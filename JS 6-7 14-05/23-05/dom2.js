let heading1 = document.querySelector("#head1");
// accessing element attributes
console.log(heading1.getAttribute("id"));
console.log(heading1.getAttribute("name"));

let divElem1 = document.querySelector("#div1");
console.log(divElem1.getAttribute("class"));
// setAttribute method will override the existing class names
// divElem1.setAttribute("class", "myCls2");

// to add new class names to the existing ones
divElem1.classList.add("myCls2");
divElem1.classList.remove("myCls1");

// HTML elements creation, adding and removing
// create a h1 element with content and add at the top of html body
let topHead = document.createElement("h1");
topHead.innerText = "Top Heading!!!";

let body = document.querySelector("body");
// node.prepend() adds at top inside the node
// node.append() adds at bottom inside the node
body.prepend(topHead);
// divElem1.append(topHead);

// add a paragraph after h2 element
let para1 = document.createElement("p");
para1.innerText = "This is new para added through javascript";
// node.before() adds element before the node outside
// node.after() adds after the node outside
heading1.after(para1);

// remove the newly added para
// node.remove() - removes node from document
para1.remove();