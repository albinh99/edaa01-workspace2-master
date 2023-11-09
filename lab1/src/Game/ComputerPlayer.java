package Game;

import java.util.Random;

public class ComputerPlayer extends Player{
    Random rand = new Random();


    public ComputerPlayer(String userId) {
        super(userId);
    }

    @Override
    public int takePins(Board b) {
        if(b.getNoPins() == 1){
            return 1;
        }
        else if (b.getNoPins() == 2) {
            return 2;
        }
        else{
            return rand.nextInt(2)+1;
        }


    }
}
