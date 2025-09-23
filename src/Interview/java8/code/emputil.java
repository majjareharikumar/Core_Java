package Interview.java8.code;

public class emputil {

    int id;
    String name;
    int age;
    String gender;
    String DeptName;
    int yearOfJoin;
    double salary;

    public emputil(int id, String name, int age, String gender, String deptName, int yearOfJoin, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        DeptName = deptName;
        this.yearOfJoin = yearOfJoin;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDeptName() {
        return DeptName;
    }

    public int getYearOfJoin() {
        return yearOfJoin;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "emputil{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", DeptName='" + DeptName + '\'' +
                ", yearOfJoin=" + yearOfJoin +
                ", salary=" + salary +
                '}';
    }
}
//
//1️⃣ Basic Filtering & Mapping
//Get names of all employees in the "HR" department.
//List all employees who earn more than 50,000.
//Get employees whose names start with “R”.
//Print all employees younger than 25.
//
//        2 Aggregation
//Total salary of all employees.
//Average salary of all employees.
//Total salary per department.
//Average age of employees in each department.
//
//3️⃣ Grouping & Counting
//Count of employees in each department.
//Count of male and female employees overall.
//Count of male and female employees in each department.
//Group employees by gender.
//
//        4️⃣ Partitioning
//Partition employees who are older than 25 and those 25 or younger.
//Partition employees earning more than 50k and those earning less.
//
//5️⃣ Max / Min / Finding
//Employee with the highest salary.
//Employee with the lowest salary.
//Oldest employee in the organization.
//Youngest employee in the organization.
// Highest-paid employee per department.
//Youngest employee per department.
//
// 6️⃣ Sorting
//Sort employees by age.
//Sort employees by salary descending.
//Sort employees by year of joining.
//Sort employees by department and then by salary.
//
//  Advanced Stream API
//Get the names of employees grouped by department.
//Get the total salary of employees per department, only for those with age > 25.
//Partition employees by gender, then by age > 25 (nested partitioning).
//Find the top 3 highest-paid employees.
//Find employees who joined before 2010 and earn more than 50k.
//List employees whose name length is greater than 4 characters.
//
//8️⃣ Collector Combinations
//Join all employee names into a single comma-separated string.
//Get departments with more than 2 employees.
//Average salary of male vs female employees.
//Sum of salaries of employees in developer + QA departments.
//Create a Map of department → set of employee names.
