package breakoutBall;
import java.awt.*;

public class Collision {

    public void isCollision(Ball ball, Paddle paddle) {

        int bX = ball.getX();                           //ball X coordinate
        int bY = ball.getY();                           //ball Y coordinate
        int bR = ball.getRadius();                      //ball radius
        int pX = paddle.getX();                         //object X coordinate
        int pY = paddle.getY();                         //object X coordinate
        int pW = paddle.getWidth();                     //object width
        int pH = paddle.getHeight();                    //object height

        Rectangle object = new Rectangle(pX,pY,pW,pH);
        Rectangle myBall = new Rectangle(bX,bY,bR,bR);

        if (myBall.intersects(object))
        {
            if ( bY > pY ) ball.setBallVelocityX(ball.getBallVelocityX()*-1);
            else if ( bY < pY ) ball.setBallVelocityY(ball.getBallVelocityY()*-1);
            else {
                ball.setBallVelocityY(ball.getBallVelocityY()*-1);
                ball.setBallVelocityX(ball.getBallVelocityX()*-1);
            }
        }

    }

}
