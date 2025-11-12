package GameLogic;

import Model.Pieces;
import Model.Player;

public class FlyingPhase extends GamePhase{


    public FlyingPhase(Pieces[] board, Player current, Player opponent) {
        super(board, current, opponent);
    }

    @Override
    public GamePhase handleClick(int slotIndex) {
        return null;
    }

    @Override
    public String getStatusMessage() {
        return "Remove an opponent's piece";
    }
}
