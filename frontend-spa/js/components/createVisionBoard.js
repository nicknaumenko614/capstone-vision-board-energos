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

  const visionboardIdInput = document.createElement("input");
  visionboardIdInput.classList.add("visionboard-id-input");
  visionboardIdInput.value = `${visionboard.id}`;
  visionboardIdInput.type = "hidden";
  containerBody.appendChild(visionboardIdInput);

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
  renderPreSavedOptions(visionboard);
}

function addAllEventListeners() {
  addSideBarEventListeners();
  addDragAndDropEventListeners();
  addEventListenersToTemplates();
  addSettingsEventListeners();
}

function renderPreSavedOptions(visionboard){
  darkThemeOption(visionboard);
  showGridOption(visionboard);
  gridSpacingOption(visionboard);
}

function darkThemeOption(visionboard){
  if (`${visionboard.themeDark}` == "true"){ 
    const body = document.body;
    const icons = document.querySelectorAll(".icon-div i");
    const logoImage = document.querySelector(".logo-image");
    body.classList.add("dark");
    logoImage.src = "./images/logo-dark.png";
    logoImage.style.marginTop = "20px";
    logoImage.style.transform = "scale(1)";
    icons.forEach((icon) => icon.classList.add("dark"));
    const darkModeToggleSwitch = document.querySelector(".dark-theme-checkbox");
    darkModeToggleSwitch.checked = true;
  } 
}

function showGridOption(visionboard){
  if (`${visionboard.hasGrid}` == "false"){
    const showGridToggleSwitch = document.querySelector(".grid-checkbox");
    const gridBoxes = document.querySelectorAll(".box");
    gridBoxes.forEach((box) => (box.style.backgroundColor = "transparent"));
    showGridToggleSwitch.checked = false;
  }
}

function gridSpacingOption(visionboard){
  const spacingSlider = document.querySelector("#spacing-slider");
  const elementsWithGridGap = document.querySelectorAll("main div:not(.box)");
  const gap = `${visionboard.gridSpacing}`;
  elementsWithGridGap.forEach(
    (element) => (element.style.gridGap = gap)
  );
  spacingSlider.value = parseInt(gap, 10);
}