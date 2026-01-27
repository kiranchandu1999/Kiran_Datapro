// Object constructor function
function Calculator(brand, price) {
    this.brand = brand;
    this.price = price;
    // add method for calculator objects (every object will store this method which leads to ineffiecient memory usage)
    // this.add = (a, b) => {
    //     console.log(`Addition is: ${a+b}`);
    // }
}

const c1 = new Calculator('Casio', 500);
const c2 = new Calculator('Noise', 800);

// prototype is used  for assigning new fields or new methods to all objects created from Calculator constructor
// prototype is used for method (memory efficient way)
console.log(Calculator.prototype);

// adding new key value pair into prototype (for all instances)
Calculator.prototype.color = 'black';
console.log(c1.color);
console.log(Calculator.prototype);

// adding add method into prototype
Calculator.prototype.add = (a, b) => {
    console.log(`Addition is: ${a+b}`);
};

// calling calcultor add method from c1
c1.add(10, 5); // 15
c2.add(10, 25); // 35

console.log(c1.__proto__ == Calculator.prototype); // true

// Important note: We can update prototype but shoudn't replace that
Calculator.prototype = {
    multiply: (a, b) => {
        console.log(`Multiplication is ${a*b}`);
    }
}

console.log(Calculator.prototype);
console.log(c1.__proto__ == Calculator.prototype); // false

// creating new objects after replacing prototype
const c3 = new Calculator('Titan', 1000);
// c3.add(5, 6); // can't access - unknown proto
// c2.multiply(2, 4); // can't access - proto is changed
c3.multiply(6, 4);
