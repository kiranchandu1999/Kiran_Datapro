// in this case we need to call 2 functions
function myDisplayer(some) {
    console.log(`Sum is ${some}`);
}

function myCalculator(num1, num2) {
    let sum = num1 + num2;
    return sum;
}

let result = myCalculator(5, 10);
myDisplayer(result);


// callback is a funtion which is passed as a paramter to another function
// by using callbacks we can control the sequence of execution

function display(wishes) {
    console.log(wishes);
}

function BDayWishes(name, callBack) {
    let wishes = `Happy birthday ${name}`;
    if(callBack) {
        callBack(wishes);
    }
}

BDayWishes("Navdeep");
BDayWishes("Raju", display);
BDayWishes("Raju", (wishes) => {
    console.log(wishes);
});


// async programming - Functions running in parallel with other functions are called asynchronous

console.log("one");
console.log("two");
// setTimeout(()=> {
//     BDayWishes("Venky", display);
// }, 2000);
console.log("three");
console.log("four");

// let count = 0;
// let interval = setInterval(() => {
//     BDayWishes("Venky", display);
//     count++;
//     if(count == 5) {
//         clearInterval(interval);
//     }
// }, 2000);


// callback hell
// refers to deeply nested callback functions, 
// typically used in asynchronous programming, 
// that make code difficult to read, understand, and maintain
function getData(data, callBack) {
    setTimeout(()=>{
        console.log(`Data is ${data}`);
        if(callBack) {
            callBack();
        }
    }, 2000);
}

getData(1, () => {
    getData(2, () => {
        getData(3, () => {
            getData(4);
        });
    });
});