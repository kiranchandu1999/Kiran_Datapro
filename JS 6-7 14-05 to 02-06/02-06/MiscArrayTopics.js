// misc topics of Arrays
const nums = [3, 5, 7, 9];

// map()
const sqNums = nums.map((x)=>{
    return x * x;
});
// [9, 25, 49, 81]

// print the values in the above array
// for(let x of sqNums) {
//     console.log(`Value is ${x}`);
// }
// using forEach()
sqNums.forEach((x, i)=>{
    console.log(`Value at ${i}: ${x}`);
});

// filter()
// we can use filter function on arrays to filter matched values
const marks = [85, 69, 92, 80, 45, 62];

const distictMarks = marks.filter((m)=>{
    return m > 70;
}); // [85, 92, 80]

console.log(distictMarks);


// reduce()
// reduce is used calculate the cummulative result
const shoppingBill = {
    biscuit: 250,
    drinks: 480,
    hotChips: 360,
    soaps: 300,
    icecreams: 200
};

let totalAmount = Object.values(shoppingBill).reduce((b1, b2)=>{
    return b1 + b2;
});

console.log(`Total bill amount: ${totalAmount}`);
