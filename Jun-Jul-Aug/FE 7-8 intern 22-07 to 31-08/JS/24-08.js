let arr1 = ["css", "C", "java", "html"];
let arr2 = ["golang", "ruby"];
// arr1[1] = "javascript";
let str = "Hello";

// console.log(typeof arr1);
// console.log("hello");
// console.log(arr1.toString());
// console.log(arr1.sort());

// array methods
// adding and removing at last
// arr1.push("javascript");
// arr1.pop();

arr1.unshift("javascript");
arr1.unshift("python");
arr1.shift();

let arr3 = arr1.concat(arr2);
// [ 'javascript', 'css', 'C', 'java', 'html', 'golang', 'ruby' ]

let slc = arr3.slice(3, 6);

arr3.splice(2, 3, "React", "Angular");



// [ 'javascript', 'css', 'React', 'Angular', 'golang', 'ruby' ]

// array iteration methods
// let i = 0;
// for(let val of arr3){
//    arr3[i] = val.toUpperCase();
//    i++;
// }

let res = "";
arr3.forEach((val)=>{
    res += val + ",";
    // console.log(val);
});

let upArr = arr3.map((val)=>{
    return val.toUpperCase();
});

let filArr = arr3.filter((val)=>{
    if(val.length >= 5) return val;
});

let marks = [95, 82, 48, 65, 91, 72];

let total = marks.reduce((prev, curr)=>{
    return prev + curr;
});

// console.log(total / 6);

let avg = 0;
let sum = 0;

for(let val of marks){
    sum += val;
}

avg = sum / 6;

// console.log(avg);


// functions

let marks2 = [85, 72, 64, 95, 98, 45];

// function getAvg (mks) {
//     let total2 = mks.reduce((prev, curr)=>{
//         return prev + curr;
//     });
    
//     console.log(total2/6);
// }

// anonymous function
// let getAvg = function (mks) {
//     let total2 = mks.reduce((prev, curr)=>{
//         return prev + curr;
//     });
    
//     console.log(total2/6);
// }

// console.log(getAvg);


// arrow function
let getAvg = (mks)=>{
    let total2 = mks.reduce((prev, curr)=>{
        return prev + curr;
    });
    
    console.log(total2/6);
}

getAvg(marks);
getAvg(marks2);