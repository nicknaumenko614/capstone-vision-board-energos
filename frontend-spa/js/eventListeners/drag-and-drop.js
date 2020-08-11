import { fetchImageId, updateImageParentElement } from "../apiHelpers/apiHelper-Images.js";
import { fetchTextId, updateTextParentElement } from "../apiHelpers/apiHelper-Texts.js";
import { fetchQuoteId, updateQuoteParentElement } from "../apiHelpers/apiHelper-Quotes.js";

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
  const elementAsJSON = getIdByHTMLId(el);
  const elementId = `${elementAsJSON.id}`;
  const boxId = e.target.id;
  if (el.classList.contains("image")) {
    const imageJSON = createJSON("imageParentElement", boxId);
    updateImageParentElement(elementId, imageJSON);
  } else if (el.classList.contains("text")) {
    const textJSON = createJSON("textParentElement", boxId);
    updateTextParentElement(elementId, textJSON);
  } else if (el.classList.contains("quote")) {
    const quoteJSON = createJSON("quoteParentElement", boxId);
    updateQuoteParentElement(elementId, quoteJSON);
  }
}

export function removePreviousElement(box) {
  const imagesContainer = document.querySelector(".images-container");
  const textsContainer = document.querySelector(".text-container");
  const quotesContainer = document.querySelector(".quotes-container");
  const previousElement = box.firstChild;
  const elementAsJSON = getIdByHTMLId(previousElement);
  const elementId = `${elementAsJSON.id}`;
  if (previousElement == null) return false;
  if (previousElement.classList.contains("image")) {
    imagesContainer.appendChild(previousElement);
    const imageJSON = createJSON("imageParentElement", "images-container");
    updateImageParentElement(elementId, imageJSON);
  } else if (previousElement.classList.contains("text")) {
    textsContainer.appendChild(previousElement);
    const textJSON = createJSON("textParentElement", "text-container");
    updateTextParentElement(elementId, textJSON);
  } else if (previousElement.classList.contains("quote")) {
    quotesContainer.appendChild(previousElement);
    const quoteJSON = createJSON("quoteParentElement", "quotes-container");
    updateQuoteParentElement(elementId, quoteJSON);
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

export function getIdByHTMLId(el) {
  const visionboardId = document.querySelector(".visionboard-id-input").value;

  if (el == null) return false;
  if (el.classList.contains("image")) return fetchImageId(visionboardId, el.id);
  if (el.classList.contains("text")) return fetchTextId(visionboardId, el.id);
  if (el.classList.contains("quote")) return fetchQuoteId(visionboardId, el.id);
}

export function createJSON(key, value) {
  const jSON = {
    [key]: value,
  };
  return jSON;
}
