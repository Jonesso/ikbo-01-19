package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;

public class Task2 extends JFrame {
    public Task2(String path_to_img) {
        setLayout(null);
        setTitle("Picture");
        setMinimumSize(new Dimension(1000, 700));
        setSize(1000, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon(path_to_img);
        JLabel imgLabel = new JLabel(icon);
        JLabel textLabel = new JLabel("Your image:");
        textLabel.setBounds(350, 80, 400, 45);
        textLabel.setFont(new Font("Roboto", Font.PLAIN, 40));
        imgLabel.setBounds(330, 150, 400, 400);
        add(imgLabel);
        add(textLabel);
        pack();
        setVisible(true);
    }
}
