/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacionii;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class SwingPaint {
 JFrame frame = new JFrame("Swing Paint");
  JButton clearBtn,  btnSave;
  DrawArea drawArea;
  ActionListener actionListener = new ActionListener() {
 
      
  public void actionPerformed(ActionEvent e) {
      
  if (e.getSource() == btnSave){
      Guardar();
      frame.dispose();
      } else if (e.getSource() == clearBtn){
      drawArea.clear();
      }
  
    }
  };
 
  public static void main(String[] args) {
    new SwingPaint().show();
  }
 
  public void show() {
    // create main frame
    
    Container content = frame.getContentPane();
    // set layout on content pane
    content.setLayout(new BorderLayout());
    // create draw area
    drawArea = new DrawArea();
    
    //Esto es para que aparezca al medio
    frame.setSize(500, 500);
    frame.setLocationRelativeTo(null);
    
    // add to content pane
    content.add(drawArea, BorderLayout.CENTER);
 
    // create controls to apply colors and call clear feature
    JPanel controls = new JPanel();
 
    
    clearBtn = new JButton("Clear");
    clearBtn.addActionListener(actionListener);
    btnSave = new JButton("Save");
    btnSave.addActionListener(actionListener); 

 
    // add to panel
    /*
    controls.add(greenBtn);
    controls.add(blueBtn);
    controls.add(blackBtn);
    controls.add(redBtn);
    controls.add(magentaBtn);
    */
    controls.add(clearBtn);
    controls.add(btnSave);
 
    // add to content pane
    content.add(controls, BorderLayout.NORTH);
 
    frame.setSize(600, 600);
    // can close frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // show the swing paint result
    frame.setVisible(true);
 
    // Now you can try our Swing Paint !!! Enjoy <img draggable="false" class="emoji" alt="😀" src="https://s.w.org/images/core/emoji/2.3/svg/1f600.svg">
  }
public void Guardar(){
BufferedImage bImg = new BufferedImage(drawArea.getWidth(), drawArea.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D cg = bImg.createGraphics();
        drawArea.paintAll(cg);
        try {
            if (ImageIO.write(bImg, "png", new File("src/Imagenes/firma.jpg"))) {
                System.out.println("-- saved");
            }
        } catch (IOException a) {
            // TODO Auto-generated catch block
            a.printStackTrace();

        }
}
}