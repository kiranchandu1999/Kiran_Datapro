// Operators ==> these are used to compute mathematical operations and value comparisons
// Arithmetic operators (+, -, *, /, %)
console.log(8 / 3); // 2.666
console.log(8 % 3); // 2

// Assignment operators (=, +=, -=, *=, /=, %=)
let n1 = 10;
n1 += 3;
console.log(n1);

// Relational operators (==, ===, <, >, <=, >=, !=)
let s1 = "Hello";
let s2 = 'Hello';
console.log(s1 == s2); // true
let a = 5, b = '5';
console.log(a == b); // true
console.log(a === b); // false

// Logical operators (&&, ||, !)
let c = 8;
console.log((a > 0) && (a < c)); // true
console.log((a > 0) || (a > c)); // true


// Conditional statements
// if else ==> It's used to execute statements based on conditions
// find the biggest number among the following numbers
let x1 = 6, x2 = 9, x3 = 7;

if(x1 > x2) {
    if(x1 > x3) {
        console.log("X1 is bigger");
    }
    else {
        console.log("X3 is bigger");
    }
}
else {
    if(x2 > x3) {
        console.log("X2 is bigger");
    }
    else {
        console.log("X3 is bigger");
    }
}

// if else if ===> it is used to check multiple conditions
// calculate the Grade for given marks
let marks = prompt("Enter your marks..");

let opt = confirm("Is this marks correct?");
if(!opt) {
    marks = prompt("please enter correct marks..");
}

if(marks >= 90) {
    console.log("Grade-A");
}
else if(marks >= 75) {
    console.log("Grade-B");
}
else if(marks >= 50) {
    console.log("Grade-C");
}
else if(marks >= 35) {
    console.log("Grade-D");
}
else {
    alert("You failed in this subject!!!")
}
