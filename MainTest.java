
package prak15_rifan;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainTest extends Application {
    
    @Override   
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FormInput.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Data Mahasiswa");
        stage.show();
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
