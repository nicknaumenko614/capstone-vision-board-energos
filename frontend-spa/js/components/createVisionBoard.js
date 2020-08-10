import {clearElementChildren} from "../app.js";
import { renderDesignBoard } from "./renderDesignBoards.js";

export function renderVisionBoard(visionBoard){
    const containerBody = document.querySelector(".container-body");

    clearElementChildren(containerBody);

    const image = new Image();
    image.classList.add("logo-image");
    image.src = "./images/logo.png";
    image.alt = "Energós Logo";
    
    containerBody.appendChild(image);
    containerBody.appendChild(createLeftSideBar());

    const main = document.createElement("main");
    main.appendChild(renderDesignBoard(`${visionBoard.gridTemplateName}`));
    containerBody.appendChild(main);
}

