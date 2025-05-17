console.log("Hello Navadeep");

// Objects
const car1 = {
    name: "Innova", 
    brand: "Toyota", 
    color: "white", 
    maxSpeed: 200
};

const car2 = {
    model: "Audi Q3", 
    brand: "Audi", 
    color: "black", 
    speedLimit: 250
};

// accessing object properties
console.log(car2.speedLimit);
console.log(car1["color"]);
console.log(car2.color);


// Object with properties and methods
const person = {
    firstName: "Navadeep",
    lastName: "Santosh",
    age: 20,
    sayHi: function() {
        return "Hi...";
    },
    fullName: function() {
        return this.firstName + " " + this.lastName;
    }
};

// objects addressed by referenced not by value
person.firstName = "Sai";

let x = person;
// x.firstName = "Sai";

console.log(person.lastName);
console.log(person.sayHi());
console.log(person.fullName());

// adding new properties or methods to an object
person.email = "example@gamil.com";
console.log(person.email);

person.jump = function() {
    console.log(this.firstName + " is jumping..");
};

person.jump();