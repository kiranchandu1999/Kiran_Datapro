// promises 
// A Promise is an Object that links Producing code and Consuming code
// promise states:
// - pending, - fulfilled, - rejected

let promise = new Promise((resolve, reject)=>{
    let x = 0;

    if(x != 0) {
        resolve("Success from promise");
    }
    else {
        reject("Error from promise");
    }
});

function displayPromise(result) {
    console.log(result);
}

// then() is called once promise state changes from pending to either fulfilled/rejected
// Promise.then() takes two arguments, a callback for success and another for failure.
promise.then((success) => {
    displayPromise(res);
}, (err) => {
    displayPromise(err);
});


let timedPromise = new Promise((res, rej) => {
    setTimeout(() => {
        console.log("Hello");
        res("ok");
    }, 1000);
});

// example: get data from database
function getData(data) {
    return new Promise((res, rej) => {
        setTimeout(()=>{
            console.log("Getting data:", data);
            res("Data fetched...");
        }, 2000);
    });
}


// promise chaining
getData(1).then((res)=> {
    console.log(res);
    // after getting data 1 then fetch data 2
    getData(2).then((res)=> {
        console.log(res);
        // after getting data 2 then fetch data 3
        getData(3).then((res)=> {
            console.log(res);
        });
    });
});

// The keyword async before a function makes the function return a promise
// async functions are used to overcome the drawback of promise chaining
async function getAllData() {
    await getData(1);
    await getData(2);
    await getData(3);
    await getData(4);
}

getAllData();
