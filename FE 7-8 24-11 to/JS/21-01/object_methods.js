// object is a data structure which stores data in key value pairs and it represents one physical entity
// object creation using literal
// const obj_name = {
//     key1: "value1",
//     key2: "value2"
// }

const car1 = {
    brand: "Toyota",
    model: "Innova",
    color: "Black"
};
// adding new field
car1.price = 5000;

// const car2 = new Object();
// car2.model_n = "Desire";
// car2.clr = "white";
// console.log(car2);

console.log(car1);

// accessing object keys and values
// obj_name.key  or  obj_name["key"]
console.log(car1.model);
console.log(car1["color"]);

// iterating over object
for(let key in car1) {
    console.log(`${key} = ${car1[key]}`);
}

// Object destructuring
let {brand, color, model: model_name} = car1;
// or
// let brand = car1.brand;
// let color = car1.color;
// let model = car1.model;
console.log(brand);
console.log(color);
console.log(model_name);

// Array destructuring
const nums = [5, 3, 8, 10, 4];
// using rest operator
let [n1, n2, ...nums2] = nums;
console.log(n1);
console.log(n2);
console.log(nums2);

// spread operator
const merged_arr = [...nums, ...nums2];
console.log(merged_arr);


// Object constructor function for creating structured objects
// use PascalCase for creating constructor function names
function Calculator(company, price) {
    this.company = company;
    this.price = price;
}

const c1 = new Calculator("Casio", 1000);
const c2 = new Calculator("Titan", 1200);

console.log(c1.company);
console.log(c2["price"]);
