console.log(document);
// console.dir(document);

// Selecting html elements
// getElementsByTagName(tagName)
const h1Elems = document.getElementsByTagName("h1");
console.log(h1Elems);

// getElementsByClassName(className)
const headingElems = document.getElementsByClassName("heading");
console.log(headingElems);

// getElementById(id)
const headElem = document.getElementById("head");
console.dir(headElem);


// For changing element's content
// innerText --> to read or write of html element content as a plain text
// innerHTML --> to read or write of html element content as a html content
// textContent --> to read or write of html element hidden content

// Add following products into html document
const products = ["Mobile", "Laptop", "Keyboard"];

// select list element
// querySelector(css selector name) --> returns single element
// querySelectorAll(css selector nam) ---> returns collection of elements
let list = document.querySelector("#products");

for(let p of products) {
    list.innerHTML += `<li>${p}</li>`;
}

// add item and it's price into html table
const data = [
    {name: "Apple", price: 800},
    {name: "Avacado", price: 1500},
    {name: "Mango", price: 400}
]

let tbody = document.getElementById("table-data");

for(let obj of data) {
    if(obj.price >= 1000) {
        tbody.innerHTML += `<tr><td>${obj.name}</td><td><b>${obj.price}</b></td></tr>`;
    }
    else {
        tbody.innerHTML += `<tr><td>${obj.name}</td><td>${obj.price}</td></tr>`;
    }
}

console.dir(list);