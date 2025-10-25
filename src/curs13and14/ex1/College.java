package curs13and14.ex1;

import java.util.ArrayList;

public class College {

    private String name;
    private ArrayList<Course> courses;
    private ArrayList<Professor> professors;
    private ArrayList <Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(ArrayList<Professor> professors) {
        this.professors = professors;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                ", professors=" + professors +
                ", students=" + students +
                '}';
    }
}
