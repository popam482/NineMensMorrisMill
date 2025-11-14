package Model;

public class NetworkPlayer extends Player {

    private final String connectionId;

    public NetworkPlayer(String name, Pieces piecesColor, String connectionId){
        super(name, piecesColor);
        this.connectionId=connectionId;
    }

    public String getConnectionId(){
        return connectionId;
    }

}
