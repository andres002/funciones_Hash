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
    int[] v ={7,9,8,5,4};
	int N =5; //número de elementos

	public void lineal(int k){
		//int d = H(k); poner funcion hash
            int d = 2;
		int dx = 0;
		if(v[d]==k){
			System.out.println("El elemento esta en la posicion"+d);

		}else{
			dx = d+1;
			while(dx <= N && v[dx]!=k &&  dx != d){
				dx = dx +1 ;
				if(dx == N+1){
					dx = 1;
				}
			}
			if(v[dx] ==k){
				System.out.println("El elemento esta en la posicion "+dx);

			}else{
				System.out.println("El elemento no esta en el arreglo");
			}

		}
	}

	
}
