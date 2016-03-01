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
    int[] n;

    public int[] datos;
    public int[] ids;

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
        datos = new int[n.length];
        ids = new int[n.length];
        int res;
        for (int i = 0; i < n.length; i++) {
            res = Truncar(n[i]); //este es el Id aquí se obtiene
            if(res>n.length){
                while(res>n.length){
                    res=res-n.length;
                   // System.out.println(res);
                }
            }
            if(res == 0)
                res+=1;
            suit.acomodar(res, n[i]);
            datos[i] = n[i];
            ids[i] = res;
            System.out.println("id: " + res + " valor: " + n[i]);
        }
    }

    public int Truncar(int clave) {
        int tama = n.length; //come
        int digitos = calculaD(clave);
        int id = GeneraId(clave, digitos, tama);
         if(id == 0)
                id+=1;
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
                clave+=1;
               if(clave>n.length){
                   clave=clave-n.length;
               }
               return clave;
            }
            if (digitos == 2) {
                clave = clave/10;
                clave+=1;
                if(clave>n.length){
                    while(clave>n.length){
                        clave= clave-n.length;
                    }
                }
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
               if(convert>n.length){
                    while(convert>n.length){
                        convert=convert-n.length;
                    }
                }
                return convert;

            }

        }
        if (tama >= 1000 && tama <= 9999) {
            if (digitos == 1) {
                clave+=1;
                if(clave>n.length){
                    while(clave>n.length){
                        clave=clave-n.length;
                    }
                }
                return clave;
            }
            if (digitos == 2) {
                clave = clave/10;
                clave+=1;
                 if(clave>n.length){
                    while(clave>n.length){
                        clave=clave-n.length;
                    }
                }
                return clave;
            }
            if (digitos == 3 || digitos == 4) {
                String a = String.valueOf(clave);
                String x = String.valueOf(a.charAt(0));
                String y = String.valueOf(a.charAt(2));

                String union = x + y;
                convert = (Integer.parseInt(union)) + 1;
                if(convert>n.length){
                    while(convert>n.length){
                        convert=convert-n.length;
                    }
                }
                return convert;

            }
            if (digitos == 5 || digitos == 6) {
                String a = String.valueOf(clave);
                String x = String.valueOf(a.charAt(0));
                String y = String.valueOf(a.charAt(2));
                String z = String.valueOf(a.charAt(4));
                String union = x + y + z;
                convert = (Integer.parseInt(union)) + 1;
                if(convert>n.length){
                    while(convert>n.length){
                        convert=convert-n.length;
                    }
                }
                return convert;

            }

        }
        if (tama >= 10000 && tama < 100000) {
            if (digitos == 1) {
                clave+=1;
                if(clave>n.length){
                    while(clave>n.length){
                        clave=clave-n.length;
                    }
                }
                return clave;
            }
            if (digitos == 2) {
                clave = clave/10;
                clave+=1;
               if(clave>n.length){
                   while(clave>n.length){
                       clave=clave-n.length;
                   }
               }
            }
            if (digitos == 3 || digitos == 4) {
                String a = String.valueOf(clave);
                String x = String.valueOf(a.charAt(0));
                String y = String.valueOf(a.charAt(2));

                String union = x + y;
                convert = (Integer.parseInt(union)) + 1;
                if(convert>n.length){
                    while(convert>n.length){
                        convert=convert-n.length;
                    }
                }
                return convert;
                

            }
            if (digitos == 5 || digitos == 6) {
                String a = String.valueOf(clave);
                String x = String.valueOf(a.charAt(0));
                String y = String.valueOf(a.charAt(2));
                String z = String.valueOf(a.charAt(4));
                String union = x + y + z;
                convert = (Integer.parseInt(union)) + 1;
                if(convert>n.length){
                    while(convert>n.length){
                        convert=convert-n.length;
                    }
                }
                return convert;

            }
            if (digitos == 7 || digitos == 8) {
                String a = String.valueOf(clave);
                String x = String.valueOf(a.charAt(0));
                String y = String.valueOf(a.charAt(2));
                String z = String.valueOf(a.charAt(4));
                String union = x + y + z;
                convert = (Integer.parseInt(union)) + 1;
                if(convert>n.length){
                    while(convert>n.length){
                        convert=convert-n.length;
                    }
                }
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
               if(convert>n.length){
                    while(convert>n.length){
                        convert=convert-n.length;
                    }
                }
                return convert;
            }
        }
        if (tama < 100&&tama>10) {
            if (digitos == 1) {
                clave+=1;
                if(clave>n.length){
                    while(clave>n.length){
                        clave=clave-n.length;
                    }
                }
                return clave;
            }
            if (digitos == 2) {
                clave = clave/10;
                clave+=1;
               if(clave>n.length){
                   while(clave>n.length){
                       clave=clave-n.length;
                   }
               }
               return clave;
            }
             if (digitos == 3) {
                 String a = String.valueOf(clave);
            String x = String.valueOf(a.charAt(0));
            String y = String.valueOf(a.charAt(2));
            String union = x + y;
                convert = (Integer.parseInt(union)) + 1;
               if(clave>n.length){
                   while(clave>n.length){
                       convert=convert-n.length;
                   }
               }
               return convert;
            }
        }
        if(tama>0&&tama<11){
            String a = String.valueOf(clave);
            String x = String.valueOf(a.charAt(0));
             convert = (Integer.parseInt(x)) + 1;
            if(convert>n.length){
                    while(convert>n.length){
                        convert=convert-n.length;
                    }
                }
                return convert;
        }
        

        return 0;
    }

    public int[] getDatos() {
        return datos;
    }

    public int[] getIds() {
        return ids;
    }
}
