/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.util.Scanner;
import hash_functions.Suit;

/**
 *
 * @author hugo
 */
public class Plegamiento {

    Suit suit = new Suit();
    int[] n;

    public int[] datos;
    public int[] ids;
    int suma = 0;

    public static void main(String[] args) {
        Plegamiento a = new Plegamiento();

        System.out.println("Bienvenido");
        for (int i = 0; i < a.n.length; i++) {
            int valora = a.plegamiento(a.n[i]);//aqui se genera el Id
            System.out.println("El id es: " + valora + " El dato es: " + a.n[i]);

        }
    }

    public void setArray(int[] n) {
        this.n = n;
    }

    public int[] getDatos() {
        return datos;
    }

    public int[] getIds() {
        return ids;
    }

    public void calcular() {
        datos = new int[n.length];
        ids = new int[n.length];
        int res;
        for (int i = 0; i < n.length; i++) {
            res = plegamiento(n[i]); //este es el Id aquí se obtiene
            datos[i] = n[i];
            ids[i] = res;
            suit.acomodar(res, n[i]);
            System.out.println("id: " + res + " valor: " + n[i]);
        }
    }

    public int plegamiento(int clave) {
        int clave1 = clave;
        int digitos = calculaD(clave);
        String linea = String.valueOf(clave);
        if (digitos == 5) {
            String a1 = linea.substring(0, 3);
            //    System.out.println("a1: " +a1);
            String a2 = linea.substring(3, 5);
            //   System.out.println("a2: "+a2);
            int b1 = Integer.parseInt(a1);
            int b2 = Integer.parseInt(a2);
            //   System.out.println("la suma ahora es: "+(b1+b2));
            suma = b1 + b2;
        }
        if (digitos == 4) {
            String a1 = linea.substring(0, 2);
            //    System.out.println("a1: " +a1);
            String a2 = linea.substring(2, 4);
            //   System.out.println("a2: "+a2);
            int b1 = Integer.parseInt(a1);
            int b2 = Integer.parseInt(a2);
            suma = b1 + b2;
        }
        if (digitos == 3) {
            String a1 = linea.substring(0, 2);
            //   System.out.println("a1: " +a1);
            String a2 = linea.substring(2);
            //   System.out.println("a2: "+a2);
            int b1 = Integer.parseInt(a1);
            int b2 = Integer.parseInt(a2);
            suma = b1 + b2;

        }
        if (digitos == 2) {
            int a1 = clave / 10;
            int a2 = clave % 10;
            suma = a1 + a2;
        }
        if (digitos == 1) {
            if (clave1 == 0) {
                return clave + 1;
            } else {
                return clave+1;
            }

        }

        if (clave1 == 0) {
            return clave + 1;
        }
        if(suma > n.length)
            return plegamiento(suma);
        return suma;

    }

    public int calculaD(int clave) {
        int cont = 0;
        while (clave != 0) {
            clave = clave / 10;
            cont++;
        }
        return cont;
    }

}
