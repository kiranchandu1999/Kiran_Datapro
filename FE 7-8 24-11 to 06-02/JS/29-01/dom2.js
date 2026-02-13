let head3_ele_1 = document.querySelector("#h3-ele-1");

// update the above element content
head3_ele_1.innerText += " using innerHTML";

// select that ul list
let product_list = document.getElementById("products");

// update following data into product_list
const items = ["Television", "Laptop", "Mobile"];

for(let item of items) {
    product_list.innerHTML += `<li>${item}</li>`;
}


// add 'bg-yl' class name to para1 element
let para1_ele = document.querySelector("#para1");
// adding attribute using setAttribute(key, value)
// para1_ele.setAttribute('class', 'bg-yl');
// para1_ele.setAttribute('class', 'clr-red');

// removing attribute using removeAttribute(key)
// para1_ele.removeAttribute('class')

// accessing existing attribute value
// console.log(para1_ele.getAttribute('id'));


// adding multiple classes using 'classList'
para1_ele.classList.add('bg-yl');
para1_ele.classList.add('clr-red');

// remove bg-yl class from para1 ele
para1_ele.classList.remove('bg-yl')
console.log(para1_ele.classList.contains('bg-yl')); // false


// adding inline styling using 'style' key
para1_ele.style.fontSize = '20px';