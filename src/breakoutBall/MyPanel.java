package breakoutBall;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MyPanel extends JPanel {

    Ball ball = new Ball();
    Paddle paddle = new Paddle();
    Collision collision = new Collision();
    final int panelWidth = 800;
    final int panelHeight = 600;

    MyPanel() {

        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

                if ( e.getKeyCode() == 37 ) {
                    paddle.setX(paddle.getX()-10);
                }
                if ( e.getKeyCode() == 39 ) {
                    paddle.setX(paddle.getX()+10);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        Timer timer = new Timer(3,
                e -> {

                    if (ball.getX() + ball.getRadius() > panelWidth || ball.getX() < 0) {
                        ball.setBallVelocityX(ball.getBallVelocityX() * -1);
                    }
                    if (ball.getY() + ball.getRadius() > panelHeight || ball.getY() < 0) {
                        ball.setBallVelocityY(ball.getBallVelocityY() * -1);
                    }
                    collision.isCollision(ball, paddle);

                    ball.setX(ball.getX() + ball.getBallVelocityX());
                    ball.setY(ball.getY() + ball.getBallVelocityY());
                    repaint();
                });
        timer.start();

    }


    public void paintComponent(Graphics graphics) {

        super.paintComponent(graphics);
        Graphics2D graph2D = (Graphics2D) graphics;
        graph2D.setColor(Color.yellow);
        graph2D.fillRect(paddle.getX(), paddle.getY(), paddle.getWidth(), paddle.getHeight());
        graph2D.setColor(Color.blue);
        graph2D.fillOval(ball.getX(), ball.getY(), ball.getRadius(), ball.getRadius());
    }

}