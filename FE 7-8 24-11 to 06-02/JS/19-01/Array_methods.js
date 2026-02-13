// Array --> It's a collection of heterogeneous elements

// creating an array
const fruits = ['mango', 'grapes', 'orange', 'banana'];
// or
const cars = new Array('tata', 'suzuki', 'baleno');

console.log(fruits);

// accessing elements using index (0th based indexing)
// get the 3rd element in fruits array
console.log(fruits[2]); // 'orange'

// update 3rd element in cars array with 'benz'
cars[2] = 'benz';
console.log(`after updating cars: ${cars}`);


// array methods
// push(item) --> adds new item at the end of array
cars.push('innova');
console.log(cars); // [ 'tata', 'suzuki', 'benz', 'innova' ]

// unshift(item) --> adds new item at beginning of an array
cars.unshift('punch');
console.log(cars); // [ 'punch', 'tata', 'suzuki', 'benz', 'innova' ]


// pop() --> removes item from end of array
cars.pop();
console.log(cars); // [ 'punch', 'tata', 'suzuki', 'benz' ]

// shift() --> removes item from start of array
cars.shift();
console.log(cars); // [ 'tata', 'suzuki', 'benz' ]


// slice(si, ei) --> extracts part of an array (it doesn't change original array)
console.log(fruits); // [ 'mango', 'grapes', 'orange', 'banana' ]

console.log(fruits.slice(-3, -1)); // ['grapes', 'orange']

// splice(start index, no. of items to remove, ...new items)
// insert 'kiwi' at 2nd index
fruits.splice(2, 0, 'kiwi');
console.log(fruits); // [ 'mango', 'grapes', 'kiwi', 'orange', 'banana' ]

// replace 'grapes' with 'apple', 'dragon fruit'
fruits.splice(1, 1, 'apple', 'dragon fruit');
console.log(fruits); // [ 'mango', 'apple', 'dragon fruit', 'kiwi', 'orange', 'banana' ]

// remove 'orange' from fruits
fruits.splice(4, 1);
console.log(fruits); // [ 'mango', 'apple', 'dragon fruit', 'kiwi', 'banana' ]


// sorting and searching
fruits.sort();
console.log(fruits); // [ 'apple', 'banana', 'dragon fruit', 'kiwi', 'mango' ]

const nums = [3, 6, 2, 8, 10, 4];
nums.sort(numeric_sort); // it sorts based on string values of above numbers
console.log(nums);

// negetive value ---> same order
// positive value ---> reverse the order
function numeric_sort(a, b) {
    return b - a;
}