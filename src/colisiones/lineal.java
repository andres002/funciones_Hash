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
public class lineal {

    /**
     *
     * @param d id hash
     * @param k numero a buscar
     * @param v arreglo de id
     */
    public boolean linealB(int d, int k, int[] v) {

        int N = v.length - 1;
        System.out.println("N: "+N);
        int dx = 0;
        System.out.println("d: " + d);
        System.out.println("k" + k);
        if (v[d] == k) {
            System.out.println("true");
            return true;
        } else {
            dx = d + 1;
            if (dx == N + 1) {
                dx = 1;
            }
            //   while (dx <= N && v[dx] != k && dx != d) {
            while (dx <= N && v[dx] != k && dx != d) {
                dx = dx + 1;
                if (dx == N + 1) {
                    dx = 1;
                }
            }
            System.out.println("dx: " + dx);
            
            if (v[dx] == k) {
                System.out.println("El elemento esta en la posicion " + dx);
                return true;

            } else {
                return false;
            }

        }
    }

    /*
     * @param d id hash
     */
    /**
     *
     * @param d
     * @param v
     * @param dato
     * @return
     */
    public int lineal(int d, int[] v, int dato) {

        int N = v.length - 1;

        int dx = d + 1;
        if (dx == N + 1) {
            dx = 1;
        }
        while (dx <= N && v[dx] != '\0' && dx != d) {
            dx = dx + 1;
            if (dx == N + 1) {
                dx = 1;
            }
        }
        v[dx] = dato;
        return dx;

    }

}
