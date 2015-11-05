import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by andreazirn on 04/11/15.
 */
public class AppStarter extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent rootPanel = new AppUI();

        Scene scene = new Scene(rootPanel);

        primaryStage.setTitle("JavaFX App");
        primaryStage.setScene(scene);

        primaryStage.setWidth(750);
        primaryStage.setHeight(600);
        primaryStage.centerOnScreen();

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


