package br.com.devdojo.model;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

//classe model para estudante
public class Student {

    private String name;
    private int id;
    public static List<Student> studentList;
    static {
        studentRepository();
    }



    public Student(int id, String name) {
        this(name);
        this.id = id;
    }

    public Student() {
        
    }

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static void studentRepository(){
        studentList = new ArrayList<>(asList(new Student(1, "caio"),new Student(2, "abimael")));
    }
}
