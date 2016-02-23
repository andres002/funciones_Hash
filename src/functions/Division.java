package functions;

import hash_functions.Suit;
import static hash_functions.FXMLDocumentController.bandera;
import java.io.*;
import java.util.*;

public class Division {
    public static int clave=0;
    Suit suit = new Suit();
    public int h;
    int[] n;
    public int[] datos;
    public int[] ids;

    public void setArray(int[] n) {
        this.n = n;
    }

    public void calcula() {
        datos = new int[n.length];
        ids = new int[n.length];
        int k;

        for (int i = 0; i < n.length; i++) {
            h = hash(n[i]);

            System.out.println("num: " + n[i] + " id: " + h);
            datos[i] = n[i];
            ids[i] = h;
            acomodar(n[i], h);
        }
    }

    public int hash(int dato) {
        return (dato % n.length) + 1;
    }
    public int hash(int dato, int[] n) {
        return (dato % n.length) + 1;
    }

    public void acomodar(int num, int id) {
        suit.acomodar(id, num);
        clave = id;

    }

    public int[] getDatos() {
        return datos;
    }

    public int[] getIds() {
        return ids;
    }

}
