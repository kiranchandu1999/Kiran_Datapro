class Mobile {
    String brand;
    int price;

    Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void call(String number) {
        System.out.println("Calling to the number: " + number);
    }
}

class Person {
    String name;
    int age;
    Mobile mobile;

    Person(String name, int age, Mobile mobile) {
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }

    void talkWithFriend(String number) {
        this.mobile.call(number);
        System.out.println("Talking with friend..");
    }
}

class AggregationExample {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Vivo", 15000);
        Person p1 = new Person("John", 21, m1);
        p1.talkWithFriend("998989");
        
        Person p2 = new Person("Alice", 19, m1);
    }
}