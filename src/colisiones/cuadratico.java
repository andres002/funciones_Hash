/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colisiones;

/**
 *
 * @author Javier
 */
public class cuadratico {
    int complejidad = 0;
    int posicion = -1;
    
    public int getPosicion(){
        return posicion;
    }
    public int getComplejidad(){
        return complejidad;
    }

    public boolean cuadraticoB(int d, int k, int[] v) {
        complejidad= 0;
        if (v[d] == k) {
            posicion = d;
            complejidad++;
            System.out.println("El elemento esta en la posicion " + d);
            return true;
        } else {
            int i = 1;
            int dx = (int) (d + Math.pow(i, 2));
            while (v[dx] != '\0' && v[dx] != k) {
                complejidad++;
                i = i + 1;
                dx = (int) (d + Math.pow(i, 2));
                System.out.println("dx " + dx);
                if (dx > v.length-1) {
                    i = 0;
                    dx = 1;
                    d = 1;
                }
            }
            if (v[dx] == k) {
                complejidad++;
                posicion = dx;
                System.out.println("El elemento esta en la posicion " + dx);
                return true;

            } else {
                posicion = -1;
                System.out.println("El elemento no esta en el arreglo");
                return false;
            }

        }
    }

    public int cuadratico(int d, int[] v, int dato) {

        int i = 1;
        int dx = (int) (d + Math.pow(i, 2));
        if (dx > v.length-1) {
               
                dx = 1;
             
            }
        System.out.println(v.length + "ee" +dx);
        while (v[dx] != '\0') {
            i = i + 1;
            dx = (int) (d + Math.pow(i, 2));
            System.out.println("dx " + dx);
            if (dx > v.length-1) {
                i = 0;
                dx = 1;
                d = 1;
            }
        }
        v[dx] = dato;
        return dx;

    }

    public void soluColisions(int id, int dato) {

    }
}
