import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class UsuariosRegistrados {
    public UsuariosRegistrados() {
        // Configurar el frame
        JFrame frame = new JFrame();
        frame.setTitle("Usuarios Registrados");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Datos para la tabla
        Object[][] datos = {
            {"Juan", 2023},
            {"María", 2022},
            {"Carlos", 2024},
            {"Mark", 2023},
            {"Killian", 2022}
        };

        // Nombres de columnas
        String[] columnas = {"Nombre", "Fecha"};

        // Crear JTable con el modelo
        JTable tabla = new JTable(datos,columnas);

        // Configurar propiedades de la tabla
        tabla.setRowHeight(25);

        // Crear un ScrollPane para la tabla
        JScrollPane scrollPane = new JScrollPane(tabla);

        scrollPane.setViewportView(tabla);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Botón "Usuarios registrados" más pequeño y en la esquina inferior derecha
        JButton regresar = new JButton("Regresar");
        regresar.setBounds(250, 500, 120, 30); // Botón más pequeño en la esquina
        frame.add(regresar);

        // Añadir el ScrollPane al frame
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
