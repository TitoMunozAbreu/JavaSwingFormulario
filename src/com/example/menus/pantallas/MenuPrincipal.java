package com.example.menus.pantallas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase que muestra la pantalla principal "Home"
 */
public class MenuPrincipal extends JFrame{
    //declaracion de los componentes
    private JPanel PanelMain;
    private JLabel tituloMain;
    private JButton homeButton;
    private JButton btnMostrarClientes;
    private JButton btnCrearCliente;
    private JPanel PanelMenu;

    /**
     * Constructor
     */
    public MenuPrincipal() {
        setContentPane(PanelMain);
        ImageIcon img = new ImageIcon("C:\\Users\\34618\\IdeaProjects\\SegundoDam\\MiprimerJavaSwing\\src\\com\\example\\menus\\imagenes\\icons8-papaya-60.png");
        setIconImage(img.getImage());
        setTitle("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750,600);
        setLocationRelativeTo(null);
        setVisible(true);

        //Boton que te envia a la (JFrame) pantalla de crear cliente
        btnCrearCliente.addActionListener(a ->{
            dispose();
           MenuCrearCliente mc =  new MenuCrearCliente();
        });
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
