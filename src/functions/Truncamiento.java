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
public class Truncamiento {

    public static void main(String [] args) {
        int[] n = {1001, 1005, 1007, 1025, 1030, 1039, 1049, 1057, 1090, 1095, 1098, 1099, 1100, 1127, 1136, 1145, 1148,
            1158, 1165, 1191, 1194, 1197, 1200, 1202, 1208, 1227, 1233, 1240, 1254, 1299, 1302, 1325, 1329, 1343, 1352,
            1360, 1373, 1376, 1382, 1389, 1407, 1415, 1423, 1433, 1443, 1453, 1456, 1461, 1487, 1494, 1501, 1505, 1507,
            1512, 1513, 1525, 1526, 1532, 1551, 1578, 1581, 1585, 1610, 1615, 1622, 1633, 1635, 1646, 1651, 1684, 1692,
            1711, 1716, 1717, 1720, 1722, 1726, 1752, 1759, 1791, 1812, 1816, 1843, 1847, 1857, 7259, 1891, 1892, 1893,
            1894, 1905, 1909, 1911, 1919, 1930, 9359, 1957, 1960, 1969, 1971};
        Scanner x = new Scanner(System.in);
        Truncamiento a = new Truncamiento();
        int k;
        System.out.println("Bienvenido");
        System.out.print("\nNumero a buscar: ");
        k = x.nextInt();
        System.out.println(n.length);
        System.out.println("Clave: " + a.Truncar(k, n.length));
    }

    public int Truncar(int clave, int tama) {
        if (tama < 100) {
            String a = String.valueOf(clave);
            String x = String.valueOf(a.charAt(0));
            String y = String.valueOf(a.charAt(2));
            String union = x + y;

            int convert = (Integer.parseInt(union)) + 1;
            return convert;

        } else if (tama >= 100 && tama < 1000) {
            String a = String.valueOf(clave);
            String x = String.valueOf(a.charAt(0));
            String y = String.valueOf(a.charAt(2));
            //String z = String.valueOf(a.charAt(4));
            String union = x + y; /*+z*/

            int convert = (Integer.parseInt(union)) + 1;
            return convert;

        } else if (tama >= 1000 && tama < 10000) {
            String a = String.valueOf(clave);
            String x = String.valueOf(a.charAt(0));
            String y = String.valueOf(a.charAt(2));
            String z = String.valueOf(a.charAt(4));
            String w = String.valueOf(a.charAt(6));
            String union = x + y + z + w;

            int convert = (Integer.parseInt(union)) + 1;
            return convert;

        } else if (tama >= 10000 && tama < 100000) {
            String a = String.valueOf(clave);
            String x = String.valueOf(a.charAt(0));
            String y = String.valueOf(a.charAt(2));
            String z = String.valueOf(a.charAt(4));
            String w = String.valueOf(a.charAt(6));
            String b = String.valueOf(a.charAt(8));
            String union = x + y + z + w + b + w;

            int convert = (Integer.parseInt(union)) + 1;
            return convert;

        }
        return 0;

    }

}
