// Array --> Collection of elements of different datatypes.
// Creating an array (2 ways)
const arr1 = [5, 15, 20];
const arr2 = new Array(5, 15, 20); // Both will create same kind of array

// accessing array elements by defining element position (index)
console.log(arr1[1]); // 15
// updating existing elements using index
arr2[2] = 10;
console.log(arr2); // [5, 15, 10]

// Array methods
// Adding elements
// push(value) --> adds new element at last
arr1.push(18);
console.log(arr1); // [5,15,20,18]

// unshift(value) --> adds new element at start
arr1.unshift(6); 
console.log(arr1); // [6,5,15,20,18]

// Removing elememts
// pop() --> removes last element
arr1.pop();
console.log(arr1); // [6,5,15,20]

// shift() --> removes element at start
arr1.shift(); 
console.log(arr1); // [5,15,20]

// Find array length
console.log("Array1 length: " + arr1.length); // 3

// slice(si, ei) --> extract some part of array
const languages = ["Javascript", "Python", "C", "C#", "HTML"];
let extracted = languages.slice(1, 3); // ["Python", "C"]

// splice(start, no.of elements to remove, new elements...) --> 
// It changes original array and it's used to insert, update and delete elements at any index
languages.splice(1, 1); // Pyhthon removed
console.log(languages); // ["Javascript", "C", "C#", "HTML"]

// Update C with C++ and Ruby
languages.splice(1, 1, "C++", "Ruby");
console.log(languages); // ["Javascript", "C++", "Ruby, "C#", "HTML"]


// Sorting array
const nums = [2, 8, 3, 9, 6, 11, 15, 18];
nums.sort();
console.log(nums); // Compared elements as string values
// Numeric sorting
nums.sort(numericSort);
console.log("After numeric sort: " + nums);

// Order will be reversed for positive values
// Order won't be changed for negative values
function numericSort(a, b) {
    return a - b;
}

nums.reverse();
console.log(nums);

// Searching values in an array
const nums2 = [16, 18, 3, 19, 2, 11, 15, 2, 10, 2];
console.log("Index of 19: " + nums2.indexOf(19)); // 3
console.log("Index of 19: " + nums2.lastIndexOf(2)); // 7
console.log("Index of 19: " + nums2.indexOf(2, nums2.indexOf(2)+1)); // 7

if(nums2.includes(13)) {
    console.log("It has prime number 13");
}
else {
    console.log("It didn't contain 13");
}


// Iterating over array (ES6 features)
// forEach(callback) --> to perform a task on every element and it doesn't return any thing
nums2.forEach((value, index, array) => {
    console.log(value);
});

// map(callback) --> to perform a task on every element and it returns new array
// double the elements of nums2 array
const doubledArr = nums2.map((value) => {
    return value * 2;
});
console.log(doubledArr);


// filter(callback) --> it will filter the elements based on given condition
// returns the elements which are passed given test condition
const evens = nums2.filter((x) => {
    return x % 2 == 0;
});
console.log(evens);


// reduce(callback) --> It will do the calculate on whole array and returns single value
const cars = ["Swift", "Baleno", "Innova", "Comet", "Fortuner"];
// find largest string
// cars.reduce((prev, value, index, array));
let largest = cars.reduce((prev, curr) => {
    return prev.length < curr.length ? curr : prev;
});
console.log("Largest string: " + largest); // Fortuner