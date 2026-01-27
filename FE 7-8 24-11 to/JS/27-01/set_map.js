// Set is a data structure which stores unique elements in a random order.
// set creation
let set_a = new Set(); // it will create empty set
const unique_nums = new Set([5, 8, 3, 6, 5, 2, 3, 9]);
console.log(unique_nums);

// methods
// adding elements into set
unique_nums.add(5);
unique_nums.add(11);
console.log(unique_nums);

console.log(unique_nums.size);

// deleting elements from set
unique_nums.delete(5); // removes 5 from set
console.log(unique_nums);

// searching in set
if(!unique_nums.has(5)) {
    console.log("5 not exists");
}

// iterating over set
for(let v of unique_nums) {
    console.log(v);
}

// complete clearing set
// unique_nums.clear();
// console.log(unique_nums.size);

console.log(unique_nums.keys());
console.log(unique_nums.values());
console.log(unique_nums.entries());

// create a function to remove duplicates from given array
function remove_duplicates(ip_ids) {
    // return unique values from given input
    return [...new Set(ip_ids)];
}

const ids = [10, 5, 6, 3, 11, 3, 5, 10, 12];
const unique_ids = remove_duplicates(ids);
console.log(unique_ids.length);

// set with objects
const ob1 = {
    id: 101,
    name: 'kiran'
};

const ob2 = {
    id: 101,
    name: 'kiran'
}

const set_x = new Set([ob1, ob2]);
console.log(set_x.size); // eventhough both objects values are same, but they are different in memory locations


// Map is a data structure which stores data in key value pairs with random order
const map1 = new Map(); // empty map

const credentails = new Map([
    ['user1', 'pass1'],
    ['user2', 'pass2'],
    ['user3', 'pass3']
]);
console.log(credentails);

// adding key/value pair
credentails.set('user4', 'pass4');

// deleting key/value pair
credentails.delete('user2'); // removes key/value pair
console.log(credentails);

// searching
console.log(credentails.has('user2')); // false

// accessing particular value based on key
// get password of user3
console.log(credentails.get('user3')); // pass3


// letter frequency map
function get_frequency(ip_str) {
    // return letter frequency of given string
    const fr_map = new Map();

    for(let ch of ip_str) {
        if(fr_map.has(ch)) {
            fr_map.set(ch, fr_map.get(ch)+1);
        }
        else {
            fr_map.set(ch, 1);
        }
    }

    return fr_map;
}

console.log(get_frequency("dataproda"));