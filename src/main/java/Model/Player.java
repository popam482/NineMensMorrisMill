package Model;

public class Player {

    private String name;
    private Pieces piecesColor;
    private int numberOfPieces=9;

    public Player(String name, Pieces piecesColor){
        this.name=name;
        this.piecesColor=piecesColor;
    }

    public String getName(){
        return name;
    }

    public Pieces getPiecesColor(){
        return piecesColor;
    }

    public int getNumberOfPieces(){
        return numberOfPieces;
    }

    public void removePiece(){
        numberOfPieces--;
    }

}
