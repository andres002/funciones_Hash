/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash_functions;

import java.util.Scanner;

/**
 *
 * @author hugo
 */
public class Plegamiento {
     public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Plegamiento a = new Plegamiento();
        int k;
        System.out.println("Bienvenido");
        System.out.print("\nNumero a buscar: ");
        k = x.nextInt();
        System.out.println("Clave: "+a.plegamiento(k));
    }
    public int plegamiento(int clave){
		int suma=0;
		int retorno=0;

		while(clave!=0){
			suma = suma+clave%100;
			clave = clave/100;
		}
                retorno=retorno+1;
                System.out.println("impriem"+retorno);
		while(suma!=0){
			retorno =retorno+suma%100;
			suma=suma/100;
		}
                retorno=retorno+1;
                System.out.println("impriem"+retorno);
		return retorno;
	}
    
}
