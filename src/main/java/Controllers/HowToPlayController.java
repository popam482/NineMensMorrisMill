package Controllers;

import javafx.fxml.FXML;
import Navigator.Navigator;

public class HowToPlayController {

    @FXML
    private void backToMainMenu()
    {
        Navigator.goTo("Menu.fxml");
    }

}
