/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author abdoulayembaye
 */
public class GestDocMain extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
       
       Parent root = FXMLLoader.load(getClass().getResource("/Ressources/Fxml/GestionDoc.fxml"));
      
        
        Scene scene = new Scene(root);
        
        scene.getStylesheets().add(getClass().getResource("/Ressources/application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Gestion Documents");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
