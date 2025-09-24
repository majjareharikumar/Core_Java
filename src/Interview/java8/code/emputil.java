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