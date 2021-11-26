package breakoutBall;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    Ball ball = new Ball();
    Paddle paddle = new Paddle();
    Collision collision = new Collision();

    MyPanel() {
        final int panelWidth = 800;
        final int panelHeight = 600;
        this.setPreferredSize(new Dimension(panelWidth, panelHeight));
        this.setBackground(Color.black);

        Timer timer = new Timer(1, e -> {

            if (ball.getX() + ball.getRadius() > panelWidth || ball.getX() < 0 ) {
                ball.setBallVelocityX(ball.getBallVelocityX()*-1);
            }
            if (ball.getY() + ball.getRadius() > panelHeight || ball.getY() < 0 ) {
                ball.setBallVelocityY(ball.getBallVelocityY()*-1);
            }
            if (collision.isCollisionY(ball, paddle)) {
                ball.setBallVelocityY(ball.getBallVelocityY()*-1);
            }
            if (collision.isCollisionX(ball, paddle)) {
                ball.setBallVelocityX(ball.getBallVelocityX()*-1);
            }
//            if (collision.isCollisionXY(ball,paddle)) {
//                ball.setBallVelocityY(ball.getBallVelocityY()*-1);
//                ball.setBallVelocityX(ball.getBallVelocityX()*-1);
//            }

            ball.setX(ball.getX()+ball.getBallVelocityX());
            ball.setY(ball.getY()+ball.getBallVelocityY());
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
        graph2D.fillOval(ball.getX(),ball.getY(),ball.getRadius(),ball.getRadius());
    }
}
