/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class DobleDireccionHash {

    /**
     * @param args the command line arguments
     */
     static int[] v;
     
     public void setArray(int[] n) {
        this.v = n;
    }
     
    public void DobleDirecHash(int k){
        int d=(k % v.length)+1;
        System.out.println(d);
        if(v[d]==k){
            System.out.println("Esta en la posicion:"+d);
        }else{
           int dx=(d%v.length)+1;
            while ((dx<=v.length)&&(v[dx]!=k)&&(v.length!=0)&&(dx!=d)){
                dx=(dx%v.length)+1;
            }
            if (v[dx]==k){
                System.out.println("Esta en la posicion:"+dx);
            }else{
                System.out.println("El elemento no esta en el arreglo");
            }

        }
        
     
    }
}
    /*
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Ingresa el dato a encontrar");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int v[]={1030,2304,3053,4324,5340,6120,7049,8324,9234,1233,3345,6576};
        int d=(k % v.length)+1;
        System.out.println(d);
        if(v[d]==k){
            System.out.println("Esta en la posicion:"+v[d]);
        }else{
           int dx=(v[d]%v.length)+1;
            while ((dx<=v.length)&&(v[dx]!=k)&&(v.length!=0)&&(dx!=d)){
                dx=(v[dx]%v.length)+1;
            }
            if (v[dx]==k){
                System.out.println("Esta en la posicion:"+dx);
            }else{
                System.out.println("El elemento no esta en el arreglo");
            }

        }
    }
    
}
*/