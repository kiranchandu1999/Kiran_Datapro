// to get the elements
// getElementsByTagName()
// getElementsByClassName()
// getElementById()

let head2 = document.getElementsByTagName("h2");
console.dir(head2[0]);
head2[0].innerText = "Heading 123";
// head2[0].innerHTML = "<i>Heading 123</i>";

let paras = document.getElementsByClassName("para1");

let head3 = document.getElementById("heading1");

// queryselectors
let head4 = document.querySelector(".para1");
let heads = document.querySelectorAll("#heading1");
console.log(heads[0]);

// elements content
// innerText
// innerHTML
// textContent

let div1 = document.querySelector("#div1");
// div1.innerHTML = "<input type='text'>";

// to create html element
let innerDiv = document.createElement("div");
let label = document.createElement("label");
let input = document.createElement("input");

// set the attributes
// input.setAttribute("type", "text");
input.type = "password";
label.innerText = "FullName:";

// to add child elements into any html element
// append() // add at last inside the element
// prepend() // adds the element at first inside the main element
// after() // adds after the element
// before() // adds before the element

innerDiv.append(label);
innerDiv.append(document.createElement("br"));
innerDiv.append(input);

div1.append(innerDiv);