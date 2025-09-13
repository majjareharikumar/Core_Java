package Interview.java8.code;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    public static void main(String[] args) {
        List<emputil> EmployeeList=new ArrayList<>();

        EmployeeList.add(new emputil(1,"Hari",25,"male","developer",2021, 50000));
        EmployeeList.add(new emputil(2,"Kumar",25,"male","qa",2022, 40000));
        EmployeeList.add(new emputil(3,"Mani",24,"female","manager",2000, 150000));
        EmployeeList.add(new emputil(4,"Rani",23,"female","developer",2023, 50000));
        EmployeeList.add(new emputil(5,"Nani",28,"male","hr",2004, 40000));
        EmployeeList.add(new emputil(6,"Ram",30,"male","qa",2009, 70000));
        EmployeeList.add(new emputil(7,"Vinay",22,"male","developer",2019, 60000));
        EmployeeList.add(new emputil(8,"Vani",27,"female","hr",2005, 70000));
        EmployeeList.add(new emputil(9,"Ramana",23,"male","developer",2016, 90000));
        EmployeeList.add(new emputil(10,"Nanda",25,"male","qa",2021, 50000));


        //How many male and female employees are there in the organization?
        Map<String,Long> noOfMaleAndFemale= EmployeeList.stream().collect(Collectors.groupingBy(emputil ::getGender,Collectors.counting()));
        System.out.println(noOfMaleAndFemale);

        //Print the name of all departments in the organization?
        EmployeeList.stream().map(emputil :: getDeptName).distinct().forEach(System.out::println);

        Map<String,Double> avgage=EmployeeList.stream().collect(Collectors.groupingBy(emputil ::getGender,Collectors.averagingInt(emputil::getAge)));
        System.out.println(avgage);

        //Get the details of highest paid employee in the organization?
        Optional<emputil> h= EmployeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(emputil ::getSalary)));
        System.out.println(h.get().getId());
        System.out.println(h.get().getName());

        //Get the names of all employees who have joined after 2015?
        
    }
}
