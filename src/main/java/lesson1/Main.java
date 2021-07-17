package lesson1;

public class Main {
    public static void main(String[] args) {
        CanRunCanJump[] canRunCanJumps = {new Cat(10, 3), new Human(20, 5),
                new Robot(50, 10)};

        Overcomabl[] overcomabls = {new Wall(8), new Treadmill(3)};

        for (CanRunCanJump canRunCanJump : canRunCanJumps) {
            for (Overcomabl overcomabl : overcomabls) {
                overcomabl.overcome(canRunCanJump);
            }
        }
    }
}