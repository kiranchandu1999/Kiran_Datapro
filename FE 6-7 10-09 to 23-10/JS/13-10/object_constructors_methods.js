// Method: When any function written inside an object then it's called method.
// this keyword refers to an object itself, 
// It's used when we want to refer any properties or methods of an object inside itself
const calc1 = {
    brand: "Casio",
    price: 500,
    addition: function (n1, n2) {
        return n1+n2;
    },
    specs: function () {
        console.log(`Calc made by ${this.brand} and it costs rupees ${this.price}`);
    }
};

console.log(calc1.brand); // Casio
console.log(calc1.addition(5, 8));
calc1.specs();

calc1.color = "black";
console.log(calc1);


// for-in and for-of loops
// for-in loop iterates over the keys
// for-of loop iterates over the values
for(let k in calc1) {
    console.log(calc1[k]);
}

const arr = [5, 8, 10, 3];
for(let x in arr) {
    console.log(x);
}

// function constructor
// It's used to create identical objects with predefined parametrs in function constructor.
function Calculator(brand, price) {
    this.brand = brand;
    this.price = price;
    this.addition = function (n1, n2) {
        return n1+n2;
    };
    this.specs = function () {
        console.log(`Calc made by ${this.brand} and it costs rupees ${this.price}`);
    }
}

const cal1 = new Calculator("Noise", 750);
console.log(cal1.price);
console.log(cal1.addition(3, 5)); // 8

const cal2 = new Calculator("Titan", 1200);
cal2.specs();
cal2.color = "blue";

// adding new property to function constructor
Calculator.prototype.color = "red";

// check whether this property gets added in all corresponding objects or not
const cal3 = new Calculator("Firebolt", 900);
cal3.color = "green";
console.log(cal1.color);