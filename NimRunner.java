public class NimRunner {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Game of Nim!");
        Board.populate(); // static method call
            Nim gameOfNim = new Nim();
            gameOfNim.play();

    }
}
