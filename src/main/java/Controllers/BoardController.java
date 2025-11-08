package Controllers;

import Navigator.Navigator;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class BoardController {

    @FXML
    Button backButton;

    @FXML
    private void backToMainMenu(){
        Navigator.goTo("Menu.fxml");
    }

}
