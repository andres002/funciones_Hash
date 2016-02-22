/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colisiones;

/**
 *
 * @author Jesus
 */
public class DDHas {

    /**
     * @param args the command line arguments
     */
       
   public int doubleHash(int k,int v[], int dato) {
        int dx;
        int d = (k%v.length);
        if (k==v[d]){
            System.out.println("La clave:"+v[d]+"  Se encuentre en parte:"+d);
            return d;
        }else{
             dx = (d%v.length)+1;
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
       return dx;
    }
    
}
