package com.vineeth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main (String[] args)
    {
        Addition obj = new Addition();

    }
}
class Addition extends JFrame implements ActionListener
{
    JLabel h;
    JTextField t1;
    JTextField t2;
    JButton b;
    JLabel l;

    public Addition()
    {
         h= new JLabel ("Addition of Two Numbers");
         t1 = new JTextField(15);
         t2 = new JTextField(15);
         b= new JButton ("OK");
         l= new JLabel ("Results");
        add(h);
        add(t1);
        add(t2);
        add(b);
        add(l);

        b.addActionListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(225,225);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        int num1= Integer.parseInt(t1.getText());
        int num2= Integer.parseInt(t2.getText());
        int value= num1 + num2 ;
        l.setText(value + "");

    }

}
