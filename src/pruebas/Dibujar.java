/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Dibujar extends JFrame implements ActionListener {

    private Point inicioArrastre;
    private Point finArrastre;
    private ArrayList<Shape> lineas = new ArrayList<Shape>();

    JPanel panel = new JPanel();
    JButton btnBorrar = new JButton("Borrar");
    JButton btnAceptar = new JButton("Aceptar");

    public Dibujar() {
        super("Documentacion ");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        btnBorrar.setActionCommand("Borrar");
        btnBorrar.addActionListener(this);
        
        btnAceptar.setActionCommand("Aceptar");
        btnAceptar.addActionListener(this);

        addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) { // cuando se presiona el mouse
                inicioArrastre = new Point(e.getX(), e.getY());
                repaint();
            }

            public void mouseReleased(MouseEvent e) { // cuando se deja de presionar el mouse
                finArrastre = new Point(e.getX(), e.getY());
                Shape linea = crearLinea(inicioArrastre.x, inicioArrastre.y, finArrastre.x, finArrastre.y);
                lineas.add(linea);
                repaint();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {

            public void mouseDragged(MouseEvent e) { // cuando se esta arrastrando el mouse
                finArrastre = new Point(e.getX(), e.getY());
                Shape linea = crearLinea(inicioArrastre.x, inicioArrastre.y, finArrastre.x, finArrastre.y);
                lineas.add(linea);
                inicioArrastre = new Point(finArrastre.x, finArrastre.y);
                repaint();
            }
        });
        panel.add(btnBorrar);
        panel.add(btnAceptar);
        add(panel);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Borrar")) {
            panel.repaint();
            lineas.clear();
            /*
            dispose();
            Dibujar ventanaD = new Dibujar();
            ventanaD.setVisible(true);*/

        }
        else if (e.getActionCommand().equals("Aceptar")) {
            
                BufferedImage bImg = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_RGB);
    Graphics2D cg = bImg.createGraphics();
    panel.paintAll(cg);
    try {
            if (ImageIO.write(bImg, "png", new File("/home/gino/Escritorio/Proyecto Programacion/firma.png")))
            {
                System.out.println("-- saved");
            }
    } catch (IOException a) {
            // TODO Auto-generated catch block
            a.printStackTrace();
    }
            
            //dispose();
            //VentanaTrabajo ventana = new VentanaTrabajo();
            //ventana.setVisible(true);

        }
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        for (Shape linea : lineas) { // dibuja todos las elipses
            g2.draw(linea);
        }
    }

    private Line2D.Float crearLinea(int x1, int y1, int x2, int y2) {
        return new Line2D.Float(x1, y1, x2, y2);
    }
    public static void main(String[] a3d) {
        JFrame ventana = new JFrame("Dibujar");
        ventana.setSize(400, 300);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(new Dibujar());
        ventana.setVisible(true);
    }

}
