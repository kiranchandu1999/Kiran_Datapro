// Object --> It's a collection of data stored in key-value pairs.
// Objects can be created using literal or new keyword
const car = {
    brand: "Toyota",
    model: "Baleno",
    speed: 120
}

// accessing object data
console.log(car.speed); // 120
console.log(car["model"]); // Baleno
// adding or modifying existing property
car.color = "White";
console.log(car);

// for-in (iterate on keys) 
for(let key in car) {
    console.log(`Key: ${key} and Value: ${car[key]}`);
}

// for-of loops (iterate on values)
const nums = [2, 4, 6, 8];
for(let x of nums) {
    console.log(x);
}

let b = car.brand;
let c = car.color;
let m = car.model;
// Destructuring
// let {brand, model, color} = car;
// Destructuring with custom names
let {brand: brandName, model: modelName, color: colorName} = car;
console.log(brandName); // Toyota

let [n1, n2, n3, n4] = nums;
console.log(n2); // 4
// Rest operator
let [x, ...nums2] = nums;
console.log(nums2);
// Spread operator
const merged = [...nums, ...nums2];
console.log(merged);


// When we want to create multiple same kind of objects then we should 
// object constructor function
function Calculator(brand, price) {
    this.brand = brand;
    this.price = price;
}

const calc1 = new Calculator("Casio", 1000);
const calc2 = new Calculator("Titan", 1200);
const calc3 = new Calculator("Noise", 800);
console.log(calc1.price); // 1000

// To add any new property for all instances
// Modifying prototype
Calculator.prototype.color = "Black";

// Replacing prototype (Not safe)
Calculator.prototype = {
    dimensions: "10x8"
}

const calc4 = new Calculator("Boat", 500);
console.log(calc1.dimensions); // undefined
console.log(calc4.dimensions); // 10x8

