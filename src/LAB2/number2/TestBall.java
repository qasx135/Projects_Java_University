package LAB2.number2;

public class TestBall {
    public static void main(String[] args) {
        System.out.println("""
                ------
                Task with a ball
                ------""");
        Ball ball = new Ball();
        String info;
        ball.setX(12);
        ball.setY(34);
        info = ball.toString();
        System.out.println("The object ball with default constructor and emthods used " + info );
        Ball new_ball = new Ball(12.3, 100.45);
        for (int i = 1; i < 11; i++) {
            new_ball.move(i, i+1);
            info = new_ball.toString();
            System.out.println("Added to x: " + i +", to y: " + (i + 1));
            System.out.println("Info about ball: " + info);
        }
    }
}
