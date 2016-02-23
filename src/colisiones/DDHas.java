/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colisiones;
import static hash_functions.FXMLDocumentController.opcHash;
import functions.Division;
import functions.Cuadrado;
import functions.Plegamiento;
import functions.Truncamiento;

/**
 *
 * @author Jesus
 */
public class DDHas {
 
    /**
     * @param args the command line arguments
     */
     int posicion = -1;
     int cont = 0;
   public boolean doubleHashB(int d,int v[], int dato) {
          Division div = new Division();
    Cuadrado cu = new Cuadrado();
    Plegamiento ple = new Plegamiento();
    Truncamiento tru = new Truncamiento();
       posicion = -1; 
       cont = 0;
        int dx = d;
         int N = v.length - 1;
      // int d = (k%v.length);
        if (v[d] == dato){
            cont++;
            posicion = d;
            System.out.println("La clave:"+v[d]+"  Se encuentre en parte:"+d);
            return true;
        }else{
            System.out.println("Se genera otra clave");
           
            if(opcHash == 1){
                 dx = div.hash(d,new int[v.length-1]);
            }
            if(opcHash == 2){
                 cu.setArray(new int[v.length-1]);
                cu.calcula(d);
                 dx = cu.getClave();
            }
            if(opcHash == 3){
               dx = ple.plegamiento(d);
              
            }
            if(opcHash == 4){
                  tru.setArray(new int[v.length-1]);
                dx = tru.Truncar(d);
                
            }
            System.out.println("dxdd"+dx);
            System.out.println(v[dx]);
            while(dx<=N && v[dx]!=dato && dx!=d){
                cont++;
                if(opcHash == 1){
                         dx = div.hash(dx,new int[v.length-1]);
                    }
                    if(opcHash == 2){
                        
                        cu.calcula(dx);
                        dx = cu.getClave();
                    }
                    if(opcHash == 3){
                       dx = ple.plegamiento(dx);

                    }
                    if(opcHash == 4){
                       
                        dx = tru.Truncar(dx);

                    }
                   
            }
            cont++;
             System.out.println("dato buscar: " +dato +"id: "+dx);
            if (v[dx]==dato){
                posicion = dx;
                System.out.println("La clave:"+v[dx]+"  se encuentra en parte : "+ dx);
                return true;
            }else {
                System.out.println("no se encuentra");
                return false;
            }
        }
   
    }
   public int getPosicion(){
       return posicion;
   }
   public int getComplejidad(){
       return cont;
   }
      public int doubleHash(int d,int v[], int dato) {
             Division div = new Division();
    Cuadrado cu = new Cuadrado();
    Plegamiento ple = new Plegamiento();
    Truncamiento tru = new Truncamiento();
        
        int dx = d;
  int N = v.length - 1;
  
            
            if(opcHash == 1){
                 dx = div.hash(d,new int[v.length-1]);
            }
            if(opcHash == 2){
                cu.setArray(new int[v.length-1]);
                cu.calcula(d);
                
                 dx = cu.getClave();
            }
            if(opcHash == 3){
                
               dx = ple.plegamiento(d);
              
            }
            if(opcHash == 4){
                tru.setArray(new int[v.length-1]);
                dx = tru.Truncar(d);
                
            }
           
            while(dx<=N && v[dx]!=dato && v[dx] != '\0'&& dx!=d){
                if(opcHash == 1){
                         dx = div.hash(dx,new int[v.length-1]);
                    }
                    if(opcHash == 2){
                      
                        cu.calcula(dx);
                        dx = cu.getClave();
                    }
                    if(opcHash == 3){
                       dx = ple.plegamiento(dx);

                    }
                    if(opcHash == 4){
                        dx = tru.Truncar(dx);

                    }
                   
                    System.out.println("dxdd"+dx);
            }
            v[dx] =dato;
            System.out.println("dato: " +dato +"id: "+dx);
           return dx;
        
       
    }
    
}
