import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {
        int guess;
        String trash;

        Random generator = new Random();

        int val = generator.nextInt(10) + 1;


        Scanner in = new Scanner(System.in);
        System.out.println("Enter your guess between 1 and 10");
        if(in.hasNextInt()) {
            guess = in.nextInt();
            in.nextLine();
            if(guess >=1&&guess<= 10){

                if (guess == val) {
                    System.out.printf("The number was %d, you were correct!", val);
                } else if (guess < val) {
                    System.out.printf("The number was %d, you were too low!", val);
                }else{
                    System.out.printf("The number was %d, you were too high!", val);
                }

            }else{
                System.out.println("Invalid number entered: "+guess);
            }
        }else{
            trash = in.nextLine();
            System.out.println("Invalid number entered: "+trash);
        }


    }
}