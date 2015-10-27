/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;

/**
 * FXML Controller class
 *
 * @author Yassine
 */
public class RegistrationController implements Initializable {
    
    @FXML
    private Hyperlink registration;
    @FXML
    private Button register;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void registration (){
        System.out.println("boobs");
    }

}
