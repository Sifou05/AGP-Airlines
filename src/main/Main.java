package main;

import javax.swing.*;

import booking.*;

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

        // Departure

        JComboBox<String> departureBox = new JComboBox<>(destinations);
        JPanel departurePanel = new JPanel();
        departurePanel.add(departureBox);
        departurePanel.setVisible(false);
        mainPanel.add(departurePanel);

        // Arrival
        JLabel label6 = new JLabel("Arrival airport", SwingConstants.CENTER);
        label6.setFont(new Font("Arial", Font.PLAIN, 20));
        label6.setAlignmentX(Component.CENTER_ALIGNMENT);
        label6.setVisible(false);
        mainPanel.add(Box.createVerticalStrut(5));
        mainPanel.add(label6);

        JComboBox<String> arrivalBox = new JComboBox<>(destinations);
        JPanel arrivalPanel = new JPanel();
        arrivalPanel.add(arrivalBox);
        arrivalPanel.setVisible(false);
        mainPanel.add(arrivalPanel);

        // Category
        JLabel label7 = new JLabel("Category position", SwingConstants.CENTER);
        label7.setFont(new Font("Arial", Font.PLAIN, 20));
        label7.setAlignmentX(Component.CENTER_ALIGNMENT);
        label7.setVisible(false);
        mainPanel.add(Box.createVerticalStrut(5));
        mainPanel.add(label7);

        Choice position = new Choice();
        position.add("Economy class");
        position.add("Business class");
        position.add("Exclusive class");
        position.add("Exclusive+ class");
        JPanel categoryPanel = new JPanel();
        categoryPanel.add(position);
        categoryPanel.setVisible(false);
        mainPanel.add(categoryPanel);

        JLabel label8 = new JLabel("Passengers", SwingConstants.CENTER);
        label8.setFont(new Font("Arial", Font.PLAIN, 20));
        label8.setAlignmentX(Component.CENTER_ALIGNMENT);
        label8.setVisible(false);
        mainPanel.add(Box.createVerticalStrut(5));
        mainPanel.add(label8);

        JPanel passengerPanel = new JPanel();
        passengerPanel.setLayout(new GridLayout(4, 1));
        passengerPanel.setVisible(false);

        final int[] adults = {0};
        final int[] children = {0};
        final int[] infants = {0};

        JLabel adultLabel = new JLabel("0");
        JLabel childrenLabel = new JLabel("0");
        JLabel infantsLabel = new JLabel("0");
        JLabel totalLabel = new JLabel("All passengers: 0", SwingConstants.CENTER);
        totalLabel.setFont(new Font("Arial", Font.PLAIN, 20));

        JPanel adultsPanel = new JPanel();
        adultsPanel.add(new JLabel("Adults (age>18): "));
        JButton minusAdult = new JButton("-");
        JButton plusAdult = new JButton("+");
        adultsPanel.add(minusAdult);
        adultsPanel.add(adultLabel);
        adultsPanel.add(plusAdult);
        passengerPanel.add(adultsPanel);

        JPanel childrenPanel = new JPanel();
        childrenPanel.add(new JLabel("Children (age:3-18): "));
        JButton minusChild = new JButton("-");
        JButton plusChild = new JButton("+");
        childrenPanel.add(minusChild);
        childrenPanel.add(childrenLabel);
        childrenPanel.add(plusChild);
        passengerPanel.add(childrenPanel);

        JPanel infantsPanel = new JPanel();
        infantsPanel.add(new JLabel("Infants (age<3): "));
        JButton minusInfant = new JButton("-");
        JButton plusInfant = new JButton("+");
        infantsPanel.add(minusInfant);
        infantsPanel.add(infantsLabel);
        infantsPanel.add(plusInfant);
        passengerPanel.add(infantsPanel);

        passengerPanel.add(totalLabel);
        mainPanel.add(passengerPanel);

        ActionListener updateTotal = e -> {
            int total = adults[0] + children[0] + infants[0];
            totalLabel.setText("All passengers: " + total);
        };

        plusAdult.addActionListener(e -> {
            adults[0]++;
            adultLabel.setText(String.valueOf(adults[0]));
            updateTotal.actionPerformed(null);
        });

        minusAdult.addActionListener(e -> {
            adults[0] = Math.max(0, adults[0] - 1);
            adultLabel.setText(String.valueOf(adults[0]));
            updateTotal.actionPerformed(null);
        });

        plusChild.addActionListener(e -> {
            children[0]++;
            childrenLabel.setText(String.valueOf(children[0]));
            updateTotal.actionPerformed(null);
        });

        minusChild.addActionListener(e -> {
            children[0] = Math.max(0, children[0] - 1);
            childrenLabel.setText(String.valueOf(children[0]));
            updateTotal.actionPerformed(null);
        });

        plusInfant.addActionListener(e -> {
            infants[0]++;
            infantsLabel.setText(String.valueOf(infants[0]));
            updateTotal.actionPerformed(null);
        });

        minusInfant.addActionListener(e -> {
            infants[0] = Math.max(0, infants[0] - 1);
            infantsLabel.setText(String.valueOf(infants[0]));
            updateTotal.actionPerformed(null);
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label5.setVisible(true);
                departurePanel.setVisible(true);
                label6.setVisible(true);
                arrivalPanel.setVisible(true);
                label7.setVisible(true);
                categoryPanel.setVisible(true);
                position.setVisible(true);
                label8.setVisible(true);
                passengerPanel.setVisible(true);
                mainPanel.revalidate();
                mainPanel.repaint();
            }
        });

        burgerButton.addActionListener(e -> menu.show(burgerButton, 0, burgerButton.getHeight()));
        
        item2.addActionListener(e -> {
        	ChangeBooking dialogBooking = new ChangeBooking(frame);
        	dialogBooking.setVisible(true);
        });

        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	frame.setVisible(false);
                new CancelBooking(frame);
            }
        });

        item5.addActionListener(e -> System.exit(0));

        frame.add(topRightPanel, BorderLayout.NORTH);
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

}
