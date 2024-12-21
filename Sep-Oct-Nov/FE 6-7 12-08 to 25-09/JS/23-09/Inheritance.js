class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
        console.log("person const");
    }
    talk() {
        console.log("person talking...");
    }

    eat() {
        console.log("person eating...");
    }
}

class Employee extends Person{
    constructor(name, age, id, salary) {
        super(name, age);
        this.id = id;
        this.salary = salary;
        console.log("employee const");
    }
    work() {
        console.log("employee working...");
    }

    eat() {
        console.log("employee eating...");
    }
}

let emp1 = new Employee("chandrasekhar", 20, 1001, 20000);
console.log(emp1.salary);
emp1.eat();