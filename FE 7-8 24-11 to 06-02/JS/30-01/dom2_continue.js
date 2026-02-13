// select employee list div
const emp_list_div = document.querySelector("#emp-list");
// console.dir(emp_list_div);

const emp_list = emp_list_div.children;
console.dir(emp_list);

// create new 'ul' element
const ul_list = document.createElement('ul');

for(let e of emp_list) {
    // create 'li' element and add required data to it
    const li_item = document.createElement('li');
    li_item.innerText = e.innerText;
    li_item.className = e.className;
    li_item.setAttribute('role', e.getAttribute('role'));
    // adding li_item into ul_list
    ul_list.append(li_item);
}

console.log(ul_list);

// finally adding ul_list after emp_list_div
emp_list_div.after(ul_list);
// remove existing list
emp_list_div.remove();

// removing child with resepect to parent
// document.body.removeChild(emp_list_div);

// node.append(item) --> adds item inside node at last
// node.prepend(item) --> adds item inside node at start
// node.after(item) --> adds item outside the node after
// node.before(item) --> adds item outside the node before

// adding css classes to ul_list items
for(let li of ul_list.children) {
    // add css class corresponding to role
    if(li.getAttribute('role') === 'developer') {
        li.classList.add('dev');
    }
    else if(li.getAttribute('role') === 'analyst') {
        li.classList.add('anl');
    }
    else {
        li.classList.add('tst');
    }
}