import java.util.Scanner;
public class Player {
    private int Score;
    private String name;

    public Player(String nm, int scr) {
        name = nm;
        Score = scr;
        Scanner sc = new Scanner(System.in);
    }
    public Player() {
        Score = 0;
        Scanner sc = new Scanner(System.in);
    }
    public int takeTurn() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number to be removed from the board between " + (Board.getNumPieces()) / 2 + " and 1");
            int n = sc.nextInt();

            if (n <= Board.getNumPieces() / 2 && n >= 1) {
                Board.removePieces(n);
                return Board.getNumPieces();
            } else {
                System.out.println("Invalid input. Go again.");
            }
        }


    }
    public String getName() {
        return name;
    }

    public int getScore() {
        return Score;
    }
    public void incrScore() {
        Score++;
    }
}
