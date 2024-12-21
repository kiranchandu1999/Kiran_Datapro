let arr1 = [3, 5, 7, 9, 20, 15];

// spread and rest (...)

let arr2 = [18, 20, 22];

let arr3 = [...arr1, ...arr2];

console.log(arr3);

// destructuring
let cars = ["Benz", "BMW", "TATA", "Toyata"];

// let c1 = cars[0];
// let c2 = cars[1];
// let c3 = cars[2];

let [c1, , , c4] = cars;

console.log(c1 + " " + c4);

// for in, for of loops

// for(let c in cars) {
//     console.log(c);
// }

// for(let c of cars) {
//     console.log(c);
// }

console.log(arr3.indexOf(20, 5));

console.log(arr3.lastIndexOf(20, 3));

console.log(arr3.reverse());

// objects 

let st1 = {
    id: 101,
    name: "Sai shankar",
    age: 20,
    email: "sai@gmail.com"
}

// st1.ph = 123456;

// console.log(st1.ph);

// console.log(st1.age);
console.log(st1["age"]);

for(let val in st1) {
    console.log(`${val} = ${st1[val]}`);
}



