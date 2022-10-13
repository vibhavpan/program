
package com.mycompany.awt;

import java.awt.*;
import java.awt.event.*;

class FrameMake extends Frame  
{
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    
    Panel pl;
    
     public FrameMake()
     {
         b1=new Button("One");
         b2=new Button("Two");
         b3=new Button("Three");
         b4=new Button("Four");
         b5=new Button("Five");
         
         add(b1,BorderLayout.NORTH);
         add(b2,BorderLayout.WEST);
         add(b3,BorderLayout.CENTER);
         //add(b4,BorderLayout.EAST);
         add(b5,BorderLayout.SOUTH);
         
    
         pl=new Panel();
         
         Choice c=new Choice();
         
         c.add("Monday");
         c.add("Tuesday");
         c.add("Wednessday");
         c.add("Thursday");
         c.add("Friday");
         
         pl.add(c);
         add(pl,BorderLayout.EAST);
         
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
