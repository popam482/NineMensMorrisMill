package Model;

public abstract class Player {

    private String name;
    private Pieces piecesColor;
    private int piecesToPlace=9;
    private int piecesOnBoard=0;
    private int piecesRemoved=0;

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

    public int getPiecesToPlace(){
        return piecesToPlace;
    }

    public int getPiecesOnBoard(){
        return piecesOnBoard;
    }

    public int getPiecesRemoved(){
        return piecesRemoved;
    }

    public void placePiece(){
        if(piecesToPlace > 0) {
            piecesToPlace--;
            piecesOnBoard++;
        }
    }

    public void removePieceFromBoard(){
        if(piecesOnBoard>0){
            piecesOnBoard--;
            piecesRemoved++;
        }
    }


}
