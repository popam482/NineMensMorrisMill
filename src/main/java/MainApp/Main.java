package MainApp;

import Navigator.Navigator;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        try {

            Navigator.init(stage);

            Navigator.goTo("Menu.fxml");


            Image image = new Image(getClass().getResourceAsStream("/logo.png"));
            stage.getIcons().add(image);

            stage.setResizable(false);
            stage.setTitle("Nine Men's Morris");
            stage.centerOnScreen();
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        launch(args);
    }

}
