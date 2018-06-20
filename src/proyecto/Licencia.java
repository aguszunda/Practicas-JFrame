
package proyecto;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class Licencia extends JFrame implements ActionListener, ChangeListener 
{
    private JLabel label1, label2;
    private JTextArea area;
    private JScrollPane scroll;
    private JButton boton1, boton2;
    private JCheckBox check;
    String nom="";
    
    public Licencia()
    {
        setLayout(null);
        setTitle("Licencia de uso");
        ImageIcon imagen2 = new ImageIcon("C:\\Users\\Zunda\\Documents\\Programas JAVA\\Proyecto\\images\\icon.png");
        setIconImage(imagen2.getImage());
        Proyecto bien = new Proyecto();
        nom=bien.nombre;
        
        label1 = new JLabel("TERMINOS Y CONDICIONES");
        label1.setBounds(215,5,200,30);
        label1.setFont(new Font("Andale Mono",1,14));
        label1.setForeground(new Color(0,0,0));
        add(label1);
        
        area = new JTextArea();
        area.setEditable(false);//bloqueanos la edicion del texto...
        area.setFont(new Font("Andale Mono",0,9));
        area.setText("\n\n          TÉRMINOS Y CONDICIONES\n\n          A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GUEKIPEDIA DE ERNESTO.\n\n          B.  PROHIBIDA LA ALTERACIÓN DEL CODIGO FUENTE O DISEÑO DE LA INTERFACES GRAFICAS.\n\n          C.  LA GUEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE.\n\n          LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE.\n\n          PARA MAYOR INFORMACIÓN DE NUESTROS PRODUCTOS Y SERVICIOS, POR FAVOR VISITE :\n\n          http//www.youtube.com/ernestoperezm");
        scroll= new JScrollPane(area);
        scroll.setBounds(10,40,575,200);
        add(scroll);
        
        check = new JCheckBox("Yo "+ nom +" Acepto");
        check.setBounds(10,250,300,30);
        check.addChangeListener(this);
        add(check);
        
        boton1 = new JButton("Continuar");
        boton1.setBounds(10,290,100,30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);
        
        boton2 = new JButton("No Acepto");
        boton2.setBounds(120,290,100,30);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);
        
        ImageIcon imagen = new ImageIcon("C:\\Users\\Zunda\\Documents\\Programas JAVA\\Proyecto\\images\\coca-cola.png"); 
        
        label2 = new JLabel(imagen);
        label2.setBounds(315,135,300,300);
        //label2.setFont(new Font("Edwardian Script ITC", 3,50));
        //label2.setForeground(new Color(255,0,0));
        add(label2);
    }
    public void stateChanged(ChangeEvent e)
    {
        if(check.isSelected()== true)
        {
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        }
        else
        {
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== boton1)
        {
            Programa x = new Programa();
            x.setBounds(0,0,700,550);
            x.setVisible(true);
            x.setLocationRelativeTo(null);
            x.setResizable(false);
            this.setVisible(false);
        }
        else
        {
            if(e.getSource() == boton2)
            {
               Proyecto b = new Proyecto();
               b.setBounds(0,0,350,450);
               b.setVisible(true);
               b.setLocationRelativeTo(null);
               b.setResizable(false);
               this.setVisible(false);
            }   
        }
        
    }
    /*public static void main(String[] args)
    {
        Licencia x = new Licencia();
        x.setBounds(0,0,600,360);
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        x.setResizable(false);

    }*/
    
}