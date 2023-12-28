import java.util.Scanner;
public class Board {
    private static int pieces;

    public Board(int pcs) {
        pieces = pcs;
    }

    public static void populate() {
        int max = 50;
        int min = 10;
        pieces = (int) (Math.random() * (max-min+1) + min);
    }

    public static int getNumPieces() {
        return pieces;
    }

    public static void removePieces(int n) {
        pieces -= n;
    }
}
