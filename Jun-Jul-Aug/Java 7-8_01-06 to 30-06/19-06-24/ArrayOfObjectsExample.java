class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class ArrayOfObjectsExample{
    // static int add(int[] arr){
    //     int sum = 0;
    //     for(int val : arr){
    //         sum = sum + val;
    //     }

    //     return sum;
    // }

    public static void main(String[] args) {
        // 5, 8, 6, 4  ---> int[]
        // "sai", "bhanu", "ramesh"   --->  String[]

        Student s1 = new Student(5, "sai");
        Student s2 = new Student(8, "bhanu");
        Student s3 = new Student(1, "sai");

        // Student[] arr = new Student[3];
        Student[] arr = {s1, s2, s3};

        // arr[0] = s1;
        // arr[1] = s2;
        // arr[2] = s3;

        System.out.println(arr[1]);
    }
}