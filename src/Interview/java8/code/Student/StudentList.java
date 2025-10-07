package Interview.java8.code.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentList {
    public static void main(String[] args) {
        Course java=new Course(101,"Java",5000);
        Course spring=new Course(102,"Spring boot",9000);
        Course react=new Course(103,"React",4500);
        Course aws=new Course(104,"AWS",6000);
        Course python=new Course(105,"Python",8000);

        List<Student> studentlist=new ArrayList<>();
        studentlist.add(new Student(1,"Hari","male","hari123@gmail.com", Arrays.asList(java,spring)));
        studentlist.add(new Student(2,"Kumar","male","kumar123@gmail.com", Arrays.asList(java,spring,aws)));
        studentlist.add(new Student(3,"Mani","female","mani123@gmail.com", Arrays.asList(java,spring,react,aws)));
        studentlist.add(new Student(4,"Vani","female","vani123@gmail.com", Arrays.asList(python,react,aws)));
        studentlist.add(new Student(5,"Nani","male","nani123@gmail.com", Arrays.asList(java,spring,react)));
        studentlist.add(new Student(6,"Rani","female","rani123@gmail.com", Arrays.asList(python)));

        //How many male and female students are there in the training center?
        Map<String,Long> Gendercount= studentlist.stream().collect(Collectors.groupingBy(Student::stugender,Collectors.counting()));
        System.out.println(Gendercount);

        //Print the names of all available courses
        List<String> courseNames=studentlist.stream().flatMap(s->s.listofcourse.stream()).map(Course::CourseName).distinct().collect(Collectors.toList());
        System.out.println(courseNames);
    }
}
