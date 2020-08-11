import { renderDesignBoard } from "../components/renderDesignBoards.js";
import { removePreviousElement } from "./drag-and-drop.js";

export function addEventListenersToTemplates() {
  const templates = document.querySelectorAll(".templates-container img");
  const main = document.querySelector("main");
  for (let i = 0; i < templates.length; i++) {
    templates[i].addEventListener("click", () => {
      clearDesignBoard();
      const designBoard = renderDesignBoard(i);
      main.appendChild(designBoard);
    });
  }
}

function clearDesignBoard() {
  const main = document.querySelector("main");
  removeAllElements();
  main.innerHTML = null;
}

function removeAllElements() {
  const boxes = document.querySelectorAll(".box");
  boxes.forEach((box) => {
    removePreviousElement(box);
  });
}
