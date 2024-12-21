let btn1 = document.querySelector("#btn1");

// btn1.onclick = () => {
//     console.log("first click");
// }

// btn1.onclick = () => {
//     console.log("second click");
// }

let secFun = () => {
    console.log("second click");
};

btn1.addEventListener("click", () => {
    console.log("first click");
});

btn1.addEventListener("click", secFun);

btn1.addEventListener("click", () => {
    console.log("third click");
});

btn1.removeEventListener("click", secFun);

let form = document.querySelector("form");
let inp1 = document.querySelector("#id1");

form.onsubmit = (e) => {
    e.preventDefault();
    console.log(inp1.value);
}

inp1.onchange = () => {
    console.log("changed");
}

// callbacks, promises and async-await

// callbacks
// function getData(a, callBack) {
//     setTimeout(() => {
//         console.log(a);
//         if(callBack) {
//             callBack();
//         }
//     }, 2000);
// }

// getData(1, ()=> {
//     getData(2, ()=> {
//         getData(3);
//     });
// });

// promises
// function getData(a) {
//     return new Promise((res, rej) => {
//         setTimeout(() => {
//             console.log(a);
//             res(console.log("Success"));
//         }, 2000);
//         // rej(console.log("Error")); when failure occured
//     })
// }

// getData(1).then(() => {
//     getData(2).then(() => {
//         getData(3).then(() => {
//             getData(4);
//         })
//     })
// })

// async - await
function getData(a) {
    return new Promise((res, rej) => {
        setTimeout(() => {
            console.log(a);
            res("Success");
        }, 2000);
    })
}

async function getAllData() {
    await getData(1);
    await getData(2);
    await getData(3);
}

getAllData();