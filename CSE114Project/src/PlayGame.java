//Kristian Hajredinaj ID:113367328

import java.util.Scanner;

public class PlayGame {

    public static void main(String[] args) {

        ConnectFour game = new ConnectFour();

        for (int i = 0; i < game.getBoard().length; i++) {
            for (int j = 0; j < game.getBoard()[i].length; j++) {
                System.out.print(game.getBoard()[i][j]);
            }
            System.out.println();
        }
        System.out.println(" 0 1 2 3 4 5 6");
        System.out.println("........................");

        boolean redTurn = true;
        boolean yellowTurn = false;

        Scanner input = new Scanner(System.in);

        while (!game.redWin() && !game.yellowWin()) {

            System.out.print("Enter " + (redTurn ? "red" : "yellow") +" player position(0-6): ");
            int position = input.nextInt();

            game.updatePosition(position, redTurn, yellowTurn);

            for (int i = 0; i < game.getBoard().length; i++) {
                for (int j = 0; j < game.getBoard()[i].length; j++) {
                    System.out.print(game.getBoard()[i][j]);
                }
                System.out.println();
            }

            System.out.println(" 0 1 2 3 4 5 6");
            System.out.println(".......................");

            redTurn = !redTurn;
            yellowTurn = !yellowTurn;
            game.redTurn(redTurn);
            game.yellowTurn(yellowTurn);

        }

            System.out.print((game.redWin()) ? "Red player wins" : "Yellow Player wins");

    }
}
