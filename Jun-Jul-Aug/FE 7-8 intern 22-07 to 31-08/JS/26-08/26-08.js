let arr1 = ["java", "c++"];
console.log(arr1[1]);

const student = {
    id : 101,
    name: "ahmed",
    age: 20,
    email: "ahmed@gmailcom",
    frnd : {
        id: 102,
        name: "teja"
    }
}

console.log(student.frnd.id);

let heading2 = document.getElementsByTagName("h2");
console.dir(heading2[1]);

let head1 = document.getElementsByClassName("head1");
head1[0].innerText = "heading 456";

heading2[1].innerHTML = "<div><p>new <i>para</i></p></div>";

let para = document.getElementById("para1");
para.innerText = "new para info 1230";

let para2 = document.querySelector("#para1");
para2.innerText = "Hello para 2";

let headings = document.querySelectorAll("h2");
heading2[2].innerText = "heading at index 2";
