/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import pruebas.Dibujar;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import net.sourceforge.jdatepicker.impl.*;
import net.sourceforge.jdatepicker.util.*;
import proyectoprogramacionii.Dni;
import proyectoprogramacionii.Persona;
import proyectoprogramacionii.WebcamViewerExample;



//import Atxy2k.CustomTextField.RestrictedTextField;
public class VentanaTrabajo extends JFrame implements ActionListener {
/*
    private static String nombre_;
    private static String apellido_;
    private static String nacimiento_;
    private static String sexo_;
    private static String domicilio_;
    private static String nacionalidad_;
    private static String ciudad_;
    private static String lugardenacimiento_;*/

    //Font titleFont = new Font("Dialog", Font.BOLD, 18);
    JPanel paneltitulo = new JPanel(new GridLayout(1, 3, 1, 1));
    JLabel invisible = new JLabel();
    JLabel invisible1 = new JLabel();
    JLabel titulo = new JLabel("Crear DNI");
    JButton btnBandera = new JButton("Aceptar");
    //JLabel bandera = new JLabel("ARG");

    JPanel panelimg = new JPanel(null);

    JPanel grillaDatos = new JPanel(new GridLayout(9, 2, 1, 1));
    JPanel btns = new JPanel(new GridLayout(1, 2, 1, 1));

    //Creamos Labels
    JLabel nombre = new JLabel("Nombre: ");
    JLabel apellido = new JLabel("Apellido: ");
    JLabel fecha = new JLabel("Fecha de Nacimiento: ");
    JLabel domicilio = new JLabel("Domicilio: ");
    JLabel lblSexo = new JLabel("Sexo: ");
    JLabel nacionalidad = new JLabel("Nacionalidad: ");
    JLabel ciudad = new JLabel("Ciudad: ");
    JLabel nacimiento = new JLabel("Lugar de Nacimiento: ");
    //JLabel invisible = new JLabel();
    
    public UtilDateModel model;
    public JDatePanelImpl datePanel;
    public JDatePickerImpl datePicker;
    
    
    //Botones
    JButton btnAceptar = new JButton("Aceptar");
    JButton btnFoto = new JButton("Tomar Foto");
    JButton btnFirma = new JButton("Firma");

    //ComboBox
    JComboBox pais = new JComboBox(this.paises());

    String[] sexo = {"Masculino", "Femenino"};
    JComboBox boxSexo = new JComboBox(sexo);

    //Creamos TextFields
    JTextField txtNombre = new JTextField(20);
    JTextField txtApellido = new JTextField(20);
    JTextField txtDomicilio = new JTextField(20);
    JTextField txtCiudad = new JTextField(20);
    JTextField txtNacimiento = new JTextField(20);

    /*
    public void addAction(){
    btnAceptar.setActionCommand("Aceptar");
    btnAceptar.addActionListener(this);
   }
     */

 /*
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }*/
 /*
    public class Imagen extends javax.swing.JPanel {

        public Imagen() {
            this.setSize(50,  public class selectDate extends JFrame implements ActionListener
    {
    JLabel CheckDate; JButton check;
    public UtilDateModel model;
    public JDatePanelImpl datePanel;
    public JDatePickerImpl datePicker;
    public selectDate()
        { 100); //se selecciona el tamaño del panel
        }

        //Se crea un método cuyo parámetro debe ser un objeto Graphics
        public void paint(Graphics grafico) {
            Dimension height = getSize();

            //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
            ImageIcon Img = new ImageIcon(getClass().getResource("/Imagenes/BANDERA_ARGENTINA.png"));

            //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
            grafico.drawImage(Img.getImage(), 0, 0, height.height, height.width, null);

            setOpaque(false);
            super.paintComponent(grafico);
        }
    
    }*/
    public VentanaTrabajo() {
        super("Documentacion ");
        //setSize(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
        setUndecorated(true);

        //titulo.setFont( new Font( "Helvetica", Font.BOLD, 36 ));
        titulo.setFont(new java.awt.Font("TimesRoman", Font.BOLD, 36));
        titulo.setForeground(new java.awt.Color(64, 64, 64));

        JPanel panelgeneral = new JPanel();
        panelgeneral.setLayout(new BoxLayout(panelgeneral, BoxLayout.Y_AXIS));
        panelgeneral.setBorder(new EmptyBorder(4, 4, 4, 4));
/*
        UtilDateModel model = new UtilDateModel();
        model.setSelected(true);
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
*/
        btnAceptar.setActionCommand("Aceptar");
        btnAceptar.addActionListener(this);

        model = new UtilDateModel();  
        datePanel = new JDatePanelImpl(model);  
        datePicker = new JDatePickerImpl(datePanel);
        
        
        btnFirma.setActionCommand("Firma");
        btnFirma.addActionListener(this);
        
        btnFoto.setActionCommand("Foto");
        btnFoto.addActionListener(this);

        //btnFirma.addActionListener(new BotonFirmar());
        /*btnAceptar.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                VentanaTrabajo.dispose();
                Dni ventana2 = new Dni();
                
                
            }
        });*/

 /*btnBandera.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                Imagen img = new Imagen();
                panelimg.add(img);
                panelimg.repaint();
                
            }
        });*/
        //Imagen img = new Imagen();
        //img.setSize(400, 400);
        //lblArg.add(img);
        nombre.setBounds(1, 1, 1, 1);

        //Imagen image = new Imagen();
        btns.add(btnFoto);
        btns.add(btnFirma);
        //setContentPane(image);
        grillaDatos.add(nombre);
        grillaDatos.add(txtNombre);
        grillaDatos.add(apellido);
        grillaDatos.add(txtApellido);
        grillaDatos.add(fecha);
        grillaDatos.add(datePicker);
        grillaDatos.add(domicilio);
        grillaDatos.add(txtDomicilio);
        grillaDatos.add(lblSexo);
        grillaDatos.add(boxSexo);
        grillaDatos.add(nacionalidad);
        grillaDatos.add(pais);
        grillaDatos.add(ciudad);
        grillaDatos.add(txtCiudad);
        grillaDatos.add(nacimiento);
        grillaDatos.add(txtNacimiento);
        grillaDatos.add(btns);
        grillaDatos.add(btnAceptar);

        //panelimg.add(image);
        paneltitulo.add(invisible);
        paneltitulo.add(titulo);
        //paneltitulo.add(panelimg);

        panelgeneral.add(paneltitulo);
        panelgeneral.add(grillaDatos);
        //panelgeneral.add(image);
        add(panelgeneral);
        pack();
    }
    

