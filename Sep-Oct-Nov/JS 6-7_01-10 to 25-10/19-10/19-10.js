let hd1 = document.querySelector("h2");

console.log(hd1.innerText);
console.log(hd1.innerHTML);
console.log(hd1.textContent);

hd1.innerText = hd1.innerText + " extra adding";
hd1.innerHTML = "New h2 <i>heading</i> content";

// html object properties
console.log(hd1.getAttribute("id"));
hd1.setAttribute("id", "newH1");

console.log(hd1.id);
hd1.id = "newH2";

console.log(hd1.className);

// hd1.style.color = "blue";
// hd1.style.backgroundColor = "orange";

// hd1.className = "cls1 cls2"; // wrong way
hd1.className = "cls1";

hd1.classList.add("cls2");
hd1.classList.remove("cls2");

let image = document.querySelector("img");
image.src = "https://img.freepik.com/free-photo/person-working-laptop-desk_9975-24478.jpg";
image.width = "100";

let head4 = document.createElement("h4");
head4.innerText = "JS created h4 element";
head4.className = "cls1";

let body = document.body;

// for adding html elements
// prepend, append, before and after
// body.prepend(head4);
body.append(head4);
body.appendChild(head4);