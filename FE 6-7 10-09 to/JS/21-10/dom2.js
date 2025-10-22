// selecting element object using querySelector methods
// document.querySelector("#id_value");
// document.querySelectorAll("tagName");
// document.querySelectorAll(".class_name");

let para1Element = document.querySelector("#para1");
console.dir(para1Element);

// Attributes manipulation --> adding, updating and removing
// adding red-clr class to para1 element
// para1Element.setAttribute("class", "red-clr");

// getting value of title attribute
let val1 = para1Element.getAttribute("title");
console.log(val1);

// removing attribute
// para1Element.removeAttribute("class");

// adding another class name
// para1Element.setAttribute("class", "bg-ylw");


// for adding multiple class names we should use "classList"
para1Element.classList.add("red-clr");
para1Element.classList.add("bg-ylw");
// remove red-clr class name
para1Element.classList.remove("red-clr");


// manipulating style attribute
// para1Element.setAttribute("style", "font-size: 20px;");
para1Element.style.fontSize = "20px";


// Creating new element and adding to html document
let tableElement = document.createElement("table");

let row1 = document.createElement("tr");
let heading1 = document.createElement("th");
heading1.innerText = "Id";
let heading2 = document.createElement("th");
heading2.innerText = "Name";
// add both headings into row1
row1.append(heading1);
row1.appendChild(heading2);

let row2 = document.createElement("tr");
let data1 = document.createElement("td");
data1.innerText = "101";
let data2 = document.createElement("td");
data2.innerText = "John";
// add both data elements to row2
row2.append(data1);
row2.append(data2);

// prepend(data2) then prepend(data1)

// add both the rows to table
tableElement.append(row1);
tableElement.append(row2);

console.log(tableElement);

// adding table element into html document after para1 element
para1Element.after(tableElement);

// before() ---> adds element before to that.