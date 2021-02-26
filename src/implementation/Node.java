package implementation;

public class Node<E>{
    Node<E> next;
    E data;

    public Node( E data) {
        this.data = data;
        this.next = null;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
