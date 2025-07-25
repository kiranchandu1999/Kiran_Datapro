console.log(document.body);
console.dir(document.body);

// use following method of document object to select html elements
// getElementById()
// getElementsByClassName()
// getElementsByTagName()

let heading1 = document.getElementById("head1");
console.dir(heading1);

let myClassElems = document.getElementsByClassName("my-class");
console.dir(myClassElems[1]);

let paraElems = document.getElementsByTagName("p");
console.dir(paraElems[0]);

let divElems = document.getElementsByTagName("div");


// Changing html element content using JS
// innerText -> It'll return text inside html element
// innerHTML -> It'll return html content inside element
// textContent -> It'll return hidden content
console.log(heading1.innerText);
console.log(divElems[0].innerHTML);
console.log(myClassElems[1].textContent);

myClassElems[0].innerHTML = "This is changed para inside <b>div</b> element";


for(let elem of myClassElems) {
    if(elem.tagName == "P") {
        console.log(`This is 'p' tag element - ${elem.tagName}`);
    }
    else {
        console.log(`Not a 'p' tag element - ${elem.tagName}`);
    }
}


// We can use query selectors as well to select html elements from DOM tree
// querySelector();
// querySelectorAll();

let qHeading1 = document.querySelector("#head1");
console.dir(qHeading1);

let qMyClassElems = document.querySelectorAll(".my-class");
console.dir(qMyClassElems[0]);