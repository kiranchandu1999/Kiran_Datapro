let st1 = {
    fname: "sai",
    lname: "shankar",
    age: 20,
    fullName: function() {
        return this.fname + " " + this.lname;
    }
};

console.log(st1.fname);
console.log(st1.fullName);
console.log(st1.fullName());


class Person {
    constructor(name, age, email) {
        this.fname = name;
        this.age = age;
        this.emailId = email;
    }
    talk() {
        console.log("person talking...");
    }

    eat() {
        this.talk();
        console.log("person eating...");
    }
}

class Employee extends Person {
    constructor(name, age, email, salary) {
        super(name, age, email);
        this.salary = salary;
    }

    get getSal() {
        return this.salary;
    }

    set setSal(sal) {
        this.salary = sal;
    }

    empEat() {
        super.eat();
    }
}

let p1 = new Person("srinivas", 20, "sri@gmail.com");
p1.contact = 12345;
console.log(p1);

let p2 = new Person();
console.log(p2);

let e1 = new Employee("deepak", 20, "d@gmailcom", 10000);
console.log(e1);
e1.setSal = 5000;
console.log(e1.getSal);
Employee.empEat();


getNum();

function getNum() {
    console.log("100");
}