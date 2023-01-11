import java.util.Scanner;

public class TestMoveablePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        float x = sc.nextFloat();
        System.out.println("Enter y: ");
        float y = sc.nextFloat();
        System.out.println("Enter xspeed: ");
        float xSpeed = sc.nextFloat();
        System.out.println("Enter yspeed: ");
        float ySpeed = sc.nextFloat();
        MoveablePoint moveablePoint = new MoveablePoint(x, y, xSpeed, ySpeed);
        System.out.println(moveablePoint.toString());
        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}
