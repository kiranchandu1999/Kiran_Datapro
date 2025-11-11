// select html elements
let clkBtn = document.getElementById("clk-btn");
// console.dir(clkBtn);
function logClkEvent() {
    console.log("Button clicked..");
}
// add above function to click event
// clkBtn.onclick = logClkEvent;

function makeYlwBg() {
    clkBtn.style.backgroundColor = "yellow";
}
// when we add this makeYlwBg function to click event then already existing click event will get overridden.
// clkBtn.onclick = makeYlwBg;

// To overcome this we can use EventListener
clkBtn.addEventListener("click", logClkEvent);
clkBtn.addEventListener("click", makeYlwBg);
// to remove existing event
clkBtn.removeEventListener("click", logClkEvent);

// Mouse events
let boxDiv = document.getElementById("box");
boxDiv.addEventListener("mouseover", () => {
    boxDiv.style.backgroundColor = "lightgreen";
});
boxDiv.addEventListener("mouseout", () => {
    boxDiv.style.backgroundColor = "lightgray";
});

// input events
let inputElem = document.getElementById("event-input");
inputElem.addEventListener("input", () => {
    console.log("input event triggered");
});
inputElem.addEventListener("change", () => {
    console.log("change event triggered");
});