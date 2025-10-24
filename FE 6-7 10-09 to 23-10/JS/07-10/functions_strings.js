// Javascript functions
// Function is a set of statements which are write once and reuse as many times as we want.
// First we need to define function definition and it will be executed when we called.

// simple no parameterized function
function greet() {
    // function body
    console.log("Hello Datapro students!!!");
}
// calling the above defined function
greet();
greet();

// function with parameters
function greet2(name, age) {
    console.log("Hello ", name);
}
greet2("Ganesh"); // Hello Ganesh

// function with return statement
function multiply(n1, n2) {
    return n1*n2;
}
console.log(multiply(5, 4, 3));

// function with rest parameters
function printNums(...nums) {
    console.log("Numbers are: ", nums);
}
printNums(1, 2, 3);

// anonymous function (function without name)
let fun1 = function () {
    console.log("This is anonymous function!!!");
};
fun1();

// arrow function (New feature from ECMAScript 6)
let fun2 = () => {
    console.log("This is anonymous function!!!");
};


// When a function is defined in a class and it is called using object then it's called method.
// String methods in javascript
let s1 = "Datapro";
console.log(s1.toUpperCase()); // DATAPRO
console.log(s1); // Datapro (Strings are immutable so original value doesn't change)
console.log(s1.length); // 7
console.log(s1.charAt(3)); // prints 'a' which is at index 3
console.log(s1.slice(2, 5)); // 'tap'
// we can call slice method with negetive index values also
console.log(s1.slice(-6, -3)); // 'ata'

console.log(s1.substring(2, 5)); // 'tap'
let atmLast4Digits = "5689";
console.log(atmLast4Digits.padStart(16, "X")); // it will add 12 'X' at start before '5689'