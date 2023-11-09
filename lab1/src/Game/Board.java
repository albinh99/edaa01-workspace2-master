package Game;

public class Board {
    private int noPins;

    public Board(int noPins){
        this.noPins = noPins;
        UserInterface.printMessage("Ett bräde med " + noPins + " skapas.");

    }

    public void setUp(int setUpPins){
        noPins = setUpPins;

    }
    public void takePins(int taPinnar){
        noPins = noPins-taPinnar;


    }
    public int getNoPins(){
        return noPins;

    }

}
