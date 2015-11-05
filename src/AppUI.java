import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

/**
 * Created by andreazirn on 04/11/15.
 */
public class AppUI extends BorderPane {

    private Button button;

    public AppUI() {
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        button = new Button("Hello World");
    }

    private void layoutControls() {
        getChildren().add(button);
    }

}


