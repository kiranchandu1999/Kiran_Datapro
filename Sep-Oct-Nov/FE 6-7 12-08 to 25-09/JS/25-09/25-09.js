$(document).ready(()=>{
    let head1 = $("#head1");

    // head1.onclick = function(){
    //     head1.style.display = "none"
    // }

    $("h1").click(()=>{
        $("h1").hide(2000);
    });

    // head1.innerText = "";
    // head1.text("New heading");
    // console.log(head1.text());

    let btn1 = $("#btn1");

    btn1.click(()=>{
        // head1.text("New Heading");
        // head1.css({
        //     backgroundColor: "red",
        //     "color": "white"
        // });
        head1.toggle(2000);
    });
})

