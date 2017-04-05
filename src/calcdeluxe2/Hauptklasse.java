package calcdeluxe2;

import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;



public class Hauptklasse extends Application {
    private Label label;

    @Override public void init() {
        label = new Label("Hello World");
    }

    @Override public void start(Stage stage) {
        StackPane root = new StackPane();
        root.getChildren().add(label);

        Scene scene = new Scene(root, 200, 200);

        stage.setTitle("Hello World Example");
        stage.setScene(scene);
        stage.show();
    }

    @Override public void stop() {}

    public static void main(String[] parameters) {
        launch(parameters);
    }
}
