// Arrays
let arr1 = [5, 10, 15, 20];

console.log(arr1.length);
console.log(arr1[0]);

let str = "Hii";
str[0] = 'y';
console.log(str);
arr1[0] = 100;

// array methods
console.log(arr1.toString());
console.log(arr1.at(0));
console.log(arr1.toString());

arr1.push(150);
arr1.pop();

arr1.unshift(200);
arr1.shift();

let out = arr1.join("+");

let slicedArr = arr1.slice(1, 4);
// 100,10,15,20
arr1.splice(2, 0, 1, 15, 3); // (start number, delete count, new numbers)

// [100, 10, 1, 15, 3, 15, 20]
// searching
console.log(arr1.indexOf(15));
console.log(arr1.lastIndexOf(15));

arr1.sort();
arr1.reverse();

console.log(arr1);

for(k in arr1) {
    console.log(k);
}

for(k of arr1) {
    console.log(k);
}