// change background color of div2 having id: clrDiv
let colorDiv = document.querySelector("#clrDiv");

let clrBtn = colorDiv.firstElementChild;

function random(number) {
    return Math.floor(Math.random() * number);
}

const randomColor = () => {
    const color = `rgb(${random(255)}, ${random(255)}, ${random(255)})`;
    console.log(color);
    colorDiv.style.backgroundColor = color;
};

// clrBtn.onclick = randomColor;

// enter any letter in text box and it'll be shown in div
let textBox = document.querySelector("#textBox");
let outputDiv = document.querySelector("#output");

textBox.onkeydown = (e) => {
    outputDiv.innerText = `you pressed key: ${e.key}`;
}

// events drawback: (events get override when we provide mutliple events on same object)
// we can use EventListeners to overcome the drawback of events
const fname = document.querySelector("#fname");
const lname = document.querySelector("#lname");
const form = document.querySelector("form");
const para = document.querySelector("p");

form.addEventListener("submit", (e) => {
    if(fname.value === "" || lname.value === "") {
        // to stop default behavior
        e.preventDefault();
        para.innerText = "Please fill both names...";
    }
});

// color change button using event handler
clrBtn.addEventListener("click", randomColor);
clrBtn.removeEventListener("click", randomColor);