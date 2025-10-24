package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.util.List;

public class TransactionHistoryController {

    @FXML private ListView<String> transactionList;
    @FXML private Button closeButton;

    public void loadTransactions(List<String> transactions) {
        transactionList.getItems().setAll(transactions);
    }

    @FXML
    private void closeWindow() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
