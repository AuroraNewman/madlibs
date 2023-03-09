import java.util.InputMismatchException;
import java.util.Scanner;

public class MadLibIO {

    public static void main(String[] args) {
        MadLib madLib = new MadLib();
        printMenu(madLib);
    }

    private static void printMenu(MadLib madLib){
        boolean done = false;
        while (!done) {
            System.out.println();
            System.out.println("Please choose a number between 1 and " + MadLib.NUMBER_OF_MADLIBS + ".");
            System.out.println("To exit, please enter 0.");
            Scanner input = new Scanner(System.in);
            try {
                int entry = input.nextInt();
                if (entry == 0) {
                    System.out.println("Thanks for the laughs!");
                    System.out.println("See you next time!");
                    done = true;
                    break;
                }
                if (entry < 0) {
                    System.out.println("Please choose a positive integer.");
                    break;
                }
                if (entry > MadLib.NUMBER_OF_MADLIBS) {
                    System.out.println("That number is too large.");
                    break;
                } else MadLib.chooseMadLib(entry, madLib);
            } catch (InputMismatchException e) {
                System.out.println("Please choose a valid number.");
            }
        }
    }
}
