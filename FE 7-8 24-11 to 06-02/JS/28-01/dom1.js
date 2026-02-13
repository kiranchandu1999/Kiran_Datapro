// Selecting elements from html document into JS
// getElementsByTagName(tag_name) -> this method returns the element in the form of object by tag name
let h1_elements = document.getElementsByTagName("h1");
let first_h1 = h1_elements[0];
console.dir(first_h1);

// Accessing element content using following attributes(properties)
// innerText -> it stores plain text of it's content
// innerHTML -> it stores html content with tags
// textContent -> it stores hidden content as a plain text
// print content of head element
console.log(first_h1.innerText);
console.log(first_h1.innerHTML);
console.log(first_h1.textContent);


// getElementsByClassName(class_name) -> it returns all elements having given class name
let p_elements = document.getElementsByClassName('para-cls');
// print innerHTML of para element at index 1
console.log(p_elements[1].innerHTML);


// getElementById(id) -> it returns object with given id
let para1_id_element = document.getElementById("para1");
console.log(para1_id_element.textContent);


// selecting elements by css selector names
// querySelector(tag_name or .class_name or #id) -> returns single element
// querySelectorAll(tag_name or .class_name or #id) -> returns all elements
let para1_id_ele = document.querySelector("#para1");
console.log(para1_id_ele.innerText);