package Interview.java8.code.Emp;

import java.util.*;
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
        employeeList.add(new Employee(9, "Sudha", 26, "female", 90000, "hr", 2019));
        employeeList.add(new Employee(10, "Anusha", 24, "female", 70000, "developer", 2018));

        //Top 2 highest salary emp details
//        List<Double> emps=employeeList.stream()
//                .map(Employee::salary)
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .limit(2)
//                .toList();
//
//        employeeList.stream()
//                .filter(e->emps.contains(e.salary))
//                .forEach(e-> System.out.println(e.name+"->"+e.deptName+"->"+e.salary));
//        System.out.println("========================================================");
//
//        //Top 2 highest salary emp details per dept
//        Map<String,List<Employee>> map=employeeList.stream()
//                .collect(Collectors.groupingBy(Employee::deptName));
//
//        map.forEach((dept,list)->{
//           List<Double> top2= list.stream()
//                    .map(Employee::salary)
//                    .distinct()
//                    .sorted(Comparator.reverseOrder())
//                    .limit(2)
//                   .toList();
//
//           list.stream()
//                   .filter(e->top2.contains(e.salary))
//                   .forEach(e-> System.out.println(e.name+"->"+e.deptName+"->"+e.salary));
//        });
        prt();
        employeeList.stream()
                .filter(e->e.salary()>60000 && e.deptName.equalsIgnoreCase("hr"))
                .forEach(e->System.out.println(e.name+"->"+e.salary+"->"+e.deptName));


//        Map<String,Double>sal=employeeList.stream().filter(e->e.age>25)
//                .collect(Collectors.groupingBy(Employee::deptName,Collectors.summingDouble(Employee::salary)));
//        System.out.println(sal);
//
//        Map<String, DoubleSummaryStatistics>deptSalary=employeeList.stream()
//                .collect(Collectors.groupingBy(Employee::deptName,Collectors.summarizingDouble(Employee::salary)));
//        deptSalary.forEach((e,k)->{
//            System.out.println(e+"-->"+k.getSum());
//        });
//
//        //Second highest sal
//        Double seconfhigh=employeeList.stream()
//                .map(Employee::salary)
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst()
//                .orElse(null);
//
//        List<Employee> emps=employeeList.stream()
//                .filter(e->e.salary()==seconfhigh)
//                .toList();
//
//        System.out.println(emps);

//        Map<String, List<Employee>> deptEmp = employeeList.stream()
//                .collect(Collectors.groupingBy(Employee::deptName));
//
//        deptEmp.forEach((dept, empList) -> {
//
//            empList.stream()
//                    .sorted(Comparator.comparingDouble(Employee::salary).reversed())
//                    .skip(1)
//                    .findFirst()
//                    .ifPresent(e -> System.out.println(
//                            dept + " -> " + e.name() + " -> " + e.salary()
//                    ));
//        });

//        List<Employee> emps1=employeeList.stream()
//                .filter(e->e.salary()>50000)
//                .toList();
//
//        for(Employee e: emps1){
//            System.out.println(e);
//        }



    }
}
