import {clearElementChildren} from "../app.js";

export function createVisionBoard(visionBoard){
    const containerBody = document.querySelector(".container-body");

    clearElementChildren(containerBody);
    
    const image = new Image();
    image.classList.add("logo-image");
    image.src = "./images/logo.png";
    image.alt = "Energós Logo";

    containerBody.appendChild(createLeftSideBar());
}