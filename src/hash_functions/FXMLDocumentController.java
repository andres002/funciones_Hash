/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template fileCh, choose Tools | Templates
 * and open the template in the editor.
 */
package hash_functions;

import colisiones.Arre;
import colisiones.Encadena;
import colisiones.cuadratico;
import colisiones.lineal;
import functions.Cuadrado;
import functions.Division;
import functions.DobleDireccionHash;
import functions.Plegamiento;
import functions.Truncamiento;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
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
    static public int opcHash = 0, opcCol = 0;
    static int[] datos;
    static int[] datosL;
    static lineal li = new lineal();
    static cuadratico cu =  new cuadratico();
    static Arre arre = new Arre();
    static Encadena cadena = new Encadena();
    private TextField dato;

    @FXML
    private void openfile() {
        FileChooser fileCh = new FileChooser();
        fileCh.setTitle("Open");
        fileCh.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("txt", "*.txt")
        );
        files = fileCh.showOpenDialog(stage);
        if (files != null) {
            AllLines a = new AllLines(files.getPath());
            System.out.println("path--" + files.getPath());
            int lineas = a.getLines();
            System.out.println("lineas---" + lineas);
            datos = a.AllLines(lineas);
            datosL = new int[datos.length+1];
            
        }

    }

    private void modul() {
        Division d = new Division();
        d.setArray(datos);
        d.calcula();
        for (int i = 1; i < datosL.length; i++) {
            System.out.println("id "+i +"dato: "+datosL[i]);
        }
    }
    
    private void cuadra() {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setArray(datos);
        cuadrado.calcula1();
        for (int i = 1; i < datosL.length; i++) {
            System.out.println("id "+i +"dato: "+datosL[i]);
        }
    }
    
    private void trunca(){
        Truncamiento truncas = new Truncamiento();
        truncas.setArray(datos);
        truncas.calcular();
    }
    
    private void plega(){
        Plegamiento plegas = new Plegamiento();
        plegas.setArray(datos);
        plegas.calcular();
    }
    
    private void DobleHash(){
    DobleDireccionHash DoHash = new DobleDireccionHash();
    DoHash.SetArray(datos);
    DoHash.Calcular();
    }

    @FXML
    private void opciones() {
        if (aani.isSelected()) {
            opcCol = 1;
            arre.cleanArray(datos.length);
        }
        if (encadena.isSelected()) {
            opcCol = 2;
            cadena.cleanList(datos.length);
        }
        if (rlineal.isSelected()) {
            opcCol = 3;
            
        }
        if (rcuadra.isSelected()) {
            opcCol = 4;
        }
        if (rdoble.isSelected()) {
            opcCol = 5;
            DobleHash();
        }

        if (modul.isSelected()) {
            opcHash = 1;
            modul();
            
        }

        if (cuadra.isSelected()) {
            opcHash = 2;
            cuadra();
        }
        if (plega.isSelected()) {
            opcHash = 3;
            plega();
        }
        if (trunca.isSelected()) {
            opcHash = 4;
            trunca();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
