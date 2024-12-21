// events
// mouse events
// keyboad events

// console.log("clicked");
let body = document.querySelector("body");
let btn1 = document.querySelector("#btn1");

let div1 = document.querySelector("#div1");
let form = document.querySelector("form");
let inp1 = document.querySelector("#fname");
let main1 = document.querySelector("#main1");
let main2 = document.querySelector("#main2");

btn1.onclick = (e) => {
    let val = e.target.innerText;
    // console.log("clicked");
    // console.log(e.target.innerText);
    // if(val == "click")
    //     e.target.innerText = "clicked";
    // else
    //     e.target.innerText = "click";

    if(val == "dark"){
        body.className = "dark";
        e.target.innerText = "light";
    }
    else {
        body.className = "light";
        e.target.innerText = "dark";
    }
};

div1.onmouseover = () => {
    div1.style.backgroundColor = "blueviolet";
}

div1.onmouseout = () => {
    div1.style.backgroundColor = "red";
}

let fname = "";

form.onsubmit = (e) => {
    e.preventDefault();
    fname = inp1.value;
    main1.style.display = "none";
    main2.innerHTML = `<h2>Form Submitted</h2> <p>Ented Name is ${fname}</p>`;
}

// btn1.onclick = () => {
//     alert("hello");
// }

// btn1.addEventListener("click", () => {
//     console.log("clicked");
// });

// btn1.addEventListener("click", () => {
//     alert("hello");
// })