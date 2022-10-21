package dad.login.mvc;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class View extends VBox{
	
	private Label userLabel, passwdLabel;
	private TextField userText;
	private PasswordField passwdText;
	private CheckBox ldap;
	private Button accessButton, cancelButton;

	public View() {
		super();
		
		userLabel = new Label();
		userLabel.setText("Usuario:      ");	
		userText = new TextField();
		userText.setPromptText("Nombre de usuario");	
		HBox userHBox = new HBox(5, userLabel, userText);
		
		passwdLabel = new Label();
		passwdLabel.setText("Contraseña: ");
		passwdText = new PasswordField();
		passwdText.setPromptText("Contraseña del usuario");	
		HBox passwdHBox = new HBox(5, passwdLabel, passwdText);	
		
		ldap = new CheckBox(" Usar LDAP");	
		
		accessButton = new Button("Acceder");
		accessButton.setDefaultButton(true);
		cancelButton = new Button("Cancelar");		
		HBox buttonsHBox = new HBox(5, accessButton, cancelButton);	
		
		setSpacing(5);
		setAlignment(Pos.CENTER);
		setPadding(new Insets(5));
		setFillWidth(false);
		getChildren().addAll(userHBox, passwdHBox, ldap, buttonsHBox);
		
	}
	//getters
	public Label getUserLabel() {
		return userLabel;
	}

	public Label getPasswdLabel() {
		return passwdLabel;
	}

	public TextField getUserText() {
		return userText;
	}

	public TextField getPasswdText() {
		return passwdText;
	}

	public CheckBox getLdap() {
		return ldap;
	}

	public Button getAccessButton() {
		return accessButton;
	}

	public Button getCancelButton() {
		return cancelButton;
	}
	
}
