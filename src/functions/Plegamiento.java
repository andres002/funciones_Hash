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
    int[] n = {7259, 9359, 1007, 1025, 1030, 1039, 1049, 1057, 1090, 1095, 1098, 1099, 1100, 1127, 1136, 1145, 1148,
            1158, 1165, 1191, 1194, 1197, 1200, 1202, 1208, 1227, 1233, 1240, 1254, 1299, 1302, 1325, 1329, 1343, 1352,
            1360, 1373, 1376, 1382, 1389, 1407, 1415, 1423, 1433, 1443, 1453, 1456, 1461, 1487, 1494, 1501, 1505, 1507,
            1512, 1513, 1525, 1526, 1532, 1551, 1578, 1581, 1585, 1610, 1615, 1622, 1633, 1635, 1646, 1651, 1684, 1692,
            1711, 1716, 1717, 1720, 1722, 1726, 1752, 1759, 1791, 1812, 1816, 1843, 1847, 1857, 7259, 1891, 1892, 1893,
            1894, 1905, 1909, 1911, 1919, 1930, 9359, 1957, 1960, 1969, 1971};
 public static void main(String[] args) {
         Plegamiento a = new Plegamiento();
      
        System.out.println("Bienvenido");
        for (int i=0;i<a.n.length ;i++ ) {
          int valora= a.plegamiento(a.n[i]);//aqui se genera el Id
            System.out.println("El id es: "+valora+" El dato es: "+a.n[i]);
            

        }
    }
    public int plegamiento(int clave){
      int suma=0;
      int clave1 = clave;
      int digitos=calculaD(clave);
      String linea = String.valueOf(clave);
      if(digitos==5){
        String a1 = linea.substring(0,3);
    //    System.out.println("a1: " +a1);
        String a2 = linea.substring(3,5);
     //   System.out.println("a2: "+a2);
        int b1 = Integer.parseInt(a1);
        int b2 = Integer.parseInt(a2);
     //   System.out.println("la suma ahora es: "+(b1+b2));
       suma = b1+b2;
      }
      if(digitos==4){
        String a1 = linea.substring(0,2);
    //    System.out.println("a1: " +a1);
        String a2 = linea.substring(2,4);
     //   System.out.println("a2: "+a2);
        int b1 = Integer.parseInt(a1);
        int b2 = Integer.parseInt(a2);
       suma = b1+b2;
      }
      if(digitos==3){
        String a1 = linea.substring(0,2);
     //   System.out.println("a1: " +a1);
        String a2 = linea.substring(2);
     //   System.out.println("a2: "+a2);
        int b1 = Integer.parseInt(a1);
        int b2 = Integer.parseInt(a2);
       suma = b1+b2;

      }
      if(digitos==2){
        int a1 = clave/10;
        int a2 = clave%10;
        suma =a1+a2;
      }
      if(digitos==1){
        if(clave1==0){
          return clave+1;
        }else{
           return clave;
        }
       
      }
      
      return suma;
        
}
public int calculaD(int clave){
    int cont = 0;
    while(clave!=0){
        clave = clave/10;
        cont++;
    }
    return cont;
	}
    
}
