import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);


        System.out.println("DRAGON CAVE");
        System.out.println("You are in a land full of dragons. In front of you,\n you see two caves.");
        System.out.println("In one cave there is a friendly dragon who may share his treasure with you...");
        System.out.println("The other cave beholds a greedy, hungry dragon who will eat you on sight...");
        System.out.print("\nWhich cave will you go into? (1 or 2) \n>\t");


        String USER_INPUT = myObj.nextLine();

        if (Integer.valueOf(USER_INPUT) == 1) {
            System.out.println("You approach the cave...\nIt is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("Gobbles you down in one bite!");
        } else if (Integer.valueOf(USER_INPUT) == 2) {
            System.out.println("You see large crystals on the walls with purple liquid dripping down the tips.");
            System.out.println("In the distance you see a glow...");
            System.out.println("As you approach this glow, you realize there is a computer screen facing towards you.");
            System.out.println("A dragon only twice your size walks into the computer room..." +
                    "\nHe's holding a cup of coffee...");
            System.out.println("Though he looks confused, he grins and asks if you would like to learn Java.");
            System.out.println("The treasure was programming knowledge!");
        } else {
            System.out.println("You go back to your village...");
        }


    }

}
