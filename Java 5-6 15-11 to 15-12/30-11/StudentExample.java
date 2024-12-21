// public class StudentExample {
//     public static void main(String[] args) {
//         // object creation
//         Student s1 = new Student(101, "Ramesh", 20, "ramesh@gmail.com");
//         // s1.stId = 101;
//         // s1.stName = "Ramesh";
//         // s1.age = 20;
//         // s1.email = "ramesh@gmail.com";
//         // s1.assignValues(101, "Ramesh", 20, "ramesh@gmail.com");

//         Student s2 = new Student(102, "sai", 21, "sai@gmail.com");
//         // using assignValues method
//         // s2.assignValues(102, "sai", 21, "sai@gmail.com");

//         System.out.println(s1);
//         System.out.println(s2);
//         System.out.println(s1.stId);
//         System.out.println(s2.email);
//         s1.study();
//         int sum = s1.add(5, 8);
//         System.out.println(sum);
//     }
// }

// class Student {
//     // variables or properties
//     int stId;
//     String stName;
//     int age;
//     String email;

//     // methods or behaviours
//     void study() {
//         int a = 10;
//         System.out.println("student studying..");
//     }

//     Student(int stId, String stName, int age, String email) {
//         this.stId = stId;
//         this.stName = stName;
//         this.age = age;
//         this.email = email;
//     }

//     void assignValues(int stId, String stName, int age, String email) {
//         this.stId = stId;
//         this.stName = stName;
//         this.age = age;
//         this.email = email;
//         // System.out.println(this);
//     }

//     int add(int num1, int num2) {
//         return num1 + num2;
//     }

//     String getName() {
//         return "sadfsafgsag";
//     }
// }