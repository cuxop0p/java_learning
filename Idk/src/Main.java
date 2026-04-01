package Idk;

public class Main {

    public static void main(String[] args) {
        String name = "Ari";
        int age = 20;

        showGreeting();

        System.out.println("Ich heiße " + name + ".");
        System.out.println("Außerdem bin ich " + age + " Jahre alt.");

    }

    public static void showGreeting() {
        int hour = 15;
        System.out.println("");;
        if(hour < 12)  {
            System.out.println("Guten Morgen, guten Morgen, guten Morgen Sonnenschein! ♡");
        } else {
            if (hour < 18) {
                System.out.println("Guten Tag Herr Nasemann");
            }
            else {
                System.out.println("Guten Abend du Pups!");
            }

        }

    }
}
