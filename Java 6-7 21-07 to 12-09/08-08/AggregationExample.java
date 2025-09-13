class Mobile {
    String brand;
    int price;

    Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void dailANumber(String number) {
        System.out.println("Calling to that number " + number);
    }
}

class Person {
    String name;
    Mobile cellPhone;

    // Aggregation
    Person(String name, Mobile cellPhone) {
        this.name = name;
        this.cellPhone = cellPhone;
    }

    void talkToFriend(String number) {
        this.cellPhone.dailANumber(number);
        System.out.println("Talking with friend..");
    }
}

class AggregationExample {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("Vivo", 15000);
        Person p1 = new Person("John", mobile1);
        p1.talkToFriend("9898989");

        Person p2 = new Person("Alice", mobile1);
    }
}