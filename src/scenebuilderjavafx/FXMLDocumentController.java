/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenebuilderjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Ohjelmistokehitys
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    Label helloLabel;
    
    @FXML
    Label underLabel;
    
    @FXML
    ColorPicker colorSelector;
    
    @FXML
    AnchorPane root;
    
    @FXML
    private void handleCloseButton(ActionEvent e) {
        Platform.exit();
    }
    
    @FXML
    private void handleHelloButton(ActionEvent e) {
        helloLabel.setText("Yo!");
    }
    
    @FXML
    private void handleColorSelection(ActionEvent e) {
        underLabel.setText(colorSelector.getValue().toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
