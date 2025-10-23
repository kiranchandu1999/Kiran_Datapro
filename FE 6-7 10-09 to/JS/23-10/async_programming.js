// async programming --> executing program simultaneously
// callback function --> a function is passed as a paramter to another function.

function add(a, b) {
    console.log(a + b);
}

function fun(f) {
    f();
}

// callback function
fun(() => {
    add(5, 8);
});


// promises
let promise1 = new Promise((resolve, reject) => {
    let output = true;
    setTimeout(() => {
        if(output) {
            resolve("Success!!!");
        }
        else {
            reject("Failed!!!");
        }
    }, 2000);
});

// setTimeout(() => {
//     console.log("Time out function!!");
// }, 2000);

// console.log(promise1);

// async/await programming

function fetchData(id) {
    return new Promise((res, rej) => {
        setTimeout(() => {
            console.log("Data fetched for Id: " + id);
            res("Success!!");
        }, 2000);
    });
}

// we should use await inside async functions only
async function getAllData() {
    await fetchData(1);
    await fetchData(2);
    await fetchData(3);
}

getAllData();