
package com.mycompany.awt;

import java.awt.*;
import java.awt.RenderingHints.Key;
import java.awt.event.*;
import java.util.Date;

class Window extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}

class FrameMake extends Frame
{
        int x=0,y=0;
        
        public FrameMake()
        {
            
         super("Drawing");
         
         addMouseMotionListener(new MouseAdapter()
         {
            //to make the rectangle follow your mouse
             public void mouseMoved(MouseEvent me)
             {
                 x=me.getX();
                 y=me.getY();
                 repaint();
             }
         });
         
         //to pin the rectangle
         addMouseListener(new MouseAdapter()
                 {
                     public void mouseClicked(MouseEvent me)
                     {
                         repaint();
                     }
                 });
        
         
        setLayout(new FlowLayout());
        
        window w=new window();
        addWindowListener(w);
      
        
}
        //make Rectangle object and fill it with pink color
        
        public void paint(Graphics b)
        {
            b.setColor(Color.PINK);
            b.fillRect(x,y,30,30);
        }
}
    class window extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
            System.out.print("Bye");
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
