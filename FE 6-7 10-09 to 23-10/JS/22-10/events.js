// console.log("button clicked!!");
// get div element with class name as 'box'
let div1Element = document.querySelector(".box");

// add bg-red class name to div1Element through click event
// div1Element.classList.add("bg-red");

// select change color button
let clrBtn = document.querySelector("#chg-clr");
// add onclick event to above clrBtn
// clrBtn.onclick = () => {
//     if(div1Element.classList.contains("bg-red")) {
//         div1Element.classList.remove("bg-red");
//     } else {
//         div1Element.classList.add("bg-red");
//     }
//     console.log('color changed!!');
// };
// following onclick event will override the previous event
// clrBtn.onclick = () => {
//     alert("Color button clicked!!");
// }

// Mouse events ---> click, dblclick, mousedown, mouseup, mouseover, mouseout
// adding events through eventListener
function changeClr() {
    if(div1Element.classList.contains("bg-red")) {
        div1Element.classList.remove("bg-red");
    } else {
        div1Element.classList.add("bg-red");
    }
    console.log('color changed!!');
}
clrBtn.addEventListener("click", changeClr);

function alertFun() {
    alert("Color button clicked!!");
}
clrBtn.addEventListener("click", alertFun);

clrBtn.removeEventListener("click", alertFun);

// write mourseover event on div element
div1Element.addEventListener("mouseover", () => {
    console.log("Mouse cursor inside the div..");
});

div1Element.addEventListener("mouseout", () => {
    console.log("Mouse cursor outside the div..");
});

// Keyboard events ---> keydown, keyup, keypress
let inputElement = document.querySelector("#name-input");
console.log(inputElement);
// inputElement.addEventListener("keydown", (e) => {
//     console.log(e.key);
// });

// inputElement.addEventListener("input", (e) => {
//     console.log(e.data);
// });

inputElement.addEventListener("change", (e) => {
    console.log(e.target.value);
});