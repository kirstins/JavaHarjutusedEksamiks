package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Joon extends Application {
    int xstart;
    int xend;
    int ystart;
    int yend;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Stage stage = new Stage();
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        Scene scene = new Scene(vbox, 500, 500);
        Pane pane = new Pane();
        Scene scene1 = new Scene(pane, 500, 500);
        stage.setScene(scene);

        TextField askXstart = new TextField("x-alguskoordinaat");
        TextField askYstart = new TextField("y-alguskoordinaat");
        TextField askXend = new TextField("x-loppkoordinaat");
        TextField askYend = new TextField("y-loppkoordinaat");
        Button button = new Button("Joonista joon");
        vbox.getChildren().addAll(askXstart, askYstart, askXend, askYend,button);

        button.setOnAction(event ->{
            xstart = Integer.parseInt(askXstart.getText());
            ystart = Integer.parseInt(askYstart.getText());
            xend = Integer.parseInt(askXend.getText());
            yend = Integer.parseInt(askYend.getText());

            Line line = new Line(xstart, ystart, xend, yend);
            pane.getChildren().add(line);
            stage.setScene(scene1);

        });

        stage.show();
    }




}
