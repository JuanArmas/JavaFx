package fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FormularioJfx extends Application{
	
	   @Override
	   // el metodo start es el punto de inicio de nuestra aplicación
	   public void start(Stage primaryStage) throws Exception{ // Stage primaryStage -> representa nuestra ventana principal o primaria
		   // la clase Stage nos permite manejar las ventanas, con el setTitle podremos un titulo a la ventana del formulario
		   // cada Stage (ventana) solo puede tener una Scene
		   primaryStage.setTitle("Bienvenido a este mi mundo, dame lo que te pida"); // 
		   GridPane grid = new GridPane(); // creacion del objeto grid para crear una cuadricula en la ventana.
		   grid.setAlignment(Pos.CENTER); // 
		   grid.setHgap(10); // espaciado entre columnas
		   grid.setVgap(10); // espaciado entre filas
		   grid.setPadding(new Insets(25,25,25,25)); // crea una zona de exclusion (padding, es en px)¿?
		   
		   Text scenetittle = new Text("¿Como tú por aquí?"); // 
		   scenetittle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));// se le indica la fuente y las caracteristicas de la misma
		   grid.add(scenetittle, 0, 0, 2, 1);// el metodo grid.add añade la variable deseada, en este caso -> scenetitle al grid
		   //scenetittle se añade en la columna 0 fila 0, y establece el espacio(span) de la columna a 2 y de la fila en 1
		   
		   Label userName = new Label("Nombre Usuario: "); //etiqueta usuario
		   grid.add(userName, 0, 1); // etiqueta y posicionamiento en el grid de la misma -> nomVariable -> columna/fila
		   
		   TextField userTextField = new TextField(); //caja de texto usuario(a introducir datos)
		   grid.add(userTextField, 1, 1); // etiqueta y posicionamiento en el grid de la misma -> nomVariable -> columna/fila
		   
		   Label pass = new Label("Contraseña: "); // etiqueta contraseña
		   grid.add(pass, 0, 2); // etiqueta y posicionamiento en el grid de la misma -> nomVariable -> columna/fila
		   
		   PasswordField passBox = new PasswordField();// caja de texto a introducir contraseña
		   grid.add(passBox, 1, 2); // etiqueta y posicionamiento en el grid de la misma -> nomVariable -> columna/fila

		   Button btn = new Button("Registrate cristiano...");// creacion del botón con la etiqueta String
		   HBox hbBtn = new HBox(10); // creacion del panel de diseño con separacion de 10px a los lados
		   hbBtn.setAlignment(Pos.BOTTOM_RIGHT);// colocación del botón
		   hbBtn.getChildren().add(btn); // el boton(btn) se añade al panel de diseño HBox y este se añade al grid...
		   grid.add(hbBtn, 1, 4); // ...aqui, en la columna 1, fila 4
		   
		   final Text actiontarget = new Text(); // creacion de la caja de texto donde se mostrara el resultado¿?
		   grid.add(actiontarget, 1, 6); // posicionamiento de la caja de texto
		   
		   btn.setOnAction(new EventHandler<ActionEvent>() { // setOnAction -> controla los eventos (eventHandler)
			
			   @Override
				public void handle(ActionEvent event) {// 
					actiontarget.setFill(Color.FIREBRICK);// actionTarget
					actiontarget.setText("Botón de inicio de seción presionado");// 		
				}
			});
		   
		   Scene scene = new Scene(grid,300,275); // establece la altura(300)/anchura(275) del Scene
		   primaryStage.setScene(scene);		  // 
		   primaryStage.show(); // muestra la ventana, hace que aparezca
	   }
	   
	   
// Insets nos permite escribir el espacio en torno al área rectangular que forma nuestros elementos gráficos de login.¿?
	   
}
