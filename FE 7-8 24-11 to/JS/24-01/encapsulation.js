// Encapsulation -> Binding individual data and methods into a single unit(class) and also restricting the accessing of data from outside the class
// private variables can be accessed within the class only
class BankAccount {
    #balance; // private access variable
    constructor(balance) {
        this.#balance = balance;
    }

    deposit(amount) {
        this.#balance += amount;
        console.log(`Amount ${amount} deposited..`);
    }

    // reading private data using methods
    get_balance() {
        return this.#balance;
    }
}


const acc1 = new BankAccount(1000);
// modifying the balance
// acc1.#balance = 1500; // cannot access outside the class
// console.log(acc1.#balance); // checking balance

// deposit amount
acc1.deposit(500);

// check balance
console.log(acc1.get_balance());


// Error handling using try-catch
// try block contains statements which might throw error for different inputs
// catch block contains handling statements
let a = 3;
let b = "a";
console.log(a+b);
try {
    console.log(a-c); // Error code
}
catch(err) {
    console.log(err);
}
console.log("remaining program");
