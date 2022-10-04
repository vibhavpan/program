
package com.mycompany.awt;

import java.awt.*;
import java.awt.event.*;

class FrameMake extends Frame 
{
    Label l1,l2;
    TextField tf;
    Checkbox cb;
    
    public FrameMake()
    {
        
        //set title of window as My window
        super("My window!!");
        
        cb=new Checkbox("Show paasword!!");
        
        l1=new Label("Nothing here to show!!");
        
        tf=new TextField(20);
        
        //set password character as *
        tf.setEchoChar('*');
        
         l2=new Label("Nothing to show as entered not pressed ");

        setLayout(new FlowLayout());
  
        //create inner class to tackle leak problems
        
        class My implements ActionListener,TextListener,ItemListener
        {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                //    l2.setText(tf.getText());

            }

            //if show password button clicked display password

            @Override
            public void textValueChanged(TextEvent e) 
            {
                if(cb.getState())
                    l1.setText(tf.getText());
            }

            @Override
            public void itemStateChanged(ItemEvent e)
            {
            }

        }
         My m=new My();
        
        tf.addActionListener(m);
        tf.addTextListener(m);
        
        add(l1);
        add(tf);
        add(l2);
        add(cb);
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
