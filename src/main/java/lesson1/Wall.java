package lesson1;

public class Wall implements Overcomabl {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void overcome(CanRunCanJump canRunCanJump){
        canRunCanJump.jump(height);
    }
}
