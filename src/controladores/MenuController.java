package controladores;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class MenuController implements Initializable{

    @FXML
    private Button btnCapturar;

    @FXML
    private Button btnCombatir;

    @FXML
    private AnchorPane fondoMenu;

    @FXML
    private ImageView imgnGengar;

    @FXML 
    private void capturar(ActionEvent event){
        System.out.println("hola");
    }

    @FXML
    private void combatir(ActionEvent event){
        System.out.println("hola");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
}
