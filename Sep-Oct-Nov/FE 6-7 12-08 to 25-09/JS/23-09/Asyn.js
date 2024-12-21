// function getData(id, callBack){
//     setTimeout(()=>{
//         console.log(`data ${id}`);
//         if(callBack){
//             callBack();
//         }
//     }, 2000);
// }

// callbacks
// getData(1, ()=>{
//     getData(2);
// });

// promises
// let promise = new Promise((resolve, reject) => {

// })

// function getData(id) {
//     return new Promise((resolve, reject)=>{
//         setTimeout(()=>{
//             console.log(`data ${id}`);
//             resolve("success");
//         }, 2000);
//     });
// }

// then() and catch()
// let res1 = getData(1);
// res1.then(()=>{
//     getData(2);
// });


// async and await

function getData(id){
    return new Promise((resolve, reject)=>{
        setTimeout(()=> {
            console.log(`data ${id}`);
            resolve("success");
        }, 2000);
    })
}


async function getAllData(){
    await getData(1);
    await getData(2);
    await getData(3);
    await getData(4);
}

getAllData();