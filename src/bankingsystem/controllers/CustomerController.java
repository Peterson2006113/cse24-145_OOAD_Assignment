package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import java.io.IOException;
import java.util.Arrays;

public class CustomerController {

    @FXML private ListView<String> accountListView;
    @FXML private Button viewTransactionsButton;
    @FXML private Button logoutButton;

    @FXML
    private void initialize() {
        // Dummy data for demo
        accountListView.getItems().addAll(
                "Savings - 001 | Balance: 1500.00",
                "Investment - 002 | Balance: 3200.00"
        );
    }

    @FXML
    private void viewTransactions() {
        try {
            Stage stage = (Stage) viewTransactionsButton.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/transaction-history.fxml"));
            Scene scene = new Scene(loader.load());

            TransactionHistoryController controller = loader.getController();
            controller.loadTransactions(Arrays.asList(
                    "Deposit +500.00",
                    "Interest +25.00",
                    "Withdrawal -200.00"
            ));

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
