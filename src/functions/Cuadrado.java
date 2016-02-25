package functions;

import hash_functions.Suit;
import java.io.*;
import java.util.*;
import static hash_functions.FXMLDocumentController.bandera;
import hash_functions.Search;

public class Cuadrado {

    public static Search s2 = new Search();
    int[] n;
    int h;
    int resultado = 0;
    Suit suit = new Suit();
    public int[] datos;
    public int[] ids;

    public void setArray(int[] n) {
        this.n = n;
    }

    public int digitos(int dig, String k1, int cont) {
        char u, v, w, y, z;
        String sB, sA, res, sC, sD, sE;
        switch (dig) {
            case 1:
                z = k1.charAt(cont / 2);
                sB = String.valueOf(z);
                resultado = Integer.parseInt(sB);
                break;
            case 2:
                y = k1.charAt((cont / 2) - 1);
                z = k1.charAt(cont / 2);
                sB = String.valueOf(z);
                sA = String.valueOf(y);
                res = sA + sB;
                resultado = Integer.parseInt(res);
                break;
            case 3:
                w = k1.charAt((cont / 2) - 1);
                z = k1.charAt(cont / 2);
                y = k1.charAt((cont / 2) + 1);
                sC = String.valueOf(w);
                sB = String.valueOf(z);
                sA = String.valueOf(y);

                res = sC + sB + sA;
                resultado = Integer.parseInt(res);
                break;
            case 4:
                v = k1.charAt((cont / 2) - 2);
                w = k1.charAt((cont / 2) - 1);
                z = k1.charAt(cont / 2);
                y = k1.charAt((cont / 2) + 1);
                sD = String.valueOf(v);
                sC = String.valueOf(w);
                sB = String.valueOf(z);
                sA = String.valueOf(y);

                res = sD + sC + sB + sA;
                resultado = Integer.parseInt(res);
                break;
            case 5:
                v = k1.charAt((cont / 2) - 2);
                w = k1.charAt((cont / 2) - 1);
                z = k1.charAt(cont / 2);
                y = k1.charAt((cont / 2) + 1);
                u = k1.charAt((cont / 2) + 2);
                sD = String.valueOf(v);
                sC = String.valueOf(w);
                sB = String.valueOf(z);
                sA = String.valueOf(y);
                sE = String.valueOf(y);
                res = sD + sC + sB + sA + sE;
                resultado = Integer.parseInt(res);
                break;
        }
        return resultado;
    }

    public int getResultado() {
        return resultado;
    }

    public boolean calcula(int l) {
        int cont = 0;
        int k = l;
        int dig = 0;
        String k1;
        k = (int) Math.pow(k, 2);
        k1 = k + "";
        if (k == 0) {
            cont++;
        }
        while (k > 0) {
            k = k / 10;
            cont++;
        }

        if (n.length > 0 && n.length <= 10) {
            digitos(1, k1, cont);
        }
        if (n.length > 10 && n.length <= 100) {
            if (cont == 1) {
                digitos(1, k1, cont);
            } else {
                digitos(2, k1, cont);
            }
        }
        if (n.length > 100 && n.length <= 1000) {
            if (cont == 1) {
                digitos(1, k1, cont);
            } else if (cont == 2) {
                digitos(2, k1, cont);
            } else {
                digitos(3, k1, cont);
            }
        }

        if (n.length > 1000 && n.length <= 10000) {
            if (cont == 1) {
                digitos(1, k1, cont);
            } else if (cont == 2) {
                digitos(2, k1, cont);
            } else if (cont == 3) {
                digitos(3, k1, cont);
            } else {
                digitos(4, k1, cont);
            }
            if (n.length > 10000 && n.length <= 100000) {
                if (cont == 1) {
                    digitos(1, k1, cont);
                } else if (cont == 2) {
                    digitos(2, k1, cont);
                } else if (cont == 3) {
                    digitos(3, k1, cont);
                } else if (cont == 4) {
                    digitos(4, k1, cont);
                } else {
                    digitos(5, k1, cont);
                }
            }
        }
        h = getResultado() + 1;
        while (h > n.length) {
            h = h - n.length;
        }
        System.out.println("num: " + l + " id: " + h);
        if (!bandera) {
            suit.acomodar(h, l);
            return true;
        } else {
            return s2.encontrar(h, l);
        }
    }
    public int calcular(int l) {
        int cont = 0;
        int k = l;
        int dig = 0;
        String k1;
        k = (int) Math.pow(k, 2);
        k1 = k + "";
        if (k == 0) {
            cont++;
        }
        while (k > 0) {
            k = k / 10;
            cont++;
        }

        if (n.length > 0 && n.length <= 10) {
            digitos(1, k1, cont);
        }
        if (n.length > 10 && n.length <= 100) {
            if (cont == 1) {
                digitos(1, k1, cont);
            } else {
                digitos(2, k1, cont);
            }
        }
        if (n.length > 100 && n.length <= 1000) {
            if (cont == 1) {
                digitos(1, k1, cont);
            } else if (cont == 2) {
                digitos(2, k1, cont);
            } else {
                digitos(3, k1, cont);
            }
        }

        if (n.length > 1000 && n.length <= 10000) {
            if (cont == 1) {
                digitos(1, k1, cont);
            } else if (cont == 2) {
                digitos(2, k1, cont);
            } else if (cont == 3) {
                digitos(3, k1, cont);
            } else {
                digitos(4, k1, cont);
            }
            if (n.length > 10000 && n.length <= 100000) {
                if (cont == 1) {
                    digitos(1, k1, cont);
                } else if (cont == 2) {
                    digitos(2, k1, cont);
                } else if (cont == 3) {
                    digitos(3, k1, cont);
                } else if (cont == 4) {
                    digitos(4, k1, cont);
                } else {
                    digitos(5, k1, cont);
                }
            }
        }
        h = getResultado() + 1;
        while (h > n.length) {
            h = h - n.length;
        }
        System.out.println("num: " + l + " id: " + h);
       return h;
    }
   
    public int[] getDatos() {
        return datos;
    }

    public int[] getIds() {
        return ids;
    }

    public void calcula1() {
        datos = new int[n.length];
        ids = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            calcula(n[i]);
            
            datos[i] = n[i];
            ids[i] = h;
        }

    }
}
