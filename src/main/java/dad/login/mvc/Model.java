package dad.login.mvc;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {
	
	private StringProperty username = new SimpleStringProperty();
	private StringProperty password = new SimpleStringProperty();
	private BooleanProperty useLDAP = new SimpleBooleanProperty();
	
	public final StringProperty usernameProperty() {
		return this.username;
	}
	public final String getUsername() {
		return usernameProperty().get();
	}
	public final void setUsername(final String username) {
		this.usernameProperty().set(username);
	}
	
	public final StringProperty passwordProperty() {
		return this.password;
	}
	public final String getPassword() {
		return passwordProperty().get();
	}
	public final void setPassword(final String password) {
		this.passwordProperty().set(password);
	}
	
	public final BooleanProperty useLDAPProperty() {
		return this.useLDAP;
	}
	public final Boolean getUseLDAP() {
		return useLDAPProperty().get();
	}
	public final void setUseLDAP(final Boolean useLDAP) {
		this.useLDAPProperty().set(useLDAP);
	}
	
}
