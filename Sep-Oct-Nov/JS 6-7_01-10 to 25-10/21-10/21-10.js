let table = document.querySelector("#st_table");

let row, col1, col2, col3, col4;

row = document.createElement("tr");
col1 = document.createElement("th");
col1.innerText = "Id";
col2 = document.createElement("th");
col2.innerText = "Name";
col3 = document.createElement("th");
col3.innerText = "Age";
col4 = document.createElement("th");
col4.innerText = "Options";

row.append(col1);
row.append(col2);
row.append(col3);
row.append(col4);
table.append(row);

function addRecord(id, name, age) {
    row = document.createElement("tr");
    col1 = document.createElement("td");
    col1.innerText = id;
    col2 = document.createElement("td");
    col2.innerText = name;
    col3 = document.createElement("td");
    col3.innerText = age;
    col4 = document.createElement("td");
    let deleteBtn = document.createElement("button");
    deleteBtn.innerText = "Delete";
    col4.append(deleteBtn);
    deleteBtn.onclick = (e) => {
        deleteRecord(e);
    }

    row.append(col1);
    row.append(col2);
    row.append(col3);
    row.append(col4);
    table.append(row);
}

// let students = [
//     {
//         id: 101,
//         name: "Srinivas",
//         age: 20
//     },
//     {
//         id: 102,
//         name: "Shankar",
//         age: 20
//     },
//     {
//         id: 103,
//         name: "Rakesh",
//         age: 20
//     },
// ];

// for(let st of students) {
//     addRecord(st.id, st.name, st.age);
// }

// Javascript Events
// mouse events and keyboard events

let btn1 = document.querySelector("#btn1");

// btn1.onclick = () => {
//     console.log("clicked");
// };

// btn1.ondblclick = () => {
//     console.log("double clicked");
// }

// btn1.onmouseup = () => {
//     console.log("mouse up");
// };

let ip1 = document.querySelector("#ip_id");
let ip2 = document.querySelector("#ip_name");
let ip3 = document.querySelector("#ip_age");

btn1.onclick = () => {
    addRecord(ip1.value, ip2.value, ip3.value);
    ip1.value = "";
    ip2.value = "";
    ip3.value = "";
}

function deleteRecord(e) {
    let delRec = e.target.parentNode.parentNode;
    delRec.remove();
}