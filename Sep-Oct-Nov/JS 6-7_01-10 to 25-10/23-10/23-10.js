// $(document).ready(() => {
//     $("button").click(() => {
//         $("")
//     })
// });

let ip1 = $("#ip1");
ip1.focus(() => {
    ip1.css("background-color", "yellow");
})

ip1.blur(() => {
    ip1.css("background-color", "white");
})

let btn1 = $("#btn1");
// let btn2 = $("#btn2");
let para1 = $("p");
let body = $("body");

btn1.click(() => {
    if(btn1.text() == "dark mode") {
        btn1.text("light mode");
        body.css({"background-color": "black", "color": "white"});
    }
    else {
        btn1.text("dark mode");
        body.css({"background-color": "white", "color": "black"});
    }
    
})

// btn2.click(() => {
//     para1.show();
// })