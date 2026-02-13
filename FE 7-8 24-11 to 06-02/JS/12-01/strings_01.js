// String: It is a collection of characters, Javascript has in built string class with pre defined functions
// If a function integrated with an object then it is called as a method.

let s1 = "Welcome";
// String methods:

// print the length of given string
console.log(`String length is: ${s1.length}`);

// print the 3rd character of given string
console.log(`3rd character is ${s1.charAt(2)}`); // 'l'
console.log(`3rd character is ${s1[2]}`); // 'l'

// convert the given string into complete uppercase and lowercase
console.log(`Upper case: ${s1.toUpperCase()}`); // WELCOME
console.log(s1); // Welcome
console.log(`Upper case: ${s1.toLowerCase()}`); // welcome

// string concatenation
s1 = s1.concat(" to Datapro!"); // Welcome to Datapro!

// extract 'Datapro' from given string s1
console.log(s1.substring(11, 18)); // Datapro
console.log(s1.slice(-8, -1)); // Datapro

// searching methods in strings
// search that the given string is started with 'We'
console.log(s1.startsWith('We')); // true
console.log(s1.endsWith("ty")); // false
console.log(s1.includes('to')); // true
// space first occurance
console.log(s1.indexOf(" ")); // 7 (first occurance)
console.log(s1.indexOf(" ", s1.indexOf(" ")+1)); // 7 (first occurance)
console.log(s1.lastIndexOf(" ")); // last occurance

console.log(" Hello   ".trim()); // removes extra whitespaces
console.log("  6789 ".trim().padStart(16, 'X'));
console.log(s1.replace("Welcome", "Hello"));


// Create function for Email masking
// input: kiranuser12@gmail.com ===> output: kir...@gmail.com

function mask_email(email) {
    // find the @ in the given email
    let at_index = email.indexOf('@');
    // @ should be placed at least after index 3
    if(at_index <= 3) {
        return "Email address is very short, please update!";
    }

    // extract visible part
    let visible_part = email.substring(0, 3);

    // extract domain part
    let domain_part = email.substring(at_index);

    // combine visble and domain part with '...' and return
    return visible_part + '...' + domain_part;
}

console.log(mask_email("kiranuser123@gmail.com")); // kir...@gmail.com
console.log(mask_email("ki3@gmail.com")); // Email is short
console.log(mask_email("rahul2563@yahoo.com")); // rah...@yahoo.com


// password_strength checker
// password should be (min 8 chars, atleast 1 special char)
// weak password when password is lessthan 8 chars
// medium password when any speacial char not exists
// strong password when meets all required criteria

function pass_checker(password) {
    let spec_chars = "@$%-_";
    let has_special = false;
    // check password length
    if(password.length < 8) {
        return "Weak Password!";
    }

    // check for special character
    for(let i=0; i<spec_chars.length; i++) {
        if(password.includes(spec_chars[i])) {
            has_special = true;
            break;
        }
    }

    if(has_special) {
        return "Strong Password!";
    }
    else {
        return "Average Password!";
    }
}


console.log(pass_checker("kiran123")); // average password
console.log(pass_checker("raju@12_34")); // strong password
console.log(pass_checker("raju@1")); // Weak password

