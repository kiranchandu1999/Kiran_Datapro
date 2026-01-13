// Nested loops
/*
#
# #
# # #
# # # #
# # # # #
*/


// outer loop
for(let i=1; i<=5; i++) {
    let line = "";
    // inner loop for printing line of '#'s
    for(let j=1; j<=i; j++) {
        line = line + "# ";
    }
    console.log(line);
}


/*
1
2 3
4 5 6
7 8 9 10
*/

let counter = 1;
for(let i=1; i<=4; i++) {
    let line = "";
    // inner loop for printing numbers line
    for(let j=1; j<=i; j++) {
        line = line + counter + " ";
        counter++;
    }
    console.log(line);
}


/*
      *
    * *
  * * *
* * * *
*/

for(let i=1; i<=4; i++) {
    let line = "";
    // spaces for loop
    for(let j=1; j<=(4-i); j++) {
        line = line + "  ";
    }
    // stars for loop
    for(let j=1; j<=i; j++) {
        line = line + "* ";
    }
    console.log(line);
}

/*
* * * *
*     *
*     *
* * * *
*/
let n = 4;
for(let i=1; i<=n; i++) {
    let line = "";
    if(i == 1 || i == n) {
        for(let j=1; j<=n; j++) {
            line = line + "* ";
        }
    }
    else {
        line = "* ";
        // spaces
        for(let j=1; j<=(n-2); j++) {
            line = line + "  ";
        }
        line = line + "* ";
    }
    console.log(line);
}