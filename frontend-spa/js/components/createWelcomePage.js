import { renderPage } from "../app";

let formShown = "false";

export const createWelcomePage = (visionBoards) => {
  const container = document.createElement("div");


  const img = new Image();
  img.classList.add("logo-image");
  img.src = "./images/logo.png";
  img.alt = "Energos Logo";

  const header = document.createElement("header");
  header.innerHTML = `
    <div class="welcome-design">
        <h1>Welcome!</h1>
        <h2>Choose Your Vision Board</h2>
      </div>
    `;

  const welcomeDesignBoard = document.createElement("div");
  welcomeDesignBoard.classList.add("welcome-design-board");
  visionBoards.forEach((visionBoard) => {
    const welcomeBox = document.createElement("div");
    welcomeBox.classList.add("welcome-box");
    const span = document.createElement("span");
    span.innerText = visionBoard;
    welcomeBox.appendChild(span);
    welcomeDesignBoard.appendChild(welcomeBox);
    welcomeBox.addEventListener("click", (visionBoard) => {
        renderVisionBoard();
      });
  });

  const addVisionBoardDiv = document.createElement("div");
  addVisionBoardDiv.classList.add("add-vision-board");
  addVisionBoardDiv.innerText = "+";
  addVisionBoardDiv.addEventListener("click", () => {
    if(formShown === "false") renderAddVisionBoardForm(addVisionBoardDiv);
  })
  welcomeDesignBoard.appendChild(addVisionBoardDiv);

    container.append(img, header, welcomeDesignBoard);  

    return container;
};

function renderAddVisionBoardForm(addVisionBoardDiv){
    addVisionBoardDiv.innerHTML = `
    <label>Vision Board Name</label>
    `
}


