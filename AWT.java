
package com.mycompany.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class FrameMake extends Frame implements ItemListener
{
    Label l;
    Checkbox cb1,cb2,cb3;
    
    //constructo to intialize components
    public FrameMake()
    {
        super("Check box demo ");
        
        l=new Label("Nothing is selected");
        
        //make checkboxes
        cb1=new Checkbox("C#");
        cb2=new Checkbox("Java");
        cb3=new Checkbox("Python");
        
        //add listeneing capability to the check boxes
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        
        setLayout(new FlowLayout());
        
        add(l);
        add(cb1);
        add(cb2);
        add(cb3);
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        String str="";
        
        //attach values to label based on selection.
        if(cb1.getState())
        {
            str=str+" "+cb1.getLabel();
        }
        
        if(cb2.getState())
        {
            str=str+" "+cb2.getLabel();
        }
        
        if(cb3.getState())
        {
            str=str+" "+cb3.getLabel();
        }
        
        else if(str.isEmpty())
        {
            str="Nothing is selected ";
        }
        l.setText(str);
         
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
