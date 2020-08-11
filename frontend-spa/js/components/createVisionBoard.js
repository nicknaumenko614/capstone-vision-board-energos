import { clearElementChildren } from "../app.js";
import { renderDesignBoard } from "./renderDesignBoards.js";
import { createLeftSideBar } from "./createLeftSideBar.js";
import { addSideBarEventListeners } from "../eventListeners/sidebar.js";
import { addDragAndDropEventListeners } from "../eventListeners/drag-and-drop.js";
import { addEventListenersToTemplates } from "../eventListeners/templates.js";
import { addSettingsEventListeners } from "../eventListeners/settings.js";

export function renderVisionBoard(visionboard) {
  const containerBody = document.querySelector(".container-body");

  clearElementChildren(containerBody);

  const image = new Image();
  image.classList.add("logo-image");
  image.src = "./images/logo.png";
  image.alt = "Energós Logo";

  containerBody.appendChild(image);
  containerBody.appendChild(createLeftSideBar(visionboard));

  const main = document.createElement("main");
  main.appendChild(renderDesignBoard(`${visionboard.gridTemplateName}`));
  containerBody.appendChild(main);

  addAllEventListeners();
}

function addAllEventListeners() {
  addSideBarEventListeners();
  addDragAndDropEventListeners();
  addEventListenersToTemplates();
  addSettingsEventListeners();
}
