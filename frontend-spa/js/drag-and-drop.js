const imagesContainer = document.querySelector(".images-container");
const textsContainer = document.querySelector(".text-container");
const quotesContainer = document.querySelector(".quotes-container");

export function addDragAndDropEventListeners() {
  const boxes = document.querySelectorAll(".box");
  boxes.forEach((box) => {
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
  removePreviousElement(box);
  let data = e.dataTransfer.getData("elementID");
  let el = document.getElementById(data);
  box.appendChild(el);
}

export function removePreviousElement(box) {
  let previousElement = box.firstChild;
  if (previousElement == null) return false;
  if (previousElement.classList.contains("image")) {
    imagesContainer.appendChild(previousElement);
  } else if (previousElement.classList.contains("text")) {
    textsContainer.appendChild(previousElement);
  } else if (previousElement.classList.contains("quote")) {
    quotesContainer.appendChild(previousElement);
  }
}
