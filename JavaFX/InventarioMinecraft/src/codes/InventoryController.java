/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Window;




/**
 *
 * @author Davide Camponogara
 */
public class InventoryController{
    
    @FXML
    Pane pannello;
    
    @FXML
    ImageView imageview;
    
    @FXML
    Image image;
    
    @FXML
    protected void handleMouseClick(MouseEvent evt){
        imageview=(ImageView) evt.getSource();
        imageview.setOpacity(0.5);
        System.out.println("ciao");
    }

    
}
