const clk_btn = document.getElementById("clk-btn");

// adding onclick attribute
// clk_btn.onclick = () => {
//     console.log('Clicked!!!');
// };

// I want to add background color yellow for this button when I clicked
// clk_btn.onclick = () => {
//     // new functinality
//     clk_btn.style.backgroundColor = 'yellow';
// }
// old click event functionality got over written
// To overcome this drawback we need to use event listeners

// node.addEventListener('event_name', 'fucntion');
let log_fun = () => {
    console.log("Clicked!!");
};
clk_btn.addEventListener('click', log_fun);

let bg_yl_fun = () => {
    clk_btn.style.backgroundColor = 'yellow';
};
clk_btn.addEventListener('click', bg_yl_fun);

// removing logging functionality from click event
// clk_btn.removeEventListener('click', log_fun);

// Mouse events --> click, dblclick, mouseover, mouseout, mousedown, mouseup
const box_ele = document.querySelector("#box");

box_ele.addEventListener('mouseover', () => {
    box_ele.style.backgroundColor = 'yellow';
});

box_ele.addEventListener('mouseout', () => {
    box_ele.style.backgroundColor = 'red';
});

// Keyboard events -> keypress, keydown, keyup
const inp_ele = document.querySelector("#inp");

// inp_ele.addEventListener('keydown', () => {
//     console.log("Down");
// });
// inp_ele.addEventListener('keyup', () => {
//     console.log("Up");
// });

// inp_ele.addEventListener('keypress', (event) => {
//     // print the pressed key value
//     console.log(event.key);
// });


// Input events --> input, change
inp_ele.addEventListener('input', (e) => {
    console.log(e.data);
});

inp_ele.addEventListener('change', (e) => {
    console.log(e.target.value);
});
