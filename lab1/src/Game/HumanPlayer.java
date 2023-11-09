package Game;

import java.util.Scanner;

public class HumanPlayer extends Player{
    Scanner scan = new Scanner(System.in);

    public HumanPlayer(String userId) {
        super(userId);
    }

    @Override
    public int takePins(Board b) {
        while (true) {

            int humanTake = UserInterface.askForInt("Din tur");

            if (b.getNoPins() - humanTake < 0) {
                UserInterface.printMessage("Det är bara 1 pinne kvar");
            }
            else if (b.getNoPins() - humanTake == 0){
                UserInterface.printMessage("Grattis, du har vunnit!");
                return humanTake;
            }

            else{
                return humanTake;


            }

        }
    }



}

