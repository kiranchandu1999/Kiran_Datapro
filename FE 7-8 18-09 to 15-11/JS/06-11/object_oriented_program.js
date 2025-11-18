// Class --> It's a template for newly creating objects
class Person {
    // It's a kind of method used to initialize the new object
    // It will be executed when new object is created
    constructor(name, age) {
        console.log("Person object created");
        this.name = name;
        this.age = age;
    }

    // Method
    walk() {
        console.log(`${this.name} is walking..`);
    }

    eat() {
        console.log(`Person ${this.name} is eating...`);
    }
}


// Inheritance --> Extending properties and methods to child object from parent
class Student extends Person {
    constructor(name, age, college) {
        // it'll call parent class constructor
        console.log("Student object created");
        super(name, age);
        this.college = college;
    }

    study() {
        console.log(`${this.name} is studying in ${this.college} college..`);
        super.eat();
    }

    // Method overriding (Polymorphism)
    eat() {
        console.log(`Student ${this.name} is eating...`);
    }

    static getClassName() {
        return "Student class";
    }
}

const per1 = new Person("John", 20);
per1.walk();

const st1 = new Student("Alice", 22, "ASET");
st1.name = "Bob";
st1.study();
st1.eat();
console.log(Student.getClassName());

// Encapsulation (hiding internal details from outside the class)
class BankAccount {
    #balance = 0;

    deposit(amout) {
        console.log("Depositing amount " + amout);
        this.#balance += amout;
    }

    getBalance() {
        return this.#balance;
    }
}

const acc1 = new BankAccount();
acc1.deposit(1000);
// console.log(acc1.#balance); cannot access
console.log(acc1.getBalance());


// Error handling
// using try-catch blocks
// try block defines the statements which might throw error
// catch block defines respective handling statement
let a = 10;
let b = 20;
console.log(`Addition: ${a+b}`);
console.log(`Subtraction: ${a-b}`);
try {
    console.log(`Add: ${a+c}`);
}
catch(err) {
    console.log(err);
}
let d = 15;
console.log("Multiplication: " + (a*d));