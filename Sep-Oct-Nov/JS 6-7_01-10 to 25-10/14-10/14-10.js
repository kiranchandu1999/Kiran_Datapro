// functions
// definition
function getAvg(a, b, ...c) {
    let sum = a + b;
    for(let v of c) {
        sum += v;
    }
    let len = c.length + 2;
    let avg = sum / len;
    console.log(c);
    return avg;
}

// function calling / invoking
let arr1 = [5, 3, 2, 4, 6];
let res = getAvg(...arr1);
console.log(res);

// anonymous functions
let getAvg2 = function(a, b, ...c) {
    let sum = a + b;
    for(let v of c) {
        sum += v;
    }
    let len = c.length + 2;
    let avg = sum / len;

    return avg;
}

let res2 = getAvg2(...arr1);
console.log(res2);

// arrow functions
let getAvg3 = (a, b, ...c) => {
    let sum = a + b;
    for(let v of c) {
        sum += v;
    }
    let len = c.length + 2;
    let avg = sum / len;

    return avg;
}

let res3 = getAvg3(...arr1);
console.log(res3);

// callback functions
function getAvg4(a) {
    return a();
}

// function simple() {
//     return 50;
// }

let res4 = getAvg4(() => {
    return 50;
})
console.log(res4);

// arrays callback functions
let arr2 = [1, 2, 3, 4, 5, 4, 7];
let op = arr2.findLastIndex((v) => v + 1 == 5);
console.log(op);
// forEach
arr2.forEach((v, i, a) => {
    // console.log(v + ", " + i + ", " + a);
    console.log(v);
});

// map
// let arr3 = [];
// for(let i=0; i<arr2.length; i++) {
//     arr3[i] = arr2[i] * arr2[i];
// }
// console.log(arr3);

let arr3 = arr2.map(v => v * v);
console.log(arr3);

// filter
let arr4 = arr2.filter(v => v % 2 == 0);
console.log(arr4);

// reduce
let sum = arr2.reduce((pv, cv, i, a) => {
    return pv + cv;
});
console.log(sum);