import java.util.Arrays;

class Student implements Comparable<Student> {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.age;
    }

    @Override
    public int compareTo(Student obj) {
        // return this.name.compareTo(obj.name);
        return this.age - obj.age;
        
        // if it returns negetive (order doesn't change) otherwise change
    }
}


public class ArraySortingExample {
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 10, 4, 12};

        String[] arr2 = {"mango", "banana", "apple", "orange"};

        // Arrays.sort(arr1);

        // for(int x: arr1) {
        //     System.out.println(x);
        // }

        // Arrays.sort(arr2);

        // for(String x: arr2) {
        //     System.out.println(x);
        // }

        Student s1 = new Student(101, "kishore", 24);
        Student s2 = new Student(102, "sai", 22);
        Student s3 = new Student(103, "pavan", 20);

        Student[] arr3 = {s1, s2, s3};

        Arrays.sort(arr3);

        for(Student s: arr3) {
            System.out.println(s);
        }

    }
}