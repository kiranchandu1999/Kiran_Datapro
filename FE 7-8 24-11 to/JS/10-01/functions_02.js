// Anonymous functions --> function without any name

let fun1 = function () {
    console.log("Printing Hello!");
};

console.log(fun1); // prints function definition
// function calling
fun1();


// Arrow function (ES6 features)
let add = (a, b) => {
    return a + b;
};

console.log(add(5, 3));

let show = data => console.log(data);
show("Datapro");


// Callback functions --> 
// when a function passed as an argument to another function then that passed function is called as callback

let div_fun = function (n1, n2) {
    console.log("Division started..");
    return n1 / n2;
}

function divide_base(f, a, b) {
    // compare a and b values
    if(a > b) {
        return f(a, b);
    }
    else {
        return f(b, a);
    }
}


// calling divide_base function
let x = 22, y = 5;
let res = divide_base(div_fun, y, x);
console.log(res);


// Recursion --> A function calling itself

// print sum of N natural numbers using recursion

function calc_sum(n) {
    // base condition
    if(n <= 1) {
        return n;
    }
    // function calling inside it
    return n + calc_sum(n-1);
}

console.log(calc_sum(5));

