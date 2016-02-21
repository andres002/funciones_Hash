package colisiones;

public class Node {

    //Referencia al siguiente elemento o a NULL si es el ultimo
    Node next;
    Object data;
    ListaSimple hijos;

    // Node constructor
    public Node(Object dataValue) {
        next = null;
        data = dataValue;

    }

    // Constructor que incluye el siguiente nodo
    public Node(Object dataValue, Node nextValue) {
        next = nextValue;
        data = dataValue;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object dataValue) {
        data = dataValue;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextValue) {
        next = nextValue;
    }

    public ListaSimple getHijos() {
        return hijos;
    }

    public void setHijos(ListaSimple h) {
        hijos = h;
    }

}
