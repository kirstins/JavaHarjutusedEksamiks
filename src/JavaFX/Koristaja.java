package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */
public class Koristaja extends Application {
    Stage stage;
    Pane pane;
    Scene scene;
    Label label;
    Circle circle;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = new Stage();
        pane = new Pane();
        scene = new Scene (pane, 500, 500);
        label = new Label ("NÜÜD ON KORISTATUD!");
        label.setTranslateX(250);
        label.setTranslateY(250);
        pane.getChildren().add(label);
        ringid ();
    }

        private void ringid() {

        for (int i = 0; i<300; i++){
            circle = new Circle(Math.random()*500, Math.random()*500, 30 );
            pane.getChildren().add(circle);
            circle.setOnMouseEntered(event ->{
                Circle c = (Circle) (event.getTarget());
                c.setVisible(false);
                    }
            );
        }
        stage.setScene(scene);
        stage.show();
    }

}



