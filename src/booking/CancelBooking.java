package booking;

import java.awt.*;
import javax.swing.*;

public class CancelBooking extends JDialog {

    public CancelBooking(JFrame mainWindow) {
        super(mainWindow, "Cancel Flight - AGP Airlines", true); // true = modal

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(1920, 1080);
        setLocationRelativeTo(null);

        JPanel cancelPanel = new JPanel(new BorderLayout());
        cancelPanel.setBackground(Color.WHITE);

        JLabel titleLabel = new JLabel("Cancel Flight", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

        JLabel bodyLabel = new JLabel("<html><div style='width: 700px;'>While travelling we often face unexpected obstacles and changes. We get it! Using our user-friendly 'cancel' option, Agp flight bookings can be refunded easily. The reimbursement of the airfare is contingent upon the fare conditions.</div></html>");
        bodyLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        bodyLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 0, 0));
        bodyLabel.setVerticalAlignment(SwingConstants.TOP);
        bodyLabel.setHorizontalAlignment(SwingConstants.LEFT);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));

        JLabel bookingLabel = new JLabel("Booking ID:");
        bookingLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        JTextField bookingField = new JTextField(20);
        bookingField.setMaximumSize(new Dimension(300, 30));

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        JTextField lastNameField = new JTextField(20);
        lastNameField.setMaximumSize(new Dimension(300, 30));

        JButton cancelButton = new JButton("Cancel My Flight");
        cancelButton.setAlignmentX(Component.LEFT_ALIGNMENT);

        formPanel.add(Box.createVerticalStrut(10));
        formPanel.add(bookingLabel);
        formPanel.add(Box.createVerticalStrut(5));
        formPanel.add(bookingField);
        formPanel.add(Box.createVerticalStrut(15));
        formPanel.add(lastNameLabel);
        formPanel.add(Box.createVerticalStrut(5));
        formPanel.add(lastNameField);
        formPanel.add(Box.createVerticalStrut(20));
        formPanel.add(cancelButton);

        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.add(bodyLabel, BorderLayout.NORTH);
        contentPanel.add(formPanel, BorderLayout.CENTER);

        cancelPanel.add(titleLabel, BorderLayout.NORTH);
        cancelPanel.add(contentPanel, BorderLayout.CENTER);

        add(cancelPanel);

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                mainWindow.setVisible(true);
            }

            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                mainWindow.setVisible(true);
            }
        });
        mainWindow.setVisible(false);
        setVisible(true);
    }
}
