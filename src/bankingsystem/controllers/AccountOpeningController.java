package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class AccountOpeningController {

    @FXML private TextField customerIdField;
    @FXML private TextField accountNumberField;
    @FXML private ComboBox<String> accountTypeCombo;
    @FXML private TextField branchField;
    @FXML private Button submitButton;

    @FXML
    private void initialize() {
        accountTypeCombo.getItems().addAll("Savings Account", "Investment Account", "Cheque Account");
    }

    @FXML
    private void submitAccountOpeningForm() {
        String customerId = customerIdField.getText();
        String accNum = accountNumberField.getText();
        String type = accountTypeCombo.getValue();
        String branch = branchField.getText();

        if (customerId.isBlank() || accNum.isBlank() || branch.isBlank() || type == null) {
            showAlert("All fields are required!");
            return;
        }

        // to be changed, after database is added
        showAlert("Account for " + customerId + " created successfully!");

        // Navigate back to clerk dashboard
        try {
            Stage stage = (Stage) submitButton.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/bankclerk-dashboard.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAlert(String msg) {
        new Alert(Alert.AlertType.INFORMATION, msg).showAndWait();
    }
}
