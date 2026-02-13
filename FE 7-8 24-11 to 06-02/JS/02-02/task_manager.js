// select the elements
let task_input = document.querySelector("#task-inp");
let add_btn = document.querySelector("#add-btn");
let tasks_list = document.querySelector("#tasks-list");

// create a function to add a new task
function add_task() {
    // logic to add new task
    let value = task_input.value;

    if(value === "") {
        console.log("Can't create task for empty value!!");
        return;
    }
    
    // create a task div
    let task_div = document.createElement('div');
    task_div.classList.add('task');

    // create input checkbox
    let chk_box = document.createElement('input');
    chk_box.type = "checkbox";

    // create span element for content
    let task_content = document.createElement('span');
    task_content.textContent = value;

    // create delete button for the task
    let del_btn = document.createElement('button');
    del_btn.innerHTML = '<i class="fa-solid fa-trash"></i>';
    del_btn.classList.add('dlt-btn');

    // add all above 3 elements into task_div
    task_div.append(chk_box);
    task_div.append(task_content);
    task_div.append(del_btn);

    // add this task_div to tasks_list
    tasks_list.append(task_div);

    // adding event to check box for enabling completed task functionality
    chk_box.addEventListener('change', () => {
        task_content.classList.toggle('completed');
    })

    // adding delete functionality
    del_btn.addEventListener('click', () => {
        task_div.remove();
    })

    // clearing the input box for next input
    task_input.value = "";
}


// create a click event to add_btn with above function
add_btn.addEventListener("click", add_task);

// Enabling add task for enter button
task_input.addEventListener("keypress", (event) => {
    if(event.key === "Enter") {
        add_task();
    }
});