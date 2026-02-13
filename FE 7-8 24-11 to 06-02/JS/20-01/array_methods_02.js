// searching in arrays
const nums = [10, 3, 8, 5, 6, 11, 8, 6, 8];

// search '8' in above array
console.log(nums.indexOf(8));
// search 2nd occurance of 8
console.log(nums.indexOf(8, nums.indexOf(8)+1));
console.log(nums.lastIndexOf(8));

// sort the array in descending order
nums.sort((a, b) => {
    return a - b;
});
nums.reverse();
console.log(nums);


// array iteration
for(let i=0; i<nums.length; i++) {
    console.log(`Item at ${i} index is: ${nums[i]}`);
}

// Iteration without using index
// for-in loop iterates on keys
for(let x in nums) {
    console.log(x);
}
console.log('--------------------');
// for-of loop iterates on values
for(let x of nums) {
    console.log(x);
}

// iterating features from ES6
// forEach(callback)  --> it's a void function and it doesn't return anything
nums.forEach((value, index, array) => {
    console.log(`${value} at ${index} index from ${array} array`);
});


// map(callback) --> it performs some operation on each and every item in the array
const salaries = [5000, 2500, 1300, 4800, 3000];
// apply 10% bonus for every employee salary and print that array
const full_salaries = salaries.map((s) => {
    return s * 1.1;
});
console.log(full_salaries);


// filter(callback) ---> it filters element based on given condition and returns filtered values
const filetered_sal = salaries.filter((x) => {
    return x >= 3000;
});
console.log(filetered_sal);


// reduce(callback)  --> it returns single value by performing calculation on given array
const cars = ['benz', 'innova', 'punch', 'fortuner', 'bmw'];
// find the longest car name from above cars array
let longest_car = cars.reduce((prev, curr) => {
    return curr.length > prev.length ? curr : prev;
});
console.log(longest_car);
