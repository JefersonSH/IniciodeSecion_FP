import javax.swing.*;
import java.awt.*;

public class SesionIniciada {
    public SesionIniciada(){
        JFrame frame = new JFrame();
        frame.setTitle("Sesión");
        frame.setSize(400, 600);
        frame.setLayout(new BorderLayout());
        
        JLabel label = new JLabel("Sesión Iniciada", JLabel.CENTER);

        frame.add(label, BorderLayout.CENTER);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
