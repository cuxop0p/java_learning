package rechner;

public class Main {

    public static void main (String[] args) {

        float money = 15.6f;
        convertToDollars(money);

    }

    public static void convertToDollars(float euro) {
        System.out.println("Der Betrag in Dollar ist: " + euro * 1.20);
    }

}
