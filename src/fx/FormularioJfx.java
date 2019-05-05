package fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
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
		   
		   Label userName = new Label("Nombre Usuario: "); //etiqueta usuario
		   grid.add(userName, 0, 1); // etiqueta y posicionamiento en el grid de la misma -> nomVariable -> columna/fila
		   
		   TextField userTextField = new TextField(); //caja de texto usuario(a introducir datos)
		   grid.add(userTextField, 1, 1); // etiqueta y posicionamiento en el grid de la misma -> nomVariable -> columna/fila
		   
		   Label pass = new Label("Contraseña: "); // etiqueta contraseña
		   grid.add(pass, 0, 2); // etiqueta y posicionamiento en el grid de la misma -> nomVariable -> columna/fila
		   
		   PasswordField passBox = new PasswordField();// caja de texto a introducir contraseña
		   grid.add(passBox, 1, 2); // etiqueta y posicionamiento en el grid de la misma -> nomVariable -> columna/fila

		   Scene scene = new Scene(grid,300,275); // establece la altura(300)/anchura(275) del Scene
		   primaryStage.setScene(scene);		  // 
		   primaryStage.show(); // muestra la ventana, hace que aparezca
	   }
	   // PAGINA 33 DEL PDF tutorial-javafx-APartir-pag28
	   
// Insets nos permite escribir el espacio en torno al área rectangular que forma nuestros elementos gráficos de login.¿?
	   
}
