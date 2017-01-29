package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */
public class PixelChaser extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage = new Stage();
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        int alguskorgus = 30;
        int alguslaius = 50;

        for (int i=0; i<50; i++){
            Rectangle rect = new Rectangle(Math.random()*500,Math.random()*500,alguslaius,alguskorgus);
            pane.getChildren().add(rect);
            rect.setOnMouseClicked(event -> {
                rect.setScaleX(0.5);
                rect.setScaleY(0.5);
                boolean klikitud =true;

                rect.setOnMouseClicked(event1 -> {
                if (klikitud){
                    rect.setVisible(false);
                }
                //else {
                 //   rect.setScaleX(0.5);
                  //  rect.setScaleY(0.5);
                  //  rect.setId("klikitud");
               // }
                });
                    }
            );

        }
        stage.show();
    }
}
