public class ArrayOfObjects {
    public static void main(String[] args) {
        // objects 
        Student s1 = new Student(1001, "Pavan");
        Student s2 = new Student(1002, "Kishore");
        Student s3 = new Student(1003, "Ramya");
        
        Student[] arr1 = new Student[]{s1, s2, s3};

        System.out.println(arr1[2].fName);
    }
}

class Student {
    // variables
    int htNo;
    String fName;

    Student(int htNo, String fName) {
        this.htNo = htNo;
        this.fName = fName;
    }
}