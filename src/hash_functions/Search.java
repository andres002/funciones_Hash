/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash_functions;

import static hash_functions.FXMLDocumentController.arre;
import static hash_functions.FXMLDocumentController.cadena;
import static hash_functions.FXMLDocumentController.cu;
import static hash_functions.FXMLDocumentController.datosL;
import static hash_functions.FXMLDocumentController.li;
import static hash_functions.FXMLDocumentController.opcCol;

/**
 *
 * @author Andres
 */
public class Search {
    public boolean encontrar(int id, int dato){
        if (opcCol == 1) {
            return arre.searchDato(id, dato);
        }

        if (opcCol == 2) {
            cadena.soluColisions(id, dato);
        }
        if (opcCol == 3) {
            if (datosL[id] != '\0') {
                System.out.println("colision rLineal");
                System.out.println("dato: " + dato);
                li.lineal(id, datosL, dato);
            } else {
                datosL[id] = dato;
            }

        }
        if (opcCol == 4) {
            if (datosL[id] != '\0') {
                cu.cuadratico(id, datosL, dato);
            } else {
                datosL[id] = dato;
            }
        }
        return false;
    }
    
}

