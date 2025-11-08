module com.example.ninemensmorrismill {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens MainApp to javafx.fxml;
    exports MainApp to javafx.graphics;
    opens Controllers to javafx.fxml;

}
