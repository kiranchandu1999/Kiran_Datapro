// Array methods
// slice() ---> it is used to take some part of original array
const skills = ["Javascript", "HTML", "CSS", "Java"];
console.log(skills.slice(1, 3)); // ["HTML", "CSS"]

// splice(index, no of elements to remove, new elements) 
// ---> it is used in multiple cases (insert, remove, replace)
const fruits = ["grapes", "banana", "apple", "orange"];

// insert 'kiwi' fruit at index 2
fruits.splice(2, 0, "kiwi");
console.log(fruits); //  ["grapes", "banana", "kiwi", "apple", "orange"]

// remove apple from fruits array
fruits.splice(3, 1);
console.log(fruits); // ["grapes", "banana", "kiwi", "orange"]

// replace banana with guava and pineapple
fruits.splice(1, 1, "guava", "pineapple");
console.log(fruits);

// join() ---> it is used to join all elements in an array to make a single string
let joinedStr = fruits.join("==");
console.log(joinedStr); // grapes==guava==pineapple==kiwi==orange

// converting a string to an array
const fruitsArr = joinedStr.split("==");
console.log(fruitsArr); // 


// Object --> It's a collection of data where elements stored as key:value pairs.
// we can access values of an object by using keys
// for accessing values we use either dot notation or bracket notation

const car = {
    brand: "Toyota",
    color: "White",
    model: "Innova"
};

// accessing values
console.log(car.model); // Innova
console.log(car["brand"]); // Toyota

// inserting or updating elements
car.price = 1500;
console.log(car);

// removing elements from object
delete car.color;
console.log(car);