// String methods
let str1 = "        hello, how are you      ";
let str2 = "world";
let atm = "4596";

console.log(str1.trim());

// console.log(str1.length);
// console.log(str1.charAt(2));
// console.log(str1.charCodeAt(1));
// console.log(str1.toUpperCase());
// console.log(str1.slice(-3));
// console.log(str1.substring(-3));
// console.log(str1.substr(7, 3));

// console.log(atm.padStart(16, 'x'));
// console.log(str1.split(" "));


// conditional statements ----------
let age = 24;

// if(age >= 18) {
//     console.log("Eligible for vote");
// }
// else {
//     console.log("Not eligible for vote");
// }

if(age < 18) {
    console.log("Childhood");
}
else if(age <= 50){
    console.log("Middle age");
}
else {
    console.log("Old age");
}

let day = 3;

switch(day){
    case 1:
        console.log("Sunday");
        break;
    case 2:
        console.log("Monday");
        break;
    case 3:
        console.log("Tuesday");
        break;
    case 4:
        console.log("Wednesday");
        break;
    default:
        console.log("No dayn");
}

// loops
let fname = "Murali Krisha";

for(let i=0; i<fname.length; i++) {
    console.log(fname.charAt(i));
}

let i = 0;
while(i < fname.length) {
    console.log(fname.charAt(i));
    i++;
}
