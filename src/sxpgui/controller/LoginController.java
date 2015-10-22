/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sxpgui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sxpgui.SXPGUI;

/**
 * FXML Controller class
 *
 * @author Yassine
 */
public class LoginController implements Initializable {

    @FXML
    private TextField userName;
    @FXML
    private PasswordField password;
    @FXML
    private Button signIn;
    @FXML
    private Hyperlink registration;
    
    @FXML
    private Label label1;
    
    private Stage mainStage;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    public void handleSignIn() {
        // TODO 
    }
    @FXML
    public void handleRegistration(){
        showRgistrationDialog();
    }
    public boolean showRgistrationDialog(){
        try {
        // Load the fxml file and create a new stage for the popup dialog.
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(SXPGUI.class.getResource("fxml/registration.fxml"));
        AnchorPane page = (AnchorPane) loader.load();

        // Create the dialog Stage.
        Stage dialogStage = new Stage();
        dialogStage.setTitle("Registration");
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.initOwner(this.mainStage);
        Scene scene = new Scene(page);
        dialogStage.setScene(scene);

        // Set the person into the controller.
        

        // Show the dialog and wait until the user closes it
        dialogStage.showAndWait();

        return true;
    } catch (IOException e) {
        e.printStackTrace();
        return false;
    }
    }

    /**
     * @return the mainStage
     */
    public Stage getMainStage() {
        return mainStage;
    }

    /**
     * @param mainStage the mainStage to set
     */
    public void setMainStage(Stage mainStage) {
        this.mainStage = mainStage;
    }
}
