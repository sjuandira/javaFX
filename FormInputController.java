package prak15_salsabilajuandiraa;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FormInputController {

     @FXML
    private Button btnCancel;
     
    @FXML
    private Button btnTambah;

    @FXML
    private Label lblAlamat;

    @FXML
    private Label lblNama;

    @FXML
    private Label lblNpm;

    @FXML
    void sendData(ActionEvent event) throws IOException {
        Mahasiswa mhs= Mahasiswa(lblNpm.getText(),lblNama.getText(),lblAlamat.getText());
        FXMLLoader loader= new FXMLLoader(getClass().getResource("Output.fxml"));
        Parent root= loader.load();
        
        OutputController outputController= loader.getController();
        outputController.showValue(mhs);
        
        Stage stage=(Stage) btnTambah.getScene().getWindow();
        stage.setScene(new Scene(root));

    }

}
