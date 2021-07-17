package lesson1;

 public class Human implements CanRunCanJump {
     private int runLength;
     private int jumpHeight;

     public Human(int runLength, int jumpHeight) {
         this.runLength = runLength;
         this.jumpHeight = jumpHeight;
     }

     @Override
     public void run(int length) {
         if(length > runLength) {
         System.out.println("Я человек, пробег не успешен!");
     } else {
         System.out.println("Я человек, пробежал успешно!");
      }
     }

     @Override
     public void jump(int height) {
         if(height > jumpHeight) {
             System.out.println("Я человек, прыжок не успешен!");
         } else {
             System.out.println("Я человек, прыгнул успешно!");
         }
     }
 }