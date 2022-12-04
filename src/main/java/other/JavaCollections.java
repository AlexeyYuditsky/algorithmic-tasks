package other;

import kotlin.Pair;

import java.util.*;

public class JavaCollections {
    public static void main(String[] args) {
        String[] array = new String[3];
        array[0] = "apple";
        array[1] = "cherry";
        array[2] = "banana";
        for (String i : array) System.out.print(i+", ");
        System.out.println();

        /*-----------------------------------------*/

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("cherry");
        arrayList.add("banana");
        System.out.println(arrayList);

        Vector<String> vector = new Vector<>();
        vector.add("apple");
        vector.add("cherry");
        vector.add("banana");
        System.out.println(vector);

        Stack<String> stack = new Stack<>();
        stack.add("apple");
        stack.add("cherry");
        stack.add("banana");
        System.out.println(stack);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("cherry");
        linkedList.add("banana");
        System.out.println(linkedList);

        /*-----------------------------------------*/

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("cherry");
        hashSet.add("banana");
        System.out.println(hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("apple");
        linkedHashSet.add("cherry");
        linkedHashSet.add("banana");
        System.out.println(linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("cherry");
        treeSet.add("banana");
        System.out.println(treeSet);

        /*-----------------------------------------*/

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("key1", "apple");
        hashMap.put("key2", "cherry");
        hashMap.put("key3", "banana");
        System.out.println(hashMap);

        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "apple");
        hashtable.put("key2", "cherry");
        hashtable.put("key3", "banana");
        System.out.println(hashtable);

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("key1", "apple");
        linkedHashMap.put("key2", "cherry");
        linkedHashMap.put("key3", "banana");
        System.out.println(linkedHashMap);

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("key1", "apple");
        treeMap.put("key2", "cherry");
        treeMap.put("key3", "banana");
        System.out.println(treeMap);

        WeakHashMap<String, String> weakHashMap = new WeakHashMap<>();
        String key = "key1";
        String value = "apple";
        treeMap.put(key, value);
        treeMap.put("key2", "cherry");
        treeMap.put("key3", "banana");
        System.out.println(weakHashMap);

        /*-----------------------------------------*/

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("apple");
        priorityQueue.add("cherry");
        priorityQueue.add("banana");
        System.out.println(priorityQueue);

    }
}