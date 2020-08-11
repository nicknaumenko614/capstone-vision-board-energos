export function addDragAndDropEventListeners() {
  const main = document.querySelector("main");

  main.addEventListener("drop", () => {
    mainDropEventListener();
  });

  main.addEventListener("dragover", () => {
    mainDragOverEventListener();
  });

  main.addEventListener("dragstart", () => {
    mainDragStartEventListener();
  });
}

function allowDrop() {
  const e = event;
  e.preventDefault();
}

export function drag(el) {
  const e = event;
  e.dataTransfer.setData("elementID", el.id);
}

function drop(box) {
  const e = event;
  e.preventDefault();
  if (box.firstChild) removePreviousElement(box);
  const data = e.dataTransfer.getData("elementID");
  const el = document.getElementById(data);
  box.appendChild(el);
}

export function removePreviousElement(box) {
  const imagesContainer = document.querySelector(".images-container");
  const textsContainer = document.querySelector(".text-container");
  const quotesContainer = document.querySelector(".quotes-container");
  const previousElement = box.firstChild;
  if (previousElement == null) return false;
  if (previousElement.classList.contains("image")) {
    imagesContainer.appendChild(previousElement);
  } else if (previousElement.classList.contains("text")) {
    textsContainer.appendChild(previousElement);
  } else if (previousElement.classList.contains("quote")) {
    quotesContainer.appendChild(previousElement);
  }
}

function mainDropEventListener() {
  let el = event.target;
  while (!el.classList.contains("box")) {
    el = el.parentNode;
  }

  drop(el);
}

function mainDragOverEventListener() {
  let el = event.target;
  if (el.closest(".box")) {
    while (!el.classList.contains("box")) {
      el = el.parentNode;
    }

    allowDrop();
  }
}

function mainDragStartEventListener() {
  const el = event.target;
  if (el.closest(".box")) {
    if (
      el.classList.contains("image") ||
      el.classList.contains("text") ||
      el.classList.contains("quote")
    )
      drag(el);
  }
}
