// Function --> Block of reusable code, will be executed whenever it is called.
/* 
function fun_name(inputs) {
 function body
}
*/

// Simple function
function greet() {
    console.log("Hello!!!");
}

greet(); // Hello!!!

// function with parameters (inputs)
function add(n1, n2) {
    console.log("Addition: " + (n1+n2));
}
add(8, 5); // 13
add(10, 5); // 15

// function with return statement
function multiply(n1, n2) {
    console.log("Multiplying...");
    return n1 * n2;
}
console.log("Multiplication: " + multiply(3, 6));

// function with default params
function hello(name = "User") {
    console.log("Hello " + name);
}
hello('kiran');

// function with rest parameters
function print(...nums) {
    console.log(`Numbers: ${nums}`);
}
print(5, 8, 9, 10, 15);

// function expression (anonymous function)
let divide = function (a, b) {
    console.log("Reminder: " + (a%b));
}
divide(10, 3);

function callBack(f) {
    f(5, 8);
}
callBack(divide);

// Arrow function
let show = grade => console.log("My Grade is: " + grade);
show("A");

// Strings and It's methods
// String --> collection of characters starts with index '0'
// Method --> When a function linked with an object then it's called method
let str = "   Hello Javascript!  ";
let str2 = str.trim(); // Hello Javascript!
console.log(str2.charAt(4));; // o
console.log(str.toUpperCase()); // HELLO JAVASCRIPT!
console.log(str2.toLowerCase()); // hello javascript!
console.log(str2.startsWith("Hel")); // true
console.log(str2.endsWith("! ")); // false
console.log(str2.substring(1, 3)); // el
console.log(str2.slice(-4, -1)); // ipt
console.log(str2.length); // 

let atmNo = "5689";
console.log(atmNo.padStart(16, "X")); // XXXXXXXXXXXX5689
