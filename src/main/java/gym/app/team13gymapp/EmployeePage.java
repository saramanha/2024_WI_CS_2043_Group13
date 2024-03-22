import javax.swing.*;
import java.awt.*;

public class EmployeePage extends JFrame {

    public EmployeePage() {
        setTitle("Employee Page");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Welcome to Employee Page");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titleLabel, BorderLayout.NORTH);

        JTextArea dataTextArea = new JTextArea();
        dataTextArea.setFont(new Font("Arial", Font.PLAIN, 18));
        dataTextArea.setLineWrap(true);
        dataTextArea.setEditable(false);
        dataTextArea.setText("Sample Employee Data:\nEmployee ID: E789\nPosition: Front Desk Staff\nShift: Morning");
        panel.add(dataTextArea, BorderLayout.CENTER);

        add(panel);
        setVisible(true);
    }
}
