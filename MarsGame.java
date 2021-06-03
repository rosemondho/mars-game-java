import java.util.Scanner;

public class MarsGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("System loading ...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Booting up ...");

        try {
        Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ready");

        System.out.print("What is your name? > ");
        String name = input.next();

        System.out.println("Hi " + name + ". " + "Welcome to The Mars Adventure Game. Yesterday, you received a call from your good friend at NASA. They need someone to go to Mars this weekend, and you've been chosen.");

        System.out.println("Are you excited? Type Y or N.");
        System.out.print("> ");
        String excited = input.next();

        if (excited.equals("Y")) {
            System.out.println("I knew you'd say that. It's so cool that you're going to Mars!");
        } else if (excited.equals("N")) {
            System.out.println("Good luck to you, sir. Have a good day.");
            return;
        }

        System.out.println("It's time to pack for your trip to Mars. How many suitcases do you plan to bring?");
        System.out.print("> ");
        int suitcases = input.nextInt();

        if (suitcases > 2) {
            System.out.println("That's too many! Get off this ship!");
        } else if (suitcases == 2) {
            System.out.println("That's perfect! Go you!");
        } else if (suitcases < 2) {
            System.out.println("You are the perfect *!@& packer.");
        }

        System.out.println("You're allowed to bring one companion animal with you. What kind of companion animal would you like to bring?");
        System.out.print("> ");
        String animalType = "";
        animalType = input.next();
        System.out.println("What is your companion's name?");
        System.out.print("> ");
        String companionName = "";
        companionName = input.next();

        String msg = String.format("Cool, so you're bringing %s the %s", companionName, animalType);
        System.out.println(msg);
 
        System.out.println();
        System.out.println("NASA has a interior design team offering to outfit your space ship. You have a couple of options for the interior decor of your ship.");
        System.out.println();
        System.out.println("Your options are: ");
        System.out.println("A  Sleek, modern minimalism");
        System.out.println("B  Retro/vintage space age");
        System.out.println("C  SF Hippie chic \n");
        System.out.println("Which decor would you like? Choose A, B, or C.");
        System.out.print("> ");
        String style = input.next();

        if (style.equals("A")) {
            style = "sleek and modern";
        } else if (style.equals("B")) {
            style = "retro";
        } else if (style.equals("C")) {
            style = "SF hippie chic";
        }

        String bye = String.format("I can see it now: \n%s and %s surfing the celestial abyss...\nin a %s spaceship. \n%s -- the day is here!\nYou crawl into the spaceship with %s.", name, companionName, style, name, companionName);
        System.out.println(bye);
        System.out.println("Brace for take off!");
        for (int i = 5; i > 0; i--) {
            System.out.println(i + "...");
            try {
                Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
        System.out.println("* LIFTOFF *");
    }
}