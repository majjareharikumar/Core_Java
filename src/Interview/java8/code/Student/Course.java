package Interview.java8.code.Student;

public class Course {
    int Courseid;
    String CourseName;
    double Coursefee;

    public Course(int courseid, String courseName, double coursefee) {
        Courseid = courseid;
        CourseName = courseName;
        Coursefee = coursefee;
    }

    public int Courseid() {
        return Courseid;
    }

    public String CourseName() {
        return CourseName;
    }

    public double Coursefee() {
        return Coursefee;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Courseid=" + Courseid +
                ", CourseName='" + CourseName + '\'' +
                ", Coursefee=" + Coursefee +
                '}';
    }
}
