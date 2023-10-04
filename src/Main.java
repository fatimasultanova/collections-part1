import lists.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");
        myArrayList.add("d");
        myArrayList.add("e");
        System.out.println(myArrayList);
        System.out.println("------------------------");
        System.out.println(myArrayList.get(2));
        myArrayList.remove(4);
        System.out.println(myArrayList);
        System.out.println("------------------------");
        myArrayList.add(4,"cc");
        System.out.println(myArrayList);


    }
}