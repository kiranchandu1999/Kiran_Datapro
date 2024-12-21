// console.log(document.body.children);

// to select html elements
let myHead1 = document.getElementById("head1");
let paras = document.getElementsByTagName("p");
let myClasses = document.getElementsByClassName("cls1");
// console.log(paras[0].innerText);
console.log(myClasses[1].innerText);

let myHead4 = document.querySelector("h4");
let myHeads = document.querySelectorAll("#head1");
console.log(myHead4);
console.log(myHeads);
console.log(myHeads[0].innerText);