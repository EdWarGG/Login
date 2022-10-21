package dad.login.mvc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application {
	
	public static Stage primaryStage;
	Controller controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Login.primaryStage = primaryStage;
		controller = new Controller();
		
		Scene scene = new Scene(controller.getView(), 320, 200);
		
		primaryStage.setTitle("Login");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
