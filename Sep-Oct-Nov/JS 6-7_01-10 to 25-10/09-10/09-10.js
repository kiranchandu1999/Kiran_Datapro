// arrays

let arr = [15, 20, 45, 8, 16];
let arr2 = new Array(3, 5, 8);

console.log(arr[1]);
console.log(arr.at(1));
console.log(arr2[0]);

console.log(arr.length);

console.log(arr.toString());

console.log(arr.join('#'));

// adding and removing elements from array
arr.push(5, 9);
let res = arr.pop();

arr.unshift(25);
arr.shift();

// delete arr[0];

console.log(res);
console.log(arr); // [ 15, 20, 45, 8, 16, 5 ]

// arr.copyWithin(3, 0, 2);
// console.log(arr);

// arr.splice(2, 1, 1, 2, 3);
arr.splice(4, 0, 22, 24);
console.log(arr);