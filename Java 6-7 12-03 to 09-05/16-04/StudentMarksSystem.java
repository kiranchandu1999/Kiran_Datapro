class Student {
    int stuId;
    int[] marks;

    Student(int id) {
        this.stuId = id;
        this.marks = new int[6];
    }

    // insert marks
    void insertMarks(int[] score) {
        for(int i=0; i<=this.marks.length-1; i++) {
            this.marks[i] = score[i];
        }
    }

    // find average
    double findAvergae() {
        int total = 0;
        double avg = 0;
        // for each loop
        for(int x: marks) { // 85, 65, 86, 70, 54, 60
            total = total + x;
        }
        avg = (double) total / (double) marks.length;
        return avg;
    }

    private int getHighest(int[] score) {
        int highest = 0;
        for(int x: marks) {
            if(x > highest) {
                highest = x;
            }
        }
        return highest;
    }

    private int getLowest(int[] score) { // 28, 56, 15
        int lowest = score[0]; // 28
        for(int x: marks) {
            if(x < lowest) {
                lowest = x;
            }
        }
        return lowest;
    }

    void printHighestLowest() {
        System.out.println("Highest score: " + getHighest(this.marks));
        System.out.println("Lowest score: " + getLowest(this.marks));
    }
}

class StudentMarksSystem {
    public static void main(String[] args) {
        Student s1 = new Student(101);
        // marks insert
        s1.insertMarks(new int[] {85, 65, 86, 70, 54, 60});

        System.out.println("Average: " + s1.findAvergae());
        s1.printHighestLowest();
        // System.out.println(s1.marks[2]);
    }
}