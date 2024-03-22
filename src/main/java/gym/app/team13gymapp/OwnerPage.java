import javax.swing.*;
import java.awt.*;

public class OwnerPage extends JFrame {

    public OwnerPage() {
        setTitle("Owner Page");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Welcome to Owner Page");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titleLabel, BorderLayout.NORTH);

        JTextArea dataTextArea = new JTextArea();
        dataTextArea.setFont(new Font("Arial", Font.PLAIN, 18));
        dataTextArea.setLineWrap(true);
        dataTextArea.setEditable(false);
        dataTextArea.setText("Sample Owner Data:\nCompany Name: Fitness Club\nNumber of Members: 100\nRevenue: $10000");
        panel.add(dataTextArea, BorderLayout.CENTER);

        add(panel);
        setVisible(true);
    }
}
