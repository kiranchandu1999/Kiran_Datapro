// object creation
const dog = {
    petName: "Tommy",
    age: 5,
    color: "white",
    bark() {
        console.log(`${this.petName} is barking...`);
    }
}

dog.bark();

// object function constructor
function Animal(name, age, color) {
    this.petName = name;
    this.age = age;
    this.color = color;
    this.eat = function() {
        console.log(`${this.petName} is eating...`);
    }
}

const cat = new Animal("Rocky", 2, "black");
const cat2 = new Animal("Vicky", 3, "white");
cat2.eat();


// class is a blueprint for any object
// class contains properties and methods
class Person {
    // properties - defines identification of object
    // properties will be defined through constructor
    constructor(firstName, lastName, age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // methods - declares action what they can do
    walk() {
        console.log(`${this.firstName} is walking..`);
    }

    eat() {
        console.log(`${this.firstName} is eating..`);
    }
}

let person1 = new Person("Rahul", "kumar", 20);
let person2 = new Person("krishna", "mohan", 22);
person1.walk();
person2.eat();


// inheritance - acquiring properties and methods from parent to child
// super(args) is used to call parent class constructor
class Employee extends Person {
    constructor(firstName, lastName, age, salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    work() {
        console.log(`${this.firstName} is working..`);
    }
}

class Doctor extends Employee {
    static checkHealth() {
        console.log(`Doctor is checking health...`);
    }
}

let emp1 = new Employee("ashok", "sai", 25, 20000);
emp1.walk();
emp1.work();


let doc1 = new Doctor("navdeep", "santosh", 20, 30000);
doc1.eat();
Doctor.checkHealth();