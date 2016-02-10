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
public class Truncamiento {

     int[] n = {1001, 1005, 1007, 1025, 1030, 1039, 1049, 1057, 1090, 1095, 1098, 1099, 1100, 1127, 1136, 1145, 1148,
            1158, 1165, 1191, 1194, 1197, 1200, 1202, 1208, 1227, 1233, 1240, 1254, 1299, 1302, 1325, 1329, 1343, 1352,
            1360, 1373, 1376, 1382, 1389, 1407, 1415, 1423, 1433, 1443, 1453, 1456, 1461, 1487, 1494, 1501, 1505, 1507,
            1512, 1513, 1525, 1526, 1532, 1551, 1578, 1581, 1585, 1610, 1615, 1622, 1633, 1635, 1646, 1651, 1684, 1692,
            1711, 1716, 1717, 1720, 1722, 1726, 1752, 1759, 1791, 1812, 1816, 1843, 1847, 1857, 7259, 1891, 1892, 1893,
            1894, 1905, 1909, 1911, 1919, 1930, 9359, 1957, 1960, 1969, 1971};

    public static void main(String [] args) {
       Scanner x = new Scanner(System.in);
        
        Truncamiento a = new Truncamiento();
        int aux[]= new int[a.n.length];
        int k;
        int res;
        System.out.println("Bienvenido");
        System.out.print("\nNumero a buscar: ");
        for (int i = 0; i < a.n.length; i++) {
           res = a.Truncar(a.n[i],a.n.length); 
           aux[res]=a.n[i];
            System.out.println("id: "+res+" valor: "+aux[res]);
        }
    }

    public int Truncar(int clave, int tama) {
    	int cont =0;
    	int numero=clave;
    	while(numero>0){
    	numero=numero/10;
    		cont++;
    	}
    	//System.out.println("contador: "+cont);
        if (tama < 100) {
            String a = String.valueOf(clave);
            String x = String.valueOf(a.charAt(0));
            String union = x;

            int convert = (Integer.parseInt(union)) + 1;
            return convert;

        } else if (tama>10 &&tama >= 100 && tama < 1000) {
           if(cont>2){
           	String a = String.valueOf(clave);
            String x = String.valueOf(a.charAt(0));
            String y = String.valueOf(a.charAt(2));
            String union = x + y;

            int convert = (Integer.parseInt(union)) + 1;
            return convert;
           }else if(cont>=1&&cont<=2){
           	String a = String.valueOf(clave);
           	String x= String.valueOf(a.charAt(0));
           	String union = x;

            int convert = (Integer.parseInt(union)) + 1;
            return convert;
           }

        } else if (tama >= 1000 && tama < 10000) {
           if(cont>5){
           	String a = String.valueOf(clave);
            String x = String.valueOf(a.charAt(0));
            String y = String.valueOf(a.charAt(2));
            String z = String.valueOf(a.charAt(4));
            String union = x + y + z;

            int convert = (Integer.parseInt(union)) + 1;
            return convert;

           }else if(cont>=3&&cont<5){
           	String a = String.valueOf(clave);
            String x = String.valueOf(a.charAt(0));
            String y = String.valueOf(a.charAt(2));
            String union = x + y;

            int convert = (Integer.parseInt(union)) + 1;
            return convert;

           }else if(cont>0&&cont<3){
           	String a = String.valueOf(clave);
            String x = String.valueOf(a.charAt(0));
            String union = x;

            int convert = (Integer.parseInt(union)) + 1;
            return convert;

           }
        } else if (tama >= 10000 && tama < 100000) {
            if(cont>=6){
            String a = String.valueOf(clave);
            String x = String.valueOf(a.charAt(0));
            String y = String.valueOf(a.charAt(2));
            String z = String.valueOf(a.charAt(4));
            String w = String.valueOf(a.charAt(6));
            String union = x + y + z + w + w;

            int convert = (Integer.parseInt(union)) + 1;
            return convert;
            }else if(cont>=5&&cont<6){
            String a = String.valueOf(clave);
            String x = String.valueOf(a.charAt(0));
            String y = String.valueOf(a.charAt(2));
            String z = String.valueOf(a.charAt(4));

            String union = x + y + z;
            int convert = (Integer.parseInt(union)) + 1;
            return convert;
            }else if(cont>=3&&cont<=4){
            String a = String.valueOf(clave);
            String x = String.valueOf(a.charAt(0));
            String y = String.valueOf(a.charAt(2));
            String union = x + y;
            int convert = (Integer.parseInt(union)) + 1;

            }else if(cont<3&&cont>1){
            	String a = String.valueOf(clave);
            String x = String.valueOf(a.charAt(0));
           
            String union = x;
            int convert = (Integer.parseInt(union)) + 1;
}
        }
        return 0;

    }
}
