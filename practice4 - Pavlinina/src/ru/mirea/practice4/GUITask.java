package ru.mirea.practice4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUITask {

    static class Game extends JFrame {

        private int milanCounter = 0;
        private int madridCounter = 0;
        JButton buttonACMilan = new JButton("AC Milan");
        JButton buttonRealMadrid = new JButton("Real Madrid");
        //        JButton buttonResult = new JButton("End of match");
        JLabel matchResult = new JLabel("Result: " + milanCounter + "X" + madridCounter);
        JLabel scorerLabel = new JLabel("Last Scorer: N/A");
        Label winnerLabel = new Label("Winner: N/A");

        Game() {
            super("task");
            setLayout(null);
            buttonACMilan.setBounds(100, 230, 150, 20);
            buttonRealMadrid.setBounds(300, 230, 150, 20);
            matchResult.setBounds(230, 100, 200, 50);
            matchResult.setFont(new Font("Roboto", Font.PLAIN,20));
            scorerLabel.setBounds(200, 150, 200, 20);
            scorerLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
            winnerLabel.setBounds(200, 175, 200, 20);
            winnerLabel.setFont(new Font("Roboto", Font.PLAIN, 15));;
//            buttonResult.setBounds(150,350,200,20);
            add(buttonACMilan);
            buttonACMilan.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    milanCounter += 1;
                    scorerLabel.setText("Last scorer: AC Milan");
                    matchResult.setText("Result: " + milanCounter + "X" + madridCounter);
                    if (madridCounter == milanCounter)
                        winnerLabel.setText("WINNER: Draw");
                    else winnerLabel.setText(madridCounter > milanCounter ? "WINNER: Real Madrid" : "WINNER: AC Milan");
                }
            });
            add(buttonRealMadrid);
            buttonRealMadrid.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    madridCounter += 1;
                    scorerLabel.setText("Last scorer: Real Madrid");
                    matchResult.setText("Result: " + milanCounter + "X" + madridCounter);
                    if (madridCounter == milanCounter)
                        winnerLabel.setText("WINNER: Draw");
                    else winnerLabel.setText(madridCounter > milanCounter ? "WINNER: Real Madrid" : "WINNER: AC Milan");
                }
            });
//            add(buttonResult);
//            buttonResult.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    winnerLabel.setText(madridCounter>milanCounter?"WINNER: Real Madrid":"WINNER: AC Milan");
//                    scorerLabel.setText("Last scorer: N/A");
//                    milanCounter=0;
//                    madridCounter=0;
//                    matchResult.setText("Result: "+milanCounter+"X"+madridCounter);
//                }
//            });
            add(matchResult);
            add(scorerLabel);
            add(winnerLabel);
            setSize(550, 500);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Game();
    }

}
