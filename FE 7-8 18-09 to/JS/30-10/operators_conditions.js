// Operators
// Arithmetic operators (+, -, *, /, %, **, ++, --)
let a = 3;
let b = 2;
console.log("Additon: " + (a + b)); // Addition: 5
console.log("Exponential: " + (b ** a)); // Exponential: 8
b++;
console.log(b);

// Assignment operators (=, +=, -=, *=, /=)
// multiply a with 5 and store in a
// a = a * 5;
a *= 5;

// Comaprison operators (==, !=, <, <=, >, >=, ===, !==)
let x = 21;
let y = "21";
console.log(x == y); // true
console.log(x === y); // false (value is same but type not same)

// Logical operators (&& (AND), || (OR), ! (NOT))
console.log((x == y) && (x !== y)); // true


// Condtional statements
// if statment
let price = 100;
let isMember = false;
// if has a membership then provide discount of 5%
if(isMember) {
    // code block will be executed when condition is true
    let discount = price * 0.05;
    price -= discount;
}
console.log("Final price: " + price);

// if-else statement
let num = 15;
if(num % 2 == 0) {
    // even
    console.log("Even");
}
else {
    // odd
    console.log("Odd");
}

// if-else if-else
// find the grade for given marks
// A (above 90), B(81-90), C(71-80), D(51-70), Fail
let marks = 82;
let grade = "";
if(marks > 90) {
    grade = "A";
}
else if(marks > 80) {
    grade = "B";
}
else if(marks > 70) {
    grade = "C";
}
else if(marks > 50) {
    grade = "D";
}
else {
    grade = "Fail";
}

console.log("Grade is: " + grade);

// switch case
// find day from given number
let day = 5;
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
    case 6:
        console.log("Friday");
        break;
    case 7:
        console.log("Saturday");
        break;
    default:
        console.log("Not a valid day");
}


// Ternary operator ( ? :)
// find even or odd using ternary
let ans = (num%2 == 0) ? "Even" : "Odd";
console.log(ans);

let n1 = 5, n2 = 8, n3 = 6;
// find the greatest number
let greatest = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
console.log("Greatest num: " + greatest);