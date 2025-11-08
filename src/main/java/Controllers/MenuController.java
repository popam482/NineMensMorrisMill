package Controllers;

import Navigator.Navigator;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuController {

    @FXML
    Button startLocalButton, startOnlineButton, howToPlayButton;

    @FXML
    private void startLocalSession(){
        Navigator.goTo("Board.fxml");
    }

    @FXML
    private void startOnlineSession() {
        Navigator.goTo("Board.fxml");
    }

    @FXML
    private void howToPlay(){
        Navigator.goTo("HowToPlay.fxml");
    }

}
