package GameLogic;

import Model.Pieces;
import Model.Player;

public abstract class GamePhase {

    protected Pieces[] board;
    protected Player currentPlayer;
    protected Player opponent;

    public GamePhase(Pieces [] board, Player current, Player opponent){
        this.board=board;
        currentPlayer=current;
        this.opponent=opponent;
    }

    public abstract GamePhase handleClick(int slotIndex);

    public abstract String getStatusMessage();

    private int countPieces(Pieces color){
        int count=0;
        for(Pieces p : board){
            if(p==color)
                count++;
        }
        return count;
    }

    private GamePhase getNextPhase(){
        int piecesOnBoard=countPieces(currentPlayer.getPiecesColor());

        if(piecesOnBoard==0){
            if (piecesOnBoard == 0) {
                return new PlacingPhase(board, currentPlayer, opponent);
            } else if (currentPlayer.getNumberOfPieces() == 3) {
                return new FlyingPhase(board, currentPlayer, opponent);
            } else {
                return new MovingPhase(board, currentPlayer, opponent);
            }
        }

    }

    protected void switchPlayers(){
        Player temp=currentPlayer;
        currentPlayer=opponent;
        opponent=temp;
        getNextPhase();
    }



}
