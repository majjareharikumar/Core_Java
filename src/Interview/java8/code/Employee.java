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
        Map<String,Long> noOfMaleFemale=EmployeeList.stream().collect(Collectors.groupingBy(emputil ::getGender,Collectors.counting()));
        System.out.println(noOfMaleFemale);

        //Print the name of all departments in the organization?
       //EmployeeList.stream().map(emputil::getDeptName).distinct().forEach(System.out::println);

        Set<String> depts=EmployeeList.stream().map(emputil ::getDeptName).collect(Collectors.toSet());
        System.out.println(depts);

        //What is the average age of male and female employees?
        Map<String,Double> avgage=EmployeeList.stream().collect(Collectors.groupingBy(emputil ::getGender,Collectors.averagingInt(emputil::getAge)));
        System.out.println(avgage);

        //Get the details of highest paid employee in the organization?
        Optional<emputil> highpay=EmployeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(emputil::getSalary)));

        //System.out.println(highpay);
        highpay.ifPresent(System.out::println);

        //Get the names of all employees who have joined after 2015?
        List<String> names=EmployeeList.stream().filter(e->e.getYearOfJoin() >2015).map(emputil::getName).collect(Collectors.toList());
        System.out.println(names);

        //Count the number of employees in each department?
        Map<String,Long>empcount=EmployeeList.stream().collect(Collectors.groupingBy(emputil::getDeptName,Collectors.counting()));
        System.out.println(empcount);

        //What is the average salary of each department?
        Map<String,Double> avgsal=EmployeeList.stream().collect(Collectors.groupingBy(emputil::getDeptName,Collectors.averagingDouble(emputil::getSalary)));
        System.out.println(avgsal);

        //Get the details of youngest male employee in the  developer?
        Optional<emputil>young=EmployeeList.stream()
                .filter(e->e.getGender().equalsIgnoreCase("male") && e.getDeptName().equalsIgnoreCase("developer"))
                .min(Comparator.comparingInt(emputil::getAge));
        //System.out.println(young);
        young.ifPresent(System.out::println);

        //Who has the most working experience in the organization?
        Optional<emputil>mostYWX=EmployeeList.stream().min(Comparator.comparingInt(emputil::getYearOfJoin));
        //System.out.println(mostYWX);
        mostYWX.ifPresent(System.out::println);

        //How many male and female employees are there in the developer and qa team?
        Map<String,Long> maleAndfemale=EmployeeList.stream().filter(e->e.getDeptName().equalsIgnoreCase("developer") || e.getDeptName().equalsIgnoreCase("qa"))
                .collect(Collectors.groupingBy(emputil::getGender,Collectors.counting()));
        System.out.println(maleAndfemale);
       //What is the average salary of male and female employees?
        Map<String,Double> avgsalmf=EmployeeList.stream().collect(Collectors.groupingBy(emputil::getGender,Collectors.averagingDouble(emputil::getSalary)));
        System.out.println(avgsalmf);

        //List down the names of all employees in each department?
        Map<String,List<String>>deptwisenames=EmployeeList.stream().collect(Collectors.groupingBy(emputil::getDeptName,Collectors.mapping(emputil::getName,Collectors.toList())));
        System.out.println(deptwisenames);

        //What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics sal=EmployeeList.stream().collect(Collectors.summarizingDouble(emputil::getSalary));
        System.out.println("Average salary:- "+sal.getAverage());
        System.out.println("Total salary:- "+sal.getSum());

        //Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        Map<Boolean,List<String>> partition=EmployeeList.stream()
                .collect(Collectors.partitioningBy(e->e.getAge()>25,Collectors.mapping(emputil ::getName,Collectors.toList())))
                ;
        partition.forEach((isold,name)->{
            if(isold){
                System.out.println("Older than 25: "+name);
            }
            else {
                System.out.println("Younger than 25: "+name);
            }
        });

    //Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Optional<emputil> maxage=EmployeeList.stream().max(Comparator.comparingInt(emputil::getAge));

//        emputil emp= maxage.get();
//        System.out.println("Oldest emp name:- "+emp.getName());
//        System.out.println("Age:- "+emp.getAge());
//        System.out.println("Dept:- "+emp.getDeptName());
        maxage.ifPresent(e->{
            System.out.println("name:- "+e.getName());
            System.out.println("Age:- "+e.getAge());
            System.out.println("Dept:- "+e.getDeptName());
        });

    }
}
