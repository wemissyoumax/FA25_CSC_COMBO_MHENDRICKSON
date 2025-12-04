import java.util.Scanner;

public class DiceMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // #6 - Ask how many dice and players
        System.out.println("How many dice will be used in the game?");
        int numDie = input.nextInt();

        System.out.println("How many players will be playing?");
        int numPlayers = input.nextInt();

        // #9 - Ask for number of sides
        System.out.println("How many sides for the dice?");
        int numSidesDie = input.nextInt();

        Player[] players = new Player[numPlayers];

        for (int i = 0; i < players.length; i++) {
            players[i] = new Player("Player" + (i+1), 6);
        }


        for (Player p : players) {
            int result = p.getDie().roll();
            System.out.println("Player " + p.getName() +
                " rolled a " + result +
                " on a " + p.getDie().getNumSides() + " sided die");
        }
    }

    }


