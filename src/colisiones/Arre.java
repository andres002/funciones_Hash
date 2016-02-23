package colisiones;

public class Arre {
    Integer aux[][];
    int[][] D;
    int tamano, complejidad;
    String posicion;

    public void soluColisions(int position, int dato) {
        boolean bandera = false;
        int x = 1;
        if (aux[position][x] == null) {
            aux[position][x] = dato;

        } else {
            while (bandera == false) {
                x++;
                if (aux[position][x] == null) {
                    aux[position][x] = dato;
                    bandera = true;
                }
            }
        }
        System.out.println("lo que se guarda en auxiliar baia baia " + aux[position][x] );
        System.out.println("El dato quedo guardado en la posicion: " + position + ", " + x);
    }
    
    public String getPosicion(){
        return this.posicion;
    }
    
    public int getComplejidad(){
        return this.complejidad;
    }

    /*public int[][] getArray() {
        for (int x = 1; x <= tamano; x++) {
            for (int y = 1; y <= tamano; y++) {

                D[x][y] =aux[x][y].intValue();
            }

        }
        return D;
    }*/

    public boolean searchDato(int id, int dato) {

        for (int x = 1; x <= aux[0].length; x++) {
            System.out.println("lalala " + aux[0].length);
            //System.out.println("este es lo que tiene el arreglo----- " + D[id][x]);
            this.complejidad = x;
            System.out.println("el id buscado es   " + id);
            System.out.println("el dato es        " + dato);
            System.out.println("lo que hay en auxiliar baia baia " + aux[id][x] );
            
            if(aux[id][x] == null){
                return false;
            }
            
            if (aux[id][x].intValue() == dato) {
                this.posicion = "[" + id + "]" + "[" + x + "]";
                return true;
            } else if (aux[id][x + 1] == null) {
                return false;
            }
        }
        return false;
    }

    public void cleanArray(int tamano) {
        aux = new Integer[tamano + 1][tamano + 1];
        //D = new int[tamano + 1][tamano + 1];
        System.out.println("tamaño..." + tamano);
        for (int x = 1; x <= tamano; x++) {
            for (int y = 1; y <= tamano; y++) {
                aux[x][y] = null;
            }

        }
        
        /*D = new int[tamano + 1][tamano + 1];
        System.out.println("tamaño..." + tamano);
        for (int x = 1; x <= tamano; x++) {
            for (int y = 1; y <= tamano; y++) {

                D[x][y] = '\0';
            }

        }*/
    }

    public static void main(String[] args) {
        Arre a = new Arre();
        a.tamano = 10;
        a.D = new int[a.tamano + 1][a.tamano + 1];
        a.cleanArray(a.tamano);
        a.soluColisions(1, 1);
        a.soluColisions(2, 2);
        a.soluColisions(3, 3);
        a.soluColisions(4, 4);
        a.soluColisions(1, 12);
        a.soluColisions(1, 13);
        a.soluColisions(2, 22);
        a.soluColisions(2, 23);
        a.soluColisions(3, 33);

    }
}
