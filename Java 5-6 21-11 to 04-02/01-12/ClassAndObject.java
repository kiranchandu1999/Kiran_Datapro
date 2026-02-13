// Creating class
class Student {
    // variables
    String name;
    int rollNo;

    // methods
}


class ClassAndObject {
    public static void main(String[] args) {
        // Object creation
        Student s1 = new Student();
        System.out.println(s1);
        // assigning values to the variables of s1 using dot notation
        s1.name = "John";
        s1.rollNo = 101;
        // accessing values
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
    }
}