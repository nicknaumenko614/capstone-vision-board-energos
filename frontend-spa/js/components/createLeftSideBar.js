import { fetchBackgrounds } from "../apiHelpers/apiHelper-Backgrounds.js";
import { fetchImages } from "../apiHelpers/apiHelper-Images.js";
import { fetchTexts } from "../apiHelpers/apiHelper-Texts.js";
import { fetchQuotes } from "../apiHelpers/apiHelper-Quotes.js";

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
  populateImages(imagesContainer, visionboard);

  const textContainer = document.createElement("div");
  textContainer.classList.add("text-container");
  populateTexts(textContainer, visionboard);

  const quotesContainer = document.createElement("div");
  quotesContainer.classList.add("quotes-container");
  populateQuotes(quotesContainer, visionboard);

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

function addButtonsToContainer(el) {
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

function populateTemplates(el) {
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

function populateImages(el, visionboard) {
  el.innerHTML = `
    <div class="input-container">
    <label>Image URL</label>
    <input type="text" class="add-image" />
  </div>
    `;

  fetchImages(`${visionboard.id}`).then((images) => {
    images.forEach((image) => {
      const img = new Image();
      img.classList.add("image");
      img.draggable = "true";
      img.src = `${image.imageLink}`;
      el.appendChild(img);
    });
  });
}

function populateTexts(el, visionboard) {
  el.innerHTML = `
  <div class="input-container">
            <label>Text Input</label>
            <input type="text" class="add-text" />
          </div>
  `;

  fetchTexts(`${visionboard.id}`).then((texts) => {
    texts.forEach((text) => {
      const textDiv = document.createElement("div");
      textDiv.classList.add("text");
      textDiv.id = `${text.textHtmlId}`;
      textDiv.draggable = "true";
      const textH2 = document.createElement("h2");
      const content = `${text.textContent}`;
      textH2.contentEditable = "true";
      textH2.innerText = content;
      textDiv.appendChild(textH2);
      el.appendChild(textDiv);
    });
  });
}

function populateQuotes(el, visionboard) {
  el.innerHTML = `
  <div class="input-container">
  <label>Image URL </label>
  <input type="text" class="add-quote" />
</div>
  `;

  fetchQuotes(`${visionboard.id}`).then((quotes) => {
    quotes.forEach((quote) => {
      const img = new Image();
      img.classList.add("quote");
      img.draggable = "true";
      img.src = `${quote.quoteLink}`;
      el.appendChild(img);
    });
  });

}


