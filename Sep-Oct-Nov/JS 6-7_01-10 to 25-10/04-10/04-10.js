// operators
// Arithmetic operators
// +, -, *, /, %

// assignment operators
let a = 5;
a += 2;

// comparision operators
// <, >, <=, >=, ==, !=, ===, !==
let b = 10;
let c = "10";
console.log(b === c);

// logical operators
// &&, ||, !
if("srinivs" && null) {
    console.log("true");
}

if(!null){
   console.log("next"); 
}

// bitwise operators
// &, |, ~, ^

// 00000101
console.log(5 ^ 1); // 101 & 001 ==> 100

// shift operators
// <<, >>

console.log(5 << 1); // 101 ---> 1010

// ternary operator
let age = 18;

if(age >= 18){
    console.log("can vote")
}
else {
    console.log("cannot vote");
}

age >= 18 ? console.log("can vote") : console.log("cannot vote");
