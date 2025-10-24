package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import java.io.IOException;
import java.util.Arrays;

public class BankClerkController {

    @FXML private TableView<String> customerTable;
    @FXML private Button openAccountButton;
    @FXML private Button viewCustomerDetailsButton;
    @FXML private Button logoutButton;

    @FXML
    private void initialize() {
        // Placeholder data for demo
        customerTable.getItems().addAll("C001 - Alice Moyo", "C002 - John Phiri");
    }

    @FXML
    private void openAccountForm() {
        try {
            Stage stage = (Stage) openAccountButton.getScene().getWindow();
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/view/account-opening.fxml")));
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void logout() throws IOException {
        Stage stage = (Stage) logoutButton.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/login-view.fxml"))));
    }
}
