import { addSettingsEventListeners } from "./settings.js";
import { addSideBarEventListeners } from "./sidebar.js";
import { addEventListenersToTemplates } from "./templates.js";
import { addDragAndDropEventListeners } from "./drag-and-drop.js";
import { setupDefaultBoard } from "./components/renderDesignBoards.js";
import { fetchVisionBoards, updateVisionBoard } from "./apiHelper.js";
import { createWelcomePage } from "./components/createWelcomePage.js";

export const renderPage = (visionBoards) => {
  const containerBody = document.querySelector(".container-body");

  clearElementChildren(containerBody);
  containerBody.appendChild(createWelcomePage(visionBoards));
};

export const clearElementChildren = (element) => {
  while (element.firstChild) {
    element.firstChild.remove();
  }
};

fetchVisionBoards().then((visionBoards) => {
  renderPage(visionBoards);
});

const myjson = {
  "hasGrid": "true"
}

updateVisionBoard(1, myjson).then(visionBoard =>{
  console.log(visionBoard);

});

// setupDefaultBoard();
// addSideBarEventListeners();
// addEventListenersToTemplates();
// addSettingsEventListeners();
// addDragAndDropEventListeners();

// how to get height for elements to send in JSON (API)
// let el = document.querySelector(".my-element");
// let height = window.getComputedStyle(el).getPropertyValue("height");
