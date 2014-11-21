/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenebuilderjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.property.ListProperty;
import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
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
    ListView operationsList;
    
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
        char[] temp = colorSelector.getValue().toString().toCharArray();
        char[] color = new char[(temp.length-1)];
        
        color[0] = '#';
        
        for (int i=2; i<temp.length; i++) {
            color[i-1] = temp[i];
        }
        
        String hashHexColor = String.valueOf(color);
        
        root.setStyle("-fx-background: "+hashHexColor);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
}
