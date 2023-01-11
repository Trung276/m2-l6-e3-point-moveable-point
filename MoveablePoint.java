public class MoveablePoint extends Point {
    private float xSpeed = 0, ySpeed = 0;
    public MoveablePoint() {

    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float [] arr = new float[2];
        arr[0] = xSpeed;
        arr[1] = ySpeed;
        return arr;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "(" + super.getX() +
                "," + super.getY() +
                "), speed = (" + xSpeed +
                "," + ySpeed +
                ")}";
    }
    public MoveablePoint move() {
        float a = super.getX();
        a += xSpeed;
        this.setX(a);
        float b = super.getY();
        b += ySpeed;
        this.setY(b);
        return this;
    }
}
