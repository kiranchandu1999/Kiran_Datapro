// Set -> It is a collection of unique elements, elements can be any type
// creation
// can create empty set or
// we can create by passing an array to Set constructor
const uniqueNums = new Set();

// adding elements
uniqueNums.add(5);
uniqueNums.add(2);
uniqueNums.add(5);
uniqueNums.add(10);
console.log(uniqueNums); // [5,2,10]

// delete() method
uniqueNums.delete(2);
console.log(uniqueNums); // [5, 10]

// has() -> to search element
console.log(uniqueNums.has(10)); // true

// clear() -> removes all elements
// uniqueNums.clear();
// console.log(uniqueNums); // []

// size -> it returns length of set
console.log(uniqueNums.size);

// key(), values() and entries
console.log(uniqueNums.keys());
console.log(uniqueNums.values());
console.log(uniqueNums.entries());

// iteration
for(let x of uniqueNums) {
    console.log(x);
}

// Example: Remove duplicates from given array
const nums = [5, 8, 15, 25, 8, 16, 10, 15, 8, 5, 30];

function removeDuplicates(arr) {
    // logic to remove duplicates from array
    return [...new Set(arr)];
}

console.log(removeDuplicates(nums)); // [5, 8, 15, 25, 16, 10, 30]


// Map -> It is collection of data in the form of key-value pairs, keys can be any type of data
// creating map
const credentials = new Map();

// set(k, v) -> adds key-value pair to the map
credentials.set("alice", "alice@123");
credentials.set("john", "john@987");
credentials.set("doe", "doe$521");
// adding duplicate key
credentials.set("doe", "doe#987");

// get value from map
console.log(credentials.get("alice")); // alice@123

// deleting key-value pair
credentials.delete("john");

// replacing key name
credentials.set("doe12", credentials.get("doe"));
credentials.delete("doe");

// has(key) -> searching in the map
console.log(credentials.has("doe")); // false
console.log("Map size: " + credentials.size);

// iteration over map
console.log(credentials.keys());
console.log(credentials.values());
console.log(credentials.entries());

for(let key of credentials.keys()) {
    console.log(`Key: ${key} => Value: ${credentials.get(key)}`);
}

console.log(credentials);

// Example: Find the character frequency in given string
let input = "hello datapro";

function getCharFrequency(str) {
    // logic to find char frequency
    const frMap = new Map();
    for(let ch of str) {
        frMap.set(ch, (frMap.get(ch) || 0) + 1);
    }

    return frMap;
}

console.log(getCharFrequency(input));