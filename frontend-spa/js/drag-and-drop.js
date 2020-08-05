const boxes = document.querySelectorAll(".box");


export function addDragAndDropEventListeners() {
  boxes.forEach((box) => {
    box.addEventListener("drop", () => {
      drop(event, box);
    });

    box.addEventListener("dragOver", () => {
      allowDrop(event);
    });
  });
}

function allowDrop(e) {
  e.preventDefault();
}

export function drag(e) {
  e.dataTransfer.setData("text", e.target.id);
}

function drop(e, box) {
  e.preventDefault();
  let data = e.dataTransfer.getData("text");
  let el = document.getElementById(data);
  box.append(el);
}
