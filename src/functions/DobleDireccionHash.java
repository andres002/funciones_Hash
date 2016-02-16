/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import hash_functions.Suit;
import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class DobleDireccionHash {

    /**
     * @param args the command line arguments
     */
  public static int v[] = {7256, 1005, 1007, 1025, 1030, 1039, 1049, 1057, 1090, 1095, 1098, 1099, 1100, 1127, 1136, 1145, 1148,
            1158, 1165, 1191, 1194, 1197, 1200, 1202, 1208, 1227, 1233, 1240, 1254, 1299, 1302, 1325, 1329, 1343, 1352,
            1360, 1373, 1376, 1382, 1389, 1407, 1415, 1423, 1433, 1443, 1453, 1456, 1461, 1487, 1494, 1501, 1505, 1507,
            1512, 1513, 1525, 1526, 1532, 1551, 1578, 1581, 1585, 1610, 1615, 1622, 1633, 1635, 1646, 1651, 1684, 1692,
            1711, 1716, 1717, 1720, 1722, 1726, 1752, 1759, 1791, 1812, 1816, 1843, 1847, 1857, 7259, 1891, 1892, 1893,
            1894, 1905, 1909, 1911, 1919, 1930, 9359, 1957, 1960, 1969, 1971};
    public static int vb[] = new int[v.length+2];
    public void SetArray(int k[]){
        this.v=k;
    }

    public static void main(String[] args) {
        DobleDireccionHash d = new DobleDireccionHash();
             Suit suit = new Suit();
        System.out.println(vb.length);
        for (int lo = 0; lo < v.length; lo++) {

           int c=d.clave(v[lo]);
             if (vb[c] == 0){
               vb[c] = v[lo];
                suit.acomodar(c, v[lo]);
                 v[lo]=0;
             System.out.println("Id:"+c+"  Valor:"+vb[c]);
                  }
             else {

                     while (v[lo]!=0) {
                         c = d.newclave(c);
                         if (vb[c] == 0) {
                             vb[c] = v[lo];
                             suit.acomodar(c, v[lo]);
                             v[lo]=0;
                             System.out.println("Id:"+c+"  Valor"+vb[c]);

                         }
                     }
               }
        }



        System.out.println();
        for (int s = 0 ; s<vb.length ; s++) {
            System.out.println(vb[s]);
           // d.doubleHash(vb[s], vb);
        }
    }
    public void Calcular(){
         DobleDireccionHash d = new DobleDireccionHash();
         Suit suit = new Suit();
        for (int lo = 0; lo < v.length; lo++) {

           int c=d.clave(v[lo]);
             if (vb[c] == 0){
               vb[c] = v[lo];
                suit.acomodar(c, v[lo]);
                 v[lo]=0;
             System.out.println("Id:"+c+"  Valor:"+vb[c]);
             
                  }
             else {

                     while (v[lo]!=0) {
                         c = d.newclave(c);
                         if (vb[c] == 0) {
                             vb[c] = v[lo];
                             suit.acomodar(c, v[lo]);
                             v[lo]=0;
                             System.out.println("Id:"+c+"  Valor"+vb[c]);

                         }
                     }
               }
        }
        
    }

    public int clave(int i) {
        int clave =(i % vb.length);
        return clave;
    }

    public int newclave(int i){
        int neclave=((i+1)%vb.length);
        return neclave;
    }/*
    public void doubleHash(int k,int v[]) {
        int d = (k%v.length);
        if (k==v[d]){
            System.out.println("La clave:"+v[d]+"  Se encuentre en parte:"+d);
        }else{
            int dx = (d%v.length)+1;
           // System.out.println(dx);
            while(dx<=v.length && v[dx]!=k && v.length!=0 && dx!=d){

                dx=(dx%v.length)+1;
                //System.out.println(dx);
            }
            if (v[dx]==k){
                System.out.println("La clave:"+v[dx]+"  se encuentra en parte : "+ dx);
            }else {
                System.out.println("no se encuentra");
            }
        }
    }*/
    
}
   