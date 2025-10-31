// Loops are used to execute set of statement (block) repeatedly
// For loop => used when we know on no.of iterations
// for(initialize; condition; inc/dec) {
// }

// print numbers from 1 to 10
for(let i=1; i<=10; ++i) {
    // loop body
    console.log(i);
}

// print 5th table upto 10
let t = 5;
for(let i=1; i<=10; i++) {
    console.log(`5 x ${i} = ${t*i}`);
}

// while loop => If we doesn't know no.of iterations
// Largest digit in a given number 
// Ex: 6843 --> ans 8
let num = 6843;
let largest = 0, digit = 0;

while(num != 0) {
    digit = num % 10; 
    if(digit > largest) {
        largest = digit;
    }
    num = Math.floor(num/10);
}
console.log(`Largest is: ${largest}`);


// do-while loop --> loop body executes atleast once even condition is false
let cnt = 15;
do{
    // loop body
    console.log("Count: " + cnt);
    cnt++;
} while(cnt < 10);


// Nested loop
// print following pattern
/* 
       1
      2 2 
    3 3 3
  4 4 4 4
5 5 5 5 5  
*/

let rows = 5;

for(let i=1; i<=rows; i++) {
    let str = "";
    // loop for adding spaces
    for(let j=1; j<=(rows-i); j++) {
        str += " ";
    }
    // loop for adding numbers
    for(let j=1; j<=i; j++) {
        str += i;
    }
    console.log(str);
}