package functions;

import java.io.*;
import java.util.*;
public class Cuadrado{
	static int [] n={1001, 1005, 1007, 1025, 1030, 1039, 1049, 1057, 1090, 1095, 1098, 1099, 1100, 1127, 1136, 1145, 1148, 
			1158, 1165, 1191, 1194, 1197, 1200, 1202, 1208, 1227, 1233, 1240, 1254, 1299, 1302, 1325, 1329, 1343, 1352, 
			1360, 1373, 1376, 1382, 1389, 1407, 1415, 1423, 1433, 1443, 1453, 1456, 1461, 1487, 1494, 1501, 1505, 1507, 
			1512, 1513, 1525, 1526, 1532, 1551, 1578, 1581, 1585, 1610, 1615, 1622, 1633, 1635, 1646, 1651, 1684, 1692, 
			1711, 1716, 1717, 1720, 1722, 1726, 1752, 1759, 1791, 1812, 1816, 1843, 1847, 1857, 7259, 1891, 1892, 1893, 
			1894, 1905, 1909, 1911, 1919, 1930, 9359, 1957, 1960, 1969, 1971};
			int resultado=0;
	int [] aux= new int [n.length];
	
	public int digitos(int dig, String k1, int cont){
		char u,v,w,y,z;
		String sB, sA, res, sC, sD, sE;
		switch(dig){
			case 1:
				z= k1.charAt(cont/2);
				sB = String.valueOf(z);
				resultado= Integer.parseInt(sB); 
			break;
			case 2:
				y= k1.charAt((cont/2)-1);
					z= k1.charAt(cont/2);
					sB = String.valueOf(z);
					sA = String.valueOf(y);
					res = sA + sB;   
					resultado= Integer.parseInt(res); 
			break;
			case 3:
					w= k1.charAt((cont/2)-1);
						z= k1.charAt(cont/2);
						y= k1.charAt((cont/2)+1);
						sC = String.valueOf(w);
						sB = String.valueOf(z);
						sA = String.valueOf(y);
						
						res = sC + sB + sA;   
						resultado= Integer.parseInt(res); 
			break;
			case 4:
			v= k1.charAt((cont/2)-2);
							w= k1.charAt((cont/2)-1);
							z= k1.charAt(cont/2);
							y= k1.charAt((cont/2)+1);
							sD = String.valueOf(v);
							sC = String.valueOf(w);
							sB = String.valueOf(z);
							sA = String.valueOf(y);
						
							res = sD + sC + sB + sA;   
							resultado= Integer.parseInt(res); 
			break;
			case 5:
				v= k1.charAt((cont/2)-2);
								w= k1.charAt((cont/2)-1);
								z= k1.charAt(cont/2);
								y= k1.charAt((cont/2)+1);
								u= k1.charAt((cont/2)+2);
								sD = String.valueOf(v);
								sC = String.valueOf(w);
								sB = String.valueOf(z);
								sA = String.valueOf(y);
								sE = String.valueOf(y);
								res = sD + sC + sB + sA + sE;   
								resultado= Integer.parseInt(res); 
			break;
		}return resultado;
	}

		public int getResultado(){
		return resultado;
	}

	public void calcula(int [] n, int l){
		int cont=0;
		
		int h;
		int k=l;
		int dig=0;
		

			String k1;
		 k=(int) Math.pow(k,2);
				 k1=k+"";
				while(k>0){
					k=k/10;
					cont++;
				}
			
				if (n.length<100){
					digitos(1,k1,cont);
				}
				if(n.length>=100 && n.length<1000){ 
					if (cont == 1){
						digitos(1,k1,cont);
					}else{
						digitos(2,k1,cont);
					}
				}
					if (n.length>=1000 && n.length<10000){
						if (cont == 1){
						digitos(1,k1,cont);
					}else{
						if (cont ==2){
						digitos(2,k1,cont);
						}else{
							digitos(3,k1,cont);
						}
					}
					}
				
						if (n.length>=10000 && n.length<100000){
							if (cont == 1){
						digitos(1,k1,cont);
					}else{
						if (cont ==2){
						digitos(2,k1,cont);
						}else{
							if (cont == 3){
							digitos(3,k1,cont);
							}else{
								digitos(4,k1,cont);
							}
						}}
							if (n.length>=100000 && n.length<1000000){
								if (cont == 1){
						digitos(1,k1,cont);
					}else{
						if (cont ==2){
						digitos(2,k1,cont);
						}else{
							if (cont == 3){
							digitos(3,k1,cont);
							}else{
								if (cont==4){
								digitos(4,k1,cont);
								}else{
									digitos(5,k1,cont);
								}
							}
							}
						}
					}
				}
				h=getResultado()+1;
				System.out.println("num: "+l+" id: "+h);
				//acomodar(l,h);
	}

	/*public void acomodar(int num,int id){
		aux[id] = num;
	}

	public void imprime(){
		int x=0;
		for (int i=0; i<n.length;i++){
			x++;
			System.out.println(x+" num: "+aux[i]);
		}
	}*/


	public static void main(String[] args) {

		
		Scanner x=new Scanner (System.in);
		int opc;
		int cont=0;
		int k,p;

		Cuadrado d = new Cuadrado();
		for (int i=0; i< n.length;i++){
		d.calcula(n,n[i]);
		//d.imprime();
	}
				
}
}