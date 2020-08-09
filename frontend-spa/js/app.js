import { addSettingsEventListeners } from "./settings.js";
import { addSideBarEventListeners } from "./sidebar.js";
import { addEventListenersToTemplates } from "./templates.js";
import { addDragAndDropEventListeners } from "./drag-and-drop.js";
import { setupDefaultBoard } from "./components/renderDesignBoards.js";
import { fetchVisionBoards } from "./apiHelper.js";

export const renderPage = () => {
  const body = document.body;

  clearElementChildren(body);
};

export const clearElementChildren = (element) => {
  while (element.firstChild) {
    element.firstChild.remove();
  }
};

renderPage();

// fetchVisionBoards().then((visionBoards) => {
//   renderPage(visionBoards);
// });

// setupDefaultBoard();
// addSideBarEventListeners();
// addEventListenersToTemplates();
// addSettingsEventListeners();
// addDragAndDropEventListeners();

// how to get height for elements to send in JSON (API)
// let el = document.querySelector(".my-element");
// let height = window.getComputedStyle(el).getPropertyValue("height");
