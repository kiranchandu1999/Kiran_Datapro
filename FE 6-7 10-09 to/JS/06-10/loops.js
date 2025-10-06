// Loops ---> whenever need to execute set of statements repeatedly.
// for loop ---> It's used when we know iteration count
for(let i=1; i<=10; i++) {
    // loop body
    console.log("For loop count: ", i);
}

// while loop --> when we doesn't know the iteration count
// find the sum of digits in given number
let num = 586; // 5+8+6 = 19
let sum = 0, rem = 0;

// rem = num % 10; // 6
// sum += rem;
// num = Math.floor(num/10);

// rem = num % 10; // 8
// sum += rem;
// num = Math.floor(num/10);

// rem = num % 10; // 5
// sum += rem;
// num = Math.floor(num/10);

while(num != 0) {
    rem = num % 10; // 6
    sum += rem;
    num = Math.floor(num/10);
}
console.log("Final result: " + sum);