const boxes = document.querySelectorAll(".box");


export function addDragAndDropEventListeners() {
  boxes.forEach((box) => {
    box.style.backgroundColor = "red";
    box.addEventListener("drop", () => {
      drop(event, box);
    });

    box.addEventListener("dragover", () => {
      allowDrop(event);
    });
  });
}

function allowDrop(e) {
  e.preventDefault();
}

export function drag(e) {
  e.dataTransfer.setData("elementID", e.target.id);
}

function drop(e, box) {
  e.preventDefault();
  let data = e.dataTransfer.getData("elementID");
  let el = document.getElementById(data);
  box.appendChild(el);
  console.log(el);
}
