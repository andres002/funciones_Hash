/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.util.Scanner;
import hash_functions.Suit;

/**
 *
 * @author hugo
 */
public class Truncamiento {

    Suit suit = new Suit();
    int[] n = {7256, 1005, 1007, 1025, 1030, 1039, 1049, 1057, 1090, 1095, 1098, 1099, 1100, 1127, 1136, 1145, 1148,
        1158, 1165, 1191, 1194, 1197, 1200, 1202, 1208, 1227, 1233, 1240, 1254, 1299, 1302, 1325, 1329, 1343, 1352,
        1360, 1373, 1376, 1382, 1389, 1407, 1415, 1423, 1433, 1443, 1453, 1456, 1461, 1487, 1494, 1501, 1505, 1507,
        1512, 1513, 1525, 1526, 1532, 1551, 1578, 1581, 1585, 1610, 1615, 1622, 1633, 1635, 1646, 1651, 1684, 1692,
        1711, 1716, 1717, 1720, 1722, 1726, 1752, 1759, 1791, 1812, 1816, 1843, 1847, 1857, 7259, 1891, 1892, 1893,
        1894, 1905, 1909, 1911, 1919, 1930, 9359, 1957, 1960, 1969, 1971};

    public static void main(String[] args) {

        Truncamiento a = new Truncamiento();
        int res;
        System.out.println("Bienvenido");

        for (int i = 0; i < a.n.length; i++) {
            res = a.Truncar(a.n[i]); //este es el Id aquí se obtiene
            System.out.println("id: " + res + " valor: " + a.n[i]);
        }
    }

    public void setArray(int[] n) {
        this.n = n;
    }

    public void calcular() {
        int res;
        for (int i = 0; i < n.length; i++) {
            res = Truncar(n[i]); //este es el Id aquí se obtiene
            suit.acomodar(res,n[i]);
            System.out.println("id: " + res + " valor: " + n[i]);
        }
    }

    public int Truncar(int clave) {
        int tama = n.length;
        int digitos = calculaD(clave);
        int id = GeneraId(clave, digitos, tama);
        return id;

    }

    public int calculaD(int clave) {
        int cont = 0;
        while (clave != 0) {
            clave = clave / 10;
            cont++;
        }
        return cont;
    }

    public int GeneraId(int clave, int digitos, int tama) {
        int convert;
        //  System.out.println("El tamano es: "+tama);
        if (tama >= 100 && tama <= 999) {
            if (digitos == 1) {
                return clave;
            }
            if (digitos == 2) {
                clave = clave / 10;
                return clave;
            }
            if (digitos == 3 || digitos == 4) {
                String a = String.valueOf(clave);
                String x = String.valueOf(a.charAt(0));
                //  System.out.println("--"+x);
                String y = String.valueOf(a.charAt(2));
                //  System.out.println("--"+y);
                String union = x + y;
                //  System.out.println("union es: "+union);

                convert = (Integer.parseInt(union)) + 1;
                //  System.out.println("conver es: "+convert);
                return convert;

            }

        }
        if (tama >= 1000 && tama <= 9999) {
            if (digitos == 1) {
                return clave;
            }
            if (digitos == 2) {
                return clave / 10;
            }
            if (digitos == 3 || digitos == 4) {
                String a = String.valueOf(clave);
                String x = String.valueOf(a.charAt(0));
                String y = String.valueOf(a.charAt(2));

                String union = x + y;
                convert = (Integer.parseInt(union)) + 1;
                return convert;

            }
            if (digitos == 5 || digitos == 6) {
                String a = String.valueOf(clave);
                String x = String.valueOf(a.charAt(0));
                String y = String.valueOf(a.charAt(2));
                String z = String.valueOf(a.charAt(4));
                String union = x + y + z;
                convert = (Integer.parseInt(union)) + 1;
                return convert;

            }

        }
        if (tama >= 10000 && tama < 100000) {
            if (digitos == 1) {
                return clave;
            }
            if (digitos == 2) {
                return clave / 10;
            }
            if (digitos == 3 || digitos == 4) {
                String a = String.valueOf(clave);
                String x = String.valueOf(a.charAt(0));
                String y = String.valueOf(a.charAt(2));

                String union = x + y;
                convert = (Integer.parseInt(union)) + 1;
                return convert;

            }
            if (digitos == 5 || digitos == 6) {
                String a = String.valueOf(clave);
                String x = String.valueOf(a.charAt(0));
                String y = String.valueOf(a.charAt(2));
                String z = String.valueOf(a.charAt(4));
                String union = x + y + z;
                convert = (Integer.parseInt(union)) + 1;
                return convert;

            }
            if (digitos == 7 || digitos == 8) {
                String a = String.valueOf(clave);
                String x = String.valueOf(a.charAt(0));
                String y = String.valueOf(a.charAt(2));
                String z = String.valueOf(a.charAt(4));
                String union = x + y + z;
                convert = (Integer.parseInt(union)) + 1;
                return convert;

            }
            if (digitos == 7 || digitos == 8) {
                String a = String.valueOf(clave);
                String x = String.valueOf(a.charAt(0));
                String y = String.valueOf(a.charAt(2));
                String z = String.valueOf(a.charAt(4));
                String v = String.valueOf(a.charAt(6));
                String union = x + y + z + v;
                convert = (Integer.parseInt(union)) + 1;
                return convert;
            }
        }
        if (tama <= 99) {
            String a = String.valueOf(clave);
            String x = String.valueOf(a.charAt(0));
            convert = (Integer.parseInt(x)) + 1;
            return convert;
        }

        return 0;
    }
}
