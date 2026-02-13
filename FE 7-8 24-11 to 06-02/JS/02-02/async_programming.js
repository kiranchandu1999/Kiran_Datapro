// Synchronizing the async programming in javascript

function fetch_data() {
    // to achieve temporary timeout in the execution flow
    // setTimeout(callback, time in milli-seconds);
    setTimeout(() => {
        return 1;
    }, 2000);
}

let res = fetch_data();
console.log(1 + res); // here we get NaN due to late response from function


// Backend system will return a promise response for frontend request before returning the output
// create a function which will return promise to mimic backend
function get_emp_data_from_backend(id) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve({emp_id: id, name: `EMP-${id}`});
        }, 2000);
    });
}

// using 'async' and 'await' we can synchronize the async program
// await should be used inside async function only
async function get_all_data() {
    let e1 = await get_emp_data_from_backend(1);
    console.log(e1);
    let e2 = await get_emp_data_from_backend(2);
    console.log(e2);
    let e3 = await get_emp_data_from_backend(3);
    console.log(e3);
}

get_all_data();
