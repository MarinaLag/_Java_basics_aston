package by.aston.java._home_work.myArrayList;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
        myArrayList.add(9);
        myArrayList.add(10);
        myArrayList.print();

        myArrayList.add(11);
        myArrayList.print();

        myArrayList.add(1, 22);
        myArrayList.print();

        //  System.out.println(myArrayList.get(-1));
        //  System.out.println(myArrayList.get(25));
        System.out.println(myArrayList.get(1));

        // myArrayList.set(25,99);
        myArrayList.set(1, 222);
        myArrayList.print();

        myArrayList.remove(1);
        // myArrayList.remove(-1);
        myArrayList.print();

        myArrayList.remove((Integer) 8);
        myArrayList.remove((Integer) 55);
        myArrayList.print();

    }
}
