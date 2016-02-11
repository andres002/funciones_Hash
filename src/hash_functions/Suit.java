/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash_functions;
import static hash_functions.FXMLDocumentController.opcCol;
import static hash_functions.FXMLDocumentController.opcHash;
import static hash_functions.FXMLDocumentController.datos;
import static hash_functions.FXMLDocumentController.arre;
/**
 *
 * @author Andres
 */
public class Suit {
        public void acomodar(int id, int dato){
        if(opcCol == 1){
            arre.soluColisions(id, dato);
        }
    }
}
