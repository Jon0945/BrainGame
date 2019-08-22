package Se.Lexicon;

import java.util.Scanner;

public class App {
    //Scanner for keyboard input
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        menuChoice();
    }

    public static void printMenu() {
        System.out.println("                                _.-'-'--._     ");
        System.out.println("                              ,', ~'` ( .'`.   ");
        System.out.println("                             ( ~'_ , .'(  >-)  ");
        System.out.println("                            ( .-' (  `__.-<  ) ");
        System.out.println("                             ( `-..--'_   .-') ");
        System.out.println("                              `(_( (-' `-'.-)  ");
        System.out.println("  ====================          `-.__.-'=/     ");
        System.out.println("  | Brain Game v0.1b |            `._`='       ");
        System.out.println("  ====================               ||        ");
        System.out.println("                                     ||        ");
        System.out.println();
        System.out.println("===============================================");
        System.out.println("|| 1. Start New Game                         ||");
        System.out.println("|| 2. Quit                                   ||");
        System.out.println("===============================================");
        System.out.println();
    }

    public static void menuChoice() {
        boolean KeepGoing = true;
        while (KeepGoing) {
            printMenu();
            System.out.print("Make your choice: ");
            switch (scanner.nextLine()) {
                case "1":
                    newGame();
                    KeepGoing = false;
                    break;
                case "2":
                    System.out.println("Goodbye!");
                    KeepGoing = false;
                    break;
                default:
                    System.out.println("That's not a valid menu choice");
                    break;
            }
        }
    }

    public static void newGame() {
        int brain = (int) (Math.random() * 500);
        boolean win = newTurn(brain);
        if (win) {
            System.out.println("Congratulations you won :)");
        } else {
            System.out.println("Sorry you lost :(");
        }
    }

    public static boolean newTurn(int brain) {
        int maxGuesses = 20;
        do {
            System.out.println("I'm thinking of a number between 1 and 500");
            System.out.print("Can you guess it? | Guesses remaining: " + maxGuesses + "|: ");
            int guess = Integer.parseInt(scanner.next());
            if (guess == brain) {
                return true;
            } else if (guess > brain) {
                System.out.println("That's too high!");
            } else {
                System.out.println("That's too low!");
            }
            maxGuesses--;
        }
        while (maxGuesses != 0);
        return false;


    }


}
