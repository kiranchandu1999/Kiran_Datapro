// Attributes manipulation
let titleHead = document.getElementById("title");
titleHead.setAttribute("class", "bg-ylw");
titleHead.removeAttribute("id");
// titleHead.setAttribute("class", "clr-red");
titleHead.className = "clr-red";

// console.dir(titleHead);

// For adding multiple classes we should use classList key
titleHead.classList.add("bg-ylw");
titleHead.classList.remove("clr-red");

// Style attribute for inline css
let empListDiv = document.querySelector("#employee-list");
console.dir(empListDiv);
empListDiv.style.backgroundColor = "green";
empListDiv.style.padding = "10px";

// create unordered list for employee list from #employee-list 
const empList = document.querySelectorAll(".employee");
let list = document.createElement("ul");
let emp = null;
for(let e of empList) {
    emp = document.createElement("li");
    emp.innerText = e.textContent;
    emp.className = e.className;
    emp.setAttribute("role", e.getAttribute("role"));
    list.append(emp);
}

// add this list to html document after #employee-list div
empListDiv.after(list);
empListDiv.remove();
// document.body.removeChild(empListDiv);

for(let e of list.children) {
    if(e.getAttribute("role") === "developer") {
        e.classList.add("dev");
    }
    else if(e.getAttribute("role") === "analyst") {
        e.classList.add("anl");
    }
    if(e.getAttribute("role") === "designer") {
        e.classList.add("dgn");
    }
}
