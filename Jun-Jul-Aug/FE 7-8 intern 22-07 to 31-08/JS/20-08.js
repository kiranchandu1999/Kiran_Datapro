// var, let, const
//        redeclaration,   reinitialization
// var         1                1
// let         0                1
// const       0                0

var str1 = "Datapro";
var str2 = 'Institute';
var str3 = `Dwarakanagar`;

var str4 = 'A man says "Save the Trees"';

// console.log(`${str1} hello fadffg ${str2} ${str3}`);

console.log(str1.toUpperCase());

let age = 8;

if(age >= 18){
    console.log("Can vote");
}
else{
    console.log("Cannot vote");
}


// loops

// for(let i=1; i<=15; i++){
//     console.log("Ahmed");
// }

// let i = 6;
// while(i <= 5){
//     console.log("Ahmed");
//     i++;
// }

// do{
//     console.log("Ahmed");
//     i++; 
// }
// while(i <= 5)

let str5 = "ABCDEFG";

for(let i in str5){
    console.log(i);
}

for(let i of str5){
    console.log(i);
}





