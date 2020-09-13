package ru.mirea.lab5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Task3 {

    private int totalImages = 13, currentImage = 0, animationDelay = 30;
    private JLabel animationDisplayLabel = new JLabel();
    private Timer animationTimer;
    protected ImageIcon[] images = new ImageIcon[totalImages];

    public Task3() {
        for (int i = 0; i < images.length; i++)
            images[i] = new ImageIcon(this.getClass().getResource("/images/frame_" + i + ".gif"));
        startAnimation();
    }

    public void startAnimation() {
        ActionListener listener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                currentImage = (currentImage + 1) % images.length;
                animationDisplayLabel.setIcon(images[currentImage]);
            }
        };
        animationDisplayLabel.setIcon(images[0]);
        animationTimer = new Timer(animationDelay, listener);
        animationTimer.start();
    }

    public JComponent getAnimationComponent() {
        return animationDisplayLabel;
    }

    public static void main(String[] args) {
        Runnable r = new Runnable() {

            @Override
            public void run() {
                Task3 fp = new Task3();

                JFrame f = new JFrame("Animation test");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                f.add(fp.getAnimationComponent());
                f.pack();
                f.setLocationByPlatform(true);

                f.setVisible(true);
            }
        };
        SwingUtilities.invokeLater(r);
    }
}