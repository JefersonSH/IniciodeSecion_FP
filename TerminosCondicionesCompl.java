import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

public class TerminosCondicionesCompl extends JFrame{
    public TerminosCondicionesCompl() {
        // Configuración del JFrame
        setTitle("Terminos y Condiciones UNM");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Contructor
        JTextArea tutorial = new JTextArea(
                                "Por favor, lea cuidadosamente estos términos y condiciones (en adelante, los “Términos”). Los Términos contienen información importante. La aceptación de estos Términos es una condición obligatoria para la participación en esta Activación, por lo que, si participa en esta, se entiende que ha aceptado en su integridad y sin reservas estos Términos.\r\n" + //
                                "\r\n" + //
                                "Del Promotor:\r\n" + //
                                "\r\n" + //
                                "1.    El promotor de esta Activación es la empresa UNM Perú S.A.C. (en adelante, el Promotor), con dirección en la Av. 28 de Julio 1011, Piso 10, distrito de Miraflores, provincia y departamento de Lima, Perú.\r\n" + //
                                "2.    Los Términos están disponibles en: https://www.UNM.pe/terminosycondiciones\r\n" + //
                                "\r\n" + //
                                "Requerimientos:\r\n" + //
                                "\r\n" + //
                                "1.    Podrán participar en la Activación todas aquellas personas que sean mayores de edad. Al participar en la Activación declaran ser residentes en la República de Perú y tener la capacidad legal suficiente para ser parte en relaciones contractuales.\r\n" + //
                                "2.    Queda excluido de participar cualquier persona que lo realice con fines de lucro o negocio.\r\n" + //
                                "\r\n" + //
                                "Vigencia:\r\n" + //
                                "\r\n" + //
                                "Del 29 de noviembre del 2024 a las 00:00 horas hasta el 01 de diciembre del 2024 a las 23:59 horas, la tienda virtual UNM ofrecerá hasta un 15% de descuento adicional en catálogo de seleccionado con el cupón BLACK15\r\n" + //
                                "\r\n" + //
                                "Mecánica de la Activación:\r\n" + //
                                "\r\n" + //
                                "La promoción aplica para compras en la web en la url: https://www.UNM.pe/black_friday y la app oficial de UNM (apartado Black Friday). No aplica para productos nuevos de campaña o exclusiones globales. Hasta agotar stock de productos o cupones.\r\n" + //
                                "\r\n" + //
                                "Facultades del Promotor:\r\n" + //
                                "\r\n" + //
                                "UNM se reserva el derecho de modificar el nombre de la Promoción, la fecha de vigencia de la Promoción, así como los términos y condiciones establecidas para la participación."
        );

        //metodos mas usados
        tutorial.setEditable(false); 
        tutorial.setLineWrap(true); 
        tutorial.setWrapStyleWord(true); 

        // Añadir el JTextArea al JFrame dentro de un JScrollPane
        JScrollPane scrollPane = new JScrollPane(tutorial);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TerminosCondicionesCompl();
    }
}
