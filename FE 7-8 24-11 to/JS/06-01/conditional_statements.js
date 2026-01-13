// Conditional statements are used to control the execution flow of a program
// based on given conditions

// if statement example:
// if(condition) {
    // block of code
// }

// calculate the final product price after discount(if person has membership)
// discount 10% for membership users
let has_membership = true;
let price = 100;

if(has_membership) {
    discount = price * 0.1;
    price = price - discount;
}

console.log(`Final price is: ${price}`);


// if-else example:
// Even or Odd
let num = 15;

if(num%2 == 0) {
    console.log(`Given number ${num} is Even`);
}
else {
    console.log(`Given number ${num} is Odd`);
}


// if-else if example:
// when we have multiple conditions to check
// print Grade based on achieved score
// Grade-A(>90) Grade-B(81-90) Grade-C(61-80) Grade-D(35-60) Fail(<35)
let marks = 85;
let grade = "No Grade";

if(marks > 90) {
    grade = "Grade-A";
}
else if(marks > 80) {
    grade = "Grade-B";
}
else if(marks > 60) {
    grade = "Grade-C";
}
else if(marks >= 35) {
    grade = "Grade-D";
}
else {
    console.log("You failed in this exam!!!");
}

console.log(`Your grade is ${grade}`);


// switch case:
// It is used to check multiple equating conditions same as if else if ladder
// switch(expression) {
    // cases
// }

// print weekday according to given day number like 1-Sunday, 2-Monday,...
let day = 3;

switch(day) {
    case 1:
        console.log("Sunday");
        break;
    case 2:
        console.log("Monday");
        break;
    case 3:
        console.log("Tuesday");
        break;
    case 4:
        console.log("Wednesday");
        break;
    case 5:
        console.log("Thursday");
        break;
    default:
        console.log("Not a weekday");
}

// ternary operator:
// It's an operator which replicates if else
// syntax: condition ? true_expression : false_expression;

// Even or Odd using ternary operator
let num2 = 26;

num2%2 == 0 ? console.log("It's Even") : console.log("It's Odd");

let val = num2%2 == 0 ? "It's Even" : "It's Odd";
console.log(val);
