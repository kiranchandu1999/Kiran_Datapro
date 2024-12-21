package Misc;

import java.util.ArrayList;
import java.util.Collections;

class Student {
    int id;
    String name;
    int age;
    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Sai", 21);
        Student s2 = new Student(102, "Rakesh", 24);
        Student s3 = new Student(103, "Pavan", 20);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ArrayList<Integer> l2 = new ArrayList<>();

        Collections.sort(list, (a, b) -> {
            return a.name.compareTo(b.name);
        });

        // System.out.println(list);

        for(Student s : list) {
            System.out.println(s.name);
        }

        // System.out.println("Akash".compareTo("Dai"));
    }
}
