import java.util.Arrays;
import java.util.Comparator;

class Student1 {
    int id;
    String name;
    int age;

    Student1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.age;
    }
}

class IdSorting implements Comparator<Student1> {
    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.id - o2.id;
    }
}

class NameSorting implements Comparator<Student1> {
    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.name.compareTo(o2.name);
    }
}

// class AgeSorting implements Comparator<Student1> {
//     @Override
//     public int compare(Student1 o1, Student1 o2) {
//         return o1.age - o2.age;
//     }
// }

public class CompartorExample {
    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "kishore", 24);
        Student1 s2 = new Student1(102, "sai", 22);
        Student1 s3 = new Student1(103, "pavan", 20);

        Student1[] arr1 = {s1, s2, s3};

        // Arrays.sort(arr1, new IdSorting());
        // Arrays.sort(arr1, new NameSorting());

        // using lambda expression
        Arrays.sort(arr1, (a, b) -> {
            return a.age - b.age;
        });

        for(Student1 s: arr1) {
            System.out.println(s);
        }
    }
}
