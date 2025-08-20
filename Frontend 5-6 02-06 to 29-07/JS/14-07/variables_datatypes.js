// variables
// var - It can be re-declare, re-update
var a = 10;
var a = 20;
a = 30;

// let - It can only be re-update
let x = 15;
// let x = 20; 
x = 25;

// const - It cannot be re-declare, re-update
const pi = 3.14;
// const pi = 3.26;
// pi = 5.68;

console.log(a);
console.log(typeof a);

// data types
// number
let num = 50;

// string
let fruit1 = "Apple";
let fruit2 = 'Orange';
let fruit3 = `Kiwi`;
console.log("My favorite fruit is: " + fruit1 + " and it is in red color");
console.log("My favorite fruit is: ",fruit1," and it is in red color");
console.log(`My favorite fruit is ${fruit2} and it is in red color`);

// boolean
let isSummer = true;

// null and undefined
let value = null;
let j;
console.log(value, j);


// operators
// Arithmetic (+, -, *, /, %)
let n1 = 5 / 2;
let n2 = 5 % 2;
console.log(n1, n2);

// Assignment operators (=, +=, -=)
n1 += 5;

// comparison operators (==, ===, !=, !==, >, <, >=, <=)
console.log(5 == '5');
console.log(5 === '5');

// Logical operators (&&, ||)
console.log((5 == '5') && (5 !== '5'));