package java8.service;

import java8.classes.Student;

import java.util.ArrayList;

public interface StudentService {
     Student findByName(String name, ArrayList<Student>students);
     ArrayList<Student>getFamele(ArrayList<Student>students);
     ArrayList<Student>getMele(ArrayList<Student>students);



}
