// class --> A class is a blueprint or template for creating objects. 
// Introduced in ES6, classes provide a more structured and cleaner syntax 
// for implementing object-oriented programming compared to the older prototype-based approach.
// It supports Inheritance like concepts very easily compared to old format of function constructor

class Person {
    // constructor will be called automatically when we create new object
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    // methods
    eat() {
        console.log(`Person: ${this.name} is eating..`);
    }
}

// creating objects from Person class
const p1 = new Person("John", 21);
console.log(p1.age); // 21
p1.eat();


// Inheritance ---> 
// Classes support inheritance, allowing one class (child class) to inherit properties and methods from another class (parent class).
// by using extends keyword we can apply inheritance

class Employee extends Person {
    constructor(n, a, salary) {
        // super keyword is used to call parent class properties or methods
        super(n, a);
        this.salary = salary;
    }

    work() {
        console.log(`Employee: ${this.name} is working...`);
    }

    // method overriding
    eat() {
        console.log(`Employee: ${this.name} is eating..`);
    }
}

const e1 = new Employee("Alice", 25, 1000);
console.log(e1.name); // "Alice"
e1.work();
e1.eat();


// Error handling with try, catch blocks
let a = 10;
let b = 5;
console.log("Addition: " + (a + b));
console.log("Subtraction: ", (a - b));
try {
    console.log("New sum: " + (a+c));
}
catch(err) {
    console.log(err);
}
console.log("Multiplication: " + (a*b));