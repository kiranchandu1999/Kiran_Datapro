// Array
// It's a kind of variable which can hold multiple values

// array declaration
const arr = [5, 1, "hello", true];
const cars = new Array();

// accessing elements
console.log(arr[2]); // hello

// assigning values to the array
arr[0] = "hi";

console.log(arr);


// array methods
// push -> adds elements at the end
cars.push("innova");
cars.push("baleno");
cars.push("comet");

// pop -> removes element from last
cars.pop();

// unshift -> adds element at the beginning
cars.unshift("Fortuner");

// shift -> removes element from start
cars.shift();

console.log(cars);


// searching methods
console.log(cars.indexOf("baleno")); // 1

console.log(cars.includes("comet")); // false


// sorting methods
const nums = [15, 10, 8, 16, 25, 12];
nums.sort();

console.log(nums);


// ES6+ -> methods
// let print = (n) => {
//     console.log("Number is " + n);
// };

// forEach() -> It is used to log the elements (non return functions)
nums.forEach((n) => {
    console.log("Number is " + n);
});


// map() -> when we want to modify the whole array
const doubleNums = nums.map(n => {
    return n * 2;
});
console.log(doubleNums);


// filter() -> when we want select some elements from array
const above30Nums = doubleNums.filter(x => x >= 30);
console.log(above30Nums);


// reduce() -> when we want to combine whole array into a single value
const marks = [90, 85, 63, 72, 80, 98];
let sum = marks.reduce((acc, n) => {
    return acc + n;
}, 0);
console.log("Total marks: " + sum);


// spread operator
const arr1 = [1, 3, 5, 7];
const arr2 = [2, 4, 6, 8];
// [1, 3, 5, 7, 2, 4, 6, 8]
// const mergedArr = [arr1, arr2];
const mergedArr = [...arr1, ...arr2];
console.log(mergedArr.length);

let str = "Datapro";
// const charArr = [...str];
const charArr = str.split('');
console.log(charArr);