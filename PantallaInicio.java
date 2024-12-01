import javax.swing.*;
import java.awt.*;

public class PantallaInicio extends JFrame {
    public PantallaInicio() {
        // Configuración de la ventana
        setTitle("Pantalla de Inicio");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Layout absoluto para tener control total sobre la ubicación

        // Espacio superior para la imagen de perfil
        JLabel lblPerfil = new JLabel();
        ImageIcon perfilIcon = new ImageIcon("ruta/a/tu/imagen.jpg"); // Ruta de la imagen de perfil
        lblPerfil.setIcon(perfilIcon);
        lblPerfil.setBounds(150, 20, 100, 100); // Colocar la imagen centrada en la parte superior
        add(lblPerfil);

        // Etiqueta y cuadro de texto para "Usuario"
        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(50, 130, 300, 25);
        add(lblUsuario);

        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(50, 160, 300, 30);
        add(txtUsuario);

        // Etiqueta y cuadro de texto para "Contraseña"
        JLabel lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setBounds(50, 210, 300, 25);
        add(lblContrasena);

        JPasswordField txtContrasena = new JPasswordField();
        txtContrasena.setBounds(50, 240, 300, 30);
        add(txtContrasena);

        // Botón para "Recordarme"
        JCheckBox btnRecordarme = new JCheckBox("Recordarme");
        btnRecordarme.setBounds(50, 290, 300, 25);
        add(btnRecordarme);

        // Boton pa iniciar sesion UWU 

        JButton IniciarSesion = new JButton("Iniciar Sesion");
        IniciarSesion.setBounds(50, 320, 300, 30);
        add(IniciarSesion);

        // Botón para "Olvidaste tu contraseña"
        JButton btnOlvidasteContrasena = new JButton("¿Olvidaste tu contraseña?");
        btnOlvidasteContrasena.setBounds(50, 360, 300, 30);
        add(btnOlvidasteContrasena);

        // Botón "Usuarios registrados" más pequeño y en la esquina inferior derecha
        JButton btnUsuariosRegistrados = new JButton("Usuarios registrados");
        btnUsuariosRegistrados.setBounds(250, 500, 120, 30); // Botón más pequeño en la esquina
        add(btnUsuariosRegistrados);

        // Botón "Califícanos"
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PantallaInicio ventana = new PantallaInicio();
            ventana.setVisible(true);
        });
    }
}