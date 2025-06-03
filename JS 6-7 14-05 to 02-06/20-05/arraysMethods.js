console.log("Arrays methods:");

const fruits = ["Banana", "Orange", "Apple", "Mango"];

// methods
console.log(fruits.toString());
// retrieve element at index 2 in fruits array
console.log(fruits.at(2));
// to join array elements into a single string using some seperator
console.log(fruits.join("$"));

// pushing(adding) and popping(removing) elements from an array
fruits.push("Kiwi"); // kiwi added at the end of array
console.log(fruits);
fruits.pop(); // removes last element from array
console.log(fruits);

// shifting is working to first element - shift(remove) and unshift(add)
fruits.unshift("Grapes"); // adding at start of array
console.log(fruits);
fruits.shift(); // removes first element from array
console.log(fruits);

const cars = ["Volvo", "Benz"];
console.log(fruits.concat(cars));

// to flat nested array
const nums = [[1,2], [3,4], [5,6]];
console.log(nums.flat());

// splice method is used to add or remove elements in middle
// adding to array ["Banana", "Orange", "Apple", "Mango"]
fruits.splice(2, 0, "Grapes", "Kiwi");
console.log(fruits);

// removing element ['Banana', 'Orange', 'Grapes', 'Kiwi', 'Apple', 'Mango']
fruits.splice(3, 1);
console.log(fruits);

// slice is used to extract some part of array
console.log(fruits.slice(2, 4));

fruits.sort();
console.log(fruits);

// looping on arrays using for-in and for-of
// extracting indexes or keys from array or objects respectively
for(let key in fruits) {
    console.log(key);
}

// extracting elements or values from array or object respectively
for(let f of fruits) {
    console.log(f);
}

