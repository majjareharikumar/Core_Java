package Java17.code.Records_Class;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

record Employee(int id,String Name){

}

public class Record_Class {
    public static void main(String[] args) {

        List<Employee> empList=new ArrayList<>();
        Employee emp=new Employee(101,"Hari");
        Employee emp1=new Employee(102,"Kumar");
        System.out.println(emp.id());
        System.out.println(emp.Name());
        System.out.println(emp);

        empList.add(new Employee(101,"Hari"));
        empList.add(new Employee(102,"Kumar"));
        System.out.println(empList);
    }
}
