package breakoutBall;

public class Collision {

    Ball ball = new Ball();
    public boolean isCollisionY(Ball ball, Paddle paddle) {

        boolean check = false;
        if (ball.getX() > paddle.getX() && ball.getX() < paddle.getX() + paddle.getWidth()) {

            if (ball.getY() + ball.getRadius() > paddle.getY()) {
                check = true;
            }
        }
        return check;
    }

    public boolean isCollisionX(Ball ball, Paddle paddle) {

        boolean check = false;
        if (ball.getX() < paddle.getX() + paddle.getWidth() && ball.getY() > paddle.getY() && ball.getY() < paddle.getY() + paddle.getHeight()) {

            if ( ball.getX() + ball.getRadius() > paddle.getX()) {
                check = true;
            }
        }
        return check;
    }

//    public boolean isCollisionXY (Ball ball, Paddle paddle) {
//
//        if ( ball.getX() + ball.getRadius() == paddle.getX() && ball.getY() == paddle.getY() ) {
//            return true;
//        }
//        else if ( ball.getX() + ball.getRadius() == paddle.getX() + paddle.getWidth() && ball.getY() == paddle.getY() ) {
//            return true;
//        }
//        else if ( ball.getX() + ball.getRadius() == paddle.getX() + paddle.getWidth() && ball.getY() == paddle.getY() + paddle.getHeight()  ) {
//            return true;
//        }
//        else if ( ball.getX() + ball.getRadius() == paddle.getX() && ball.getY() == paddle.getY() + paddle.getHeight() ) {
//            return true;
//        }
//        else return false;
//    }
}
