import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumberGame {

    static int myNumber = ThreadLocalRandom.current().nextInt(0, 100 +1);
    int attempts = 0;
    void Run() {
        System.out.println("Guess Number Game");
        nextRound();
    }

    public void nextRound() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Bitte Zahl eingeben: ");
        int number = scanner.nextInt();
        attempts++;
        guess(number);

    }

    public void guess(int number) {
        if(number == myNumber) {
            System.out.println("Richtig geraten!");
            System.out.println("Du hast " + attempts + " Versuche gebraucht.");
        } else {
            System.out.println("Falsch geraten :(");

            if(number < myNumber) {
                System.out.println("Deine Zahl ist zu klein.");
            } else {
                System.out.println("Deine Zahl ist zu groß.");
            }
            nextRound();

        }
    }
}
