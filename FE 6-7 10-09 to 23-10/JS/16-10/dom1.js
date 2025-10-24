// console.log(document.body);
console.dir(document);

// How to get html elements in javascript
// By using following methods we can get any element from html document.

// 1. getElementsByTagName(tagName)
// It will return HTML collection containing all the elements with give tagName in html documemnt

let paraElements = document.getElementsByTagName("p");
console.log(paraElements.length);
console.log(paraElements[1]);

// print the content of above selected 0th index paragraph element
// innerText --> it shows text content present inside an element
// innerHTML --> it shows html content of an element
// textContent --> it is same as innerText but it shows hidden content also.
console.log(paraElements[0].innerText);
console.log(paraElements[0].innerHTML);
console.log(paraElements[1].textContent);


// 2. getElementsByClassName(className)
// It will return collection of all elements with specified class name.
let cls1Elements = document.getElementsByClassName("cls1");
console.log(cls1Elements);

console.log(cls1Elements[1].innerText);


// 3. getElementById(id)
// It will return the element which is having given id value.
let head1Element = document.getElementById("head1");
console.log(head1Element.innerText);

// update text content of above head1 element
head1Element.innerText = head1Element.innerText + " Session";

// do the same update with itallic font style
head1Element.innerHTML = `<i>${head1Element.innerText}</i>`;