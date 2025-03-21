public class InheritanceTest {
    public static void main(String[] args) {
        // object creation
        // Person p1 = new Person();
        // p1.fullName = "raju";
        // p1.age = 20;
        // p1.address = "xcvb";

        // Student s1 = new Student();
        // s1.fullName = "suresh";
        // s1.age = 22;
        // s1.address = "qwere";
        // s1.htNo = 1001;

        // Student s2 = new Student();
        // s2.fullName = "rakesh";
        // s2.age = 22;
        // s2.address = "qwere";

        // s1.talk();
        // s1.study();
        // s2.displayName();

        // using constructor
        Student s3 = new Student("vijay", 20, "asfd", 1005);
        s3.displayName();
        s3.talk();

        Person p2 = new Person("raju", 21, "dfsa");
    }
}

class Person {
    // variables
    String fullName;
    int age;
    String address;

    Person(String fullName, int age, String address) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

    // methods
    void talk() {
        System.out.println("talking...");
    }

    void eat() {
        System.out.println("eating...");
    }
}

class Student extends Person{
    // variables
    // coming from parent
    // String fullName;
    // int age;
    // String address;
    int htNo;

    // default constructor
    // Student() {
    //     super();
    // }

    Student(String fullName, int age, String address, int htNo) {
        super(fullName, age, address);
        // this.fullName = fullName;
        // this.age = age;
        // this.address = address;
        this.htNo = htNo;
    }

    // methods
    // coming from parent
    // void talk() {
    //     System.out.println("talking...");
    // }

    // void eat() {
    //     System.out.println("eating...");
    // }

    void study() {
        System.out.println("studying...");
    }

    void displayName() {
        System.out.println(fullName);
    }
}