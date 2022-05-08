import java.util.Arrays;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {

        LinkedList<String> inList1 = new LinkedList<>();

        inList1.add("Kowalski");
        inList1.add("Skipper");
        inList1.add("Rico");
        inList1.add("Private");

        LinkedList<String> inList2 = new LinkedList<>();

        inList2.add("Sub-Zero");
        inList2.add("Scorpion");
        inList2.add("Kano");
        inList2.add("Jax");
        inList2.add("Sector");

        LinkedList<String> inList3 = new LinkedList<>();

        inList3.add("Chip");
        inList3.add("Dale");
        inList3.add("Gadget");


       DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(inList1);
        doubleLinkedList.add(inList2);
        doubleLinkedList.add(inList3);




       for (Object o : doubleLinkedList) {
            System.out.println(o.toString());
        }




    }

}








 /*DoubleLinkedList doubleLinkedList1 = new DoubleLinkedList();
        doubleLinkedList1.add(inList1);
        doubleLinkedList1.add(inList2);

        DoubleLinkedList doubleLinkedList2 = new DoubleLinkedList();
        doubleLinkedList2.add(inList2);
        doubleLinkedList2.add(inList3);*/

  /* boolean a = doubleLinkedList.contains(inList1);
        System.out.println(a);

      Object [] arrayLl = doubleLinkedList1.toArray();
        for (Object linkedList: arrayLl) {
String s = String.valueOf(arrayLl.getClass());
            System.out.println(linkedList);
            System.out.println(s);
        }

      LinkedList<String>[] myArray= doubleLinkedList.toArray(new LinkedList[0]);
        String s1 = String.valueOf(arrayLl.getClass());

                for(LinkedList<String> aL:myArray){
                    System.out.println(aL);
        System.out.println(s1);}


       System.out.println(doubleLinkedList.size());
       doubleLinkedList.clear();
       Integer k = doubleLinkedList.size();
       System.out.println(k);*/
