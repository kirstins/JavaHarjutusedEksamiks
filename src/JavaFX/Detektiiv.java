package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 */

public class Detektiiv extends Application {
    Circle circle = new Circle(30);


    @Override
    public void start(Stage primaryStage) throws Exception {
        int width = 500;
        int height = 500;
        int noOfCircles = 3;

        Pane pane = new Pane();
        Scene scene = new Scene(pane, width, height);
        scene.setFill(Color.WHITE);

        primaryStage.setTitle("Detektiiv");
        primaryStage.setScene(scene);
        drawcircles (noOfCircles, pane);


        primaryStage.show();


    }

    public void drawcircles(int noOfCircles, Pane pane) {
        for (int i = 0; i <noOfCircles ; i++) {
            // genereerib random numbri
            double x = ((Math.random() * 400)+50);
            double y = ((Math.random() * 400)+50);

            circle = new Circle(20);
            circle.setCenterX(x);
            circle.setCenterY(y);
            pane.getChildren().add(circle);
            circle.setFill(Color.WHITE);
            // event.getTarget() saab õige ringi kätte,
            // aga kuna Java ei tea mis tüüpi objekt sealt tuleb, siis
            // pean talle kinnitama, et see on kindlasti "(Circle)".
            circle.setOnMouseEntered(event -> {
                Circle c = (Circle) (event.getTarget());
                c.setFill(Color.BLUE);

            });



        }
    }
}



