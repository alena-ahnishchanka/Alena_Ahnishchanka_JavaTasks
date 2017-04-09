public class Main {

    public static void main(String[] args) {
//Check the speed (adding, searching for the item, delete)

// 1) Lists (ArrayList vs LinkedList)
        System.out.println("ArrayList vs LinkedList:");
        System.out.println();
// adding elements
        CompareLists.addElementsArrayList();
        CompareLists.addElementsLinkedList();
        System.out.println();
// searching for the item
        CompareLists.searchElementArrayList();
        CompareLists.searchElementLinkedList();
        System.out.println();
// deleting elements
        CompareLists.deleteElementArrayList();
        CompareLists.deleteElementLinkedList();
        System.out.println();
        System.out.println("Result of comparison:");
        System.out.println("speed of adding elements to ArrayList and LinkedList is close to each other");
        System.out.println("speed of searching the middle item in ArrayList is very fast, and in LinkedList it's much more slower");
        System.out.println("speed of deleting elements from ArrayList is about 2 times faster than deleting elements from LinkedList");
        System.out.println();

// 2) Sets (HashSet vs TreeSet)
        System.out.println("HashSet vs TreeSet:");
        System.out.println();
// adding elements
        CompareSets.addElementsHashSet();
        CompareSets.addElementsTreeSet();
        System.out.println();
// searching for the item
        CompareSets.searchElementHashSet();
        CompareSets.searchElementTreeSet();
        System.out.println();
// deleting elements
        CompareSets.deleteElementHashSet();
        CompareSets.deleteElementTreeSet();
        System.out.println();
        System.out.println("Result of comparison:");
        System.out.println("speed of adding elements to HashSet is about 2 times faster than adding elements to TreeSet");
        System.out.println("speed of searching the item in HashSet is slower than searching it in TreeSet");
        System.out.println("speed of deleting elements from HashSet is about 3-4 times faster than from TreeSet");
        System.out.println();

// 3) Maps (HashMap vs TreeMap)
        System.out.println("HashMap vs TreeMap:");
        System.out.println();
// adding elements
        CompareMaps.addElementsHashMap();
        CompareMaps.addElementsTreeMap();
        System.out.println();
// searching for the item
        CompareMaps.searchElementHashMap();
        CompareMaps.searchElementTreeMap();
        System.out.println();
// deleting elements
        CompareMaps.deleteElementHashMap();
        CompareMaps.deleteElementTreeMap();
        System.out.println();
        System.out.println("Result of comparison:");
        System.out.println("speed of adding elements to HashMap is about 2 times faster than adding elements to TreeMap");
        System.out.println("speed of searching the item in HashMap is slower than searching it in TreeMap");
        System.out.println("speed of deleting elements from HashMap is about 2 times faster than from TreeMap");
        System.out.println();
        }
    }
