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
    
        int[] v ={7,9,8,5,4};
	int N =5; //número de elementos
    public void testCuadratico(int k){
		int d=  5; //H[k]; colocar funcion hash
	
                
		if(v[d]==k){
			System.out.println("El elemento esta en la posicion "+d);

		}else{
			int i =1;
			int dx = (int) (d + Math.pow(i,2));
			while(v[dx] != k ){
				if(dx > N){
					i = 0;
					dx = 1;
					d = 1;
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
