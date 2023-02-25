import java.util.InputMismatchException;
import java.util.Scanner;

public class MadLib {
    private static final int NUMBER_OF_MADLIBS = 4;

    public static void main(String[] args) {
        MadLib madLib = new MadLib();
        boolean done = false;
        while (!done) {
            System.out.println();
            System.out.println("Please choose a number between 1 and " + NUMBER_OF_MADLIBS + ".");
            System.out.println("To exit, please enter 0.");
            Scanner input = new Scanner(System.in);
            try {
                int entry = input.nextInt();
                if (entry == 0) {
                    System.out.println("Thanks for the laughs!");
                    System.out.println("See you next time!");
                    break;
                }
                if (entry < 0) {
                    System.out.println("Please choose a positive integer.");
                    break;
                }
                if (entry > NUMBER_OF_MADLIBS) {
                    System.out.println("That number is too large.");
                    break;
                } else chooseMadLib(entry, madLib);
            } catch (InputMismatchException e) {
                System.out.println("Please choose a valid number.");
            }
        }

    }

    private static void chooseMadLib(int option, MadLib madLib) {
        switch (option) {
            case 1: madLib.createMadLib1();
            case 2: madLib.createMadLib2();
            case 3: madLib.createMadLib3();
            case 4: madLib.createMadLib4();
        }
    }

