package Interview.java8.code.Emp;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeList {

    public static void prt(){
        System.out.println("===============================");
    }
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
        Map<String,Optional<Employee>> highpaybydept=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::deptName,Collectors.maxBy(Comparator.comparingDouble(Employee::salary))));
        highpaybydept.forEach((k,v)->{
            System.out.println(k+"-->"+v.get().name);
        });

        //Youngest employee per department.
        Map<String,Optional<Employee>> youngbydept=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::deptName,Collectors.minBy(Comparator.comparingInt(Employee::age))));
        youngbydept.forEach((k,v)->{
            System.out.println(k+"-->"+v.get().name);
        });

       //Sort employees by age.
        //Ascending order
       employeeList.stream().sorted(Comparator.comparingInt(Employee::age).thenComparing(Employee::name))
               .forEach(e-> System.out.println(e.name()+"-->"+e.age()));
       //Descending order
        employeeList.stream().sorted(Comparator.comparingInt(Employee::age).thenComparing(Employee::name).reversed())
                .forEach(e-> System.out.println(e.name+"-->"+e.age));
        System.out.println("===============================");
        //Sort employees by salary descending.
        employeeList.stream().sorted(Comparator.comparingDouble(Employee::salary).thenComparing(Employee::name).reversed())
                .forEach(e-> System.out.println(e.name()+"--"+e.salary()));
        System.out.println("===============================");
        //Sort employees by year of joining.
        employeeList.stream().sorted(Comparator.comparingInt(Employee::doj))
                .forEach(e-> System.out.println(e.name()+"-->"+e.doj()));
        System.out.println("===============================");
        //Sort employees by department and then by salary.
        employeeList.stream().sorted(Comparator.comparing(Employee::deptName).thenComparingDouble(Employee::salary))
                .forEach(e-> System.out.println(e.name()+"-->"+e.deptName()+"-->"+e.salary()));
        System.out.println("===============================");
        //Get the names of employees grouped by department.
        Map<String,List<String>>nameEmpDet=employeeList.stream().collect(Collectors.groupingBy(Employee::deptName
                ,Collectors.mapping(Employee::name,Collectors.toList())));
        System.out.println(nameEmpDet);
        System.out.println("===============================");
        //Get the total salary of employees per department, only for those with age > 25.
        Map<String,Double>sal=employeeList.stream().filter(e->e.age>25)
                .collect(Collectors.groupingBy(Employee::deptName,Collectors.summingDouble(Employee::salary)));
        System.out.println(sal);
        System.out.println("===============================");
        //Find the top 3 highest-paid employees.
        employeeList.stream().sorted(Comparator.comparingDouble(Employee::salary).reversed())
                 .limit(3).forEach(e-> System.out.println(e.name+"-->"+e.salary));

        System.out.println("===============================");
        //Find employees who joined before 2010 and earn more than 50k.
        List<String> before=employeeList.stream().filter(e->e.doj>2010 && e.salary<50000).map(Employee::name).collect(Collectors.toList());

        System.out.println(before);
        System.out.println("===============================");
        //List employees whose name length is greater than 4 characters.
         List<String>names=employeeList.stream().filter(e->e.name.length()>4).map(Employee::name).collect(Collectors.toList());
        System.out.println(names);
        System.out.println("===============================");
        //Join all employee names into a single comma-separated string.
        String allnames=employeeList.stream().map(Employee::name).collect(Collectors.joining(","));
        System.out.println(allnames);
        System.out.println("===============================");
        //Get departments with more than 2 employees.
        Map<String,Long>count=employeeList.stream().collect(Collectors.groupingBy(Employee::deptName,Collectors.counting()));
        count.entrySet().stream()
                        .filter(entry->entry.getValue()>2)
                .forEach(entry-> System.out.println(entry.getKey()+"-->"+entry.getValue()));
        System.out.println("===============================");
        //Average salary of male vs female employees.
        Map<String,Double> salarygender=employeeList.stream().collect(Collectors.groupingBy(Employee::gender,Collectors.averagingDouble(Employee::salary)));
        System.out.println(salarygender);
        System.out.println("===============================");
        //Sum of salaries of employees in developer + QA departments.
        Double sumsal=employeeList.stream().filter(e->e.deptName.equalsIgnoreCase("developer")|| e.deptName.equalsIgnoreCase("qa"))
                .collect(Collectors.summarizingDouble(Employee::salary)).getSum();
        System.out.println(sumsal);
        System.out.println("===============================");
        //Create a Map of department → set of employee names.
        Map<String, Set<String>> emps=employeeList.stream().collect(Collectors.groupingBy(Employee::deptName,Collectors.mapping(Employee::name,Collectors.toSet())));
        System.out.println(emps);
        prt();
        //How many male and female employees are there in the organization?
        Map<String,Long> countMF=employeeList.stream().collect(Collectors.groupingBy(Employee::gender,Collectors.counting()));
        System.out.println(countMF);
        prt();
        //Print the name of all departments in the organization?
         List<String> depts=employeeList.stream().map(Employee::deptName).distinct().collect(Collectors.toList());
        System.out.println(depts);

        prt();
        //What is the average age of male and female employees?
           Map<String,Double>avgageMF=employeeList.stream()
                   .collect(Collectors.groupingBy(Employee::gender,Collectors.averagingInt(Employee::age)));
        System.out.println(avgageMF);

        prt();
        //Get the details of highest paid employee in the organization?
        Optional highpay=employeeList.stream().sorted(Comparator.comparingDouble(Employee::salary).reversed())
                .findFirst();
        System.out.println(highpay.get());

        prt();
        //Get the names of all employees who have joined after 2015?
        List<String>empnames=employeeList.stream().filter(e->e.doj>2015).map(Employee::name).collect(Collectors.toList());
        System.out.println(empnames);
        prt();
        //Count the number of employees in each department?
        Map<String,Long> countemp=employeeList.stream().collect(Collectors.groupingBy(Employee::deptName,Collectors.counting()));
        System.out.println(countemp );

        prt();
        //What is the average salary of each department?
        Map<String,Double>avgsaldept=employeeList.stream().collect(Collectors.groupingBy(Employee::deptName,Collectors.averagingDouble(Employee::salary)));
        System.out.println(avgsaldept);

        prt();
        //Get the details of youngest male employee in the  developer?
        Optional<Employee>yooungemp=employeeList.stream().filter(e->e.gender.equalsIgnoreCase("male")).sorted(Comparator.comparingInt(Employee::age)).findFirst();
        System.out.println(yooungemp.get());

        prt();
        //Who has the most working experience in the organization?
        Optional mostexp=employeeList.stream().sorted(Comparator.comparingInt(Employee::doj).reversed()).findFirst().map(Employee::name);
        System.out.println(mostexp.get());

        prt();
        //>How many male and female employees are there in the developer and qa team?
        Map<String,Long>empsinDevAq=employeeList.stream().filter(e->e.deptName.equalsIgnoreCase("developer") || e.deptName.equalsIgnoreCase("qa"))
                .collect(Collectors.groupingBy(Employee::gender, Collectors.counting()));
        System.out.println(empsinDevAq);

        prt();
        //What is the average salary of male and female employees?
        Map<String,Double>avgsalMF=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::gender,Collectors.averagingDouble(Employee::salary)));
        System.out.println(avgsalMF);

        prt();
        //List down the names of all employees in each department?
        Map<String,List<String>>emplist=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::deptName,Collectors.mapping(Employee::name,Collectors.toList())));
        System.out.println(emplist);

        prt();
        //What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics avgsumsal=employeeList.stream().collect(Collectors.summarizingDouble(Employee::salary));
        System.out.println("Average sal:-" +avgsumsal.getAverage());
        System.out.println("Total sal:-"+avgsumsal.getSum());

        prt();
        //Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        Map<Boolean,List<String>>isolderthan=employeeList.stream().collect(Collectors.partitioningBy(e->e.age>25,Collectors.mapping(Employee::name,Collectors.toList())));

        isolderthan.forEach((a,b)->{
            if(a)
                System.out.println("Older than 25:-"+b);
            else
                System.out.println("Younger than 25:-"+b);
        });

        prt();
        //Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Optional<Employee>oldestemp=employeeList.stream().sorted(Comparator.comparingInt(Employee::age).reversed()).findFirst();
        oldestemp.ifPresent(e-> System.out.println("Name:-"+e.name +" age :-"+e.age +" dept:-"+e.deptName));
    }
}
