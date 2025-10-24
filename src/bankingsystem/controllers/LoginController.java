package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import java.io.IOException;

public class LoginController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private ComboBox<String> roleCombo;
    @FXML private Label errorLabel;

    @FXML
    private void initialize() {
        roleCombo.getItems().addAll("Customer", "Bank Clerk");
    }

    @FXML
    private void loginUser() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String role = roleCombo.getValue();

        // Temporary authentication mockup
        if (username.isBlank() || password.isBlank() || role == null) {
            errorLabel.setText("Please enter all fields.");
            return;
        }

        try {
            Stage stage = (Stage) usernameField.getScene().getWindow();
            FXMLLoader loader;
            Scene scene;

            if (role.equals("Customer")) {
                loader = new FXMLLoader(getClass().getResource("/view/customer-dashboard.fxml"));
            } else {
                loader = new FXMLLoader(getClass().getResource("/view/bankclerk-dashboard.fxml"));
            }

            scene = new Scene(loader.load());
            stage.setScene(scene);
            stage.setTitle(role + " Dashboard");
        } catch (IOException e) {
            e.printStackTrace();
            errorLabel.setText("Error loading dashboard.");
        }
    }
}
