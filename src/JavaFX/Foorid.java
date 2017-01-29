package JavaFX;

/**
 * Created by kirstin on 29/01/2017.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by kirstin on 26/01/2017.
 */

/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 */

public class Foorid extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        int weight = 500;
        int height = 500;
        int noOfCircles = 10;

        Pane pane = new Pane();
        Scene scene = new Scene (pane, weight, height);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Detektiiv");
        scene.setFill(Color.WHITE);
        drawCircles(noOfCircles,pane);
        primaryStage.show();


    }

    private void drawCircles(int noOfCircles, Pane pane) {
        for (int i=0; i<noOfCircles; i++){
            double x = ((Math.random()*400+50));
            double y = ((Math.random()*400+50));
            Circle circle = new Circle (20);
            circle.setTranslateX(x);
            circle.setTranslateY(y);
            circle.setFill(Color.RED);
            pane.getChildren().add(circle);

            circle.setOnMouseEntered(event->{
                        Circle c = (Circle) (event.getTarget());
                        circle.setFill(Color.GREEN);
                    }
            );
        }

    }
}
