package Model;

import GameLogic.GamePhase;
import GameLogic.Move;

public class LocalPlayer extends Player{


    public LocalPlayer(String name, Pieces piecesColor) {
        super(name, piecesColor);
    }

    @Override
    public Move getNextMove(GamePhase currentPhase) {
        return null;
    }
}
