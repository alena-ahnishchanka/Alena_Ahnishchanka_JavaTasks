import java.util.HashMap;
import java.util.TreeMap;

public class CompareMaps {

// HashMap vs TreeMap

    // 1.1 HashMap: adding elements and checking time for this operation
    public static void addElementsHashMap() {

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        long startTime = System.nanoTime();

        for (int i = 1; i < 100001; i++) {
            hashMap.put(i, i);
        }

        long time = System.nanoTime() - startTime;
        System.out.println("Time for adding 100K elements to HashMap = " + time + " ns.");
    }

    // 1.2 TreeMap: adding elements and checking time for this operation
    public static void addElementsTreeMap() {

        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

        long startTime = System.nanoTime();

        for (int i = 1; i < 100001; i++) {
            treeMap.put(i, i);
        }

        long time = System.nanoTime() - startTime;
        System.out.println("Time for adding 100K elements to TreeMap = " + time + " ns.");
    }

    // 2.1 HashMap: searching for the item and checking time for this operation
    public static void searchElementHashMap() {

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i = 1; i < 100001; i++) {
            hashMap.put(i, i);
        }

        long startTime = System.nanoTime();

        hashMap.containsValue(50000);

        long time = System.nanoTime() - startTime;
        System.out.println("Time for searching for the item among 100K elements in HashMap = " + time + " ns.");
    }

    // 2.2 TreeMap: searching for the item and checking time for this operation
    public static void searchElementTreeMap() {

        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

        for (int i = 1; i < 100001; i++) {
            treeMap.put(i, i);
        }

        long startTime = System.nanoTime();

        treeMap.containsValue(50000);

        long time = System.nanoTime() - startTime;
        System.out.println("Time for searching for the item among 100K elements in TreeMap = " + time + " ns.");
    }

    // 3.1 HashMap: deleting the item and checking time for this operation
    public static void deleteElementHashMap() {

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i = 1; i < 100001; i++) {
            hashMap.put(i, i);
        }

        long startTime = System.nanoTime();

        for (int i = 100000; i >= 0; i--) {
            hashMap.remove(i);
        }

        long time = System.nanoTime() - startTime;
        System.out.println("Time for deleting 100K elements from HashMap = " + time + " ns.");
    }


    // 3.2 TreeMap: deleting the item and checking time for this operation
    public static void deleteElementTreeMap() {

        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

        for (int i = 1; i < 100001; i++) {
            treeMap.put(i, i);
        }

        long startTime = System.nanoTime();

        for (int i = 100000; i >= 0; i--) {
            treeMap.remove(i);
        }

        long time = System.nanoTime() - startTime;
        System.out.println("Time for deleting 100K elements from TreeMap = " + time + " ns.");
    }
}
