// class -> It's a template for same type of objects
class Person {
    // constructor
    constructor(name, age, city) {
        console.log("New object created");
        this.fullName = name;
        this.age = age;
        this.city = city;
    }

    // method
    eat() {
        console.log("Eating..");
    }

    sleep() {
        console.log("Sleep..");
    }

    // setName(x) {
    //     this.fullName = x;
    // }

    // setAge(y) {
    //     this.age = y;
    // }

    // setProperties(name, age, city) {
    //     this.fullName = name;
    //     this.age = age;
    //     this.city = city;
    // }
}


const person1 = new Person("Ashok", 20, "Vizag");
person1.eat();
// person1.setName("Raju");
// person1.setProperties("Ashok", 20, "Vizag");
console.log(person1.fullName);
console.log(person1.city);


// constructor -> It's a kind of method to setup basic properties to an object
// It will be called automatically whenever we create an object using new keyword


// Inheritance -> acquiring properties and methods from parent class to child class
class Animal {
    constructor(name) {
        this.name = name;
    }

    walk() {
        console.log("Walking..");
    }

    jump() {
        console.log("Jumping..");
    }
}


class Dog extends Animal {
    constructor(name, breed) {
        super(name);
        this.breed = breed;
    }

    bark() {
        console.log("Barking..");
    }

    // method overriding -> rewriting the same method which id present inside parent class
    walk() {
        console.log(`${this.name} is walking..`);
    }

    getInfo() {
        console.log(`Name is: ${this.name} breed is: ${this.breed}`);
    }
}

const anim1 = new Animal();
// anim1.bark();
const dog1 = new Dog("Tom", "XYZ");
dog1.bark();
dog1.walk();
dog1.jump();
dog1.getInfo();


class Bank {
    #balance = 0;

    deposit(amount) {
        this.#balance += amount;
    }

    getBalance() {
        return this.#balance;
    }
}

const b1 = new Bank();
b1.deposit(100);
console.log(b1.getBalance());
console.log(b1.balance);

// error handling -> We need to use try catch blocks
// try block contains error code
// catch block contains handling statements
let a = 10;
let b = 20;
console.log("add: " + (a + b));
console.log("sub: " + (a - b));
try {
    console.log("add2: " + (a + c));
} catch(err) {
    console.log(err);
}
console.log("mul: " + (a * b));
