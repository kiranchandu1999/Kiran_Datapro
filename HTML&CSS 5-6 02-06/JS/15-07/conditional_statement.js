// conditional statements
// if, if else, else if and switch

let temp = 30;

if(temp >= 30) {
    console.log("It's hot weather..");
}
else {
    console.log("It's cool weather");
}

// Calculate grade for given score
// A(90-100), B(70-89), C(50-69), D(35-49), F(<35)

// let score = prompt("Enter score");
// let state = confirm("Is this correct score?");

// if(!state) {
//     score = prompt("Enter correct score");
// }

// if(score >= 90) {
//     console.log("Grade-A");
// }
// else if(score < 90 && score >= 70) {
//     console.log("Grade-B");
//     // alert("Grade-B");
// }
// else if(score < 70 && score >= 50) {
//     console.log("Grade-C");
// }
// else if(score < 50 && score >= 35) {
//     console.log("Grade-D");
// }
// else {
//     console.log("Fail..");
// }


let day = 3;

switch(day) {
    case 1:
        console.log("Sunday..");
        break;
    case 2:
        console.log("Monday..");
        break;
    case 3:
        console.log("Tuesday..");
        break;
    case 4:
        console.log("Wednesday..");
        break;
    case 5:
        console.log("Thursday..");
        break;
    default:
        console.log("Not a valid day..")
}