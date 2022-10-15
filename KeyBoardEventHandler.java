
package com.mycompany.awt;

import java.awt.*;
import java.awt.RenderingHints.Key;
import java.awt.event.*;
import java.util.Date;

class FrameMake extends Frame  implements KeyListener
{
    Label l1;
    Label l2;
    Label l3;
    Label l4;
    
     public FrameMake()
     {
         super("KeyBoard Event Manager");
         
         l1=new Label("");
         l2=new Label("");
         l3=new Label("");
         l4=new Label("");
         
         setLayout(null);
         
         //define position and dimentions of labels
         
         l1.setBounds(30,20,100,20);
         l2.setBounds(30,50,100,20);
         l3.setBounds(30,90,100,20);
         l4.setBounds(30,120,200,20);
         
         add(l1);
         add(l2);
         add(l3);
         add(l4);
         
         addKeyListener(this);
         
     }
     
     @Override
     public void keyPressed(KeyEvent e)
     {
         l1.setText("Key pressed "+e.getKeyChar());
         l2.setText("");
     }

    @Override
    public void keyTyped(KeyEvent e) {
        
        l3.setText("Key typed "+e.getKeyChar());
        l4.setText(new Date(e.getWhen())+"");       //get the time when the key was typed.
       
    }

   

    @Override
    public void keyReleased(KeyEvent e) {
            
        l1.setText("");
        l3.setText("");
        l2.setText("Key released "+e.getKeyChar()); //get name of key pressed into second label
    }
}
    
public class AWT extends Frame
{
    public static void main(String[] args) 
    {
        
        FrameMake fm=new FrameMake();
            
        //set frame characteristics
        
        fm.setSize(500,500);
        fm.setVisible(true);
        
    }
}
