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

    public int id;
    public int dato;
    

    public boolean encontrar(int id, int dato) {
        if (opcCol == 1) {
            id = id;
            dato = dato;
            return arre.searchDato(id, dato);
        }

        if (opcCol == 2) {
            return cadena.searchDato(id, dato);
        }
        if (opcCol == 3) {
            return li.linealB(id, dato, datosL);

        }
        if (opcCol == 4) {
            return cu.cuadraticoB(id, dato, datosL);
        }
        return false;
    }
    public int getPosicion(){
        if (opcCol == 1) {
            
        }

        if (opcCol == 2) {
           
        }
        if (opcCol == 3) {
            return li.getPosicion();

        }
        if (opcCol == 4) {
            return cu.getPosicion();
        }
        return -1;
    }
    public int getComplejidad(){
        if (opcCol == 1) {
            
        }

        if (opcCol == 2) {
           
        }
        if (opcCol == 3) {
            return li.getComplejidad();

        }
        if (opcCol == 4) {
            return cu.getComplejidad();
        }
        return -1;
    }

}
