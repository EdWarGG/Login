package dad.login.mvc;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Controller {
	
	private View view = new View();
	private Model model = new Model();
	
	public Controller() {
		//bindings
		model.usernameProperty().bind(view.getUserText().textProperty());
		model.passwordProperty().bind(view.getPasswdText().textProperty());
		//listeners
		view.getAccessButton().setOnAction(this::onAccessAction);
		view.getCancelButton().setOnAction(this::onCancelAction);
	}

	public View getView() {
		return view;
	}

	public Model getModel() {
		return model;
	}
	
	//listeners
	public void onAccessAction(ActionEvent e) {
		AuthService auth = model.getUseLDAP() ? new LdapAuthService() : new FileAuthService();
		
		try {
			if(auth.login(model.getUsername(), model.getPassword())) {
				Alert alertValid = new Alert(AlertType.INFORMATION);
				alertValid.setHeaderText("Acceso permitido");
				alertValid.setContentText("Las credenciales de acceso son válidas.");
				alertValid.showAndWait();		
			}else {
				Alert alertError = new Alert(AlertType.ERROR);
				alertError.setHeaderText("Acceso denegado");
				alertError.setContentText("El usuario y/o la contraseña no son válidos.");
				alertError.showAndWait();
				view.getPasswdText().textProperty().setValue("");
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	public void onCancelAction(ActionEvent e) {
		 Login.primaryStage.close();
	}

}
