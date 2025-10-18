import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Group;


public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, Color.PINK);

        stage.setTitle("Ashraf Khan Shihab");
        Image icon = new Image("me.jpg");
        stage.getIcons().add(icon);

        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
        // stage.setX(500);
        // stage.setY(100);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("my name is ashraf khan shihab");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("y"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
