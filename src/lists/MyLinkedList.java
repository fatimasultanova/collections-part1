package lists;

import java.util.LinkedList;

public class MyLinkedList<E> {
    private Node<E> head;
    private int size;

    private void setHead(Node<E> head) {
        this.head = head;
    }

    static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element) {
            this.element = element;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }


    }

    public MyLinkedList() {


    }

    public void add(E element) {
        Node<E> node = new Node<>(element);

        if (head == null) {
            this.head = node;
        } else {
            Node<E> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.setNext(node);
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Node<E> currentNode = this.head;
        while (currentNode != null) {
            stringBuilder.append(currentNode.element);
            if ((currentNode = currentNode.next) != null) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();

    }

    private void checkIndex(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void addFirst(E element) {
        Node<E> node = new Node<>(element);
       setHead(node);
    }

//    public E get(int index){
//        checkIndex(index);
//        }

    public E peek() {
        return head.element;
    }

    public E poll(){
        E element = head.element;
        head.element = null;
        size--;
        return element;
    }

}
