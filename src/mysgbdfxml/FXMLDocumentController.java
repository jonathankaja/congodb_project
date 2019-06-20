/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysgbdfxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**  
 *
 * @author ANGELO
 */
public class FXMLDocumentController implements Initializable {
   
//    @FXML
//    private void handleButtonAction(MouseEvent event) {
//        System.out.println("You clicked me!");
//
//        if(event.getTarget() == btnLogin){
//            System.out.println("login nnnn");
//            homePanel.setVisible(true);
//            loginPanel.setVisible(false);
//        }
//    }
    
    
    @FXML Pane loginPane = new Pane();
    @FXML Pane homePane = new Pane();
    @FXML Pane mesbd = new Pane();
    @FXML Pane add_bd = new Pane();
    @FXML ImageView deconnexion=new ImageView();
    @FXML TextField user = new TextField();
    @FXML PasswordField pwd =new PasswordField();
    @FXML Button mesbd_retour =new Button();
    @FXML Button retour_in_add_bd =new Button();
    @FXML Button creer_in_add_bd =new Button();
    
    
    /**
     *
     * @throws Exception
     */
    @FXML
    public void connexion() throws Exception 
    {
        String log = user.getText();
        String mdp = pwd.getText();
        if("a".equals(log) && "a".equals(mdp)){
            homePane.setVisible(true);
            loginPane.setVisible(false);
        }
        else{
            System.out.println("mysgbdfxml.FXMLDocumentController.deconnexion()");
        }
       
    }
    @FXML
    public void deconnexion() throws Exception 
    {
        homePane.setVisible(false);
        loginPane.setVisible(true);
       
    }
    @FXML
    public void mesbd_retour() throws Exception 
    {
        homePane.setVisible(true);
        mesbd.setVisible(false);
       
    }
    @FXML
    public void mesbd() throws Exception 
    {
        homePane.setVisible(false);
        mesbd.setVisible(true);
       
    }
    
    @FXML
    public void new_bd() throws Exception 
    {
        homePane.setVisible(false);
        add_bd.setVisible(true);
       
    }
    
    @FXML
    public void retour_in_add_bd() throws Exception 
    {
        add_bd.setVisible(false);
        homePane.setVisible(true);
        
       
    }
    @FXML
    public void creer_in_add_bd() throws Exception 
    {
        System.out.println("BD creer avec success !");
       
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //
    }    
    
}
