import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        Toolkit toolkit =Toolkit.getDefaultToolkit();

        Dimension screenSize = toolkit.getScreenSize();

        setSize(screenSize.width/2, screenSize.height/2);

        setLayout(new FlowLayout());

        JButton btnKlikniMe = new JButton("Kliknni me!");
        JLabel lblTekst = new JLabel("Tekst labela");

        add(lblTekst);
        add(btnKlikniMe);

        setTitle("Moja swing app");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
