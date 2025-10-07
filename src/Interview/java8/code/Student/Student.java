package Interview.java8.code.Student;

import java.util.List;

public class Student {
    int stuid;
    String stuname;
    String stugender;
    String stuemail;
    List<Course> listofcourse;

    public Student(int stuid, String stuname, String stugender, String stuemail, List<Course> listofcourse) {
        this.stuid = stuid;
        this.stuname = stuname;
        this.stugender = stugender;
        this.stuemail = stuemail;
        this.listofcourse = listofcourse;
    }

    public int stuid() {
        return stuid;
    }

    public String stuname() {
        return stuname;
    }

    public String stugender() {
        return stugender;
    }

    public String stuemail() {
        return stuemail;
    }

    public List<Course> listofcourse() {
        return listofcourse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", stugender='" + stugender + '\'' +
                ", stuemail='" + stuemail + '\'' +
                ", listofcourse=" + listofcourse +
                '}';
    }
}
