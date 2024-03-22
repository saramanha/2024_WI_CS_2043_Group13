import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.imageio.ImageIO;

public class GymHomePage extends JFrame {

    private JTextField idField;

    public GymHomePage() {
        setTitle("Gym Management Software");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Load logo image
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("logo.png"));
        Image img = logoIcon.getImage();
        Image scaledImg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH); // Adjust size here
        ImageIcon scaledLogoIcon = new ImageIcon(scaledImg);
        JLabel logoLabel = new JLabel(scaledLogoIcon);
        panel.add(logoLabel, BorderLayout.NORTH);

        JPanel loginPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel idLabel = new JLabel("Enter ID:");
        idLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        loginPanel.add(idLabel, gbc);

        gbc.gridx = 1;
        idField = new JTextField(10);
        idField.setFont(new Font("Arial", Font.PLAIN, 18));
        loginPanel.add(idField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.BOLD, 18));
        loginPanel.add(loginButton, gbc);

        panel.add(loginPanel, BorderLayout.CENTER);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                // Sample IDs for testing
                if (id.equals("M123")) {
                    // Redirect to member page
                    JOptionPane.showMessageDialog(null, "Redirecting to Member Page");
                    openMemberPage();
                } else if (id.equals("O456")) {
                    // Redirect to owner page
                    JOptionPane.showMessageDialog(null, "Redirecting to Owner Page");
                    openOwnerPage();
                } else if (id.equals("E789")) {
                    // Redirect to employee page
                    JOptionPane.showMessageDialog(null, "Redirecting to Employee Page");
                    openEmployeePage();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid ID");
                }
            }
        });

        add(panel);
        setVisible(true);
    }

    private void openMemberPage() {
        new MemberPage().setVisible(true);
    }

    private void openOwnerPage() {
        new OwnerPage().setVisible(true);
    }

    private void openEmployeePage() {
        new EmployeePage().setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GymHomePage();
            }
        });
    }
}
