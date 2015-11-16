import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

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


