class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println(this);
    }
}

public class StaticAndThisExample {
    int a = 5;

    // static void display(){
    //     // System.out.println(a);
    // }

    public static void main(String[] args) {
        StaticAndThisExample o1 = new StaticAndThisExample();
        o1.a = o1.a + 2;

        // person object creation
        Person p1 = new Person("Kiran", 25);
        p1.display();

        System.out.println(p1.name);

        // StaticAndThisExample o2 = new StaticAndThisExample();
        
        // System.out.println(o1.a);
        // System.out.println(o2.a);

        // System.out.println(this);
    }
}