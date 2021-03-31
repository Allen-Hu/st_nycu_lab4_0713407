import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        System.out.println("=== Welcome to Rock-Paper-Scissors game ===");

        // p1
        System.out.println("Enter Player 1 choice (rock, paper or scissors):");
        var p1 = scanner.nextLine();
        if (!game.valid(p1))
            throw new IllegalArgumentException("peko");
        Waza w1 = Waza.valueOf(p1);

        // p2
        System.out.println("Enter Player 2 choice (rock, paper or scissors):");
        var p2 = scanner.nextLine();
        if (!game.valid(p1))
            throw new IllegalArgumentException("A");
        Waza w2 = Waza.valueOf(p2);

        Kekka k = game.duel(w1, w2);
        switch (k) {
            case p1:
                System.out.println("Player 1 win!");
                break;
            case p2:
                System.out.println("Player 2 win!");
                break;
            case draw:
                System.out.println("Draw!");
        }
    }
}
