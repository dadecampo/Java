package codes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Davide Camponogara
 */
public class MyInventory extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //punto di partenza dell'indirizzo di getResource si riferisce al Source Packages
        Parent root = FXMLLoader.load(getClass().getResource("/fxmlStyle/inventoryFXML.fxml"));
        //imposto come scena il file XML
        Scene scene= new Scene(root);
        //carico nello stage la scena
        stage.setScene(scene);
        //la mostro
        stage.show();
    }
    
    //il main non è necessario per queste applicazioni JavaFX
    public static void main(String[] args){
        launch(args);
    }
    
}
