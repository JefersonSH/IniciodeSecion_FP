import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PantallaInicio extends JFrame {
    public PantallaInicio() {
        // Configuración de la ventana
        
        JFrame setTitle = new JFrame("Pantalla de Inicio");
        setTitle.setSize(400, 600);
        setTitle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        

        // Espacio superior para la imagen de perfil
        JLabel lblPerfil = new JLabel();
        try {
            Icon miIcon = new ImageIcon(new ImageIcon(getClass().getResource("perfil.png")).getImage()
                .getScaledInstance(80, 80, 0));
            lblPerfil.setIcon(miIcon);
        } catch (Exception e) {
            System.out.println("No se pudo cargar la imagen: " + e.getMessage());
        }
        lblPerfil.setBounds(150, 20, 100, 100); // Colocar la imagen centrada en la parte superior
        setTitle.add(lblPerfil);

        // Etiqueta y cuadro de texto para "Usuario"
        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(50, 130, 300, 25);
        setTitle.add(lblUsuario);

        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(50, 160, 300, 30);
        setTitle.add(txtUsuario);

        // Etiqueta y cuadro de texto para "Contraseña"
        JLabel lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setBounds(50, 210, 300, 25);
        setTitle.add(lblContrasena);

        JPasswordField txtContrasena = new JPasswordField();
        txtContrasena.setBounds(50, 240, 300, 30);
        setTitle.add(txtContrasena);

        // Botón para "Recordarme"
        JCheckBox btnRecordarme = new JCheckBox("Recordarme");
        btnRecordarme.setBounds(50, 290, 300, 25);
        setTitle.add(btnRecordarme);

        // Boton pa iniciar sesion UWU 

        JButton IniciarSesion = new JButton("Iniciar Sesion");
        IniciarSesion.setBounds(50, 320, 300, 30);
        setTitle.add(IniciarSesion);

        // Botón para "Olvidaste tu contraseña"
        JButton btnOlvidasteContrasena = new JButton("¿Olvidaste tu contraseña?");
        btnOlvidasteContrasena.setBounds(50, 360, 300, 30);
        setTitle.add(btnOlvidasteContrasena);
        JButton Registrarse = new JButton("Registrarse");
        Registrarse.setBounds(50, 400, 300, 30);
        setTitle.add(Registrarse);
        Registrarse.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle.dispose();
                new Registro();
            }
            
        });

        // Botón "Usuarios registrados" más pequeño y en la esquina inferior derecha
        JButton btnUsuariosRegistrados = new JButton("Usuarios registrados");
        btnUsuariosRegistrados.setBounds(250, 500, 120, 30); // Botón más pequeño en la esquina
        setTitle.add(btnUsuariosRegistrados);
        
        setTitle.setLayout(null); // Layout absoluto para tener control total sobre la ubicación
        setTitle.setVisible(true);
    }

    public static void main(String[] args) {
        new PantallaInicio();
    }
}