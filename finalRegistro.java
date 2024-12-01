import java.util.*;
import javax.swing.*;
public class finalRegistro {
    public ArrayList<String> user = new ArrayList<String>();
    public ArrayList<String> password = new ArrayList<String>();
    public finalRegistro() {
        JFrame registro = new JFrame("Registro");
        registro.setSize(400, 600);
        registro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel usuario = new JLabel("Usuario");
        usuario.setBounds(50, 90, 300, 30);
        registro.add(usuario);
        JTextField UsuarioIngresar = new JTextField();
        UsuarioIngresar.setBounds(50, 120, 300, 30);
        registro.add(UsuarioIngresar);

        JLabel contraseña = new JLabel("Contraseña:");
        contraseña.setBounds(50, 170, 300, 30);
        registro.add(contraseña);
        // Cambia JTextField por JPasswordField
        JPasswordField ContraseñaIngresar = new JPasswordField();
        ContraseñaIngresar.setBounds(50, 200, 300, 30);
        registro.add(ContraseñaIngresar);


        JLabel confContra = new JLabel("Confirmar contraseña:");
        confContra.setBounds(50, 260, 270, 30);
        registro.add(confContra);

        JPasswordField confContraIngresar =  new JPasswordField();
        confContraIngresar.setBounds(50, 290, 300, 30);
        registro.add(confContraIngresar);
        
        

        JButton continuar =  new JButton("Continuar");
        continuar.setBounds(50, 500, 120, 30);
        registro.add(continuar);
        registro.setLayout(null);
        registro.setVisible(true);
    }
}