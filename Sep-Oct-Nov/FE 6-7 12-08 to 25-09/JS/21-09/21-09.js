let btn1 = document.querySelector("#btn1");

// btn1.onclick = () => {
//     console.log("first click");
// }

// btn1.onclick = () => {
//     console.log("second click");
// }

// event listeners
btn1.addEventListener("click", ()=>{
    console.log("first click");
});

let secondEvent = () => {
    console.log("second click");
}

btn1.addEventListener("click", secondEvent);

btn1.addEventListener("click", ()=> {
    console.log("third click");
});

// remove event listener
btn1.removeEventListener("click", secondEvent);

// let num = Math.round(Math.random() * 100);
// let guess = prompt("Guess the number");

// while(true){
//     if(num == guess) {
//         console.log("You won the game");
//         break;
//     }
//     else {
//         num = prompt("Sorry, guess again");
//     }
// }

let btnEvent1 = (e) => {
    console.log(e);
}

let b1 = document.querySelector("#b1");
let b2 = document.querySelector("#b2");
let b3 = document.querySelector("#b3");

b1.addEventListener("click", btnEvent1);
b2.addEventListener("click", btnEvent1);
b3.addEventListener("click", btnEvent1);

let form1 = document.querySelector("#form1");
let div1 = document.querySelector("#div1");
let input1 = document.querySelector("#name");

form1.addEventListener("submit", (e)=>{
    e.preventDefault();
    let p1 = document.createElement("p");
    p1.innerText = input1.value;
    input1.value = "";

    div1.append(p1);
});