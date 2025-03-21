class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}


public class ArrayOfObjects extends Object {
    // pass by value example
    static void modify(int a) {
        a = a * 2;
        System.out.println("a value in method: " + a);
    }

    // pass by reference
    static void modify(int[] arr) {
        arr[0] = arr[0] * 2;
        System.out.println("index 0 value in method: " + arr[0]);
    }

    static void modify(Student[] arr) {
        arr[0].age = 25;
        arr[1].age = 25;
    }

    public static void main(String[] args) {
        int a = 10;
        modify(a);
        System.out.println("a value in main method: " + a);

        int[] arr = {5, 10};
        modify(arr);
        System.out.println("index 0 value in main method: " + arr[0]);

        // array of objects
        Student s1 = new Student("akhil", 20);
        Student s2 = new Student("balu", 22);

        Student[] arr2 = {s1, s2};
        modify(arr2);

        // System.out.println(arr2[0].name + " " + arr2[0].age);
        // System.out.println(arr2[1].name + " " + arr2[1].age);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
    }
}