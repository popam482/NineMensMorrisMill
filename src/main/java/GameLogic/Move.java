package GameLogic;

public class Move {

    private final int from; // -1 pentru momentul in carte il plasez
    private final int to;
    private final int remove; // -1 daca nu elimin nimic


    //constructor pentru plasare
    public Move(int to){
        from=-1;
        this.to=to;
        this.remove=-1;
    }

    //constructor pentru mutare
    public Move(int from, int to){
        this.from=from;
        this.to=to;
        this.remove=-1;
    }


    //gettere

    public int getFrom(){ return from; }
    public int getTo(){ return to; }
    public int getRemove(){ return remove; }


}
