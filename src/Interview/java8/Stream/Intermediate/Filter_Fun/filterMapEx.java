package Interview.java8.Stream.Intermediate.Filter_Fun;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
//✅ Conclusion:
//keySet() → if you only care about keys.
//values() → if you only care about values.
//entrySet() → if you need both key and value together.

public class filterMapEx {
    public static void main(String[] args) {
        Map<Integer,String> student=new HashMap<>();

        student.put(1,"Hari");
        student.put(2,"Kumar");
        student.put(3,"Mani");
        student.put(4,"Nani");
        student.put(5,"Rani");

        System.out.println("student details:- "+student);

        //Filtering by Keys → use keySet()
      student.keySet().stream().filter(k->k%2==0).forEach(k-> System.out.println(k+"-->"+student.get(k)));

        //Filtering by values → use value()
        student.values().stream().filter(e->e.startsWith("H")).forEach(e-> System.out.println(e));

        //filtering by use entrySet()
        Map<Integer,String>stu=  student.entrySet()
                .stream()
                .filter(k->k.getKey()%2==0)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(stu);

    }
}
