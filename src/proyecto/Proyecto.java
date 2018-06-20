/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Proyecto extends JFrame implements ActionListener 
{
    private JLabel label1, label2, label3, label4;
    private JTextField texto;
    private JButton boton;
    public static String nombre="";
    
    public Proyecto()
    {
        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));
        
        ImageIcon imagen2 = new ImageIcon("C:\\Users\\Zunda\\Documents\\Programas JAVA\\Proyecto\\images\\icon.png");
        setIconImage(imagen2.getImage());
        
        ImageIcon imagen = new ImageIcon("C:\\Users\\Zunda\\Documents\\Programas JAVA\\Proyecto\\images\\logo-coca.png");
        label1 = new JLabel(imagen);
        label1.setBounds(25, 15,300,150);
       
      // label1.setFont(new Font("Edwardian Script ITC", 3,50));
        //label1.setForeground(new Color(255,255,255));
        add(label1);
        
        //labels siguientes
        
        label2 = new JLabel("Sistema de Control Vacacional");
        label2.setBounds(35,135,300,30);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(new Color(255,255,255));
        add(label2);
        
        label3 = new JLabel("Ingrese su Nombre: ");
        label3.setBounds(45,212,200,30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);
        
        label4 = new JLabel("2018 The Coca-Cola Company");
        label4.setBounds(85,375,300,30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(255, 255, 255));
        add(label4);
        
        texto = new JTextField();
        texto.setBounds(35,250,260,30);
        texto.setBackground(new Color(224,224,224));
        texto.setFont(new Font("Andale Mono", 1, 14));
        texto.setForeground(new Color(255,0,0));
        add(texto);
        
        boton = new JButton("Ingresar");
        boton.setBounds(110,290,100,30);
        boton.setBackground(new Color(255,255,255));
        boton.setFont(new Font("Andale Mono", 1, 14));
        boton.setForeground(new Color(255,0,0));
        boton.addActionListener(this);
        add(boton);      
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == boton)
        {
            nombre=texto.getText().trim();
            //el metodo trim borra los espacios libres entre el texto de la variable
            //equals(): compara la cadena de caracteres para ver si presenta o no un valor
            if(nombre.equals(""))
            {
                JOptionPane.showMessageDialog(null,"debes ingresar tu nombre.");
            }
           else
              {
                  Licencia x = new Licencia();
                  x.setBounds(0,0,600,360);
                  x.setVisible(true);
                  x.setLocationRelativeTo(null);
                  x.setResizable(false);
                  this.setVisible(false);
              }
            
        }
    }
    public static void main(String[] args)
    {
        Proyecto x = new Proyecto();
        x.setBounds(0,0,350,450);
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        x.setResizable(false);
    }
    
}
