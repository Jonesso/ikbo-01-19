package ru.mirea.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Task1 extends JFrame {

    private int randNum;
    private int attempts_left = 3;
    private JTextField numField;

    public Task1() {

        Random random = new Random();
        randNum = random.nextInt(21);
        System.out.println(randNum);

        setTitle("Guessing game");
        setMinimumSize(new Dimension(500, 400));
        setSize(700, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel rulesLabel = new JLabel();
        rulesLabel.setText("Try to guess the number from 0 to 20");
        rulesLabel.setFont(new Font("Arial", Font.BOLD, 20));
        rulesLabel.setBounds(70, 50, 400, 30);
        add(rulesLabel);

        numField = new JTextField();
        numField.setFont(new Font("Arial", Font.BOLD, 28));
        numField.setBounds(200, 150, 100, 30);
        add(numField);

        JLabel resLabel = new JLabel();
        resLabel.setVisible(false);
        add(resLabel);

        JButton guessButton = new JButton("Guess!");
        guessButton.setBounds(200, 200, 100, 30);
        add(guessButton);
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int userNum = Integer.parseInt(numField.getText());
                if (userNum == randNum) {
                    resLabel.setText("You win!");
                    resLabel.setBounds(195, 270, 400, 30);
                    resLabel.setFont(new Font("Arial", Font.BOLD, 28));
                    resLabel.setForeground(Color.GREEN);
                    resLabel.setVisible(true);
                    guessButton.setVisible(false);
                    remove(guessButton);

                } else {
                    if (attempts_left > 1) {
                        attempts_left--;
                        resLabel.setText("You didn't guess. Attempts left: " + attempts_left);
                        resLabel.setBounds(90, 270, 400, 30);
                        resLabel.setFont(new Font("Arial", Font.BOLD, 22));
                        resLabel.setForeground(Color.ORANGE);
                        resLabel.setVisible(true);
                    } else {
                        resLabel.setText("You lose");
                        resLabel.setBounds(190, 270, 400, 30);
                        resLabel.setFont(new Font("Arial", Font.BOLD, 28));
                        resLabel.setForeground(Color.RED);
                        resLabel.setVisible(true);
                        guessButton.setVisible(false);
                        remove(guessButton);
                    }
                }
            }
        });


        pack();
        setVisible(true);
    }


    public static void main(String[] args) {
        new Task1();
    }
}
