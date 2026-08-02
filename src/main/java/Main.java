import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Kreiramo glavni prozor
        JFrame frame = new JFrame("Task Tracker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Panel za unos i dugme
        JPanel inputPanel = new JPanel(new FlowLayout());
        JTextField taskInput = new JTextField(15);
        JButton addButton = new JButton("Dodaj");

        inputPanel.add(taskInput);
        inputPanel.add(addButton);

        // Lista u kojoj će se prikazivati zadaci
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> taskList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(taskList);

        // Ubacujemo komponente u prozor
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Akcija za klik na dugme "Dodaj"
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = taskInput.getText().trim();
                if (!text.isEmpty()) {
                    listModel.addElement(text);
                    taskInput.setText(""); // Očisti polje za unos
                }
            }
        });

        // Prikaži prozor na centru ekrana
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}