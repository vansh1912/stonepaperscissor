import javax.sound.sampled.Line;
import java.util.Scanner;
import java.util.Random;

public class game {
    public static void main(String[] args) {

        Scanner start = new Scanner(System.in);
        shuffler obj = new shuffler();

        System.out.print("Enter 'yes' to play Rock Paper Scissors : ");
        String game = start.nextLine();
        if (game.equalsIgnoreCase("yes")) {
            System.out.println(" Game will begin in 3 seconds ");
            int i = 1;
            while (i == 1) {
                String game1 = obj.shuffle();
                System.out.println("Enter 1 for stone \nEnter 2 for Scissors \nEnter 3 for Paper");
                int choice = start.nextInt();
                if (choice == 1) {
                    if (game1.equalsIgnoreCase("stone"))
                        System.out.println("Your answer is correct");
                    else
                        System.out.println("You lose!");
                } else if (choice == 2) {
                    if (game1.equalsIgnoreCase("scissor"))
                        System.out.println("Your answer is correct");
                    else
                        System.out.println("You lose!");
                } else if (choice == 3) {
                    if (game1.equalsIgnoreCase("paper"))
                        System.out.println("Your answer is correct");
                    else
                        System.out.println("You lose!");
                } else
                    System.out.println("Invalid Input");
                System.out.println(" Do you want to run the code again ? \n Enter Y to continue and N to Stop.");
                char y = start.next().charAt(0);
                if (y == 'N')
                    i = 0 ;



            }

        }
        else
            System.out.println(" Come again later ");




        }
    }




