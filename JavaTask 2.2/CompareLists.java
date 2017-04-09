import java.util.ArrayList;
import java.util.LinkedList;

public class CompareLists {

// ArrayList vs LinkedList

// 1.1 ArrayList: adding elements and checking time for this operation
    public static void addElementsArrayList() {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime = System.nanoTime();

        for (int i = 1; i < 100001; i++) {
            arrayList.add(i);
        }

        long time = System.nanoTime() - startTime;
        System.out.println("Time for adding 100K elements to ArrayList = " + time + " ns.");
    }

// 1.2 LinkedList: adding elements and checking time for this operation
public static void addElementsLinkedList() {

    LinkedList<Integer> linkedList = new LinkedList<Integer>();

    long startTime = System.nanoTime();

    for (int i = 1; i < 100001; i++) {
        linkedList.add(i);
    }

    long time = System.nanoTime() - startTime;
    System.out.println("Time for adding 100K elements to LinkedList = " + time + " ns.");
}

// 2.1 ArrayList: searching for the item and checking time for this operation
    public static void searchElementArrayList() {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 1; i < 100001; i++) {
            arrayList.add(i);
        }

        long startTime = System.nanoTime();

        arrayList.get(50000);

        long time = System.nanoTime() - startTime;
        System.out.println("Time for searching for the middle item among 100K elements in ArrayList = " + time + " ns.");
    }

// 2.2 LinkedList: searching for the item and checking time for this operation
    public static void searchElementLinkedList() {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        for (int i = 1; i < 100001; i++) {
            linkedList.add(i);
        }

        long startTime = System.nanoTime();

        linkedList.get(50000);

        long time = System.nanoTime() - startTime;
        System.out.println("Time for searching for the middle item among 100K elements in LinkedList = " + time + " ns.");
    }

    // 3.1 ArrayList: deleting the item and checking time for this operation
    public static void deleteElementArrayList() {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 1; i < 100001; i++) {
            arrayList.add(i);
        }

        long startTime = System.nanoTime();

        for (int i = 99999; i >= 0; i--) {
            arrayList.remove(i);
        }

        long time = System.nanoTime() - startTime;
        System.out.println("Time for deleting 100K elements from ArrayList = " + time + " ns.");
    }

    // 3.2 LinkedList: deleting the item and checking time for this operation
    public static void deleteElementLinkedList() {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        for (int i = 1; i < 100001; i++) {
            linkedList.add(i);
        }

        long startTime = System.nanoTime();

        for (int i = 99999; i >= 0; i--) {
            linkedList.remove(i);
        }

        long time = System.nanoTime() - startTime;

        System.out.println("Time for deleting 100K elements from LinkedList = " + time + " ns.");
    }
}
