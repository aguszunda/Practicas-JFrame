/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Programa extends JFrame implements ActionListener
{
    private JMenuBar bar;
    private JMenu menuOpciones, menuCalcular, menuAcercade, menuColorFondo;
    private JMenuItem calculo, miRojo, miNegro, miMorado, miElCreador,miSalir, miNuevo; 
    private JLabel labelLogo, labelBienvenido, labelTitulo, labelNombre, labelAPaterno, labelAMaterno;       
    private JLabel labelDepartamento,labelAntiguedad, lablResultado,labelFooTer;
    private JTextField textNomTrabajador, textAPaterno, textAMaterno;
    private JComboBox comboDepartamento, comboAntiguedad;
    private JScrollPane scroll;
    private JTextArea area;
    String aux="";
    
    
    public Programa()
    {
        setLayout(null);
        setTitle("Pantalla Principal");
        ImageIcon imagen = new ImageIcon("C:\\Users\\Zunda\\Documents\\Programas JAVA\\Proyecto\\images\\icon.png");
        setIconImage(imagen.getImage());
        getContentPane().setBackground(new Color(255,0,0));
        Proyecto p = new Proyecto();
        aux=p.nombre;
        //menu de opciones
        
        bar = new JMenuBar();
        bar.setBackground(new Color(255,0,0));
        bar.setFont(new Font("AndaleMono",1,14));
        bar.setForeground(new Color(255,255,255));
        setJMenuBar(bar);
        
        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255,0,0));
        menuOpciones.setFont(new Font("AndaleMono",1,14));
        menuOpciones.setForeground(new Color(255,255,255));
        bar.add(menuOpciones);
       
        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255,0,0));
        menuCalcular.setFont(new Font("AndaleMono",1,14));
        menuCalcular.setForeground(new Color(255,255,255));
        bar.add(menuCalcular);
        
        menuAcercade = new JMenu("Acerca de");
        menuAcercade.setBackground(new Color(255,0,0));
        menuAcercade.setFont(new Font("AndaleMono",1,14));
        menuAcercade.setForeground(new Color(255,255,255));
        bar.add(menuAcercade);
        
        menuColorFondo = new JMenu("Color de Fondo");
        menuColorFondo.setBackground(new Color(255,0,0));
        menuColorFondo.setFont(new Font("AndaleMono",1,14));
        menuColorFondo.setForeground(new Color(255,255,255));
        menuOpciones.add(menuColorFondo);
      
        calculo = new JMenuItem("Vacaciones");
        calculo.setFont(new Font("AndaleMono",1,14));
        calculo.setForeground(new Color(255,255,255));
        menuCalcular.add(calculo);
        calculo.addActionListener(this);
        
        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font("AndaleMono",1,14));
        miRojo.setForeground(new Color(255,255,255));
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);
        
        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("AndaleMono",1,14));
        miNegro.setForeground(new Color(255,255,255));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);
        
        miMorado = new JMenuItem("Morado");
        miMorado.setFont(new Font("AndaleMono",1,14));
        miMorado.setForeground(new Color(255,255,255));
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);
        
        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("AndaleMono",1,14));
        miNuevo.setForeground(new Color(255,255,255));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);
        
        
        miElCreador = new JMenuItem("El Creador");
        miElCreador.setFont(new Font("AndaleMono",1,14));
        miElCreador.setForeground(new Color(255,255,255));
        menuAcercade.add(miElCreador);
        miElCreador.addActionListener(this);
        
        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("AndaleMono",1,14));
        miSalir.setForeground(new Color(255,255,255));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);
        
        //LABELS
        
        ImageIcon imagen1 = new ImageIcon("C:\\Users\\Zunda\\Documents\\Programas JAVA\\Proyecto\\images\\logo-coca.png");
        labelLogo = new JLabel(imagen1);
        labelLogo.setBounds(5,5,250,100);
        add(labelLogo);
        
        labelBienvenido = new JLabel("bienvenido " + aux);
        labelBienvenido.setBounds(280,30,300,50);
        labelBienvenido.setFont(new Font("AndaleMono",1,32));
        labelBienvenido.setForeground(new Color(255,255,255));
        add(labelBienvenido);
        
        labelTitulo = new JLabel("Datos del Trabajador Para el Calculo de Vacaciones");
        labelTitulo.setBounds(45,140,900,25);
        labelTitulo.setFont(new Font("AndaleMono",0,24));
        labelTitulo.setForeground(new Color(255,255,255));
        add(labelTitulo);
        
        labelNombre = new JLabel("Nombre Completo: ");
        labelNombre.setBounds(25,188,180,25);
        labelNombre.setFont(new Font("AndaleMono",0,12));
        labelNombre.setForeground(new Color(255,255,255));
        add(labelNombre);
        
        textNomTrabajador = new JTextField();
        textNomTrabajador.setBounds(25,213,150,25);
        textNomTrabajador.setBackground(new Color(224,224,224));
        textNomTrabajador.setForeground(new Color(255,0,0));
        textNomTrabajador.setFont(new Font("AndaleMono",1,14));
        add(textNomTrabajador);
        
        labelAPaterno = new JLabel("Apellido Paterno: ");
        labelAPaterno.setBounds(25,248,180,25);
        labelAPaterno.setFont(new Font("AndaleMono",0,12));
        labelAPaterno.setForeground(new Color(255,255,255));
        add(labelAPaterno);
        
        textAPaterno = new JTextField();
        textAPaterno.setBounds(25,273,150,25);
        textAPaterno.setBackground(new Color(224,224,224));
        textAPaterno.setForeground(new Color(255,0,0));
        textAPaterno.setFont(new Font("AndaleMono",1,14));
        add(textAPaterno);
        
        labelAMaterno = new JLabel("Apellido Materno: ");
        labelAMaterno.setBounds(25,308,180,25);
        labelAMaterno.setFont(new Font("AndaleMono",0,12));
        labelAMaterno.setForeground(new Color(255,255,255));
        add(labelAMaterno);
        
        textAMaterno = new JTextField();
        textAMaterno.setBounds(25,334,150,25);
        textAMaterno.setBackground(new Color(224,224,224));
        textAMaterno.setForeground(new Color(255,0,0));
        textAMaterno.setFont(new Font("AndaleMono",1,14));
        add(textAMaterno);
      
          //ComboBox
        
        labelDepartamento = new JLabel("Departamento: ");
        labelDepartamento.setBounds(220,188,180,25);
        labelDepartamento.setFont(new Font("AndaleMono",0,12));
        labelDepartamento.setForeground(new Color(255,255,255));
        add(labelDepartamento);
        
        comboDepartamento = new JComboBox();
        comboDepartamento.setBounds(220,213,220,25);
        comboDepartamento.setBackground(new Color(224,224,224));
        comboDepartamento.setForeground(new Color(255,0,0));
        comboDepartamento.setFont(new Font("AndaleMono",1,14));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Atención al Cliente");
        comboDepartamento.addItem("Departamento de Logistica");
        comboDepartamento.addItem("Departamento de Gerencia");
        
        labelAntiguedad = new JLabel("Selecciona la antiguedad: ");
        labelAntiguedad.setBounds(220,248,180,25);
        labelAntiguedad.setFont(new Font("AndaleMono",0,12));
        labelAntiguedad.setForeground(new Color(255,255,255));
        add(labelAntiguedad);
        
        comboAntiguedad = new JComboBox();
        comboAntiguedad.setBounds(220,273,220,25);
        comboAntiguedad.setBackground(new Color(224,224,224));
        comboAntiguedad.setForeground(new Color(255,0,0));
        comboAntiguedad.setFont(new Font("AndaleMono",1,14));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 Año de Servicio");
        comboAntiguedad.addItem("2 a 6 Años de Servicio");
        comboAntiguedad.addItem("7 Año o Mas Año de Servicio");
        
        lablResultado = new JLabel("Resultado del Calculo: ");
        lablResultado.setBounds(220,307,180,25);
        lablResultado.setFont(new Font("AndaleMono",0,12));
        lablResultado.setForeground(new Color(255,255,255));
        add(lablResultado);
        
        area = new JTextArea();
        area.setEditable(false);
        area.setBackground(new Color(224,224,224));
        area.setFont(new Font("AndaleMono",1,12));
        area.setForeground(new Color(255,0,0));
        area.setText("\n      Aqui aparece el resultado del calculo de las vacaciones.");
        scroll = new JScrollPane(area);
        scroll.setBounds(220,333,385,90);
        add(scroll);
        
        labelFooTer = new JLabel("2018 The Coca-Cola Company | Todos los derechos reservados.");
        labelFooTer.setBounds(135,445,500,30);
        labelFooTer.setFont(new Font("AndaleMono",1,12));
        labelFooTer.setForeground(new Color(255,255,255));
        add(labelFooTer);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== calculo)
        {
            String nombreTrabajador="", aPMater="", aPPater="", antiguedad="", depto="";
            nombreTrabajador=textNomTrabajador.getText();
            aPMater=textAMaterno.getText();
            aPPater=textAPaterno.getText();
            depto=comboDepartamento.getSelectedItem().toString();
            antiguedad=comboAntiguedad.getSelectedItem().toString();
            if(nombreTrabajador.equals("") || aPMater.equals("") || aPPater.equals("") || depto.equals("") || antiguedad.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
            }
            else
            {
                if(depto.equals("Atención al Cliente"))
                {
                    if(antiguedad.equals("1 Año de Servicio"))
                    {
                        area.setText("\n El Trabajador: "+nombreTrabajador+" "+aPPater+" "+aPMater+
                            "\nquien labora en "+depto+" con la antiguedad de : " +antiguedad+
                            "\nrecibe 6 días de vacaciones");
                    }
                    if(antiguedad.equals("2 a 6 Años de Servicio"))
                    {
                        area.setText("\n El Trabajador: "+nombreTrabajador+" "+aPPater+" "+aPMater+
                            "\nquien labora en "+depto+" con la antiguedad de : " +antiguedad+
                            "\nrecibe 14 días de vacaciones");
                    }
                    if(antiguedad.equals("7 Año o Mas Año de Servicio"))
                    {
                        area.setText("\n El Trabajador: "+nombreTrabajador+" "+aPPater+" "+aPMater+
                            "\nquien labora en "+depto+" con la antiguedad de : " +antiguedad+
                            "\nrecibe 20 días de vacaciones");
                    }
                }
                if(depto.equals("Departamento de Logistica"))
                {
                    if(antiguedad.equals("1 Año de Servicio"))
                    {
                        area.setText("\n El Trabajador: "+nombreTrabajador+" "+aPPater+" "+aPMater+
                            "\nquien labora en "+depto+" con la antiguedad de : " +antiguedad+
                            "\nrecibe 7 días de vacaciones");
                    }
                    if(antiguedad.equals("2 a 6 Años de Servicio"))
                    {
                        area.setText("\n El Trabajador: "+nombreTrabajador+" "+aPPater+" "+aPMater+
                            "\nquien labora en "+depto+" con la antiguedad de : " +antiguedad+
                            "\nrecibe 15 días de vacaciones");
                    }
                    if(antiguedad.equals("7 Año o Mas Año de Servicio"))
                    {
                        area.setText("\n El Trabajador: "+nombreTrabajador+" "+aPPater+" "+aPMater+
                            "\nquien labora en "+depto+" con la antiguedad de : " +antiguedad+
                            "\nrecibe 22 días de vacaciones");
                    }
                }
                if(depto.equals("Departamento de Gerencia"))
                {
                    if(antiguedad.equals("1 Año de Servicio"))
                    {
                        area.setText("\n El Trabajador: "+nombreTrabajador+" "+aPPater+" "+aPMater+
                            "\nquien labora en "+depto+" con la antiguedad de : " +antiguedad+
                            "\nrecibe 10 días de vacaciones");
                    }
                    if(antiguedad.equals("2 a 6 Años de Servicio"))
                    {
                        area.setText("\n El Trabajador: "+nombreTrabajador+" "+aPPater+" "+aPMater+
                            "\nquien labora en "+depto+" con la antiguedad de : " +antiguedad+
                            "\nrecibe 20 días de vacaciones");
                    }
                    if(antiguedad.equals("7 Año o Mas Año de Servicio"))
                    {
                        area.setText("\n El Trabajador: "+nombreTrabajador+" "+aPPater+" "+aPMater+
                            "\nquien labora en: "+depto+" con la antiguedad de : " +antiguedad+
                            "\nrecibe 30 días de vacaciones");
                    }
                }
            }
        }
        if(e.getSource()== miRojo)
        {
            
        }
        if(e.getSource()== miNegro)
        {
            
        }
        if(e.getSource()== miMorado)
        {
            
        }
        if(e.getSource()== miNuevo)
        {
            
        }
        if(e.getSource()== miSalir)
        {
            Proyecto bienvenida = new Proyecto();
            bienvenida.setBounds(0,0,350,450);
            bienvenida.setVisible(true);
            bienvenida.setLocationRelativeTo(null);
            bienvenida.setResizable(false);
            this.setVisible(false);
        }
        if(e.getSource()== miElCreador)
        {
            
        }
    }
    /*public static void main(String args[])
    {
        Programa x = new Programa();
        x.setBounds(0,0,700,600);
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        x.setResizable(false);
    }*/
}
