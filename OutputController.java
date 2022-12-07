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

public class OutputController {

    @FXML
    private Label lblAlamat;

    @FXML
    private Button btnDataBaru;

    @FXML
    private Label lblNama;

    @FXML
    private Label lblNpm;

    @FXML
    void openForm(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("FormInput.fxml"));
        
        Stage stage= (Stage) btnDataBaru.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    public void showValue(Mahasiswa mhs){
        lblNpm.setText(mhs.getNpm());
        lblNama.setText(mhs.getNama());
        lblAlamat.setText(mhs.getAlamat());
    }
}
