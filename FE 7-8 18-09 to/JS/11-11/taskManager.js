// Select required elements
let taskInput = document.getElementById("task-input");
let addBtn = document.getElementById("add-btn");
let taskList = document.getElementById("task-list");

console.dir(taskInput);
// function to add task into list
function addTask() {
    let value = taskInput.value;
    // if value is empty then return
    if(value === "") {
        console.log("Task value is empty!");
        return;
    }
    // create task Div
    let taskDiv = document.createElement("div");
    taskDiv.classList.add("task");

    let chkBox = document.createElement("input");
    chkBox.type = "checkbox";

    let taskData = document.createElement("span");
    taskData.textContent = value;

    let deleteBtn = document.createElement("button");
    // deleteBtn.textContent = "Delete";
    deleteBtn.innerHTML = '<i class="fa-solid fa-trash"></i>';

    // add all these to taskDiv
    taskDiv.append(chkBox);
    taskDiv.append(taskData);
    taskDiv.append(deleteBtn);
    taskList.append(taskDiv);

    // clear the input element value
    taskInput.value = "";

    // Add event to checkBox
    chkBox.addEventListener("change", () => {
        taskData.classList.toggle("completed");
    });

    // Add event to delete button
    deleteBtn.addEventListener("click", () => {
        taskDiv.remove();
    });
}

// Add event to button
addBtn.addEventListener("click", addTask);
// Add event to add task upon clicking enter button
taskInput.addEventListener("keydown", (e) => {
    if(e.key === "Enter") {
        // add new task
        addTask();
    }
})