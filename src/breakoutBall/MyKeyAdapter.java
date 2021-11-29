package breakoutBall;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyAdapter extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent e) {
        Paddle paddle = new Paddle();
        super.keyPressed(e);
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT -> paddle.setX(paddle.getX()-1);
            case KeyEvent.VK_RIGHT -> paddle.setX(paddle.getX()+1);
            default -> throw new IllegalStateException("Unexpected value: " + e.getKeyCode());
        }
    }
}
