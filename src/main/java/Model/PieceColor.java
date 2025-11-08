package Model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PieceColor {

    public static void paintSlot(Circle c, Pieces piece) {

        switch (piece) {
            case WHITE -> paintWhite(c);
            case BLACK -> paintBlack(c);
        }
    }

    public static void paintEmpty(Circle c){
        c.setFill(Color.GRAY);
        c.setStroke(Color.GRAY);
        c.setStrokeWidth(2);
    }

    public static void paintWhite(Circle c){
        c.setFill(Color.WHITE);
        c.setStroke(Color.BLACK);
        c.setStrokeWidth(2);
    }

    public static void paintBlack(Circle c){
        c.setFill(Color.BLACK);
        c.setStroke(Color.BLACK);
        c.setStrokeWidth(2);
    }



}