    private String[] paises() {

        ArrayList<String> countries = new ArrayList<String>();
        String[] aux = new String[countries.size()];

        // Get ISO countries, create Country object and
        // store in the collection.
        String[] isoCountries = Locale.getISOCountries();
        for (String country : isoCountries) {
            Locale locale = new Locale("en", country);
            String iso = locale.getISO3Country();
            String code = locale.getCountry();
            String name = locale.getDisplayCountry();

            if (!"".equals(iso) && !"".equals(code)
                    && !"".equals(name)) {
                countries.add(name);
            }
        }

        aux = countries.toArray(aux);
        return aux;
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Aceptar")) {
            Persona persona = new Persona();
            persona.setNombre(txtNombre.getText());
            persona.setApellido(txtApellido.getText());
            persona.setSexo(boxSexo.getSelectedItem().toString());
            persona.setNacimiento(datePicker.getModel().getValue().toString());
            persona.setDomicilio(txtDomicilio.getText());
            persona.setCiudad(txtCiudad.getText());
            persona.setLugarDeNacimiento(txtNacimiento.getText());
            persona.setNacionalidad(pais.getSelectedItem().toString()); 
            this.dispose();
            Dni ventanaDni = new Dni();
            
        } else if (e.getActionCommand().equals("Firma")) {
            dispose();
            System.out.println("gola");
            Dibujar ventanaDibujar = new Dibujar();
            ventanaDibujar.setVisible(true);

        }
        else if (e.getActionCommand().equals("Foto")) {
            dispose();
            System.out.println("gola");
            SwingUtilities.invokeLater(new WebcamViewerExample());
        }
    }

    /*        setBounds(getGraphicsConfiguration().getBounds());
getGraphicsConfiguration().getDevice().setFullScreenWindow(this);
    public class BotonFirmar implements ActionListener{
    @OverridesetBounds(getGraphicsConfiguration().getBounds());
getGraphicsConfiguration().getDevice().setFullScreenWindow(this);
    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("Firma")){
            System.out.println("dd");
            dispose();
        Dibujar ventanaDibujar = new Dibujar();
        ventanaDibujar.setVisible(true);
        }
    }
    }*/
/*
    public void setNombre(String nombre_) {
        this.nombre_ = nombre_;
    }

    public static String getNombre() {
        return nombre_;
    }

    public void setApellido(String apellido_) {
        this.apellido_ = apellido_;
    }

    public static String getApellido() {
        return apellido_;
    }

    public void setSexo(String sexo_) {
        this.sexo_ = sexo_;
    }

    public static String getSexo() {
        return sexo_;
    }
    public void setNacimiento(String nacimiento_) {
        this.nacimiento_ = nacimiento_;
    }

    public static String getNacimiento() {
        return nacimiento_;
    }
    public void setDomicilio(String domicilio_) {
        this.domicilio_ = domicilio_;
    }

    public static String getDomicilio() {
        return domicilio_;
    }
    public void setCiudad(String ciudad_) {
        this.ciudad_ = ciudad_;
    }

    public static String getCiudad() {
        return ciudad_;
    }
    public void setLugarDeNacimiento(String lugardenacimiento_) {
        this.lugardenacimiento_ = lugardenacimiento_;
    }

    public static String getLugarDeNacimiento() {
        return lugardenacimiento_;
    }
    public void setNacionalidad(String nacionalidad_) {
        this.nacionalidad_ = nacionalidad_;
    }

    public static String getNacionalidad() {
        return nacionalidad_;
    }*/
    }
