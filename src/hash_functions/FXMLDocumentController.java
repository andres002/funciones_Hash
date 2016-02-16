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
import javafx.scene.layout.Pane;
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
    @FXML
    private Pane panel1, panel2;
    static public int opcHash = 0, opcCol = 0;
    static int[] datos;
    static int[] datosL;
    static lineal li = new lineal();
    static cuadratico cu = new cuadratico();
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
            datosL = new int[datos.length + 1];
            panel1.setDisable(false);

        }

    }

    private void modul() {
        Division d = new Division();
        d.setArray(datos);
        d.calcula();
        for (int i = 1; i < datosL.length; i++) {
            System.out.println("id " + i + "dato: " + datosL[i]);
        }
    }

    private void cuadra() {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setArray(datos);
        cuadrado.calcula1();
        for (int i = 1; i < datosL.length; i++) {
            System.out.println("id " + i + "dato: " + datosL[i]);
        }
    }

    private void trunca() {
        Truncamiento truncas = new Truncamiento();
        truncas.setArray(datos);
        truncas.calcular();
    }

    private void plega() {
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
                if (!panel1.isDisable()) {
                arre.cleanArray(datos.length);
                }else{
                }
            }
            if (encadena.isSelected()) {
                opcCol = 2;
                if (!panel1.isDisable()) {
                cadena.cleanList(datos.length);
                }else {
                    
                }
            }
            if (rlineal.isSelected()) {
                opcCol = 3;
                if (!panel1.isDisable()) {
                }else{
                }

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
            if (!panel1.isDisable()) {
                modul();
            } else {
                System.out.println("Holiwis :3");
            }

        }

        if (cuadra.isSelected()) {
            opcHash = 2;
            if (!panel1.isDisable()) {
                cuadra();
            } else {

            }
        }
        if (plega.isSelected()) {
            opcHash = 3;
            if (!panel1.isDisable()) {
                plega();
            } else {

            }
        }
        if (trunca.isSelected()) {
            opcHash = 4;
            if (!panel1.isDisable()) {
                trunca();
            } else {

            }
        }
        panel1.setDisable(true);
        panel2.setDisable(false);
    }

    @FXML
    private void Busqueda() {
        
    }

    @FXML
    private void restart() {
        panel2.setDisable(true);
        panel1.setDisable(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        panel1.setDisable(true);
        panel2.setDisable(true);
    }

}
