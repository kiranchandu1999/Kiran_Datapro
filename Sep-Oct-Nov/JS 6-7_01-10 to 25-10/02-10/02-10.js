console.log("Hello world");

// data types
// Number
// String
// boolean
// null
// undefined
// BigInt
// Symbol

a = 10;

// variable declaration keywords
// these keywords will define the scope of the variables
// var - global scope
// can re-declare, re-update
var b = "datapro";
var b = 10;
b = 25;

// let - block scope {    }
// cannot re-declare but can re-update
let id = 101;
id = 102;

// const - block scope
// cannot re-declare, re-update
// const pi = 3.14;
// pi = 3.147;

let abc = 10;

if(true) {
    let abc = 20;
    console.log(abc);
}

console.log(abc);