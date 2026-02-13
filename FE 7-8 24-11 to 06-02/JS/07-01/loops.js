// Loops are used to execute a set of statemenets repeatedly for defined number of times or based on some condition
// Types of loops:
// for loop: it is used when we know no. of iterations
/*
syntax:
for(initialization; condition; updating) {
    // loop body
}
*/
// print 'Javascript' 10 times
for(let i=1; i<=10; i++) {
    console.log("Javascript");
}
// Execution flow: initialization->condition->execution->updating->condtion->....


// print numbers from 11 to 25 which are divisible by 3
for(let i=11; i<=25; i++) {
    if(i%3 == 0) {
        console.log(i);
    }
}


// while loop: It will be executed based on some stopping condition (not based on no of iterations)
/*
syntax:
// initialization
while(condition) {
    // loop body
    // updating
}
*/
// print first 10 numbers
let n = 1;
while(n <= 10) {
    console.log(n);
    n++;
}

// Reverse the given number (Ex: 5486 -> 6845)
let num = 5486;
let digit = 0;
let result = 0;

while(num != 0) {
    digit = num%10;
    result = result*10 + digit;
    num = Math.floor(num/10);
}

console.log(`Result is: ${result}`);



// do-while loop: It will execute at least once irrespective of the given condition
/*
do{
    // loop body
} while(condition);
*/

let v1 = 11;

do {
    console.log(v1);
    v1++;
} while(v1 <= 10);