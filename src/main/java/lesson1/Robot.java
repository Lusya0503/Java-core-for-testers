package lesson1;

public class Robot implements CanRunCanJump {
    private int runLength;
    private int jumpHeight;

    public Robot(int runLength, int jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run(int length) {
        if(length > runLength) {
            System.out.println("Я робот, пробег не успешен!");
        } else {
            System.out.println("Я робот, пробежал успешно!");
        }
    }

    @Override
    public void jump(int height) {
        if(height > jumpHeight) {
            System.out.println("Я робот, прыжок не успешен!");
        } else {
            System.out.println("Я робот, прыгнул успешно!");
        }
    }
}



