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

  const main = document.createElement("main");
  const welcomeDesignBoard = document.createElement("div");
  welcomeDesignBoard.classList.add("welcome-design-board");
  visionBoards.forEach((visionBoard) => {
    const welcomeBox = document.createElement("div");
    welcomeBox.classList.add("welcome-box");
    welcomeDesignBoard.appendChild(welcomeBox);
    main.appendChild(welcomeDesignBoard);
  });

    container.append(img, header, main);  

    return container;
};


