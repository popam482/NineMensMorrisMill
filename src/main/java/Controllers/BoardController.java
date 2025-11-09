package Controllers;

import Model.PieceColor;
import Model.Pieces;
import Model.Player;
import Navigator.Navigator;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

import java.util.Arrays;

public class BoardController {

    @FXML
    private AnchorPane boardRoot;

    @FXML
    private Button backButton;

    @FXML
    private Label nameLabel;

    @FXML
    private Label statusLabel;


    private final Circle[] slots = new Circle[24];


    private final Pieces[] cells = new Pieces[24];

    private static Player player1, player2;

    //private Handlers handlers;

    public static void setPlayers(Player p1, Player p2){
        player1=p1;
        player2=p2;
    }

    @FXML
    private void initialize() {
        Arrays.fill(cells, Pieces.EMPTY);

        for (int i = 0; i < 24; i++) {
            Circle c = (Circle) boardRoot.lookup("#slot" + i);
            if (c == null) {
                throw new IllegalStateException("Missing circle (id=slot" + i + ")");
            }
            slots[i] = c;
            PieceColor.paintEmpty(c);
        }

        if(player1!=null && player2!=null){
            nameLabel.setText(player1.getName()+"'s turn");
        }

        //handlers = new Handlers(slots, cells, colorLabel, statusLabel);
    }

    @FXML
    private void onClick(MouseEvent e) {
        Circle clicked = (Circle) e.getSource();
        String id = clicked.getId();
        if (id == null || !id.startsWith("slot")) return;

        int idx = Integer.parseInt(id.substring(4));
        //handlers.onSlotClick(idx);
    }


    @FXML
    private void backToMainMenu(){
        Navigator.goTo("Menu.fxml");
    }

}