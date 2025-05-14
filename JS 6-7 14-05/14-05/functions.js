// single line comment
/*
multi line comments
*/

// create function for greeting
function greet() {
    console.log("Hello, How are you?");
}

function countNumbers() {
    console.log("One");
    console.log("Two");
    console.log("Three");
    console.log("Four");
}

// calling function
greet();

countNumbers();

// function with inputs
// adding 2 numbers
function add(a, b) {
    console.log(a + b);
}

add(10, 20);

add(50, 70);

// funtion with return statement
function multiply(n1, n2) {
    return n1 * n2;
}

console.log(multiply(3, 5));


// funtion expression
// we can store a funtion inside a variable then it is called function expression
let displayName = function(name) {
    console.log("Hello " + name);
};

displayName("Navadeep");


// arrow function
let subtract = (num1, num2) => {
    return num1 - num2;
}

console.log(subtract(5, 3));