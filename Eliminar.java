package Libreria.Base;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Eliminar extends JFrame
{
    JTextArea   obj_JTArea      = new JTextArea("Escribir aca");
    JLabel      obj_JLabel      = new JLabel("NO FEAR");
    JButton     obj_JButton_01  = new JButton("BOTON DE INICIO");
    JButton     obj_JButton_02  = new JButton("BOTON DE FIN");
    JPanel      obj_JPanel      = new JPanel();
    

    public Eliminar(JFrame inst_JFrame)
    {
        System.out.println("Constructor inicializado de: Clase Eliminar");
        
        obj_JPanel.setLayout(new BorderLayout());
        obj_JPanel.add(obj_JLabel,BorderLayout.CENTER);
        obj_JPanel.add(obj_JTArea,BorderLayout.NORTH);
        obj_JPanel.add(obj_JButton_01,BorderLayout.WEST);
        obj_JPanel.add(obj_JButton_02,BorderLayout.EAST);

        inst_JFrame.add(obj_JPanel);
        inst_JFrame.setSize(500,500);
        inst_JFrame.setVisible(true);
        inst_JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
