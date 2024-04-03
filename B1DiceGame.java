import java.util.Random;

class B1DiceGame extends ConsoleProgram {

    /**
    * Description
    * Write a program that lets you simulate the rolling of 100 pairs of dice. For each roll,
    * If the pair adds up to 2, print "snake eyes!"
    * If the pair adds up to 7, print "lucky seven"
    * if the pair adds up to any other sum, do not print out anything
    * @author: Justin M.
    */
    
    public void run() {

        Random myRandom = new Random();

        for (int counter = 0; counter <= 100; counter++){
            int intDice1 = myRandom.nextInt((6 - 1) + 1) + 1;
            int intDice2 = myRandom.nextInt((6 - 1) + 1) + 1;
            System.out.println("\n#" + counter + ". Dice 1: " + intDice1 + " Dice 2: " + intDice2);

            if (intDice1 + intDice2 == 2){
                System.out.println("snake eyes!");
            }

            else if (intDice1 + intDice2 == 7){
                System.out.println("lucky seven");
            }

        }
    
    }
  }
