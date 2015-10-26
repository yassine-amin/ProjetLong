/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sxpgui;

import sxpgui.controller.LoginController;
//import com.sun.javaws.WinOperaSupport;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Yassine
 */
public class SXPGUI extends Application {
    @Override
    public void start(Stage stage) throws Exception {        
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(SXPGUI.class.getResource("fxml/login.fxml"));
            BorderPane ap = loader.load();
            LoginController loginController = loader.getController();
            loginController.setMainStage(stage);
            Scene sc = new Scene(ap);
            stage.setScene(sc);
            stage.show();
        }catch(Exception e){
            System.out.println("Erreur");
        }
        //stage.setScene(scene);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
