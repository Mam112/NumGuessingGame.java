# NumGuessingGame.java
import java.util.*;

public class Task1 {
    public static void numGuessing() {
        Scanner sc = new Scanner(System.in);
        int n = 1 + (int) (100 * Math.random());

        // Trials given

        int N = 5;
        int i, guessNum;
        System.out.println("A number is chosen" + " Btw 1 to 100" + " within 5 trials.");

        // Iterate over N trials
        for (i = 0; i < N; i++) {
            System.out.println("Guess the number:");

            // Take input for guessing
            guessNum = sc.nextInt();

            // If number is guessed
            if (n == guessNum) {
                System.out.println("Congratulations!!" + "You guessed the number.\nWON THE GAME");
                break;
            } else if (n > guessNum && i != N - 1) {
                System.out.println("The number is" + " greater than " + guessNum);
            } else if (n < guessNum && i != N - 1) {
                System.out.println("The number is less than" + guessNum);
            }
        }
        if (i == N) {
            System.out.println("You have reached " + N + " attempts.\n LOSE THE GAME...");
            System.out.println("The number was " + n);
        }
    }

    public static void main(String[] args) {
        numGuessing();
    }
}
