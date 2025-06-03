// Strings
let fruit = "Orange";  // using double quotes
let movie = 'Pushpa';  // using single quotes
let name = `Mahesh`;  // using template literal (back ticks)

let text = "India's national bird is \"Peacock\" \nIndia's national animal is \"Tiger\"";

console.log(text);
console.log(text.length);
console.log(fruit.length);

// to get character at given index
console.log(fruit.charAt(3));
console.log(text.charAt(10));
console.log(text.at(10));
console.log(text[10]);

// convert string to upper case
console.log(movie.toUpperCase());
console.log(movie.toLowerCase());
console.log(fruit.charCodeAt(2));

// to join or concat multiple strings
let str1 = "Hello";
let str2 = "World";
console.log(str1.concat(" ").concat(str2));

// to remove extra spaces
let extraSpaceString = " How are you   ";
console.log(extraSpaceString.trim());

let word = "How to become a good programmer";
console.log(word.slice(7, 13));

let frts = "Apple, Banana, Kiwi";
// let part = frts.slice(-12, -6);
let part = frts.substring(-12, -6); // negetive index not supported with substring
console.log(part);

// padding a string with different characters
let cardLastDigits = "4639";
console.log(cardLastDigits.padStart(16, 'X'));

console.log(cardLastDigits.repeat(2));

let institute = "Welcome to CodersHub";
console.log(institute.replace("CodersHub", "Datapro"));
console.log(institute);