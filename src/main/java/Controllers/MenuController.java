package Controllers;

import Navigator.Navigator;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.TextInputDialog;

import java.util.Optional;

public class MenuController {

    @FXML
    Button startLocalButton, startOnlineButton, howToPlayButton;

    @FXML
    private void startLocalSession()
    {
        TextInputDialog dialog=new TextInputDialog();
        dialog.setTitle("Player 1 (white) name:");
        dialog.setHeaderText("Enter player 1 (white) name: ");
        dialog.setContentText("Name:");
        Optional<String> playerName1=dialog.showAndWait();
        if(playerName1.isEmpty() || playerName1.get().trim().isEmpty()){
            return;
        }

        dialog=new TextInputDialog();
        dialog.setTitle("Player 2 (black) name:");
        dialog.setHeaderText("Enter player 2 (black) name: ");
        dialog.setContentText("Name:");
        Optional<String> playerName2=dialog.showAndWait();
        if(playerName2.isEmpty() || playerName2.get().trim().isEmpty()){
            return;
        }

        Navigator.goTo("Board.fxml");
        BoardController.setPlayersNames(playerName1.get().trim(), playerName2.get().trim());
    }

    @FXML
    private void startOnlineSession()
    {

        Navigator.goTo("Board.fxml");
    }

    @FXML
    private void howToPlay()
    {
        Navigator.goTo("HowToPlay.fxml");
    }

}
