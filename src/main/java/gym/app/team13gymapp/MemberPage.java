import javax.swing.*;
import java.awt.*;

public class MemberPage extends JFrame {

    public MemberPage() {
        setTitle("Member Page");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Welcome to Member Page");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titleLabel, BorderLayout.NORTH);

        JTextArea dataTextArea = new JTextArea();
        dataTextArea.setFont(new Font("Arial", Font.PLAIN, 18));
        dataTextArea.setLineWrap(true);
        dataTextArea.setEditable(false);
        dataTextArea.setText("Sample Member Data:\nName: John Doe\nMembership Type: Premium\nMembership Expiry: 2024-12-31");
        panel.add(dataTextArea, BorderLayout.CENTER);

        add(panel);
        setVisible(true);
    }
}
