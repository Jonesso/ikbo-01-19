package ru.mirea.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Task3 extends JFrame {
    private JComboBox<String> colorBox;
    private JComboBox<String> fontBox;
    private JTextArea area;
    private String[] fonts = new String[]{"Times New Roman",
            "MS Sans Serif",
            "Courier New"};
    private String[] colors = new String[]{"Black", "Blue", "Red"};

    public Task3() {
        //window
        setTitle("Fonts and colors");
        setMinimumSize(new Dimension(500, 400));
        setSize(700, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        //text area
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BorderLayout());
        area = new JTextArea();
        area.setFont(new Font("Arial", Font.BOLD, 28));
        area.setForeground(Color.DARK_GRAY);
        textPanel.add(area, BorderLayout.CENTER);
        textPanel.setBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(textPanel, BorderLayout.CENTER);

        //combo boxes
        JPanel boxesPanel = new JPanel();
        colorBox = new JComboBox<>();
        fontBox = new JComboBox<>();

        for (String color : colors) {
            colorBox.addItem(color);
        }

        for (String font : fonts) {
            fontBox.addItem(font);
        }

        colorBox.setBorder(
                BorderFactory.createEmptyBorder(0, 0, 0, 20));
        fontBox.setBorder(
                BorderFactory.createEmptyBorder(0, 20, 0, 0));

        boxesPanel.add(colorBox, BorderLayout.WEST);
        boxesPanel.add(fontBox, BorderLayout.EAST);
        add(boxesPanel, BorderLayout.SOUTH);

        //action listeners for combo boxes
        ActionListener colorListener = e -> {
            JComboBox<String> box = (JComboBox<String>) e.getSource();
            String selectedColor = (String) box.getSelectedItem();

            area.setForeground(setColor(selectedColor));
        };

        ActionListener fontListener = e -> {
            JComboBox<String> box = (JComboBox<String>) e.getSource();
            String selectedFont = (String) box.getSelectedItem();
            area.setFont(new Font(selectedFont, Font.BOLD, 28));
        };

        colorBox.addActionListener(colorListener);
        fontBox.addActionListener(fontListener);

        //menus
        JMenuBar menuBar = new JMenuBar();
        JMenu fontMenu = new JMenu("Text font");
        JMenu colorMenu = new JMenu("Text color");

        //mouse listeners for menus
        for (String font : fonts) {
            JMenuItem fontItem = new JMenuItem(font);
            fontItem.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseReleased(MouseEvent e) {
                    super.mouseReleased(e);
                    area.setFont(new Font(font, Font.BOLD, 28));
                }
            });
            fontMenu.add(fontItem);
        }

        for (String color : colors) {
            JMenuItem colorItem = new JMenuItem(color);
            colorItem.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseReleased(MouseEvent e) {
                    super.mouseReleased(e);
                    area.setForeground(setColor(color));
                }
            });
            colorMenu.add(colorItem);
        }

        menuBar.add(fontMenu);
        menuBar.add(colorMenu);
        add(menuBar, BorderLayout.NORTH);
        setJMenuBar(menuBar);

        pack();
        setVisible(true);
    }

    private Color setColor(String selectedColor) {
        switch (selectedColor) {
            case "Blue":
                return Color.BLUE;
            case "Red":
                return Color.RED;
            case "Black":
                return Color.BLACK;
            default:
                throw new IllegalStateException("Unexpected value: " + selectedColor);
        }
    }

    public static void main(String[] args) {
        new Task3();
    }
}
