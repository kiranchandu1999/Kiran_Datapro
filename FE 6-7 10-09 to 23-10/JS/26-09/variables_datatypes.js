// Variables using var, let and const
var a = 10;
var a = 15; // re-declare
a = 20; // re-update
console.log(a);

let i = 15.3;
i = 16;
console.log(i);

const x = 18;
// x = 19; // cannot re-update
// console.log(x);

// Data types
// Number

// String
let s1 = "Hello";
let s2 = 'World';
let s3 = `How are you`; // string interpolation
console.log('He said "where is my mobile"');
console.log("This program prints " + s1 + " " + s2 + " as ouput");
console.log(`This program prints ${s1} ${s2} as output`);

let isSummer = false;
let p = null;
let q;
console.log(p);
console.log(q);