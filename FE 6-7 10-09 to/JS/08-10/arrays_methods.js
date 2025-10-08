// Array --> Collection of elements of any type
// Arrays are used to store multiple elements in a single variable
// so it will be easy to pass multiple elements from one function to another function using array

// Array declaration
const nums = [5, 8, 6, 3, 10, 4, 7];
// or using new keyword
const programSkills = new Array();

// push() method will add element at the end of an array
console.log(programSkills); // []
programSkills.push("Javascript");
programSkills.push("HTML");
programSkills.push("CSS");
console.log(programSkills); // ["Javascript", "HTML", "CSS"]

// pop() method will remove element from last
programSkills.pop();
console.log(programSkills); // ["Javascript", "HTML"]

// unshift() method will add element at start
programSkills.unshift("C language");
console.log(programSkills); // ["C language", "Javascript", "HTML"]

// shift() method will remove element from start
programSkills.shift();
console.log(programSkills); // ["Javascript", "HTML"]

// searching elements in array
console.log(nums.indexOf(10)); // 4
console.log(nums.includes(9)); // false

// sorting an array
nums.sort(); // assumed as string values and sorted accordingly
console.log(nums); // [10, 3, 4, 5, 6, 7, 8]

// forEach() ---> it is used to print or log the values of an array
const marks = [95, 60, 72, 81, 91, 68];
// for(let i=0; i<6; i++) {
//     console.log(marks[i]);
// }
// let print = (x) => {
//     console.log(x);
// };
marks.forEach((x) => {
    console.log(x);
});


// map() ---> it is used to apply some changes on every element of the array
// add 1 marks for each subject in marks array and store them in newMarks
const newMarks = marks.map((m) => {
    return m + 1;
});
console.log(newMarks);

// filter() ---> it is used to filter the elements based on given condition
const above80Marks = marks.filter((m) => {
    return m > 80;
});
console.log(above80Marks); // [95, 81, 91]

// reduce()  ---> it is used to calculate a single result among multiple values of an array
let total = above80Marks.reduce((s, m) => {
    return s + m;
});
console.log(total);