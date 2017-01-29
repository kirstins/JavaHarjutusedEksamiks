package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt x, y kordinaadid ja raadius ning joonista talle ring.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ring extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage = new Stage();
        Pane pane = new Pane ();
        Scene scene = new Scene (pane, 500, 500);
        Button button = new Button("joonista");
        Circle ring = new Circle();

        TextField x = new TextField("x-koordinaat");
        TextField y = new TextField("y-koordinaat");
        TextField r = new TextField("raadius");

        x.setTranslateX(100);
        y.setTranslateX(200);
        r.setTranslateX(300);
        button.setTranslateX(400);

        button.setOnAction(event -> {
            ring.setCenterX(Integer.parseInt(x.getText()));
            ring.setCenterY(Integer.parseInt(y.getText()));
            ring.setRadius(Integer.parseInt(r.getText()));
                }
        );


       pane.getChildren().addAll(x, y, r, button, ring);
        stage.setScene(scene);
        stage.show();
    }
}
