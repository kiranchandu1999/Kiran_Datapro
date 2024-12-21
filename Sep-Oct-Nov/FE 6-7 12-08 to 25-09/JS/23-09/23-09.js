const car1 = {
    brand: "Tata",
    color: "black",
    mileage: 20,
    number: "tata123",
    start: function(){

    }
}

// class creation
class Car {
    constructor(brand, color, mileage) {
        this.brand = brand;
        this.color = color;
        this.mileage = mileage;
    }

    start() {
        console.log("car starting..");
    }

    stop() {
        console.log("car stoping");
    }

    // init(brand, color, mileage) {
    //     this.brand = brand;
    //     this.color = color;
    //     this.mileage = mileage;
    // }
}

// object creation
let carObj1 = new Car("Toyota", "white", 15);
// carObj1.init();
carObj1.start();
carObj1.stop();
console.log(carObj1.mileage);



