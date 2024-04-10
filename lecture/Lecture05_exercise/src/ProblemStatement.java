
import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
public class ProblemStatement extends Application{
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("problem Statement.fxml"));
			primaryStage.setTitle("My note");
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
		
	}

