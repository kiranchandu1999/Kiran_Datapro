let div1 = document.querySelector("#mouseDiv");

div1.addEventListener("mouseover", () => {
    div1.innerText = "Thank you";
});

div1.addEventListener("mouseout", () => {
    div1.innerText = "Mouse over me";
})

// exercise 2
let input = document.querySelector("#inputBox");
let content = document.querySelector("#values");

input.addEventListener("change", (e) => {
    input.value = e.target.value.toUpperCase();
    content.innerText = input.value;
});

input.addEventListener("input", (e) => {
    content.innerText = e.target.value;
})

// bulb on/off exercise
let bulb = document.querySelector("#bulb");

let onBtn = document.querySelector("#onBtn");
let offBtn = document.querySelector("#offBtn");

onBtn.onclick = () => {
    bulb.src = "https://www.w3schools.com/js/pic_bulbon.gif";
}

offBtn.onclick = () => {
    bulb.src = "https://www.w3schools.com/js/pic_bulboff.gif";
}