import lists.MyArrayList;
import lists.MyLinkedList;
public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList= new MyLinkedList<>();
        myLinkedList.add("a");
        myLinkedList.add("b");
        myLinkedList.add("c");
        myLinkedList.add("d");
        System.out.println(myLinkedList);
        myLinkedList.addFirst("aa");
        System.out.println(myLinkedList);
        myLinkedList.peek();
        System.out.println(myLinkedList);
        myLinkedList.poll();
        System.out.println(myLinkedList);

//        MyArrayList<String> myArrayList = new MyArrayList<>();
//        myArrayList.add("a");
//        myArrayList.add("b");
//        myArrayList.add("c");
//        myArrayList.add("d");
//        myArrayList.add("e");
//        System.out.println(myArrayList);
//        System.out.println("------------------------");
//        System.out.println(myArrayList.get(2));
//        myArrayList.remove(4);
//        System.out.println(myArrayList);
//        System.out.println("------------------------");
//        myArrayList.add(4,"cc");
//        System.out.println(myArrayList);

//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.poll()
    }
}