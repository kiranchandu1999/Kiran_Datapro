// array methods
const fruits = ["banana", "kiwi", "orange", "mango"];
console.log(fruits[2]);

// slice -> to extract some part of array
const subArray = fruits.slice(1, 3);
console.log(subArray);

// splice -> this is used to insert/replace/remove elements to/from an array
// insert
fruits.splice(3, 0, "apple");
console.log(fruits); // [ 'banana', 'kiwi', 'orange', 'apple', 'mango' ]

// remove
fruits.splice(2, 1);
console.log(fruits); // [ 'banana', 'kiwi', 'apple', 'mango' ]

// replace
fruits.splice(1, 1, "grapes", "guava");
console.log(fruits); // [ 'banana', 'grapes', 'guava', 'apple', 'mango' ]


// join -> used to join all elements in an array with given delimeter
let joinedFruits = fruits.join(" * ");
console.log(joinedFruits);



// object -> It is a collection of data in the form of key-value pairs
// It contains properties and methods to demonstrate the containing data
// method -> function written inside an object

// objects creation:
// - using object literal
const car1 = {
    brand: "Toyota",
    model: "Innova",
    year: 2022
};

// -using new keyword
const car2 = new Object();
car2.brand = "Suzuki";
car2.model = "WagonR";
car2.year = 2020;

// accessing object values (dot notation or bracket notation)
console.log("Car1 brand: " + car1.brand);
console.log("Car2 barnd: " + car2["brand"]);

// adding/deleting values to the object
car1.color = "Black"; // adds color property to the car1 object
console.log(car1);

delete car1.color; // removes color property from car1 object
console.log(car1);


// nested objects
const student1 = {
    id: 111,
    name: "Lokesh",
    address: {
        street: "Main st",
        city: "Vizag",
        pincode: 50000
    },
    email: "student@example.com"
};

console.log("Student name: " + student1.name);
console.log("student city: " + student1["address"].city);


// object methods
const calculator1 = {
    brand: "Casio",
    price: 1200,
    add: function(a, b) {
        return a + b;
    },
    sub: function(a, b) {
        return a - b;
    }
};

console.log("Sum of 2 numbers: " + calculator1.add(5, 3));

// we can add methods seperately
calculator1.multiply = function(a, b) {
    return a * b;
};

console.log(calculator1);

