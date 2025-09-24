package Interview.java8.code.Emp;

public class Employee {
    int id;
    String name;
    int age;
    String gender;
    double salary;
    String deptName;
    int doj;

    public Employee(int id, String name, int age, String gender, double salary, String deptName, int doj) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.deptName = deptName;
        this.doj = doj;
    }

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    public String gender() {
        return gender;
    }

    public double salary() {
        return salary;
    }

    public String deptName() {
        return deptName;
    }

    public int doj() {
        return doj;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", deptName='" + deptName + '\'' +
                ", doj=" + doj +
                '}';
    }
}
