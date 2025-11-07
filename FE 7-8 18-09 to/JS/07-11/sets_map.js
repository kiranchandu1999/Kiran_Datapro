// SET --> It's a data structure maintains unique values of data.
// It maintains the insertion order
// Creating set object using new keyword
const users = new Set(); // empty set
// we can also initialize the set at the time of creation
const uniqueNums = new Set([5, 8, 3, 10, 8, 6, 3]);
// find the no of elements in the set
console.log(uniqueNums.size); // 5
console.log(uniqueNums);

// adding elements to the set
users.add("krishna");
users.add("priya");
users.add("rahul");

// deleting elements
users.delete("Rahul");
console.log(users);

// searching in set
// check priya is present inside the set
console.log(users.has("priya")); // true

// clearing the set
// users.clear(); // it'll removes all elements
console.log(users.size);

// set with objects data
const obj1 = {
    name: "abc",
    id: 101
}

const usersData = new Set();
usersData.add(obj1);

usersData.delete(obj1);

console.log(usersData);

// Iteration over set
for(let x of users) {
    console.log(x);
}

console.log(users.keys());
console.log(users.values());
console.log(users.entries());


// Map --> It stores unique data in key-value pairs
const s1 = {
    id: 101,
    name: "student1"
}
const s2 = {
    id: 102,
    name: "student2"
}
const s3 = {
    id: 103,
    name: "student3"
}

const students = new Map();
// adding data
students.set(s1.id, s1);
students.set(s2.id, s2);
students.set(s3.id, s3);
// adding duplicate
// students.set(102, "Overridden");

// get student data by their id
console.log(students.get(102)); // it'll return student object corresponding to key 102

// Deleting data
students.delete(102); // it removes entire 102 key-value pair

// searching
console.log(students.has(102)); // false

// replacing key name
students.set(104, students.get(103));
students.delete(103);

console.log(students.keys());
console.log(students.values());
console.log(students.entries());

// Iterating over map
for(let [k, s] of students) {
    console.log(`Student Name: ${s.name}`);
}

// Examples on Set and Map
// Remove duplicates from given array
function removeDuplicates(arr) {
    return [...new Set(arr)];
}

const nums = [10, 3, 8, 6, 3, 4, 5, 10, 8];
const numsWithoutDup = removeDuplicates(nums);
console.log(numsWithoutDup);


// find word frequency
function getFreq(str) {
    const frMap = new Map();
    const arr = str.split(" ");
    for(let word of arr) {
        frMap.set(word, (frMap.get(word) || 0) + 1);
    }
    return frMap;
}

let str = "apple mango banana apple kiwi mango apple banana";
console.log(getFreq(str));
