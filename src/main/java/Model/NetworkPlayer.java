package Model;

import GameLogic.GamePhase;
import GameLogic.Move;

public class NetworkPlayer extends Player {

    private final String connectionId;

    public NetworkPlayer(String name, Pieces piecesColor, String connectionId){
        super(name, piecesColor);
        this.connectionId=connectionId;
    }

    public String getConnectionId(){
        return connectionId;
    }

    @Override
    public Move getNextMove(GamePhase currentPhase) {
        return null;
    }
}
