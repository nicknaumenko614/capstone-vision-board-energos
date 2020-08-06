import { renderDesignBoard } from "./components/renderDesignBoards.js";
import { removePreviousElement } from "./drag-and-drop.js";

const templates = document.querySelectorAll(".templates-container img");
const main = document.querySelector("main");

export function addEventListenersToTemplates() {
  for (let i = 0; i < templates.length; i++) {
    templates[i].addEventListener("click", () => {
      clearDesignBoard();
      const designBoard = renderDesignBoard(i);
      main.appendChild(designBoard);
    });
  }
}

function clearDesignBoard() {
  removeAllElements();
  main.innerHTML = null;
}

function removeAllElements() {
  const boxes = document.querySelectorAll(".box");
  boxes.forEach((box) => {
    removePreviousElement(box);
  });
}
