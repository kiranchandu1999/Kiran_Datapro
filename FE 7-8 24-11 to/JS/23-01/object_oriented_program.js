// class is a base template for creating new objects
class Person {
    // variables - defines object data
    constructor(n, a) {
        console.log("Person constructor called..")
        this.age = a;
        this.name = n;
    }

    // methods - defines object actions
    eat() {
        console.log(`Person is eating`);
    }
}

// Object is a real entity created from a base class
const p1 = new Person('kiran', 20);
p1.eat();
console.log(p1.name); // kiran
console.log(p1.age); // 20
console.log(p1["age"]);

// Inheritance - acquiring variables and methods from parent class to child class
// It is used for code reusability
class Employee extends Person {
    constructor(name, age, salary) {
        console.log("Employee constructor called..")
        super(name, age); // calling parent class constructor
        this.salary = salary;
    }

    // Runtime Polymorphism (method overrding)
    eat() {
        console.log("Employee is eating...");
    }

    work() {
        console.log("Working...");
    }
}

const e1 = new Employee('John', 21, 1000); // calling child constructor
e1.eat(); // from parent
e1.work(); // own method
console.log(e1.name); // from parent
console.log(e1.age); // from parent
console.log(e1.salary); // own
