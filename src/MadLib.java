import java.util.ArrayList;
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
                    done = true;
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
            case 1:
                madLib.createMadLib1();
                break;
            case 2:
                madLib.createMadLib2();
                break;
            case 3:
                madLib.createMadLib3();
                break;
            case 4:
                madLib.createMadLib4();
                break;
        }
    }

    private void createMadLib1() {
        Scanner input = new Scanner(System.in);

        //hashmap, key is the type, int, array of words
        int numAdj = 1;
        int numNoun = 1;
        int numPluralNoun = 2;
        int numVerb = 1;
        int numFood = 2;
        int numSaying = 1;
        int numColor = 1;
        int numAnimal = 1;
        int numRideable = 1;
        int numPerson = 1;
        int numOccupation = 0;
        int numInfinitiveVerb = 0;
        int numPlace = 1;
        int numNumber = 1;
        int numBodyPart = 1;

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
        int numAdj = 2;
        int numNoun = 3;
        int numPluralNoun = 2;
        int numVerb = 2;
        int numFood = 0;
        int numSaying = 0;
        int numColor = 0;
        int numAnimal = 0;
        int numRideable = 0;
        int numPerson = 0;
        int numOccupation = 1;
        int numInfinitiveVerb = 1;
        int numPlace = 1;
        int numNumber = 1;
        int numBodyPart = 1;
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
        /*
        int numAdj = 3;
        String[] adjectives = userInput("adjective", numAdj);
         */
        int numAdj = 2;
        String[] adj = userInput("adjective", numAdj);
        int numNoun = 2;
        String[] noun = userInput("noun", numNoun);
        int numPluralNoun = 2;
        String[] pluralNoun = userInput("plural noun", numPluralNoun);
        int numVerb = 2;
        String[] verb = userInput("verb", numVerb);
        int numPlace = 1;
        String[] place = userInput("place", numPlace);
        int numNumber = 1;
        String[] number = userInput("number", numNumber);
        int numBodyPart = 1;
        String[] bodyPart = userInput("part of the body", numBodyPart);

        //following two are for nouns that should be capitalized
        String s1 = pluralNoun[0].substring(0, 1).toUpperCase();
        String pluralNoun1Capitalized = s1 + pluralNoun[0].substring(1);

        s1 = place[0].substring(0, 1).toUpperCase();
        String place1Capitalized = s1 + place[0].substring(1);

        System.out.println();
        System.out.println("Two " + pluralNoun1Capitalized + ", both alike in dignity,");
        System.out.println("In fair " + place1Capitalized + ", where we lay our scene,");
        System.out.println("From ancient " + noun[0] + " break to new mutiny,");
        System.out.println("Where civil blood makes civil hands unclean.");
        System.out.println("From forth the fatal loins of these two foes");
        System.out.println("A pair of star-cross`d " + pluralNoun[1] + " take their life;");
        System.out.println("Whole misadventured piteous overthrows");
        System.out.println("Do with their " + noun[1] + " bury their parents` strife.");
        System.out.println("The fearful passage of their " + adj[0] + " love,");
        System.out.println("And the continuance of their parents` rage,");
        System.out.println("Which, but their children`s end, nought could " + verb[0] + ",");
        System.out.println("Is now the " + number[0] + " hours` traffic of our stage;");
        System.out.println("The which if you with " + adj[1] + " "+ bodyPart[0] + " attend,");
        System.out.println("What here shall " + verb[1] + ", our toil shall strive to mend.");
        System.out.println();
        System.out.println("Would you like to go again?");
    }

    /**
     * text from https://www.madtakes.com/libs/058.html
     */
    private void createMadLib4(){

        int numAdj = 3;
        String[] adjectives = userInput("adjective", numAdj);
        int numAdv = 1;
        String[] adverb = userInput("adverb", numAdv);
        int numNoun = 2;
        String[] noun = userInput("noun", numNoun);
        int numPluralNoun = 1;
        String[] pluralNoun = userInput("plural noun", numPluralNoun);
        int numVerb = 1;
        String[] verb = userInput("verb", numVerb);
        int numPastVerb = 2;
        String[] pastVerb = userInput("verb in past tense", numPastVerb);
        int numPerson = 3;
        String[] person = userInput("celebrity's name", numPerson);
        int numOccupation = 2;
        String[] occupation = userInput("occupation", numOccupation);
        int numMaterial = 1;
        String[] material = userInput("material used in construction", numMaterial);
        int numCreature = 1;
        String[] creature = userInput("mythical creature", numCreature);

        System.out.println();
        System.out.println("In his second term at Hogwarts School of " + noun[0] + ", and Wizardry, Harry Potter (played by " + person[0] + ") is warned by a/an " + creature[0] + " named Dobby ");
        System.out.println("that " + noun[1] + " will "+ verb[0] + " when he returns to Hogwarts. Besides the fact that he is still " + pastVerb[0] + " by Professor Snape (" + person[1] + ") and " + pastVerb[1] + " by Draco Malfoy (Tom Felton),");
        System.out.println("Harry gets off to a " + adjectives[0] + " start with his two best " + pluralNoun[0] + ", Ron Weasley (Rupert Grint) and Hermione Granger (" + person[2] + ").");
        System.out.println("Also, famous " + occupation[0] + " Gilderoy Lockhart (Kenneth Branagh) has joined the Hogwarts staff and is the new Defense Against the " + adjectives[1] + " Arts teacher.");
        System.out.println("But now, Hogwarts students are " + adverb[0] + "  being turned into " + material[0] + ".");
        System.out.println("But who is the one doing it?");
        System.out.println("Malfoy?");
        System.out.println(occupation[1] + " Hagrid (Robbie Contrane)?");
        System.out.println("or even Harry?");
        System.out.println("But what if it`s Lord Voldemort trying to make his " + adjectives[2] + " return?");
        System.out.println();
        System.out.println("Would you like to go again?");

    }
    private String[] userInput(String wordCategory, int numberWords){
        String[] words = new String[numberWords];
        Scanner input = new Scanner(System.in);
        try {
            for (int i = 0; i < numberWords; i++) {
                if (wordCategory.startsWith("a") || wordCategory.startsWith("e") || wordCategory.startsWith("i") || wordCategory.startsWith("o") || wordCategory.startsWith("u")) {
                    System.out.println("Please enter an " + wordCategory);
                } else {
                    System.out.println("Please enter a " + wordCategory);
                }
                String temp = input.nextLine();
                if (temp != null) {
                    words[i] =temp;
                }
            }
        } catch (NullPointerException e){
            System.out.println("Please enter a valid word.");
        }
            return words;
    }
}

//TODO: make confirmation before generating the madlib