let btn2 = document.querySelector("#btn2");
// btn2.onclick = function() {
//     console.log("Button 2 clicked");
// }
// if we add another event on same element, it'll override the previous event
// btn2.onclick = function() {
//     alert("Alert: Button 2 clicked");
// }

let alertFun = ()=> {
    alert("Alert: Button 2 clicked");
};
// To overcome this drawback, we should use EventListener
btn2.addEventListener("click", ()=> {
    console.log("Button2 clicked");
});

btn2.addEventListener("click", alertFun);

// We can remove existing events by using removeEventListener();
btn2.removeEventListener("click", alertFun);

// Mouse events
btn2.addEventListener("dblclick", ()=> {
    console.log("double clicked on button 2");
});

let div1 = document.querySelector("#box");
div1.addEventListener("mouseover", ()=> {
    console.log("Mouse hovered on div..");
});
div1.addEventListener("mouseout", ()=> {
    console.log("Mouse left from div..");
});
div1.addEventListener("mousedown", ()=> {
    console.log("Mouse button pressed on div");
});


// keyboard events
// Every event will generate an event object, it will contain information about element on which event triggered
let idInput = document.querySelector("#id-input");
idInput.addEventListener("keydown", (e)=> {
    console.log(`Key pressed on id input: ${e.key}`);
});


// form and input element events
let emailInput = document.querySelector("#email-input");
emailInput.addEventListener("input", ()=> {
    console.log("Input event triggered");
});
emailInput.addEventListener("change", (e)=> {
    console.log(e.target.value);
});
emailInput.addEventListener("focus", ()=> {
    console.log("Email input focused..");
});

let form = document.querySelector("#form");
form.addEventListener("submit", (e)=> {
    e.preventDefault(); // it will disables the default reload when form submitted
    console.log("Form submitted..");
});


// window events
window.addEventListener("resize", ()=> {
    console.log(`window resized to: ${window.innerWidth} x ${window.innerHeight}`);
});