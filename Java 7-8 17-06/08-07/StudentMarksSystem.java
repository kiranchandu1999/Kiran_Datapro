class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // find average
    double getAverage() {
        double sum = 0;
        double avg = 0;
        // forEach loop
        for(int m: marks) {
            sum += m;
        }
        avg = sum / marks.length;
        return avg;
    }

    // find highest marks and lowest marks
    void printHighestLowest() {
        int hi = 0;
        int lo = 100;

        for(int x: marks) {
            // logic for highest
            if(x > hi) {
                hi = x;
            }
            // logic for lowest
            if(x < lo) {
                lo = x;
            }
        }

        System.out.println("Highest score: " + hi);
        System.out.println("Lowest score: " + lo);
    }
}

class StudentMarksSystem {
    public static void main(String[] args) {
        String name1 = "Ramesh";
        int[] marks1 = {85, 70, 92, 80, 51, 90};
        Student s1 = new Student(name1, marks1);
        Student s2 = new Student("Balu", new int[] {93, 85, 97, 70, 92, 79});

        System.out.println("Marks average of " + s1.name + ": " + s1.getAverage());
        System.out.println("Marks average of " + s2.name + ": " + s2.getAverage());

        s1.printHighestLowest();
        s2.printHighestLowest();
    }
}