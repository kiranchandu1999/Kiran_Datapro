// Loops (to execute repetitive work)
// for loop, while and do-while

for(let i=1; i<=5; i++) {
    console.log("Count: ", i);
}

let x = 1;
while(x <= 5) {
    console.log("While loop: ", x);
    x++;
}

x = 1;
do {
    console.log("Do-while: ", x);
    x++;
} while(x <= 5);


/*
*
* *
* * *
* * * *
* * * * *
*/

for(let r=1; r<=5; r++) {
    for(let c=1; c<=r; c++) {
        process.stdout.write("* ");
    }
    process.stdout.write("\n");
}