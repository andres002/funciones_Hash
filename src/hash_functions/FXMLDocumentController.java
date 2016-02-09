/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template fileCh, choose Tools | Templates
 * and open the template in the editor.
 */
package hash_functions;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import leerArchivo.AllLines;


/**
 *
 * @author Andres
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private File files;
    private Stage stage;
    @FXML
    private RadioButton modul, cuadra, plega, trunca, aani, encadena, rlineal, rcuadra, rdoble;
    int opcHash=0, opcCol;
    
    
   
    @FXML
    private void openfile(){
        FileChooser fileCh = new FileChooser();
        fileCh.setTitle("Open");
        fileCh.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("txt", "*.txt")
        );
        files = fileCh.showOpenDialog(stage);
        if(files != null){
            AllLines a = new AllLines(files.getPath());
            System.out.println("path--"+files.getPath());
            int lineas = a.getLines();
        }
        
    }
    
    @FXML
    private void opciones(){
        if (modul.isSelected()){
            opcHash = 1;
        }
        
        if (cuadra.isSelected()){
            opcHash = 2;
        }
        if (plega.isSelected()){
            opcHash = 3;
        }
        if (trunca.isSelected()){
            opcHash = 4;
        }
        if (aani.isSelected()){
            opcCol = 1;
        }
        if (encadena.isSelected()){
            opcCol = 2;
        }
        if (rlineal.isSelected()){
            opcCol = 3;
        }
        if (rcuadra.isSelected()){
            opcCol = 4;
        }
        if (rdoble.isSelected()){
            opcCol = 5;
        }
        
        
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
