package Interview.collection.map;

import java.util.*;

public class mapEx {
    public static void main(String[] args) {
        //No order guaranteed,Allows one null key and multiple null values
        Map<String,String> hashMap=new HashMap<>();
        hashMap.put("null","Hari");
        hashMap.put("key1","null");
        hashMap.put("key2","null");
        hashMap.put("key3","Kumar");

        System.out.println("Hashmap:-"+hashMap);

        //2)LinkedHashMap → Maintains insertion order along with hashing.
        // Same as HashMap (one null key, multiple null values).
        Map<String,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("null","Hari");
        linkedHashMap.put("key1","null");
        linkedHashMap.put("key2","null");
        linkedHashMap.put("key3","Kumar");

        System.out.println("LinkedHashmap:-"+linkedHashMap);

        // TreeMap does not allow null keys, but allows null values
        Map<String, String> treeMap = new TreeMap<>();
        try {
            treeMap.put(null, "Value1"); // Throws NullPointerException
        } catch (Exception e) {
            System.out.println("TreeMap null key error: " + e);
        }
        treeMap.put("Key1", null);
        treeMap.put("Key2", null);
        System.out.println("TreeMap: " + treeMap);

        // Hashtable does not allow null key or null values
        Map<String, String> hashTable = new Hashtable<>();
        try {
            hashTable.put(null, "Value1"); // Throws NullPointerException
        } catch (Exception e) {
            System.out.println("Hashtable null key error: " + e);
        }
        try {
            hashTable.put("Key1", null); // Throws NullPointerException
        } catch (Exception e) {
            System.out.println("Hashtable null value error: " + e);
        }
    }
}
