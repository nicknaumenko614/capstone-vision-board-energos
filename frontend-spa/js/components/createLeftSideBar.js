import { fetchBackgrounds } from "../apiHelpers/apiHelper-Backgrounds.js";

export function createLeftSideBar(visionboard) {
  const sidebar = document.createElement("section");
  sidebar.classList.add("sidebar");

  const buttonsContainer = document.createElement("div");
  buttonsContainer.classList.add("buttons-container");
  addButtonsToContainer(buttonsContainer);

  const sidebarContent = document.createElement("div");
  sidebarContent.classList.add("sidebar-content");

  const templatesContainer = document.createElement("div");
  templatesContainer.classList.add("templates-container");
  populateTemplates(templatesContainer);

  const wallpapersContainer = document.createElement("div");
  wallpapersContainer.classList.add("wallpapers-container");
  populateWallpapers(wallpapersContainer, visionboard);

  const imagesContainer = document.createElement("div");
  imagesContainer.classList.add("images-container");

  const textContainer = document.createElement("div");
  textContainer.classList.add("text-container");

  const quotesContainer = document.createElement("div");
  quotesContainer.classList.add("quotes-container");

  const settingsContainer = document.createElement("div");
  settingsContainer.classList.add("settings-container");

  sidebarContent.append(
    templatesContainer,
    wallpapersContainer,
    imagesContainer,
    textContainer,
    quotesContainer,
    settingsContainer
  );
  sidebar.append(buttonsContainer, sidebarContent);
  return sidebar;
}

export function addButtonsToContainer(el) {
  el.innerHTML = `
        <div class="templates icon-div">
          <i class="material-icons icon-text">view_quilt</i>
        </div>
        <div class="wallpapers icon-div">
          <i class="material-icons icon-text">palette</i>
        </div>
        <div class="images icon-div">
          <i class="material-icons icon-text">image</i>
        </div>
        <div class="text icon-div">
          <i class="material-icons icon-text">text_fields</i>
        </div>
        <div class="quotes icon-div">
          <i class="material-icons icon-text">format_quote</i>
        </div>
        <div class="settings icon-div">
          <i class="material-icons icon-text">settings</i>
        </div>
    `;
}

export function populateTemplates(el) {
  el.innerHTML = `
    <img id="template1" src="/images/templates/design-board1.JPG" />
    <img id="template2" src="/images/templates/design-board2.JPG" />
    <img id="template3" src="/images/templates/design-board3.JPG" />
    <img id="template4" src="/images/templates/design-board4.JPG" />
    <img id="template5" src="/images/templates/design-board5.JPG" />
    <img id="template6" src="/images/templates/design-board6.JPG" />
    `;
}

function populateWallpapers(el, visionboard) {
  el.innerHTML = `
    <div class="color-container">
            <label>Color</label>
            <input class="color-picker" type="color" />
          </div>
          <div class="input-container">
            <label>Image URL</label>
            <input class="add-image" type="text" />
          </div>
          `;

  fetchBackgrounds(`${visionboard.id}`).then((backgrounds) => {
    backgrounds.forEach((background) => {
      const img = new Image();
      img.classList.add("wallpaper");
      img.src = `${background.backgroundLink}`;
      el.appendChild(img);
    });
  });
}
