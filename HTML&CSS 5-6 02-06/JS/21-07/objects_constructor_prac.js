// this keyword
// It is referred to an object, and we can select properties of an object using this keyword

const person = {
    firstName: "John",
    lastName: "Doe",
    age: 25,
    fullName: function() {
        console.log("Fullname is: " + this.firstName + " " + this.lastName);
    }
};

person.fullName(); // John Doe


// object looping using for...in loop
for(let key in person) { // key = "firstName";
    console.log(`Key: ${key}, Value: ${person[key]}`);
}


// object comparison
const a = {
    name: "xyz"
};

const b = {
    name: "xyz"
};

console.log(a == b); // false

const c = a;
console.log(a == c); // true


// Destructuring 
// Arrays
const nums = [2, 5, 6, 4];
let [x, y, ...z] = nums;
// values skipping
// let [ , , , x] = nums;
console.log(y);

// Objects
let {firstName: fn, lastName: sn} = person;
console.log(fn);


// object function constructor
// It is used when we want to create multiple objects with same structure

function Human(firstName, lastName, age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    // default value
    this.language = "Chineese";
}

const person1 = new Human("alice", "hussan", 21);
const person2 = new Human("bob", "dijing", 22);
const person3 = new Human("chin", "hong", 28);

// adding new property to person2 object
// person2.language = "Chineese";
// person1.language = "Chineese";
// person3.language = "Chineese";

// can we add new property to object constructor directly
// we should use prototype to add new property
Human.prototype.country = "China";

console.log(person2.lastName);
console.log(person1.language);
console.log(person3.country);