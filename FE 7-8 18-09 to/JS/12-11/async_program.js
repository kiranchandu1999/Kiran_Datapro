// Asynchronous programming
// fetching data
function getData(id, callBack) {
    setTimeout(() => {
        console.log("Data fetched for id: " + id);
        if(callBack) {
            callBack();
        }
    }, 3000);
}

// async program using callbacks
// getData(1, () => {
//     getData(2, () => {
//         getData(3);
//     });
// });


// Promises
const p = new Promise((resolve, reject) => {
    setTimeout(() => {
        reject("Failed");
    }, 2000);
});
// console.log(p);

p.then((res) => {
    console.log(res);
}).catch((err) => {
    console.log(err);
})

function fetchData(userId) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Data fetched for id " + userId);
            if(userId === 3) {
                reject("Error occurred..");
            }
            resolve({id: userId, name: `User-${userId}`});
        }, 2000);
    });
}

// Promises chaining
// fetchData(1)
// .then(user1 => {
//     console.log("User1: " + user1);
//     return fetchData(2);
// })
// .then(user2 => {
//     console.log("User2: " + user2);
//     return fetchData(3);
// })
// .then(user3 => {
//     console.log("User3: " + user3);
//     console.log("All users fetched..")
// })
// .catch(err => {
//     console.log(err);
// })


// using async/await
async function getAllData () {
    const user1 = await fetchData(1);
    console.log("User1: " + user1);

    const user2 = await fetchData(2);
    console.log("User2: " + user2);

    const user3 = await fetchData(3);
    console.log("User3: " + user3);

    console.log("All users fetched..");
}

getAllData();


fetch('https://jsonplaceholder.typicode.com/todos/1')
      .then(response => response.json())
      .then(json => console.log(json))

async function fetchTodo() {
    const res = await fetch('https://jsonplaceholder.typicode.com/todos/1');
    const json = await res.json();
    console.log(json);
}

fetchTodo();
