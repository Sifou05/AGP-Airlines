package Main;

import javax.swing.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  Create burger button (3 horizontal lines)
        JButton burgerButton = new JButton("\u2630"); // ☰
        int buttonWidth = 50;
        int buttonHeight = 40;
        int marginRight = 20;
        int marginTop = 10;

        // Add components to frame
        frame.add(burgerButton);
        frame.setVisible(true);

        // Show frame
        SwingUtilities.invokeLater(() -> {
            int x = frame.getWidth() - buttonWidth - marginRight;
            burgerButton.setBounds(x, marginTop, buttonWidth, buttonHeight);
            frame.repaint();
        });

        // Create popup menu
        JPopupMenu menu = new JPopupMenu();
        JMenuItem item1 = new JMenuItem("Home");
        JMenuItem item2 = new JMenuItem("Settings");
        JMenuItem item3 = new JMenuItem("Exit");

        menu.add(item1);
        menu.add(item2);
        menu.add(item3);

        // Action to show menu on button click
        burgerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.show(burgerButton, 0, burgerButton.getHeight());
            }
        });

        // Add action to Exit item
        item3.addActionListener(e -> System.exit(0));
    }

}
