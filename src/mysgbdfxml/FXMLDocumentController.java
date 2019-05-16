/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysgbdfxml;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

/**  
 *
 * @author ANGELO
 */
public class FXMLDocumentController implements Initializable {
   
    @FXML
    private void handleButtonAction(MouseEvent event) {
        System.out.println("You clicked me!");

        if(event.getTarget() == btnLogin){
            System.out.println("login nnnn");
            homePanel.setVisible(true);
            loginPanel.setVisible(false);
        }
   
        
 }
    @FXML Pane loginPane = new Pane();
    @FXML Pane homePane = new Pane();
    
    @FXML
    public void connexion() throws Exception 
    {
       homePane.setVisible(true);
       loginPane.setVisible(false);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //
    }    
    
}
