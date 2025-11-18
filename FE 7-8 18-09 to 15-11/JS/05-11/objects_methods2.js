// When any function defined inside an object then it's called method.
// Ex
function Employee(name, salary) {
    this.name = name;
    this.salary = salary;
    // this.anualSalary = function() {
    //     return this.salary * 12;
    // }
}

Employee.prototype.age = 25;

Employee.prototype.anualSalary = function() {
    return this.salary * 12;
}

const e1 = new Employee("Arun", 1000);
console.log(e1.name); // Arun
console.log(e1.anualSalary()); // 12000

const e2 = new Employee("John", 500);
console.log(e2.name); // John
console.log(e2.anualSalary()); // 6000

console.log(Employee.prototype);

// Nested objects
const student1 = {
    name: "Rahul",
    subjects: [
        {sub: "Maths", marks: 90},
        {sub: "Social", marks: 80},
        {sub: "Hindi", marks: 75}
    ]
}

student1.__proto__ = {
    getDetails: function() {
        console.log(`Name: ${this.name} and Subjects: ${this.subjects.length}`);
    },
    getAvg: function() {
        let sum = this.subjects.reduce((total, s) => {
            return total + s.marks;
        }, 0);
        return sum/this.subjects.length;
    }
}

console.log(Object.getPrototypeOf(student1));
student1.getDetails();
console.log(student1.getAvg());

const p1 = {
    name: "xyz",
    age: 20,
    address: {
        city: "",
        state: "",
        pin: 5000
    }
}