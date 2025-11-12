package GameLogic;

import Model.Pieces;
import Model.Player;

public class PlacingPhase extends GamePhase {

    public PlacingPhase(Pieces[] board, Player current, Player opponent) {
        super(board, current, opponent);
    }

    @Override
    public GamePhase handleClick(int slotIndex) {
        return null;
    }

    @Override
    public String getStatusMessage() {
        return "Place a piece";
    }
}
