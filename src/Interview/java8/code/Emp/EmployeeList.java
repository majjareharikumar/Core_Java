package Interview.java8.code.Emp;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeList {

    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();

        employeeList.add(new Employee(1,"Hari",24,"male",70000, "developer",2016));
        employeeList.add(new Employee(2,"Kumar",23,"male",50000, "qa",2019));
        employeeList.add(new Employee(3,"Mani",27,"female",90000, "manager",2010));
        employeeList.add(new Employee(4,"Rani",25,"female",60000, "hr",2008));
        employeeList.add(new Employee(5,"Siva",26,"male",70000, "developer",2017));
        employeeList.add(new Employee(6,"Vani",30,"female",100000, "manager",2005));
        employeeList.add(new Employee(7,"Ram",24,"male",40000, "qa",2020));
        employeeList.add(new Employee(8,"Anil",29,"male",65000, "developer",2013));
        employeeList.add(new Employee(9,"Sudha",26,"female",40000, "hr",2019));
        employeeList.add(new Employee(10,"Anusha",24,"female",70000, "developer",2018));

        //Get names of all employees in the "HR" department.
        List<String >hrNames=employeeList.stream()
                .filter(e->e.deptName().equalsIgnoreCase("hr"))
                .map(Employee :: name).collect(Collectors.toList());
        System.out.println(hrNames);

        //List all employees who earn more than 50,000.
      List<Employee> more50000=employeeList.stream().filter(e->e.salary()>50000).collect(Collectors.toList());
        //System.out.println(more50000);
        for(Employee e:more50000){
            System.out.println(e);
        }

        //Get employees whose names start with “R”.
        List<String> namewithR=employeeList.stream().filter(e->e.name().startsWith("R"))
                .map(Employee::name)
                .collect(Collectors.toList());
        System.out.println(namewithR);

        //Print all employees younger than 25
        String Youngerages=employeeList.stream().filter(e->e.age()<25)
                .map(Employee::name).collect(Collectors.joining(","));
        System.out.println(Youngerages);

        //Total salary of all employees
        //DoubleSummaryStatistics salry=employeeList.stream().collect(Collectors.summarizingDouble(Employee::salary));
        Double salary=employeeList.stream().mapToDouble(Employee::salary).sum();
        System.out.println(salary);

        //Average salary of all employees.
        Double avgsal=employeeList.stream().collect(Collectors.averagingDouble(Employee::salary));
        System.out.println(avgsal);

        //Total salary per department
//      Map<String,Double> deptSalary= employeeList.stream()
//              .collect(Collectors.groupingBy(Employee::deptName,Collectors.summingDouble(Employee::salary)));
//        deptSalary.forEach((e,k)->{
//            System.out.println(e +"-->"+ k);
//        });
        Map<String, DoubleSummaryStatistics>deptSalary=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::deptName,Collectors.summarizingDouble(Employee::salary)));
        deptSalary.forEach((e,k)->{
            System.out.println(e+"-->"+k.getSum());
        });
        //Average age of employees in each department.
        Map<String,Double>avgage=employeeList.stream().collect(Collectors.groupingBy(Employee::deptName,Collectors.averagingInt(Employee::age)));
        System.out.println(avgage);

        //Count of employees in each department.
       Map<String,Long>countDept= employeeList.stream()
                .collect(Collectors.groupingBy(Employee::deptName,Collectors.counting()));
        System.out.println(countDept);

        //Count of male and female employees overall.
        Map<String,Long> maleAndFemaleCount =employeeList.stream().collect(Collectors.groupingBy(Employee::gender,Collectors.counting()));
        System.out.println(maleAndFemaleCount);

        //Count of male and female employees in each department.
        Map<String,Map<String,Long>> deptMFCount=employeeList.stream().collect(Collectors.groupingBy(Employee::deptName,Collectors.groupingBy(Employee::gender,Collectors.counting())));
        System.out.println(deptMFCount);

        //Group employees by gender
        Map<String,List<String>> emp=employeeList.stream().collect(Collectors.groupingBy(Employee::gender,Collectors.mapping(Employee::name, Collectors.toList())));
        System.out.println(emp);
//        emp.forEach((k,v)->{
//            System.out.println(k+"-->"+v);
//        });

        //employees who are older than 25 and those 25 or younger.
        Map<Boolean, List<String> >isolder=employeeList.stream().collect(Collectors.partitioningBy(e->e.age>25,Collectors.mapping(Employee::name,Collectors.toList())));
        isolder.forEach((k,v)->{
            if(k){
                System.out.println("Older than 25:- "+v);
            }
            else {
                System.out.println("Younger than 25:- "+v);
            }
        });
        System.out.println(isolder);


        //employees earning more than 50k and those earning less.
        Map<Boolean,List<String>> more50k=employeeList.stream().collect(Collectors.partitioningBy(e->e.salary()>50000,Collectors.mapping(Employee::name,Collectors.toList())));
        more50k.forEach((k,v)->{
            if(k){
                System.out.println("MoreThan 50k Employees:-"+v);
            }
            else{
                System.out.println("Less than 50k Employees:- "+v);
            }
        });

        //Employee with the highest salary.
       Optional<Employee> highsal=employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::salary)));
        System.out.println(highsal);
        highsal.ifPresent(e->{System.out.println(e.name);});

        //Employee with the lowest salary.
        Optional<Employee> lowsal=employeeList.stream().min(Comparator.comparingDouble(Employee::salary));
        System.out.println(lowsal);
        lowsal.ifPresent(e->{
            System.out.println(e.name);
        });

        //Oldest employee in the organization.
        Optional<Employee> oldest=employeeList.stream().min(Comparator.comparingInt(Employee::doj));
        oldest.ifPresent(e-> System.out.println(e.name));

        //Youngest employee in the organization.
        Optional<Employee> youngest=employeeList.stream().max(Comparator.comparingInt(Employee::doj));
        youngest.ifPresent(e-> System.out.println(e.name));

        //Highest-paid employee per department.
        Map<String,Optional<Employee>> highpaybydept=employeeList.stream().collect(Collectors.groupingBy(Employee::deptName,Collectors.maxBy(Comparator.comparingDouble(Employee::salary))));
        highpaybydept.forEach((k,v)->{
            System.out.println(k+"-->"+v.get().name);
        });

        //Youngest employee per department.
        Map<String,Optional<Employee>> youngbydept=employeeList.stream().collect(Collectors.groupingBy(Employee::deptName,Collectors.minBy(Comparator.comparingInt(Employee::age))));
        youngbydept.forEach((k,v)->{
            System.out.println(k+"-->"+v.get().name);
        });





    }
}
