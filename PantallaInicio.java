import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PantallaInicio extends JFrame {
    public PantallaInicio() {
        // Configuración de la ventana
        
        JFrame frame = new JFrame("Pantalla de Inicio");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
         // Espacio superior para la imagen de perfil
        JLabel lblPerfil = new JLabel();
        ImageIcon perfilIcon = redimensionarImagen(new ImageIcon("Imagenes\\perfil.png"),100,100); // Ruta de la imagen de perfil
        lblPerfil.setIcon(perfilIcon);
        lblPerfil.setBounds(150, 20, 100, 100); // Colocar la imagen centrada en la parte superior
        add(lblPerfil);

        // Etiqueta y cuadro de texto para "Usuario"
        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(50, 130, 300, 25);
        frame.add(lblUsuario);

        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(50, 160, 300, 30);
        frame.add(txtUsuario);

        // Etiqueta y cuadro de texto para "Contraseña"
        JLabel lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setBounds(50, 210, 300, 25);
        frame.add(lblContrasena);

        JPasswordField txtContrasena = new JPasswordField();
        txtContrasena.setBounds(50, 240, 300, 30);
        frame.add(txtContrasena);

        // Botón para "Recordarme"
        JCheckBox btnRecordarme = new JCheckBox("Recordarme");
        btnRecordarme.setBounds(50, 290, 300, 25);
        frame.add(btnRecordarme);

        // Boton pa iniciar sesion UWU 
        JButton IniciarSesion = new JButton("Iniciar Sesion");
        IniciarSesion.setBounds(50, 320, 300, 30);
        frame.add(IniciarSesion);
        
        IniciarSesion.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        // Botón para "Registrarse"
        JButton btnRegistro = new JButton("Registrarse");
        btnRegistro.setBounds(50, 360, 300, 30);
        frame.add(btnRegistro);
        
        btnRegistro.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Registro();
            }
        });

        // Botón "Usuarios registrados" más pequeño y en la esquina inferior derecha
        JButton btnUsuariosRegistrados = new JButton("Usuarios registrados");
        btnUsuariosRegistrados.setBounds(250, 500, 120, 30); // Botón más pequeño en la esquina
        frame.add(btnUsuariosRegistrados);
        
        btnUsuariosRegistrados.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new UsuariosRegistrados();
            }
        });
        // Botón "Califícanos"
        JButton calificanosButton = new JButton("Calificanos");
        calificanosButton.setBounds(50, 500, 120, 30); // Botón más pequeño en la esquina
        frame.add(calificanosButton);
        
        calificanosButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Calificanos();
            }
            
        });
        
        frame.setLayout(null); // Layout absoluto para tener control total sobre la ubicación
        frame.setVisible(true);
    }
    private static ImageIcon redimensionarImagen(ImageIcon icon, int ancho, int alto) {
        Image img = icon.getImage(); // Obtén la imagen del icono
        Image imgRedimensionada = img.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH); // Redimensionar
        return new ImageIcon(imgRedimensionada); // Crear un nuevo ImageIcon con la imagen redimensionada
    }
    public static void main(String[] args) {
        new PantallaInicio();
    }
}