import { renderDesignBoard } from "../components/renderDesignBoards.js";
import { removePreviousElement, createJSON } from "./drag-and-drop.js";
import { updateVisionBoardGridTemplateName } from "../apiHelpers/apiHelper-VisionBoards.js";

export function addEventListenersToTemplates() {
  const templates = document.querySelectorAll(".templates-container img");
  const main = document.querySelector("main");
  for (let i = 0; i < templates.length; i++) {
    templates[i].addEventListener("click", () => {
      clearDesignBoard();
      const designBoard = renderDesignBoard(i);
      main.appendChild (designBoard);
    const visionBoardTemplateJSON = createJSON ("gridTemplateName", i);
    const visionBoardId = document.querySelector(".visionboard-id-input").value;
    updateVisionBoardGridTemplateName(visionBoardId, visionBoardTemplateJSON);
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
