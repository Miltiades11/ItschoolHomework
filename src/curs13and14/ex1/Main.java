package curs13and14.ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //1. College Management System -  Design a system for a college to efficiently manage information about students, professors, and courses:
        //Store comprehensive profiles for every student, capturing their first name, last name, sex, age, date of birth, CNP, and address.
        //Similarly, maintain detailed profiles for every professor, including their first name, last name, sex, age, date of birth, CNP, and address.
        //The college offers eight distinct courses: Math, Computer Science, Physics, Chemistry, Biology, Geography, English, and History. For each course, track details like its schedule, duration, description, and the assigned professor.
        //Allow for the assignment of a professor to a specific course and ensure the ability to retrieve and view course details, including its assigned professor.
        //
        //Note: Think about the needed classes, attributes and methods. We should master OOP principles and always find a way to transpose the objects from real life (or the business domain) to our application, with Java code.

        Student student1 = new Student();
        student1.setFirstName("Marco");
        student1.setLastName("Polo");
        student1.setSex('M');
        student1.setAge(23);
        student1.setDateOfBirth("2002-02-17");
        student1.setCnp(50202150029L);
        student1.setAddress("Bucharest");

        System.out.println(student1);
        System.out.println("-----------------------------------");

        Professor professor1 = new Professor();
        professor1.setFirstName("Visinescu");
        professor1.setLastName("Pavel");
        professor1.setSex('M');
        professor1.setAge(70);
        professor1.setDateOfBirth("01-01-1955");
        professor1.setCnp(3154273256423L);
        professor1.setAddress("Constanta");

        System.out.println(professor1);
        System.out.println("-----------------------------------");

        Course course1 = new Course();
        course1.setName("Math");
        course1.setDescription("Geometrics");
        course1.setDuration(2);
        course1.setSchedule("13:00 - 15:00");
        course1.setProfessor(professor1);

        System.out.println(course1);
        System.out.println("-----------------------------------");

        College college = new College();

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(course1);
        ArrayList<Professor> professors = new ArrayList<>();
        professors.add(professor1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);

        college.setCourses(courses);
        college.setProfessors(professors);
        college.setStudents(students);
        college.setName("Kretzulescu");
        System.out.println(college);
    }
}
