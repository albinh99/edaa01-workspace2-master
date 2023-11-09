package Game;

public class TakePinsGame {
    public static void main(String[] args) {
        Board b = new Board(10);
        Player user1 = new HumanPlayer("Albin");
        Player user2 = new ComputerPlayer("Computer");


        while(true){
            if(b.getNoPins() != 0){
                int personPins = user1.takePins(b);
                if(personPins == -2){
                    System.exit(0);
                } else {
                    b.takePins(personPins);
                }
            }
            if(b.getNoPins() != 0){
                int computerPins = user2.takePins(b);
                b.takePins(computerPins);
                UserInterface.printMessage("Datorn tog " + computerPins + " st pinnar, det finns " + b.getNoPins() + " st pinnar kvar");
                    if(b.getNoPins() == 0){
                        UserInterface.printMessage("Datorn vann");
                    }
            }
            else{
                break;
            }

        }






    }
}
