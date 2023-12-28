import java.util.Scanner;
public class Nim {
    private Player player1;
    private Player player2;

    public Nim() {
        Scanner name = new Scanner(System.in);
        System.out.println("Player 1, please enter your name");
        this.player1 = new Player(name.nextLine(), 0);
        System.out.println("Player 2, please enter your name");
        this.player2 = new Player(name.nextLine(), 0);
    }

    public void play() {
        int p1first = (int) (Math.random() * (2 - 1 + 1) + 1);

        Player currentPlayer = new Player();

        // Set currentPlayer to either player1 or player2
        if (p1first == 1) {
            currentPlayer = player1;
        } else {
            currentPlayer = player2;
        }
        boolean playAgain = true;
            while (Board.getNumPieces() > 1 && playAgain) {
                currentPlayer.takeTurn();


                if (Board.getNumPieces() == 1) {
                    if (p1first == 1) {
                        System.out.println(player2.getName() + " has won the game");
                        playAgain = playAgain();
                        int p1First = 0;
                        Board.populate();
                    } else {
                        System.out.println(player1.getName() + " has won the game");
                        playAgain = playAgain();
                        int p1First = 0;
                        Board.populate();
                    }
                }


            }
    }

    public boolean playAgain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to play again?");
        String again = sc.nextLine();
        if(again.equals("yes")) {
            return true;
        } else {
            return false;
        }

    }
}