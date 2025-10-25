package curs11.ex3;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        //3. Create :
        //2 empty ArrayLists: studentList and graduateStudentList
        //populate studentList with 10 students
        //copy values from studentList to graduateStudentList
        //iterate through graduateStudentList and print each graduated student

        ArrayList<String> studentList = new ArrayList<>(10);
        studentList.add("Andrei");
        studentList.add("Maria");
        studentList.add("Mircea");
        studentList.add("Vali");
        studentList.add("Cristi");
        studentList.add("Cezar");
        studentList.add("Sorin");
        studentList.add("Antonia");
        studentList.add("Rares");
        studentList.add("Gabriel");

        ArrayList<String> graduatedStudentList = new ArrayList<>();
        graduatedStudentList.addAll(studentList.subList(1,7));

        for(String student : graduatedStudentList){
            System.out.println(student + ", CONGRATULATIONS!");
        }
    }
}
