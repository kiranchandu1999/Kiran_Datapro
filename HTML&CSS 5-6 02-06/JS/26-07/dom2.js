// Accessing DOM elements
let heading1 = document.querySelector("#hId1");
console.log(heading1.textContent);

// Attribute manipulation
console.log(heading1.getAttribute("id")); // hId1
heading1.setAttribute("class", "hClass1");
heading1.removeAttribute("class"); // removes the class attribute
let input1 = document.querySelector("#ip1");
input1.toggleAttribute("disabled");


// class attribute manipulation
let para1 = document.querySelector(".p-class");
// para1.setAttribute("class", "bg-yellow");
para1.classList.add("bg-yellow");
para1.classList.remove("p-class");
console.log(para1.classList);
console.log(para1.classList.contains("p-class")); // false


// style attribute manipulation (used for inline css)
heading1.style.color = 'green';
heading1.style.fontSize = '25px';


// creating elements, updating content and adding to DOM tree
let list1 = document.createElement('ul');
let item1 = document.createElement('li');
item1.textContent = "Red";
let item2 = document.createElement('li');
item2.textContent = "Blue";

list1.append(item1);
list1.appendChild(item2);
list1.setAttribute("id", "colors");

input1.after(list1);
let item3 = document.createElement('li');
item3.innerHTML = '<i>Green</i>';
list1.appendChild(item3);

// item2.remove(); // removes item2
list1.removeChild(item2);