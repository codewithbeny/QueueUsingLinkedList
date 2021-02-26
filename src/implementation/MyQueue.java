package implementation;
import myinterface.QueueADT;


public class MyQueue<E> implements QueueADT<E> {
    private Node<E> front;//head
    private Node<E> rear;//tail
    private int size;
    @Override
    public void enqueue(E data) {
        Node<E> node = new Node<>(data);
        if(!isEmpty()){
            rear.setNext(node);
            rear = node;
        }
        else{
            front = node;
            rear = node;
        }
        size++;
    }
    @Override
    public E dequeue() {
        E response = null;
        if(!isEmpty()){
            response = front.getData();
            front = front.getNext();
            if(front == null){
                rear = null;
            }
            size--;
        }
        return response;
    }

    @Override
    public E peek() {
        E response = null;
        if(!isEmpty()){
            response = front.getData();
        }
        return response;
    }

    @Override
    public boolean isEmpty() {
        return front == null;//size == 0;
    }

    @Override
    public int size() {
        return size;
    }
    public void traverse(){
        System.out.println("printing queue");
        System.out.print("front <--");
        Node<E> temp = front;
        while (temp != null){
            System.out.print(temp.getData() + "<--");
            temp = temp.getNext();
        }
        System.out.println("rear");

    }
}

