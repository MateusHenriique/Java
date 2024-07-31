
package olamundojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author mateu
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblmessage;
    private Button btnclick;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblmessage.setText("Olá, Mundo!!!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
