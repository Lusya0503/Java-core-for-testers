package lesson1;

public class Treadmill implements Overcomabl{
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public void overcome(CanRunCanJump canRunCanJump){
        canRunCanJump.run(length);
    }
}
