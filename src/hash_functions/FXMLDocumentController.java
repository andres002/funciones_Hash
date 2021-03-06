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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import leerArchivo.AllLines;
import static functions.Cuadrado.s2;

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
    public Pane panel1, panel2;
    @FXML
    public TextArea datoh, idh, idc;
    @FXML
    public TextArea busquedaTxt;
    @FXML
    private TextField buscar;
    static public int opcHash = 0, opcCol = 0;
    static int[] datos;
    static int[] datosL;
    public static int wea = 0;
    static lineal li = new lineal();
    
    static cuadratico cu = new cuadratico();
    static Arre arre = new Arre();
    static Encadena cadena = new Encadena();
    private TextField dato;
    Division d = new Division();
    Cuadrado cuadrado = new Cuadrado();
    Truncamiento truncas = new Truncamiento();
    Plegamiento plegas = new Plegamiento();
    Search search = new Search();
    public static boolean bandera = false;
    public int tam;

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
            cleanDatosL();
            panel1.setDisable(false);
            tam = lineas;

        }

    }

    private void modul(int dato) {

        if (!panel1.isDisable()) {
            d.setArray(datos);
            d.calcula();
            for (int i = 1; i < datosL.length; i++) {
                System.out.println("id " + i + "dato: " + datosL[i]);
            }
        } else {
            int id = d.hash(dato);
            Search s = new Search();
            if (s.encontrar(id, dato)) {
                busquedaTxt.setText("El dato fue encontrado en la posicion "+s.getPosicion() +"\nLa complejidad es" +s.getComplejidad());
                System.out.println("EL DATO FUE ENCONTRADO");
            } else {
                busquedaTxt.setText("El dato no fue encontrado. \nLa complejidad es" +s.getComplejidad());
                System.out.println("El dato no fue encontrado");
            }

        }

    }

    private void cuadra(int dato) {
        if (!panel1.isDisable()) {
            
            cuadrado.setArray(datos);
            cuadrado.calcula1();
            for (int i = 1; i < datosL.length; i++) {
                System.out.println("id " + i + "dato: " + datosL[i]);
            }
        } else {
            if (cuadrado.calcula(dato)) {
                 busquedaTxt.setText("El dato fue encontrado en la posicion "+s2.getPosicion() +"\nLa complejidad es" +s2.getComplejidad());
               
                System.out.println("EL DATO FUE ENCONTRADO");
                System.out.println(search);
            } else {
                 busquedaTxt.setText("El dato no fue encontrado. \nLa complejidad es" +s2.getComplejidad());
                System.out.println("El dato no fue encontrado");
            }

        }
    }

    private void trunca(int dato) {
        if (!panel1.isDisable()) {
            truncas.setArray(datos);
            truncas.calcular();
        } else {
            int id = truncas.Truncar(dato);
            System.out.println("este es el id que mando-----" + id);
            System.out.println("este es el dato --------- " + dato);
            Search s = new Search();
            if (s.encontrar(id, dato)) {
                 busquedaTxt.setText("El dato fue encontrado en la posicion "+s.getPosicion() +"\nLa complejidad es" +s.getComplejidad());
                
                System.out.println("EL DATO FUE ENCONTRADO");
            } else {
                 busquedaTxt.setText("El dato no fue encontrado. \nLa complejidad es" +s.getComplejidad());
                System.out.println("El dato no fue encontrado");
            }

        }

    }

    private void plega(int dato) {
        if (!panel1.isDisable()) {
            plegas.setArray(datos);
            plegas.calcular();
        } else {
            int id = plegas.plegamiento(dato);
            System.out.println("este es el id que me manda ***** " + id);
            Search s = new Search();
            if (s.encontrar(id, dato)) {
                busquedaTxt.setText("El dato fue encontrado en la posicion "+s.getPosicion() +"\nLa complejidad es" +s.getComplejidad());
                System.out.println("EL DATO FUE ENCONTRADO");
            } else {
                 busquedaTxt.setText("El dato no fue encontrado. \nLa complejidad es" +s.getComplejidad());
                
                System.out.println("El dato no fue encontrado");
            }
        }

    }

    private void DobleHash() {
        DobleDireccionHash DoHash = new DobleDireccionHash();
        DoHash.SetArray(datos);
        DoHash.Calcular();
    }

    @FXML
    private void opciones() {
        int algo = 0;
        if (panel1.isDisable()) {
            bandera = true;
            try {
                algo = Integer.parseInt(buscar.getText());
            } catch (Exception e) {
                System.out.println("Excepcion---" + e);
            }
        } else {
            bandera = false;
        }

        if (aani.isSelected()) {
            opcCol = 1;
            if (!panel1.isDisable()) {
                arre.cleanArray(datos.length);
            }
        }
        if (encadena.isSelected()) {
            opcCol = 2;
            if (!panel1.isDisable()) {
                cadena.cleanList(datos.length);
            }
        }
        if (rlineal.isSelected()) {
            opcCol = 3;

            if (!panel1.isDisable()) {
                cleanDatosL();     
            }

        }
        if (rcuadra.isSelected()) {
            opcCol = 4;
           if (!panel1.isDisable()) {
                cleanDatosL();     
            }
        }
        if (rdoble.isSelected()) {
            opcCol = 5;
            if (!panel1.isDisable()) {
                cleanDatosL();     
            }
        }

        if (modul.isSelected()) {
            opcHash = 1;
            datoh.setText(" ");
            idh.setText(" ");
            modul(algo);
            for (int x = 0; x < d.datos.length; x++) {
                datoh.setText(datoh.getText() + d.datos[x] + "\n");
                idh.setText(idh.getText() + d.ids[x] + "\n");
            }
        }

        if (cuadra.isSelected()) {
            opcHash = 2;
            datoh.setText(" ");
            idh.setText(" ");
            cuadra(algo);
            for (int x = 0; x < cuadrado.datos.length; x++) {
                datoh.setText(datoh.getText() + cuadrado.datos[x] + "\n");
                idh.setText(idh.getText() + cuadrado.ids[x] + "\n");
            }

        }
        if (plega.isSelected()) {
            opcHash = 3;
            datoh.setText(" ");
            idh.setText(" ");
            plega(algo);
            for (int x = 0; x < plegas.datos.length; x++) {
                datoh.setText(datoh.getText() + plegas.datos[x] + "\n");
                idh.setText(idh.getText() + plegas.ids[x] + "\n");
            }

        }
        if (trunca.isSelected()) {
            opcHash = 4;
            datoh.setText(" ");
            idh.setText(" ");
            trunca(algo);
            for (int x = 0; x < truncas.datos.length; x++) {
                datoh.setText(datoh.getText() + truncas.datos[x] + "\n");
                idh.setText(idh.getText() + truncas.ids[x] + "\n");
            }

        }
        panel1.setDisable(true);
        panel2.setDisable(false);
    }
    private void cleanDatosL(){
        for (int i = 0; i < datosL.length; i++) {
            datosL[i]='\0';
        }
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
