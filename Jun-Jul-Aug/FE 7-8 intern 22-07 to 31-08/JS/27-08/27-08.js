let div1 = document.querySelector("#div1");
console.dir(div1);

let div2 = document.querySelector("#div2");
// div2.innerHTML = "<img >";

let img1 = document.createElement("img");

// console.dir(div2.childNodes[0]);
// let img1 = div2.childNodes[0];
img1.src = "https://media.istockphoto.com/id/1888905382/photo/open-laptop-with-black-screen-against-black-background.webp?b=1&s=612x612&w=0&k=20&c=glJ7hr_gVysmOyRWOWTflny6vwNthn5BpmtPfmMpohc=";

// img1.className = "img1";
// img1.style = "width: 100px;";

img1.classList.add("img1", "img2");

let obj = div2.appendChild(img1);

let para1 = document.createElement("p");
para1.innerText = "new para";

console.dir(div2);

div2.appendChild(para1);

// div2.removeChild(img1);

let input1 = document.querySelector("#in1");
input1.type = "password";
input1.placeholder = "Enter password";

