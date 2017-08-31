/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacionii;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.UnsupportedLookAndFeelException;

public class Principal extends JFrame {

    JPanel panelPrincipal;
    PanelDibujo pd;
    String nombreArchivo;
    private Image img = new Image("/Imagenes/test.jpg");
    
    public Principal() {

        colocarSkin();

        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());

        JMenuBar barra = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem cerrar = new JMenuItem("Cerrar");

        cerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                dispose();
            }
        }
        );

        abrir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                /*
                pd = new PanelDibujo(userImg);
                panelPrincipal.repaint();
                panelPrincipal.add(userImg);
                */
                /*
                JFileChooser selector = new JFileChooser();
                int resultado = selector.showOpenDialog(null);
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    try {
                        nombreArchivo = selector.getSelectedFile().getName();
                        pd = new PanelDibujo(ImageIO.read(selector.getSelectedFile()));
                        pd.repaint();
                        repaint();
                        panelPrincipal.add(pd);
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            */
                PanelDibujo pd = new PanelDibujo();       
                pd.add(img);
                panelPrincipal.add(pd);
            }
        });
        JMenuItem recortar = new JMenuItem("Recortar");
        recortar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                pd.guardar_imagen("recorte de " + nombreArchivo);
            }
        });
        archivo.add(abrir);
        archivo.add(recortar);
        archivo.add(cerrar);
        barra.add(archivo);
        setJMenuBar(barra);
        add(panelPrincipal);
    }

    public void colocarSkin() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }

    public static void main(String arg[]) {
        Principal p = new Principal();
        p.setVisible(true);
        p.setBounds(0, 0, 400, 470);
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
        public class Image extends JPanel {

        String img = "recorte de test.jpg";

        public Image(String img) {
            this.setSize(179, 155);
            this.img = img;
        }

        public Image() {
            this.setSize(179, 155);
        }

        public void paint(Graphics grafico) {
            Dimension height = getSize();
            ImageIcon icon = new ImageIcon(getClass().getResource(this.img));
            grafico.drawImage(icon.getImage(), 0, 0, height.width, height.height, null);
            //grafico.drawImage(icon.getImage(), 0, 0, height.whidth, height.height, null);
            setOpaque(false);
            super.paintComponent(grafico);

        }

    }
}
