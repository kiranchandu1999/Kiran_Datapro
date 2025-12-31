// Variable creation in javascript
// using 'var' keyword
// These variables can be redeclared, reupdated and hoisted as well. and it's global scoped
var a = 10; // declaring a variable
var a = 11; // re-declaring
a = 12; // reupdating
console.log(a); // 12

// hoisting
console.log(n1); // undefined
var n1 = 100;

// scope ---> it's an area under which a variable can be accssed.
var n2 = 45;
{
    var n2 = 50;
}
console.log(n2); // 50


// using 'let' keyword
// These variables cannot be redeclared but can be reupdated and it's block scoped
let b; // declaring
// let b = 21; // redeclaring not possible
b = 22; // updating
{
    let b = 15;
    console.log(b); // 15
    {
        let b = 18;
        console.log(b); // 15
    }
    console.log(b); // 15
}
console.log(b); // 22

// using 'const' keyword
// These variables cannot be redeclared and reupdated and it's a block scoped
const c = 30;
// const c = 31; // can't be redeclared
// c = 31; // can't be updated

console.log(c);