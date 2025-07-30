package main;

import javax.swing.*;
import java.awt.*;
import java.time.*;
import java.text.DateFormatSymbols;
import java.util.Locale;

public class CalendarPanel extends JPanel {
    JPanel calendarPanel = new JPanel();
    JComboBox<String> monthBox = new JComboBox<>();
    JComboBox<Integer> yearBox = new JComboBox<>();

    // Months
    final String[] months = new DateFormatSymbols(Locale.ENGLISH).getMonths();

    public CalendarPanel() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createTitledBorder("Departure date"));

        JPanel topPanel = new JPanel();

        // Months
        for (int i = 0; i < 12; i++) {
            monthBox.addItem(months[i]);
        }

        // Years
        for (int year = 2025; year <= 2026; year++) {
            yearBox.addItem(year);
        }

        topPanel.add(monthBox);
        topPanel.add(yearBox);
        add(topPanel, BorderLayout.NORTH);

        // Calendar panel
        calendarPanel = new JPanel();
        calendarPanel.setLayout(new GridLayout(0, 7));
        add(calendarPanel, BorderLayout.CENTER);

        // Listener for changing day
        monthBox.addActionListener(e -> refreshCalendar());
        yearBox.addActionListener(e -> refreshCalendar());

        LocalDate now = LocalDate.now();
        monthBox.setSelectedIndex(now.getMonthValue() - 1);
        yearBox.setSelectedItem(now.getYear());

        refreshCalendar();
    }

    private void refreshCalendar() {
        calendarPanel.removeAll();

        // Days
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (String name : dayNames) {
            JLabel label = new JLabel(name, SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 12));
            calendarPanel.add(label);
        }

        int month = monthBox.getSelectedIndex() + 1;
        int year = (int) yearBox.getSelectedItem();
        LocalDate firstDay = LocalDate.of(year, month, 1);
        int daysInMonth = YearMonth.of(year, month).lengthOfMonth();
        int startDay = firstDay.getDayOfWeek().getValue();

        // Κενά πριν την πρώτη μέρα
        for (int i = 1; i < startDay; i++) {
            calendarPanel.add(new JLabel(""));
        }

        // Choose a day
        for (int day = 1; day <= daysInMonth; day++) {
            int currentDay = day;
            JButton dayButton = new JButton(String.valueOf(currentDay));
            dayButton.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Departure date: " + currentDay + "/" + month + "/" + year);
            });
            calendarPanel.add(dayButton);
        }

        calendarPanel.revalidate();
        calendarPanel.repaint();
    }
}