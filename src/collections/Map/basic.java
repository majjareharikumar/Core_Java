package collections.Map;

import java.util.*;

//put(K key, V value)	         Adds or updates a key-value pair
//get(Object key)	             Returns the value for the given key
//remove(Object key)           Removes the mapping for a key
//containsKey(Object key)	     Checks if a key exists
//containsValue(Object value)	 Checks if a value exists
//isEmpty()	                 Checks if map is empty
//size()	                     Returns number of entries
//clear()	                     Removes all mappings
//keySet()	                 Returns a Set of keys
//values()	                 Returns a Collection of values
//entrySet()	                 Returns a Set of key-value pairs
public class basic {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        m.put(1,"Hari");
        m.put(2,"Kumar");
        m.put(3,"Mani");
        m.put(4,"Rani");
        m.put(4,"Siri");

        System.out.println("Original map:- "+m);

        //Get the value for specific key
        System.out.println("Value for Key 2 is :- "+m.get(2));

        //remove the value by key
        System.out.println("removing the value by key 2");

        //Checks if a key exists
        System.out.println("Is Set contains key 2? :-"+m.containsKey(2));

        //Checks if a value exists
        System.out.println("Is set contains value Hari?:- "+m.containsValue("Hari"));

        //Checks if map is empty
        System.out.println("Is set empty? :- "+m.isEmpty());

        //Returns number of entries
        System.out.println("Size of set:- "+m.size());

        //Returns a Set of keys
        Set<Integer> s=m.keySet();
        System.out.println("Keys in map:- "+s);

        //Returns a Collection of values
        Collection<String> v=m.values();
        System.out.println("Values in map :- "+v);

        //Returns a Set of key-value pairs
        Set<Map.Entry<Integer,String>> entries=m.entrySet();
        System.out.println("Entries");
        for(Map.Entry<Integer,String> entry: entries){
            System.out.println("Key:- "+entry.getKey()+" , "+"Value:- "+entry.getValue());
        }

        //Removes all mappings
        System.out.println("Is map empty before clearing values:- "+m.isEmpty());
        m.clear();
        System.out.println("Is map empty after clearing values:- "+m.isEmpty());

    }
}
