package com.example.menus.pantallas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

/**
 * Clase que muestra la pantalla de Crear clientes
 */
public class MenuCrearCliente extends JFrame{
    //declaracion de componentes
    private JPanel panelCrearCliente;
    private JPanel PanelMenu;
    private JButton btnHome;
    private JButton btnCrearCliente;
    private JButton btnMostrarClientes;
    private JPanel panelFormulario;
    private JTextField idInput;
    private JTextField nombreInput;
    private JTextField telefonoInpunt;
    private JTextField apellidoInput;
    private JTextField direccionInput;
    private JTextField emailInput;
    private JLabel idLabel;
    private JLabel nombreLabel;
    private JLabel apellidoLabel;
    private JLabel direccionLabel;
    private JLabel emailLabel;
    private JLabel telefonoLabel;
    private JButton btnCrear;

    /**
     * Contructor
     */
    public MenuCrearCliente(){
        setContentPane(panelCrearCliente);
        ImageIcon img = new ImageIcon("C:\\Users\\34618\\IdeaProjects\\SegundoDam\\MiprimerJavaSwing\\src\\com\\example\\menus\\imagenes\\icons8-papaya-60.png");
        this.setIconImage(img.getImage());
        setTitle("Crear Cliente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLocationRelativeTo(null);
        setVisible(true);

        //boton para regresar al menu principal (Home)
        btnHome.addActionListener(a ->{
           dispose();
           MenuPrincipal mp =  new MenuPrincipal();
        });

        //boton que muestra un dialogo que cliente registrado
        btnCrear.addActionListener(a -> {
            JOptionPane.showMessageDialog(this,"Cliente creado con exito");
        });
        PanelMenu.addComponentListener(new ComponentAdapter() {
        });
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
}
