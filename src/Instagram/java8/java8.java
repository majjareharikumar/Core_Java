package Instagram.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Employee(int id,String name,Double sal,int age,int ex){}
public class java8 {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(100,"Hari",90000.00,26,5));
        employeeList.add(new Employee(101,"Kumar",60000.00,23,3));
        employeeList.add(new Employee(102,"Mani",100000.00,27,7));
        employeeList.add(new Employee(103,"Rani",90000.00,27,5));
        employeeList.add(new Employee(104,"Nani",60000.00,26,4));
        employeeList.add(new Employee(105,"Vasu",100000.00,29,7));

        List<Employee> sortedemps=employeeList.stream()
                .sorted(
                        Comparator.comparingDouble(Employee::sal)
                                .thenComparingInt(Employee::ex)
                                .thenComparingInt(Employee::age)
                )
                .toList();

        sortedemps.forEach(System.out::println);
    }
}
