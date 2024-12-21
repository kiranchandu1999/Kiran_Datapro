// Strings
// "", '', `` (String inetrpolation)

let name = "Shankar";
let id = 101;
let contact = 1234;

// console.log("Shankar id is " + id);
console.log(`Name is ${name}, His id is ${id}, his contact info is ${contact}`);

console.log("A man said 'Save the trees' ");

console.log(name.length);
console.log(name.charAt(3));
console.log(name.charCodeAt(3));

console.log(name.concat(" sai"));

console.log("     Hello");

let atm = "4569";

console.log(atm.padStart(16, "X"));

console.log("Hello World from another World".replaceAll("World", "Datapro"));

let sent = "Hello World from another World";
console.log(sent.split("o"));

console.log(sent.slice(-5));
console.log(sent.substring(-5)); // negative values treated as 0 in substring
console.log(sent.substr(6, 5));
