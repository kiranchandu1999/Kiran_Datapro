// Async programming can be done using following approaches
// Callbacks -> passing a function as an argument to another function

function fetchData(id, callback) {
    setTimeout(()=> {
        console.log("Fetching data " + id);
        // after fetching data executing callback
        if(callback) {
            callback();
        }
    }, 3000);
}

fetchData(1, ()=>{
    fetchData(2, () => {
        fetchData(3);
    });
});


// To overcome callback hell, we can use promises
const promise1 = new Promise((res, rej) => {
    let success = true;
    if(success) {
        res("Promise success");
    }
    else {
        rej("Promise failed");
    }
});

// promise1.then((res)=> {
//     console.log(res);
// }).catch((err)=> {
//     console.log(err);
// });

// above problem statement using promises
function fetchData2(id) {
    return new Promise((res)=> {
        setTimeout(()=> {
            console.log("Fetching data " + id);
            // after fetching data promise will be fulfilled
            res("Success");
        }, 3000);
    })
}

fetchData2(1).then(() => {
    fetchData2(2).then(() => {
        fetchData2(3);
    })
});


// for good readability and easy to understand we can use async/await
function fetchData3(id) {
    return new Promise((res)=> {
        setTimeout(()=> {
            console.log("Fetching data " + id);
            // after fetching data promise will be fulfilled
            res("Success");
        }, 3000);
    })
}

async function getData() {
    await fetchData3(1);
    await fetchData3(2);
    await fetchData3(3);
}

getData();
