import java.util.HashSet;
import java.util.TreeSet;

public class CompareSets {

// HashSet vs TreeSet

    // 1.1 HashSet: adding elements and checking time for this operation
    public static void addElementsHashSet() {

        HashSet<Integer> hashSet = new HashSet<Integer>();

        long startTime = System.nanoTime();

        for (int i = 1; i < 100001; i++) {
            hashSet.add(i);
        }

        long time = System.nanoTime() - startTime;
        System.out.println("Time for adding 100K elements to HashSet = " + time + " ns.");
    }

    // 1.2 TreeSet: adding elements and checking time for this operation
    public static void addElementsTreeSet() {

        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        long startTime = System.nanoTime();

        for (int i = 1; i < 100001; i++) {
            treeSet.add(i);
        }

        long time = System.nanoTime() - startTime;
        System.out.println("Time for adding 100K elements to TreeSet = " + time + " ns.");
    }

    // 2.1 HashSet: searching for the item and checking time for this operation
    public static void searchElementHashSet() {

        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 1; i < 100001; i++) {
            hashSet.add(i);
        }

        long startTime = System.nanoTime();

        hashSet.contains(50000);

        long time = System.nanoTime() - startTime;
        System.out.println("Time for searching for the item among 100K elements in HashSet = " + time + " ns.");
    }

    // 2.2 TreeSet: searching for the item and checking time for this operation
    public static void searchElementTreeSet() {

        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        for (int i = 1; i < 100001; i++) {
            treeSet.add(i);
        }

        long startTime = System.nanoTime();

        treeSet.contains(50000);

        long time = System.nanoTime() - startTime;
        System.out.println("Time for searching for the item among 100K elements in TreeSet = " + time + " ns.");
    }

    // 3.1 HashSet: deleting the item and checking time for this operation
    public static void deleteElementHashSet() {

        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 1; i < 100001; i++) {
            hashSet.add(i);
        }

        long startTime = System.nanoTime();

        for (int i = 100000; i >= 0; i--) {
            hashSet.remove(i);
        }

        long time = System.nanoTime() - startTime;
        System.out.println("Time for deleting 100K elements from HashSet = " + time + " ns.");
    }


    // 3.2 TreeSet: deleting the item and checking time for this operation
    public static void deleteElementTreeSet() {

        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        for (int i = 1; i < 100001; i++) {
            treeSet.add(i);
        }

        long startTime = System.nanoTime();

        for (int i = 100000; i >= 0; i--) {
            treeSet.remove(i);
        }

        long time = System.nanoTime() - startTime;
        System.out.println("Time for deleting 100K elements from TreeSet = " + time + " ns.");
    }
}
