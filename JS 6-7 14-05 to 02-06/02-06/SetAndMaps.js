// Set: A JavaScript Set is a collection of unique values.
// It won't allow the duplicate values
const letters = new Set(["a","b","c","a"]);
letters.add("k");
letters.add("w");

let text = "";
for(let ch of letters) {
    text += ch;
}

console.log(text);

// to check whether given element is present in set or not
console.log(letters.has("u")); // returns true if present else retuns false

// set doesn't contains keys, so if keys and values are same
console.log(letters.keys());
console.log(letters.values());


// Map - A Map holds key-value pairs where the keys can be any datatype.
const fruits = new Map([
  ["apples", 500],
  ["bananas", 300],
  ["oranges", 200]
]);

// set(key, value) to add elements to the map
fruits.set("kiwi", 100);
fruits.set("mangoes", 250);
fruits.set("apples", 400);

// get(key) returns corresponding value to that key
console.log("Before delete:",fruits.get("kiwi"));

fruits.delete("kiwi");

console.log("After delete:",fruits.get("kiwi"));

console.log("Keys in map:",fruits.keys());
console.log("Values in map:",fruits.values());
console.log("Entries in map:",fruits.entries());
