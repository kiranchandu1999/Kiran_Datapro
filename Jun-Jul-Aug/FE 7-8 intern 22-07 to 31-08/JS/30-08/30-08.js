class Vehicle {
    start() {
        console.log("starting..");
    }
    stop() {
        console.log("stop..");
    }
}

class Bike extends Vehicle{
    constructor() {
        super();
    }
}

class Car extends Vehicle{
    constructor(brand, color) {
        super();
        this.brandName = brand;
        this.color = color;
    }

    callStart() {
        super.start();
    }
    
    // setBrand(brand){
    // }
    // setColor(color){
    // }
}

let fortuner = new Car("toyota", "red");
fortuner.callStart();
// fortuner.start();
// fortuner.stop();

let honda = new Bike();
// honda.start();

let cars = ["breeza", "creta", "innova"];

const student = {
    id: 101,
    fname: "Ahmed",
    lname: "Shaik",
    age: 20,
    fullName: function() {
        console.log(`${this.fname} ${this.lname}`);
    }
};

console.log(student.fname);

student.fullName();
