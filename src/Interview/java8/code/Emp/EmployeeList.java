package Interview.java8.code.Emp;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeList {

    public static void prt(){
        System.out.println("===============================");
    }
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "Hari", 24, "male", 70000, "developer", 2016));
        employeeList.add(new Employee(2, "Kumar", 23, "male", 50000, "qa", 2019));
        employeeList.add(new Employee(3, "Mani", 27, "female", 90000, "manager", 2010));
        employeeList.add(new Employee(4, "Rani", 25, "female", 60000, "hr", 2008));
        employeeList.add(new Employee(5, "Siva", 26, "male", 70000, "developer", 2017));
        employeeList.add(new Employee(6, "Vani", 30, "female", 100000, "manager", 2005));
        employeeList.add(new Employee(7, "Ram", 24, "male", 40000, "qa", 2020));
        employeeList.add(new Employee(8, "Anil", 29, "male", 65000, "developer", 2013));
        employeeList.add(new Employee(9, "Sudha", 26, "female", 40000, "hr", 2019));
        employeeList.add(new Employee(10, "Anusha", 24, "female", 70000, "developer", 2018));

        Map<String,Double>sal=employeeList.stream().filter(e->e.age>25)
                .collect(Collectors.groupingBy(Employee::deptName,Collectors.summingDouble(Employee::salary)));
        System.out.println(sal);

        Map<String, DoubleSummaryStatistics>deptSalary=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::deptName,Collectors.summarizingDouble(Employee::salary)));
        deptSalary.forEach((e,k)->{
            System.out.println(e+"-->"+k.getSum());
        });

    }
}
