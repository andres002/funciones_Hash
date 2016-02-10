/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.util.Scanner;

/**
 *
 * @author hugo
 */
public class Plegamiento {
    int[] n = {1001, 1005, 1007, 1025, 1030, 1039, 1049, 1057, 1090, 1095, 1098, 1099, 1100, 1127, 1136, 1145, 1148,
            1158, 1165, 1191, 1194, 1197, 1200, 1202, 1208, 1227, 1233, 1240, 1254, 1299, 1302, 1325, 1329, 1343, 1352,
            1360, 1373, 1376, 1382, 1389, 1407, 1415, 1423, 1433, 1443, 1453, 1456, 1461, 1487, 1494, 1501, 1505, 1507,
            1512, 1513, 1525, 1526, 1532, 1551, 1578, 1581, 1585, 1610, 1615, 1622, 1633, 1635, 1646, 1651, 1684, 1692,
            1711, 1716, 1717, 1720, 1722, 1726, 1752, 1759, 1791, 1812, 1816, 1843, 1847, 1857, 7259, 1891, 1892, 1893,
            1894, 1905, 1909, 1911, 1919, 1930, 9359, 1957, 1960, 1969, 1971};
 public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
      Plegamiento a = new Plegamiento();
        int aux[]= new int[a.n.length];
        int k;
        int res;
        System.out.println("Bienvenido");
       // System.out.print("\nNumero a buscar: ");
        for (int i = 0; i < a.n.length; i++) {
           res = a.plegamiento(a.n[i]); 
           aux[res]=a.n[i];
            System.out.println("id: "+res+" valor: "+aux[res]);
        }
        
       
    }
    public int plegamiento(int clave){
		int suma=0;
		int retorno=0;

		while(clave!=0){
			suma = suma+clave%100;
			clave = clave/100;
		}
                retorno=retorno+1;
		while(suma!=0){
			retorno =retorno+suma%100;
			suma=suma/100;
		}
                retorno=retorno+1;
              
		return retorno;
	}
    
}
