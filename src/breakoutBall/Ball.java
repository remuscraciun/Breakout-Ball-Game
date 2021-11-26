package breakoutBall;

public class Ball {

    private int x = 198;
    private int y = 463;
    private int ballVelocityX = 1;
    private int ballVelocityY = 1;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getRadius() {
        return 30;
    }
    public int getBallVelocityX() {
        return ballVelocityX;
    }
    public void setBallVelocityX(int ballVelocityX) {
        this.ballVelocityX = ballVelocityX;
    }
    public int getBallVelocityY() {
        return ballVelocityY;
    }
    public void setBallVelocityY(int ballVelocityY) {
        this.ballVelocityY = ballVelocityY;
    }
}
