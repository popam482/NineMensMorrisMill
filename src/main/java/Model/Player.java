package Model;

import GameLogic.GamePhase;
import GameLogic.Move;

public abstract class Player {

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
        if(numberOfPieces>2)
            numberOfPieces--;
    }

    public abstract Move getNextMove(GamePhase currentPhase);

}
