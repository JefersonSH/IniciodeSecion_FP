import java.util.Calendar;

import javax.swing.*;
public class Registro {
    public Registro() {
        JFrame registro = new JFrame("Registro");
        registro.setSize(400, 600);
        registro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel Datos = new JLabel("Nombres y Apellidos:");
        Datos.setBounds(50, 90, 300, 30);
        registro.add(Datos);
        JTextField DatosIngresar = new JTextField();
        DatosIngresar.setBounds(50, 120, 300, 30);
        registro.add(DatosIngresar);
        JLabel Ocupacion = new JLabel("Ocupacion:");
        Ocupacion.setBounds(50, 170, 300, 30);
        registro.add(Ocupacion);
        JTextField OcupacionIngresar =  new JTextField();
        OcupacionIngresar.setBounds(50, 200, 300, 30);
        registro.add(OcupacionIngresar);

        JLabel gmail = new JLabel("Gmail:");
        gmail.setBounds(50, 260, 270, 30);
        registro.add(gmail);
        JTextField gmailIngresar =  new JTextField();
        gmailIngresar.setBounds(50, 290, 300, 30);
        registro.add(gmailIngresar);



        JLabel fecha = new JLabel("Fecha de Nacimiento:");
        fecha.setBounds(50, 350, 300, 30);
        registro.add(fecha);

        JSpinner numberSpinner = new JSpinner(new SpinnerNumberModel(10, 1, 31, 1));

        // Crear un spinner con modelo de lista
        String[] meses = {"enero", "febrero", "marzo", "abril",
                            "mayo", "junio", "julio", "agosto",
                            "septiembre", "octubre", "noviembre", "diciembre"};
        JSpinner listSpinner = new JSpinner(new SpinnerListModel(meses));
        
        // Crear un spinner con modelo de fecha para solo el año
        Calendar calendar = Calendar.getInstance();
        SpinnerDateModel yearModel = new SpinnerDateModel();
        yearModel.setCalendarField(Calendar.YEAR); // Incremento basado en años
        yearModel.setValue(calendar.getTime()); // Establece el año actual como valor inicial

        // Crear el spinner y personalizar su editor
        JSpinner yearSpinner = new JSpinner(yearModel);
        JSpinner.DateEditor yearEditor = new JSpinner.DateEditor(yearSpinner, "yyyy");
        yearSpinner.setEditor(yearEditor);

        // Crear un panel para organizar los spinners
        JPanel panel = new JPanel();
        panel.add(new JLabel("Dia:"));
        panel.add(numberSpinner);
        panel.add(new JLabel("Mes:"));
        panel.add(listSpinner);
        panel.add(new JLabel("Año:"));
        panel.add(yearSpinner);
        panel.setBounds(50, 380, 300, 30);
        
        registro.add(panel);

        JButton continuar =  new JButton("Continuar");
        continuar.setBounds(50, 500, 120, 30);
        registro.add(continuar);
        registro.setLayout(null);
        registro.setVisible(true);


        

    }
    public static void main(String[] args) {
        new Registro();
    }
}