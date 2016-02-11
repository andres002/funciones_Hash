package colisiones;

public class Encadena{
	ListaSimple ls;
	int tamano;
	
	public void soluColisions(int position, int dato){
		ListaSimple ls2 = (ListaSimple)ls.get(position).getData();
		ls2.add(dato);
		System.out.println("El dato quedo guardado en la posicion: " + position +", " + ls2.size());
	}

	public void cleanList(int tamano){
		ls = new ListaSimple();
		for (int x = 1; x <= tamano; x++) {
			ls.add(new ListaSimple());
		}
	}


		


/*	public static void main(String[] args) {
		Encadena a = new Encadena();
		a.tamano =10;
		a.cleanList(a.tamano);
		a.soluColisions(1,1);
		a.soluColisions(2,2);
		a.soluColisions(3,3);
		a.soluColisions(4,4);
		a.soluColisions(1,12);
		a.soluColisions(1,13);
		a.soluColisions(2,22);
		a.soluColisions(2,23);
		a.soluColisions(3,32);


		ListaSimple ls2 = (ListaSimple)a.ls.get(1).getData();
		System.out.println(ls2.get(1).getData());
		System.out.println(ls2.get(2).getData());
		System.out.println(ls2.get(3).getData());
		System.out.println("----------------------------------------------------");
		ListaSimple ls3 = (ListaSimple)a.ls.get(2).getData();
		System.out.println(ls3.get(1).getData());
		System.out.println(ls3.get(2).getData());
		System.out.println(ls3.get(3).getData());
		System.out.println("----------------------------------------------------");

		ListaSimple ls4 = (ListaSimple)a.ls.get(3).getData();
		System.out.println(ls4.get(1).getData());
		System.out.println(ls4.get(2).getData());
		System.out.println("----------------------------------------------------");
		
		ListaSimple ls5 = (ListaSimple)a.ls.get(4).getData();
		System.out.println(ls5.get(1).getData());
		



	}*/
}