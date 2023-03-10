import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MadLib {
    public static final int NUMBER_OF_MADLIBS = 4;
    //String description, arraylist of objects that consist of a pair: wordcategory and int number appearances,
    // alternative set of static arrays for each word category where index 0 is blank, 0 corresponds to madlib 1, 1 to madlib 2, etc
    MadLib(){

    }


    public static void chooseMadLib(int option, MadLib madLib) {
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
        int numAdj = 1;
        String[] adjective = userInput("adjective", numAdj);
        int numNoun = 1;
        String[] noun = userInput("noun", numNoun);
        int numVerb = 1;
        String[] verb = userInput("verb", numVerb);
        int numFood = 2;
        String[] food = userInput("food", numFood);
        int numSaying = 1;
        String[] saying = userInput("saying", numSaying);
        int numColor = 1;
        String[] color = userInput("color", numColor);
        int numAnimal = 1;
        String[] animal = userInput("animal", numAnimal);
        int numRideable = 1;
        String[] rideable = userInput("thing in which a person can ride (e.g., car)", numRideable);
        int numPerson = 1;
        String[] person = userInput("person", numPerson);

        String s1 = adjective[0].substring(0, 1).toUpperCase();
        String adjective1Capitalized = s1 + adjective[0].substring(1);

        s1 = animal[0].substring(0, 1).toUpperCase();
        String animal1Capitalized = s1 + animal[0].substring(1);

        System.out.println("Today I went to my favorite taco stand called the " + adjective1Capitalized + " " + animal1Capitalized + ".");
        System.out.println("Unlike most food stands, they cook and prepare the food in a " + rideable[0] + " while you " + verb[0] + ".");
        System.out.println("The best thing on the menu is the " + color[0] + " " + noun[0] + ".");


        System.out.println("Instead of ground beef they fill the taco with " + food[--numFood] + ", cheese, and top it off with a salsa made from " + food[--numFood] + ".");
        System.out.println("If that doesn't make your mouth water, then it's just like " + person[0] + " always says: ");
        System.out.println(saying[0] + "!");

        System.out.println();
        System.out.println("Would you like to go again?");
    }

    private void createMadLib2() {

        int numAdj = 2;
        String[] adjective = userInput("adjective", numAdj);
        int numNoun = 3;
        String[] noun = userInput("noun", numNoun);
        int numVerb = 3;
        String[] verb = userInput("verb", numVerb);
        int numOccupation = 1;
        String[] occupation = userInput("occupation", numOccupation);

        //next noun should be capitalized
        String s1 = noun[2].substring(0, 1).toUpperCase();
        String noun3Capitalized = s1 + noun[2].substring(1);

        System.out.println();
        System.out.println("Today a " + occupation[0] + " named " + noun3Capitalized + " came to our school to talk to us about her job.");
        System.out.println("She said the most important skill you need to know to do her job is to be able " + verb[1] + " around a " + adjective[0] + " " + noun[1] + ".");
        System.out.println("She said it was easy for her to learn her job because she loved to " + verb[0] + " when she was my age--and that helps a lot!");
        System.out.println("If you're considering her profession, I hope you can be near a " + adjective[1] + " " + noun[0] + ".");
        System.out.println("That's very important!");
        System.out.println("If you get too distracted in that situation, you won't be able to " + verb[2] + " next to a " + noun[0] + "!");
        System.out.println();
        System.out.println("Would you like to go again?");

    }

    /**
     * text from https://www.madtakes.com/libs/186.html
     */
    private void createMadLib3() {

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