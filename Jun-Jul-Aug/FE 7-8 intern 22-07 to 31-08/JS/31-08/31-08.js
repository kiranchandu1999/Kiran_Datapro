// console.log("hello world");

// function getData(id, getCallBack) {
//     setTimeout(()=>{
//         console.log(`student ${id}`);
//         if(getCallBack){
//             getCallBack();
//         }
//     }, 2000);
// }

// // callback hell
// getData(1, ()=>{
//     getData(2, ()=> {
//         getData(3);
//     });
// });

// promises
function getData(id) {
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            console.log(`student ${id}`);
            resolve("success");
        }, 2000);
    })
}

// then() --> whenever promise got resolve
// getData(1).then(()=>{
//     return getData(2);
// }).then(()=>{
//     return getData(3);
// }).then(()=>{
//     getData(4);
// })


// async and await
async function getAllData(){
    await getData(1);
    await getData(2);
    await getData(3);
    await getData(4);
}

getAllData();



