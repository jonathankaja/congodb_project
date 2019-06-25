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
import javafx.scene.control.Label;
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
    @FXML TextField txt_nombd = new TextField();
    @FXML Pane panel_bdexiste, panel_bdcreer = new Pane();
    @FXML Label txt_bdexiste,txt_bdcreer = new Label();
    @FXML TextField txt_nomtable,txt_champ1,txt_champ2,txt_champ3,txt_champ4,txt_champ5 = new TextField();
    @FXML TextField txt_type1,txt_type2,txt_type3,txt_type4,txt_type5 =new TextField();
    @FXML Pane panel_addchamp = new Pane();
    /**
     *
     * @throws Exception
     */
    String bd;
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
    public void bd_existe() throws Exception 
    {
        panel_bdexiste.setVisible(false);
        
       
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
        bd=txt_nombd.getText();
        if (GestionTable.verifierBaseDesdonnees(bd)){
            txt_bdexiste.setText("La base de donnees "+bd+" existe !");
            panel_bdexiste.setVisible(true);
            System.out.println("bd existe");
            
        
        }else{
        
        txt_bdcreer.setText("La base de donnees "+bd+" a été créee !");
        panel_bdcreer.setVisible(true);
        GestionTable.creationBaseDesDonnees(bd);
        System.out.println("bd creee");
        
        };
       
    }
    
    @FXML
    public void affiche_ajoute_champ(){
        panel_bdcreer.setVisible(false);
        panel_addchamp.setVisible(true);
    
    }
    
    @FXML
    public void ajoute_table() throws Exception 
    {
        bd="C:\\Users\\Blackpyramide\\Documents\\NetBeansProjects\\mySGBDfxml\\bd\\"+bd+".json";
        Nouveautable table = new Nouveautable(txt_nomtable.getText());
        Champs champ1 =new Champs(txt_champ1.getText(), txt_type1.getText());
        Champs champ2 =new Champs(txt_champ2.getText(), txt_type2.getText());
        Champs champ3 =new Champs(txt_champ3.getText(), txt_type3.getText());
        Champs champ4 =new Champs(txt_champ4.getText(), txt_type4.getText());
        Champs champ5 =new Champs(txt_champ5.getText(), txt_type5.getText());
        table.addChamp(champ1,champ2, champ3,champ4,champ5);
        System.out.println(bd);
        ConversionStringToJson.serialisation(table,bd);
        
        
        
        
        
        
        System.out.println("donees ajouter avec success");
//        homePane.setVisible(false);
//        mesbd.setVisible(true);
       
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //
    }    
    
}
