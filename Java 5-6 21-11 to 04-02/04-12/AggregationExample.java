class Mobile {
    String brand;

    Mobile(String brand) {
        this.brand = brand;
    }

    void call(String num) {
        System.out.println("Calling to number: " + num);
    }
}

class Person {
    String name;
    Mobile cellPhone;

    Person(String name, Mobile cellPhone) {
        this.name = name;
        this.cellPhone = cellPhone;
    }

    void talkToFriendOnMbl(String num) {
        cellPhone.call(num);
        System.out.println("Talking with friend");
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        // Mobile object
        Mobile m1 = new Mobile("Oppo");
        // creating Person object
        Person p1 = new Person("John", m1);
        Person p2 = new Person("Priya", m1);
        // invoking Person's talkToFriend method
        p1.talkToFriendOnMbl("999999");
        p2.talkToFriendOnMbl("123645");
    }
}
