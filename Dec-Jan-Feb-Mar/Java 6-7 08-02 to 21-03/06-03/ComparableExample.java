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

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.age;
    }

    @Override
    public int compareTo(Student obj) {
        // if returns negetive - order doesn't change
        // if positive order change
        // return this.id - obj.id;
        // return this.name.compareTo(obj.name);

        if(this.age < obj.age) {
            return -1;
        }
        else {
            return 1;
        }
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        int[] arr = {10, 5, 15, 3, 20};

        String[] arr2 = {"java", "python", "c++", "c"};

        Arrays.sort(arr);

        Arrays.sort(arr2);

        // for(int x: arr) {
        //     System.out.println(x);
        // }

        // for(String x: arr2) {
        //     System.out.println(x);
        // }

        Student s1 = new Student(101, "sai", 22);
        Student s2 = new Student(102, "kishore", 20);
        Student s3 = new Student(103, "megha", 24);

        Student[] students = {s1, s2, s3};

        Arrays.sort(students);

        for(Student s: students) {
            System.out.println(s);
        }

    }
}
