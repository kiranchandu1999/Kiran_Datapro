// function
// It is a set of statements which can be declared once and reuse as many times as we want.

// declaration
function greet() {
    // function body
    console.log("Hello student!");
}

// function calling
greet();

// function with parameters
function greet(student) {
    console.log("Hello " + student);
}

greet("John"); // Hello John


// function with return statement
function multiply(n1, n2) {
    return n1 * n2;
}

console.log(multiply(10, 5));


// function with default parameter
function add(n1, n2 = 0) {
    console.log("Sum: " + (n1 + n2));
}

add(20, 25, 50);


// function with rest parameters
function sum(...nums) {
    let sum = 0;
    for(let n of nums) {
        sum += n;
    }
    return sum;
}

console.log(sum(10, 20, 50));


// anonymous function or function expression
let printHello = function() {
    console.log("Hello is printing..");
};

printHello();


// ES6 - Arrow function
let showData = () => {
    console.log("Showing data...");
};

showData();


// Strings
// Collection of characters
let s1 = "Hello";
let s2 = "World";

console.log(s1.length);

console.log(s1.toUpperCase()); // HELLO
console.log(s2.toLowerCase()); // world
console.log(s1.charAt(2)); // l
console.log(s2.indexOf("r")); // 2

console.log("Hello World".substring(6, 11));
console.log("Hello World".slice(-5));