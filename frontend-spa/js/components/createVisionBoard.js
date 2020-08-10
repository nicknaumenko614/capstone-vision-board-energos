import { clearElementChildren } from "../app.js";
import { renderDesignBoard } from "./renderDesignBoards.js";
import { createLeftSideBar } from "./createLeftSideBar.js";

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
}