    private void createMadLib1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an adjective.");
        String adjective1 = input.nextLine();
        String s1 = adjective1.substring(0, 1).toUpperCase();
        String adjective1Capitalized = s1 + adjective1.substring(1);
        System.out.println("Enter a food (plural).");
        String foods1 = input.nextLine();
        System.out.println("Provide a saying.");
        String saying1 = input.nextLine();
        System.out.println("I'll take a noun for 500.");
        String noun1 = input.nextLine();
        System.out.println("What's your favorite (or least favorite) color?");
        System.out.println("(Give any color; I'm not going to check!)");
        String color1 = input.nextLine();
        System.out.println("Name a person, any person.");
        String person1 = input.nextLine();
        System.out.println("Another plural food, if you please.");
        String foods2 = input.nextLine();
        System.out.println("What's something you can ride?");
        String rideable1 = input.nextLine();
        System.out.println("Almost there! Give me an animal.");
        String animal1 = input.nextLine();
        s1 = animal1.substring(0, 1).toUpperCase();
        String animal1Capitalized = s1 + animal1.substring(1);
        System.out.println("Last one! I'd like a verb, please.");
        String verb1 = input.nextLine();
        System.out.println();
        System.out.println("Today I went to my favorite Taco Stand called the " + adjective1Capitalized + " " + animal1Capitalized + ".");
        System.out.println("Unlike most food stands, they cook and prepare the food in a " + rideable1 + " while you " + verb1 + ".");
        System.out.println("The best thing on the menu is the " + color1 + " " + noun1 + ".");
        System.out.println("Instead of ground beef they fill the taco with " + foods2 + ", cheese, and top it off with a salsa made from " + foods1 + ".");
        System.out.println("If that doesn't make your mouth water, then it's just like " + person1 + " always says: ");
        System.out.println(saying1 + "!");
        System.out.println();
        System.out.println("Would you like to go again?");
    }

    private void createMadLib2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an occupation.");
        String occupation1 = input.nextLine();
        System.out.println("Enter a noun.");
        String noun1 = input.nextLine();
        System.out.println("Provide an adjective.");
        String adjective1 = input.nextLine();
        System.out.println("I'll take a verb for 500.");
        String verb1 = input.nextLine();
        System.out.println("One more adjective, please!");
        String adjective2 = input.nextLine();
        System.out.println("'nother noun.");
        String noun2 = input.nextLine();
        System.out.println("One infinitive verb, por favor.");
        String verb2 = input.nextLine();
        System.out.println("Almost there! Last noun.");
        String noun3 = input.nextLine();
        String s1 = noun3.substring(0, 1).toUpperCase();
        String noun3Capitalized = s1 + noun3.substring(1);
        System.out.println("The verb's the word!");
        String verb3 = input.nextLine();
        System.out.println();
        System.out.println("Today a " + occupation1 + " named " + noun3 + " came to our school to talk to us about her job.");
        System.out.println("She said the most important skill you need to know to do her job is to be able " + verb2 + " around (a) " + adjective1 + " " + noun2 + ".");
        System.out.println("She said it was easy for her to learn her job because she loved to " + verb1 + " when she was my age--and that helps a lot!");
        System.out.println("If you're considering her profession, I hope you can be near (a) " + adjective2 + " " + noun1 + ".");
        System.out.println("That's very important!");
        System.out.println("If you get too distracted in that situation, you won't be able to " + verb3 + " next to (a) " + noun1 + "!");
        System.out.println();
        System.out.println("Would you like to go again?");

    }

    /**
     * text from https://www.madtakes.com/libs/186.html
     */
    private void createMadLib3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a plural noun.");
        String pluralNoun1 = input.nextLine();
        String s1 = pluralNoun1.substring(0, 1).toUpperCase();
        String pluralNoun1Capitalized = s1 + pluralNoun1.substring(1);
        System.out.println("Enter a place.");
        String place1 = input.nextLine();
        s1 = place1.substring(0, 1).toUpperCase();
        String place1Capitalized = s1 + place1.substring(1);
        System.out.println("Provide a plural noun.");
        String pluralNoun2 = input.nextLine();
        System.out.println("I'll take a noun for 500.");
        String noun2 = input.nextLine();
        System.out.println("One adjective, please!");
        String adj1 = input.nextLine();
        System.out.println("Verb me!");
        String verb1 = input.nextLine();
        System.out.println("What's a noun between friends?");
        String noun1 = input.nextLine();
        System.out.println("One number, coming up!");
        String number1 = input.nextLine();
        System.out.println("Another adjective!");
        String adj2 = input.nextLine();
        System.out.println("Almost there! Gimme a part of the body.");
        String bodyPart1 = input.nextLine();
        System.out.println("The verb's the word!");
        String verb2 = input.nextLine();
        System.out.println();
        System.out.println("Two " + pluralNoun1 + ", both alike in dignity,");
        System.out.println("In fair " + place1 + ", where we lay our scene,");
        System.out.println("From ancient " + noun1 + " break to new mutiny,");
        System.out.println("Where civil blood makes civil hands unclean.");
        System.out.println("From forth the fatal loins of these two foes");
        System.out.println("A pair of star-cross`d " + pluralNoun2 + " take their life;");
        System.out.println("Whole misadventured piteous overthrows");
        System.out.println("Do with their " + noun2 + " bury their parents` strife.");
        System.out.println("The fearful passage of their " + adj1 + " love,");
        System.out.println("And the continuance of their parents` rage,");
        System.out.println("Which, but their children`s end, nought could " + verb1 + ",");
        System.out.println("Is now the " + number1 + " hours` traffic of our stage;");
        System.out.println("The which if you with " + adj2 + bodyPart1 + " attend,");
        System.out.println("What here shall " + verb2 + ", our toil shall strive to mend.");
        System.out.println();
        System.out.println("Would you like to go again?");
    }

    /**
     * text from https://www.madtakes.com/libs/058.html
     */
    private void createMadLib4(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a noun.");
        String noun1 = input.nextLine();

        System.out.println("Enter a famous person's name.");
        String name1 = input.nextLine();

        System.out.println("Provide a mythical creature.");
        String creature1 = input.nextLine();

        System.out.println("I'll take a noun for 500.");
        String noun2 = input.nextLine();

        System.out.println("Verb me!");
        String verb1 = input.nextLine();

        System.out.println("verb ending in 'ed', please!");
        String pastVerb1 = input.nextLine();

        System.out.println("Can you name another famous person?");
        String name2 = input.nextLine();

        System.out.println("Another verb ending in 'ed', please");
        String pastVerb2 = input.nextLine();

        System.out.println("An adjective!");
        String adj1 = input.nextLine();

        System.out.println("Gimme gimme a plural noun after midnight");
        String pluralNoun3 = input.nextLine();

        System.out.println("Is this madlibs or a tabloid?");
        System.out.println("in any case, one more famous person, please");
        String name3 = input.nextLine();

        System.out.println("An occupation");
        String occupation1 = input.nextLine();

        System.out.println("Another adjective!");
        String adj2 = input.nextLine();

        System.out.println("Adverb ending in 'ly");
        String adv1 = input.nextLine();

        System.out.println("Type of material");
        String material1 = input.nextLine();

        System.out.println("Nearly done! One more occupation");
        String occupation2 = input.nextLine();

        System.out.println("And finish off with a final adjective");
        String adj3 = input.nextLine();

        System.out.println();
        System.out.println("In his second term at Hogwarts School of " + noun1 + ", and Wizardry, Harry Potter (played by " + name1 + ") is warned by a/an " + creature1 + " named Dobby ");
        System.out.println("that " + noun2 + " will "+ verb1 + " when he returns to Hogwarts. Besides the fact that he is still " + pastVerb1 + " by Professor Snape (" + name2 + ") and " + pastVerb2 + " by Draco Malfoy (Tom Felton),");
        System.out.println("Harry gets off to a " + adj1 + " start with his two best " + pluralNoun3 + ", Ron Weasley (Rupert Grint) and Hermione Granger (" + name3 + ").");
        System.out.println("Also, famous " + occupation1 + " Gilderoy Lockhart (Kenneth Branagh) has joined the Hogwarts staff and is the new Defense Against the " + adj3 + " Arts teacher.");
        System.out.println("But now, Hogwarts students are " + adv1 + "  being turned into " + adv1 + " " + material1 + ".");
        System.out.println("But who is the one doing it?");
        System.out.println("Malfoy?");
        System.out.println(occupation2 + " Hagrid (Robbie Contrane)?");
        System.out.println("or even Harry?");
        System.out.println("But what if it`s Lord Voldemort trying to make his " + adj3 + " return?");
        System.out.println();
        System.out.println("Would you like to go again?");

    }
}


/*
System.out.println("");
String  = input.nextLine();
 */