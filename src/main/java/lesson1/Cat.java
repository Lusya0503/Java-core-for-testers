package lesson1;


public class Cat implements CanRunCanJump{
    private int runLength;
    private int jumpHeight;

    public Cat(int runLength, int jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run(int length) {
        if(length > runLength) {
            System.out.println("Я кот, пробег не успешен!");
        } else {
            System.out.println("Я кот, пробежал успешно!");
        }
    }

    @Override
    public void jump(int height) {
        if(height > jumpHeight) {
            System.out.println("Я кот, прыжок не успешен!");
        } else {
            System.out.println("Я кот, прыгнул успешно!");
        }
    }
}



