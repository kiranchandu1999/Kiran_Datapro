// function is a block of reusable code which will execute a particular task when we called

// syntax:
/*
function fun_name(parameters) {
    // function body
}
parameters are nothing but inputs for this function call and these are optional
*/

// simple function
// create a function to greet like 'Hello World!'
// function definition
function greet() {
    console.log("Hello World!");
}

// function calling
greet();


// function with inputs
// create a function for telling new year wishes to given name
function wish_newyear(name) {
    console.log(`Happy New year 2026 to ${name}`);
}

// function_name(arguments)
wish_newyear("kiran");
wish_newyear(); // name will be undefined here


// function with return statement
// create a function to add two numbers and return their sum
function addition(n1, n2) {
    let sum = n1 + n2;
    return sum;
}

let res = addition(5, 8);
console.log(`Sum is: ${res}`);

console.log(addition(10)); // NAN


// function with default parameters
// create a function to calculate net salary (inputs: basic, hra, pf)
// net salary = basic+hra-pf
function calc_salary(basic, hra=0, pf=0) {
    let net_salary = basic + hra - pf;
    return net_salary;
}

console.log(`Net salary is: ${calc_salary(5000, 2000, 1000)}`); // 6000
console.log(`Net salary is: ${calc_salary(3000)}`); // 3000


// function with rest parameters (...variable_name)
// create a function to muliply given numbers
function multiply(...nums) {
    let product = 1;
    for(let x of nums) {
        product *= x;
    }
    console.log(`Product is: ${product}`);
}

multiply(5, 2, 4); // 40
multiply(3, 2, 1, 4); // 24
