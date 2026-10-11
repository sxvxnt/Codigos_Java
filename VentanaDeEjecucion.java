package Libreria.Base;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class VentanaDeEjecucion
{
    JFrame obj_JFrame = new JFrame();
    JPanel obj_JPanel = new JPanel();
    
    JTextArea obj_JTArea = new JTextArea("AREA DE TEXTO");
    JButton obj_JButton_001 = new JButton("OPCION DE CONFIGURACION");
    JButton obj_JButton_002 = new JButton("OpCION GRAFICAS");
    
    
    public VentanaDeEjecucion()
    {
        obj_JPanel.setLayout(new BorderLayout());
        obj_JPanel.add(obj_JTArea,BorderLayout.CENTER);
        obj_JPanel.add(obj_JButton_001,BorderLayout.NORTH);
        obj_JPanel.add(obj_JButton_002,BorderLayout.WEST);
        
        obj_JFrame.add(obj_JPanel);
        obj_JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj_JFrame.setVisible(true);
        obj_JFrame.setSize(300,300);
    }
    
}
