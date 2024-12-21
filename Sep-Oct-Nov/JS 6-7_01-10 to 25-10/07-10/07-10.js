// conditional statements
// if, else, else if, switch

let age = 15;

if(age >= 18) {
    // if block body
    console.log("Voter can vote");
}
else {
    console.log("Voter cannot vote");
}

// if else if ladder

let a = 10, b = 8, c = 12;

if(a > b && a > c) {
    console.log("a is bigger");
}
else if (b > a && b > c) {
    console.log("b is bigger");
}
else {
    console.log("c is bigger");
}

// -----------------

if(a > b) {
    if(a > c) {
        console.log("a is bigger");
    }
    else {
        console.log("c is bigger");
    }
}
else if(b > c) {
    console.log("b is bigger");
}
else {
    console.log("c is bigger");
}

// switch case

let day = 4;

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
    default:
        console.log("Saturday");
}

// loops
// for loop, while loop and do while loop

for(let i=1; i<=10; i++) {
    console.log(i);
}

// while loop
let i = 11;

while(i <= 10) {
    console.log(`while loop ${i}`);
    i++;
}

// do while loop
let j = 11;

do {
    console.log(`do-while loop ${j}`);
    j++;
} while(j <= 10);


let val = 5;

console.log(++val);
console.log(val);


