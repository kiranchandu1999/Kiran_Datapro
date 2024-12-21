// arrays callback functions
// forEach
let marks = [58, 65, 79, 68, 95, 81];

let sum = 0;
marks.forEach((val) => {
    sum = sum + val;
});

// console.log(sum);

// map
let nums = [1, 2, 3, 4, 5, 6];

let sqrs = nums.map((val) => {
    return val * val;
});

// console.log(sqrs);

// filter
let ages = [19, 21, 17, 24, 20, 16, 14, 28, 17];

let finalAges = ages.filter((val) => {
    return val >= 18;
});

// console.log(finalAges);

// let j = 0;

// for(let i=0; i<ages.length; i++){
//     if(ages[i] >= 18){
//         finalAges[j] = ages[i];
//         j++;
//     }
// }

// reduce
let evens = [2, 4, 6, 8, 10, 12];

let res = evens.reduce((prev, val) => {
    return prev + val;
}, 10);

// console.log(res);


let st1 = {
    id: 101,
    fname: "chandrasekhar",
    age: 20,
    email: "chandu@gmail.com",
    contact: '1234'
}

console.log(st1["id"]);

for(let k in st1) {
    console.log(`${k} = ${st1[k]}`);
}

