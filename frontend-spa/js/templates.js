import { renderDesignBoard } from "./components/renderDesignBoards.js";
import { addAllEventListeners } from "./app.js";

const templates = document.querySelectorAll(".templates-container img");
const main = document.querySelector("main");

export function addEventListenersToTemplates() {
  for (let i = 0; i < templates.length; i++) {
    templates[i].addEventListener("click", () => {
      let boxes = document.querySelectorAll(".box");
      clearDesignBoard();
      const designBoard = renderDesignBoard(i);
      main.appendChild(designBoard);
      
    });
  }
}

function clearDesignBoard() {
  main.innerHTML = null;
}
