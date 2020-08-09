export const createWelcomePage = (visionBoards) => {
  const container = document.createElement("div");


  const img = new Image();
  img.classList.add("logo-image");
  img.src = "./images/logo.png";
  img.alt = "Energós Logo";

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
    span.innerText = `${visionBoard.visionBoardName}`;
    welcomeBox.appendChild(span);
    welcomeDesignBoard.appendChild(welcomeBox);
    welcomeBox.addEventListener("click", (visionBoard) => {
        renderVisionBoard();
      });
  });

  const addVisionBoardDiv = document.createElement("div");
  addVisionBoardDiv.classList.add("add-vision-board");

  const plusSign = document.createElement("div");
  plusSign.classList.add("plus-sign");
  plusSign.innerText = "+";
  addVisionBoardDiv.appendChild(plusSign);
  const form = createAddVisionBoardForm();
  addVisionBoardDiv.appendChild(form);
  addVisionBoardDiv.addEventListener("click", () => {
    renderAddVisionBoardForm(plusSign, form);
  })
  welcomeDesignBoard.appendChild(addVisionBoardDiv);

    container.append(img, header, welcomeDesignBoard);  

    return container;
};

function renderAddVisionBoardForm(plusSign, addNewVisionBoardForm){
    plusSign.style.display = "none";
    addNewVisionBoardForm.style.display = "block";
}

function createAddVisionBoardForm(){
  const addNewVisionBoardForm = document.createElement("div");
  addNewVisionBoardForm.classList.add("add-form");
  addNewVisionBoardForm.style.display = "none";
  const label = document.createElement("label");
  label.innerText = "Enter Your Name:";
  const input = document.createElement("input");
  input.type = "text";
  input.required = "true";
  input.classList.add("vision-board-name");
  const button = document.createElement("button");
  button.innerText = "Submit";
  addNewVisionBoardForm.append(label, input, button);

  return addNewVisionBoardForm;
}


