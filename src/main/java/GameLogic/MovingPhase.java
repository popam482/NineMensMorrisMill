package GameLogic;

import Model.Pieces;
import Model.Player;

public class MovingPhase extends GamePhase{
    public MovingPhase(Pieces[] board, Player currentPlayer, Player opponent) {

        super(board, currentPlayer, opponent);

    }

    @Override
    public GamePhase handleClick(int slotIndex) {
        return null;
    }

    @Override
    public String getStatusMessage() {
        return "";
    }
}
