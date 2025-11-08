package Controllers;

import Model.PieceColor;
import Model.Pieces;
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

    static String playerName1, playerName2;

    private final Circle[] slots = new Circle[24];


    private final Pieces[] cells = new Pieces[24];


    //private Handlers handlers;

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

    protected static void setPlayersNames(String name1, String name2){
        playerName1=name1;
        playerName2=name2;

    }

    @FXML
    private void backToMainMenu(){
        Navigator.goTo("Menu.fxml");
    }

}
