/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacionii;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Dni extends JFrame {
    JPanel panelgeneral = new JPanel();
    JPanel panelDatos = new JPanel(new GridLayout(1, 1, 1, 1));
    JLabel lbl = new JLabel("pdeda");
    
    public Dni() {
        super("Documentacion ");
        setSize(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        panelgeneral.add(panelDatos);
        add(panelgeneral);
    }
}
