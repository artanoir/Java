import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        guessNum();

    }

    static void guessNum() {
        System.out.println("Computer will pick a number from 0 to 9 and you should guess this value.\n");
        System.out.println("Please enter any number from 0 to 9.");
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int compnum = rand.nextInt(10);

        for (int attempts =0; attempts < 3; attempts++) {
            int usernum = scanner.nextInt();
            if (usernum == compnum) {
                System.out.println("You win!");
            }
            else if (usernum > compnum) {
                System.out.println("Your number is greater. Please try once more!");
            }
            else if (usernum < compnum) {
                System.out.println("Your number is smaller. Please try once more!");
            }
            else if (attempts == 3) {
                System.out.println("You lose!");
            }
            attempts += 1;

        }
    }
}