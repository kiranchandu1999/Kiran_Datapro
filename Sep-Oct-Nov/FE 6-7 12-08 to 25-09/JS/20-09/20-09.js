let div1 = document.querySelector("#div1");

// div1.className = "bg1";
// div1.className = "dim";

div1.classList.add("bg1");
div1.classList.add("dim");
// div1.classList.remove("bg1");

let para = document.createElement("p");
para.innerText = "Hello";
para.style.color = "white";
div1.append(para);
// para.remove();
// div1.removeChild(para);


// EVENTS in JS
// mouse ()
// keyboard

let btn1 = document.querySelector("#btn1");
let btn2 = document.querySelector("#btn2");

btn1.onclick = () => {
    if(div1.classList.contains("bg1")){
        div1.classList.remove("bg1");
        div1.classList.add("bg2");
        btn1.innerText = "red";
    }
    else {
        div1.classList.remove("bg2");
        div1.classList.add("bg1");
        btn1.innerText = "blue";
    }
}

// btn1.onmousedown = () => {
//     div1.classList.remove("bg1");
//     div1.classList.add("bg2");
// }

// btn1.onmouseup = () => {
//     div1.classList.remove("bg2");
//     div1.classList.add("bg1");
// }

div1.onmouseover = () => {
    div1.classList.remove("bg1");
    div1.classList.add("bg2");
}

div1.onmouseout = () => {
    div1.classList.remove("bg2");
    div1.classList.add("bg1");
}

btn2.onclick = () => {
    document.body.style.backgroundColor = "black";
    document.body.style.color = "white";
}

let input1 = document.querySelector("#nameInput");
input1.onchange = () => {
    console.log(input1.value);
    input1.value = "";
}