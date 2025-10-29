// Variables using var, let and const
// var -> It has global scope and supports hoisting
var a = 15;
// update this variable inside block
{
   // redeclare
   var a = 20;
   // reassign
   a = 35;
}
console.log(a); // 35

// let -> It has block scope and it cannot be redeclared
let b = 15.4;

{
    // reassign
    // b = 16.8;
    // redeclare
    let b = 20;
    console.log(b); // 20
}
console.log(b); // 16.8

// const -> It has block scope and it cannot be redeclare and reassign
const PI = 3.14;
// reassign (can't)
// PI = 5.68;
console.log(PI);


// Data types
// Number
let age = 20;
let length = 15;

console.log(typeof length); // Number

// String - collection of characters
let instituteName = "Datapro";
let location = 'Dwarakanagar';
let city = `vizag`; // String Interpolation
console.log("I'm learning JS in " + instituteName + " at " + location);
console.log(`I'm learning JS in ${instituteName} at ${location}`);

console.log(typeof city); // string

// Boolean
let isStudent = true;

// undefined
let z;
console.log(z); // undefined

// null
let xyz = null;
console.log(xyz);
