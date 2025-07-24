package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("AGP Airlines");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JLabel label1 = new JLabel("New booking", SwingConstants.CENTER);
        label1.setFont(new Font("Arial", Font.BOLD, 24));
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);

        mainPanel.add(Box.createVerticalStrut(5));
        mainPanel.add(label1);

        JLabel label2 = new JLabel("Welcome to AGP Airlines", SwingConstants.CENTER);
        label2.setFont(new Font("Arial", Font.PLAIN, 20));
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(label2);

        JLabel label3 = new JLabel("Enjoy your flight and travel everywhere you want", SwingConstants.CENTER);
        label3.setFont(new Font("Arial", Font.PLAIN, 20));
        label3.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(Box.createVerticalStrut(5));
        mainPanel.add(label3);

        JLabel label4 = new JLabel("See all routes, buy your tickets and taste the feeling of flying", SwingConstants.CENTER);
        label4.setFont(new Font("Arial", Font.PLAIN, 20));
        label4.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(Box.createVerticalStrut(5));
        mainPanel.add(label4);

        JButton burgerButton = new JButton("\u2630");
        JPanel northPanel = new JPanel(new BorderLayout());
        JPanel topRightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        topRightPanel.add(burgerButton);

        JPopupMenu menu = new JPopupMenu();
        JMenuItem item1 = new JMenuItem("Home");
        JMenuItem item2 = new JMenuItem("Change flight");
        JMenuItem item3 = new JMenuItem("Cancel flight");
        JMenuItem item4 = new JMenuItem("Settings");
        JMenuItem item5 = new JMenuItem("Exit");

        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);
        menu.add(item5);

        mainPanel.add(Box.createVerticalStrut(20));

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton btn1 = new JButton("Return");
        JButton btn2 = new JButton("One way");
        JButton btn3 = new JButton("Multicity");

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);

        mainPanel.add(panel);

        JLabel label5 = new JLabel("Departure airport", SwingConstants.CENTER);
        label5.setFont(new Font("Arial", Font.PLAIN, 20));
        label5.setAlignmentX(Component.CENTER_ALIGNMENT);
        label5.setVisible(false);
        mainPanel.add(Box.createVerticalStrut(5));
        mainPanel.add(label5);

        String[] destinations = {
                "Athens (ATH) - Greece", "Thessaloniki (SKG) - Greece", "Heraklion (HER) - Greece",
                "London Heathrow (LHR) - United Kingdom", "London Gatwick (LGW) - United Kingdom",
                "Paris Charles de Gaulle (CDG) - France", "Paris Orly (ORY) - France",
                "Amsterdam Schiphol (AMS) - Netherlands", "Frankfurt (FRA) - Germany", "Munich (MUC) - Germany",
                "Rome Fiumicino (FCO) - Italy", "Milan Malpensa (MXP) - Italy",
                "Barcelona El Prat (BCN) - Spain", "Madrid Barajas (MAD) - Spain",
                "Vienna International (VIE) - Austria", "Zurich (ZRH) - Switzerland",
                "Copenhagen (CPH) - Denmark", "Stockholm Arlanda (ARN) - Sweden", "Oslo Gardermoen (OSL) - Norway",
                "Dublin (DUB) - Ireland", "Lisbon Humberto Delgado (LIS) - Portugal", "Brussels Airport (BRU) - Belgium",
                "Warsaw Chopin (WAW) - Poland", "Prague Vaclav Havel (PRG) - Czech Republic",
                "Budapest Ferenc Liszt (BUD) - Hungary", "Dubai International (DXB) - UAE",
                "Abu Dhabi International (AUH) - UAE", "Doha Hamad International (DOH) - Qatar",
                "Istanbul Airport (IST) - Turkey", "Tel Aviv Ben Gurion (TLV) - Israel",
                "Tokyo Narita (NRT) - Japan", "Tokyo Haneda (HND) - Japan", "Seoul Incheon (ICN) - South Korea",
                "Beijing Capital (PEK) - China", "Shanghai Pudong (PVG) - China", "Hong Kong International (HKG) - Hong Kong",
                "Bangkok Suvarnabhumi (BKK) - Thailand", "Singapore Changi (SIN) - Singapore",
                "Kuala Lumpur International (KUL) - Malaysia", "New Delhi Indira Gandhi (DEL) - India",
                "Mumbai Chhatrapati Shivaji (BOM) - India", "Jakarta Soekarno-Hatta (CGK) - Indonesia",
                "Manila Ninoy Aquino (MNL) - Philippines", "Doha Hamad International (DOH) - Qatar"
        };

        JComboBox<String> destinationBox = new JComboBox<>(destinations);
        destinationBox.setMaximumSize(new Dimension(300, 30));
        destinationBox.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel destinationPanel = new JPanel();
        destinationPanel.setLayout(new FlowLayout());
        destinationPanel.add(destinationBox);
        destinationPanel.setVisible(false);
        mainPanel.add(destinationPanel);

        JLabel label6 = new JLabel("Arrival airport", SwingConstants.CENTER);
        label6.setFont(new Font("Arial", Font.PLAIN, 20));
        label6.setAlignmentX(Component.CENTER_ALIGNMENT);
        label6.setVisible(false);
        mainPanel.add(Box.createVerticalStrut(5));
        mainPanel.add(label6);

        JComboBox<String> destinationBox2 = new JComboBox<>(destinations);
        destinationBox2.setMaximumSize(new Dimension(300, 30));
        destinationBox2.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel destinationPanel2 = new JPanel();
        destinationPanel2.setLayout(new FlowLayout());
        destinationPanel2.add(destinationBox2);
        destinationPanel2.setVisible(false);
        mainPanel.add(destinationPanel2);

        // ActionListener for "Return" button
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label5.setVisible(true);
                destinationPanel.setVisible(true);

                label6.setVisible(true);
                destinationPanel2.setVisible(true);

                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });

        burgerButton.addActionListener(e -> menu.show(burgerButton, 0, burgerButton.getHeight()));

        // ActionListener for "Cancel flight" menu item
        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCancelFlightWindow();
            }
        });

        item5.addActionListener(e -> System.exit(0));

        frame.add(topRightPanel, BorderLayout.NORTH);
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    // 
    private static void openCancelFlightWindow() {
        JFrame cancelFrame = new JFrame("Cancel Flight - AGP Airlines");
        cancelFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cancelFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        cancelFrame.setLocationRelativeTo(null); 
        
        JPanel cancelPanel = new JPanel();
        cancelPanel.setLayout(new BorderLayout());
        cancelPanel.setBackground(Color.WHITE);
        
        JLabel titleLabel = new JLabel("Cancel Flight", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        
        JLabel bodyLabel = new JLabel("<html><div style='width: 700px;'>While travelling we often face unexpected obstacles and changes. We get it! Using our user-friendly 'cancel' option, Agp flight bookings can be refunded easily. The reimbursement of the airfare is contingent upon the fare conditions.</div></html>");
        bodyLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        bodyLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 0, 0)); 
        bodyLabel.setVerticalAlignment(SwingConstants.TOP);
        bodyLabel.setHorizontalAlignment(SwingConstants.LEFT);
        
        cancelPanel.add(titleLabel, BorderLayout.NORTH);
        cancelPanel.add(bodyLabel, BorderLayout.CENTER);
        
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
        
        cancelFrame.add(cancelPanel);
        cancelFrame.setVisible(true);        
    }
}