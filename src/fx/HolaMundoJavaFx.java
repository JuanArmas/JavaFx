package fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
//clase application y stage -> investigarlas, son importantes
// ojito todas las importaciones deben empezar por javafx.

public class HolaMundoJavaFx  extends Application {
	 public static void main(String[] args) {
	        launch(args);
	    }
	 
    //el metodo start maneja el comportamiento del boton(grosso modo)
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        // StackPane (contenedor¿?) explicaion pagina 3 auntes propios javafx
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}