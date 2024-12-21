// functions
function getAvg(a, b, c) {
    let sum = a + b + c;
    let avg = sum / 3;
    console.log(avg);
}

// anonymous function
let funVar = function () {
    // body
    console.log("anonymous");
}

funVar();

// arrow function
let arrFun = () => {
    // body
    console.log("arrow function");
}

function getAvg2(a, b, c) {
    let sum = a + b + c;
    let avg = sum / 3;
    return avg;
}

// taking array as input
function getAvg3(arr) {
    let sum = 0;
    for(let i=0; i<arr.length; i++){
        sum = sum + arr[i];
    }
    let avg = sum / arr.length;
    console.log(avg);
}

let m1 = 80, m2 = 95, m3 = 72;

let res = getAvg2(m1, m2, m3);
console.log(res);

let sm1 = 75, sm2 = 80, sm3 = 87;

getAvg(sm1, sm2, sm3);

let marks = [58, 62, 85, 48, 76, 90];

getAvg3(marks);


// objects
const st1 = {
    fname : "chandu",
    lname : "Chandrasekhar",
    age: 20,
    email : "chandu@gmail.com",
    contact : "12345",
    fullName : function() {
        return this.fname + " " + this.lname;
    }
}

console.log(st1.fname);
console.log(st1["email"]);
console.log(st1.fullName());