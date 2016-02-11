package colisiones;

public class Arre{
	int [][] D;
	int tamano;
	
	public void soluColisions(int position, int dato){
		boolean bandera = false;
		int x = 1;
			if(D[position][x] == '\0'){
				D[position][x] = dato;
				
			}else{
				while(bandera==false){
					x++;
					if(D[position][x] == '\0'){
						D[position][x] = dato;
						bandera = true;
					}
				}
			}
		System.out.println("El dato quedo guardado en la posicion: " + position +", " + x);
	}
		

	public int[][] getArray(){
            return D;
        }

	
	public void cleanArray(int tamano){
            D = new int [tamano +1][tamano +1];
            System.out.println("tamaño..." + tamano);
		for (int x = 1; x <= tamano; x++) {
			for (int y = 1; y <= tamano; y++) {
                            
				D[x][y] = '\0'; 
			}
			
		}
	}




	public static void main(String[] args) {
		Arre a = new Arre();
		a.tamano = 10;
		a.D = new int [a.tamano +1][a.tamano +1];
		a.cleanArray(a.tamano);
		a.soluColisions(1,1);
		a.soluColisions(2,2);
		a.soluColisions(3,3);
		a.soluColisions(4,4);
		a.soluColisions(1,12);
		a.soluColisions(1,13);
		a.soluColisions(2,22);
		a.soluColisions(2,23);
		a.soluColisions(3,33);

	}
}