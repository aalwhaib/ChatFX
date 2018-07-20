package com.houarizegai.chatfx.main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML
    private void launchServer(MouseEvent e) {
        ((AnchorPane)e.getSource()).setDisable(true);
        
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/com/houarizegai/chatfx/server/Server.fxml"));
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Server");
        stage.show();
    }
    
    @FXML
    private void launchClient() {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/com/houarizegai/chatfx/client/Client.fxml"));
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Client");
        stage.show();
    }
    
    @FXML
    private void btnSettings() {
        
    }
    
}
