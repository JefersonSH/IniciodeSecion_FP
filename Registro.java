import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Registro {
    public Registro() {
        JFrame registro = new JFrame("Registro");
        registro.setSize(400, 600);
        registro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel Datos = new JLabel("Nombres y Apellidos:");
        Datos.setBounds(50, 130, 300, 30);
        registro.add(Datos);
        JTextField DatosIngresar = new JTextField();
        DatosIngresar.setBounds(50, 160, 300, 30);
        registro.add(DatosIngresar);
        JLabel Ocupacion = new JLabel("Ocupacion:");
        Ocupacion.setBounds(50, 210, 300, 30);
        registro.add(Ocupacion);
        JTextField OcupacionIngresar =  new JTextField();
        OcupacionIngresar.setBounds(50, 240, 300, 30);
        registro.add(OcupacionIngresar);
        registro.setLayout(null);
        registro.setVisible(true);
    }
}
