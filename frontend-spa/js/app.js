import { addSettingsEventListeners } from "./settings.js";
import { addSideBarEventListeners } from "./sidebar.js";
import { addEventListenersToTemplates } from "./templates.js";
import { addDragAndDropEventListeners } from "./drag-and-drop.js";

export function addAllEventListeners() {
  addSettingsEventListeners();
  addSideBarEventListeners();
  addEventListenersToTemplates();
  addDragAndDropEventListeners();
}

addAllEventListeners();

// how to get height for elements to send in JSON (API)
// let el = document.querySelector(".my-element");
// let height = window.getComputedStyle(el).getPropertyValue("height");
