import java.util.Hashtable;
import javax.swing.*;
import java.awt.*;

public class Calificanos {
    public static void main(String[] args) {
        // Crear el slider
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 1, 5, 3);

        // Configurar el slider
        slider.setPaintTicks(true); // Activa las marcas
        slider.setMajorTickSpacing(1); 
        slider.setPaintLabels(true); // Muestra etiquetas

        // Etiquetas personalizadas
        Hashtable<Integer, JLabel> labelTable = new Hashtable<>();
        labelTable.put(1, new JLabel("Malo"));
        labelTable.put(3, new JLabel("Bueno"));
        labelTable.put(5, new JLabel("Excelente"));
        slider.setLabelTable(labelTable);

        // Crear un panel para las estrellas
        JPanel estrellasPanel = new JPanel();
        estrellasPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        JLabel[] estrellas = new JLabel[5];

        // Redimensionar las imágenes
        ImageIcon estrellaVaciaIcon = redimensionarImagen(new ImageIcon("Imagenes/estrella_vacia.png"), 40, 40);
        ImageIcon estrellaLlenaIcon = redimensionarImagen(new ImageIcon("Imagenes/estrella.png"), 40, 40);

        // Inicializar las estrellas como vacías
        for (int i = 0; i < 5; i++) {
            estrellas[i] = new JLabel(estrellaVaciaIcon);
            estrellasPanel.add(estrellas[i]);
        }

        // Actualizar las estrellas al mover el slider
        slider.addChangeListener(e -> {
            int valor = slider.getValue();
            for (int i = 0; i < 5; i++) {
                estrellas[i].setIcon(i < valor ? estrellaLlenaIcon : estrellaVaciaIcon);
            }
        });
        

        // Crear el JFrame
        JFrame frame = new JFrame("Califícanos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        // Crear botón "Regresar"
        JButton regresar = new JButton("Regresar");

        // Agregar componentes al JFrame
        frame.add(estrellasPanel, BorderLayout.NORTH);
        frame.add(slider, BorderLayout.CENTER);
        frame.add(regresar, BorderLayout.SOUTH);

        // Mostrar el JFrame
        frame.setVisible(true);
    }

    // Método para redimensionar imágenes
    private static ImageIcon redimensionarImagen(ImageIcon icon, int ancho, int alto) {
        Image img = icon.getImage(); // Obtén la imagen del icono
        Image imgRedimensionada = img.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH); // Redimensionar
        return new ImageIcon(imgRedimensionada); // Crear un nuevo ImageIcon con la imagen redimensionada
    }
}
