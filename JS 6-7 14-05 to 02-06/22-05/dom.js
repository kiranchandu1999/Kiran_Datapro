// "document" is the root object for all html objects
console.log(document);
console.dir(document);

// html element selector methods
// getElementById("id"), getElementsByClassName("class"), getElementsByTagName("tag")
let heading = document.getElementById("head1");
console.log(heading.innerText);
console.log(heading.tagName);

// change heading as "DOM example" using js
heading.innerText = "DOM example";

// add some new text to the heading
heading.innerText = heading.innerText + " - Document Object Model";

let firstDiv = document.getElementById("div1");
console.log(firstDiv);

// apply background color as yellow
firstDiv.style.backgroundColor = "yellow";

let divElements = document.getElementsByClassName("div-class1");
divElements[1].style.backgroundColor = "green";

let tagElements = document.getElementsByTagName("div");
// console.log(tagElements[0]);
// console.log(tagElements[1]);
// console.log(tagElements[2]);
tagElements[1].style.border = "1px solid red";

// make third div element content as italic
tagElements[2].innerHTML = "<i>para tag 3 in italic</i>";


// we can use querySelector method also
// querySelector("id"), querySelectorAll("class or tag")
// select "head1" id element
let myHead1 = document.querySelector("#head1");
console.log(myHead1);

// select elements having class name as "div-class1"
let divClassElements = document.querySelectorAll(".div-class1");
console.log(divClassElements[0]);
console.log(divClassElements[1]);