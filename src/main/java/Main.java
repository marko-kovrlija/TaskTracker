import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(()->{
            JFrame mainFrame = new JFrame("Moj prvi swing frame!");
            mainFrame.setSize(500, 500);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

            JButton sacuvajBtn = new JButton("Sačuvaj");
            JButton otkaziBtn = new JButton("Otkaži");
            centerPanel.add(sacuvajBtn);
            centerPanel.add(otkaziBtn);

            mainFrame.setLayout(new BorderLayout(5, 5));

            mainFrame.add(centerPanel, BorderLayout.CENTER);

            mainFrame.setVisible(true);
        });

    }
}