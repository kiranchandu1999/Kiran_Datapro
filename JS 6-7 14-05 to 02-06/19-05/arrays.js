console.log("Object function constructor:");

// we can use function constructor to create same type objects:
function Person(firstName, lastName, age, email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.email = email;
}

// creating objects using new keyword
const person1 = new Person("Navadeep", "Santosh", 20, "navdeep@example.com");
const person2 = new Person("Rahul", "Kumar", 25, "rahul@gmail.com");

console.log(person1);
console.log(person1.firstName);

console.log(person2.email);

// we can add new field to an existing object
person1.contact = "12345";
console.log(person1.contact);

// we cannot add new field to constructor, we need to use prototype
Person.prototype.country = "India";
console.log(person2.country);

// Arrays in javascript
// An array is a special variable, which can hold more than one value:
// creating an array
const fruits = ["Mango", "Apple", "Banana", "Kiwi", "Orange", "Dragon fruit"];
// or
const cars = new Array("Innova", "Benz", "BMW", "Audi");

console.log(fruits);

// accessing array values
console.log(fruits[3]);

// updating array elements
fruits[2] = "Grapes";
console.log(fruits);

// array length and accessing last element
console.log(cars[cars.length - 1]);

// looping on array
for(let i=0; i<fruits.length; i++) {
    console.log(fruits[i]);
}
