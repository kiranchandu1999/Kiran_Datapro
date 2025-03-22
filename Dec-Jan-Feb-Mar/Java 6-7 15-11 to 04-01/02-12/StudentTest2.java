public class StudentTest2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        // object
        Student s1 = new Student();
        s1.htNo = 101;
        s1.stName = "kishore";
        s1.email = "kish@gmaiul.com";

        Student s2 = new Student();
        s2.htNo = 102;
        s2.stName = "rupa";
        s2.email = "rupa@gmaiul.com";

        System.out.println(s2.email);

        double avg = s1.calcAvg(5, 4);
        System.out.println(avg);

        Student s3 = new Student();

        s3.calcAvg(20, 25);
    }
}

class Student {
    // variables or properties
    int htNo;
    String stName;
    String email;

    // methods or behaviours
    double calcAvg(int a, int b) {
        int sum = a + b;
        double avg = sum / 2;
        return avg;
    }
}