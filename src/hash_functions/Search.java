/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash_functions;

import colisiones.DDHas;
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
    DDHas doble = new DDHas();

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
         if (opcCol == 5) {
            
               
               return doble.doubleHashB(id, datosL, dato);
          
        }
        return false;
    }
    public String getPosicion(){
        if (opcCol == 1) {
            return arre.getPosicion();
        }

        if (opcCol == 2) {
           return cadena.getPosicion();
        }
        if (opcCol == 3) {
            return li.getPosicion()+"";

        }
        if (opcCol == 4) {
            return cu.getPosicion()+"";
        }
        if(opcCol == 5){
            return doble.getPosicion()+"";
        }
        return "-1";
    }
    public int getComplejidad(){
        if (opcCol == 1) {
            return arre.getComplejidad();
        }

        if (opcCol == 2) {
           return cadena.getComplejidad();
        }
        if (opcCol == 3) {
            return li.getComplejidad();

        }
        if (opcCol == 4) {
            return cu.getComplejidad();
        }
        if(opcCol == 5){
            return doble.getComplejidad();
        }
        return -1;
    }

}
