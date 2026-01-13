// Operators are used to do operational calculations on given operands.
// syntax: operand operator operand (5 + 3)

// Types of Operators
// Arithmetic operators (returns a value of Number data type)
// (addition +, subtraction -, multiplication *, division /, modulus %, power **)
let a = 5, b = 8;

console.log(`Addition of ${a} and ${b} is ${a+b}`);
console.log(`Multiplication of ${a} and ${b} is ${a*b}`);
console.log(`Division of ${a} and ${b} is ${b/a}`);
console.log(`Modulo of ${a} and ${b} is ${b%a}`);


// Assignment operators (used to assign some value to a variable)
// (=, +=, -=, *=, /=, %=)
let x = 15, y = 21;
// multiply x value with 2 and store the result again in x
// x = x * 2
x *= 2;
console.log(`x value after multiplication is: ${x}`);


// Comparison operators (used to compare two values and return boolean value as a result)
// (==, <, <=, >, >=, !=, ===, !==)
let n1 = 45, n2 = 9, n3 = "9";
// check whether both n1 and n2 value are equal
console.log(n1 == n2); // false
// compare n2 and n3 by value
console.log(n2 == n3); // true
console.log(n2 != n3); // false

// compare n2 and n3 by value and type also
console.log(n2 === n3); // false
console.log(n2 !== n3); // true

console.log(n1 >= n3); // true


// Logical operators (used on boolean operands to return a boolean result)
// (AND - &&), (OR - ||)
let x1 = 3, y1 = 8;
// define whether both the coordinates lies in positive quarter of the graph
let ans = (x1 > 0 && y1 > 0);
console.log(`Both co-ordinates lies in first quarter?: ${ans}`);

let num = 10;
// print whether given number is divisble by 3 or 5
let isDivisible = (num%3 == 0 || num%5 == 0);
console.log(`Number is divisible by either 3 or 5?: ${isDivisible}`);