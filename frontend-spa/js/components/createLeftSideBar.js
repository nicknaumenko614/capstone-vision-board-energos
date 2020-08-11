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

  const backContainer = document.createElement("div");

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
  populateSettings(settingsContainer);

  const helpContainer = document.createElement("div");
  helpContainer.classList.add("help-container");
  populateHelp(helpContainer);

  sidebarContent.append(
    backContainer,
    templatesContainer,
    wallpapersContainer,
    imagesContainer,
    textContainer,
    quotesContainer,
    settingsContainer,
    helpContainer
  );
  sidebar.append(buttonsContainer, sidebarContent);
  return sidebar;
}

function addButtonsToContainer(el) {
  el.innerHTML = `
        <div class="back-arrow icon-div">
          <i class="material-icons icon-text">reply</i>
        </div>
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
        <div class="help icon-div">
          <i class="material-icons icon-text">help</i>
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
      img.id = `${image.imageHtmlId}`;
      let parent = document.querySelector(`#${image.imageParentElement}`);
      if (parent == null) parent = document.querySelector(`.${image.imageParentElement}`);
      if (parent == null) parent = el;
      parent.appendChild(img);
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
      let parent = document.querySelector(`#${text.textParentElement}`);
      if (parent == null) parent = document.querySelector(`.${text.textParentElement}`);
      if (parent == null) parent = el;
      parent.appendChild(textDiv);
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
      img.id = `${quote.quoteHtmlId}`;
      let parent = document.querySelector(`#${quote.quoteParentElement}`);
      if (parent == null) parent = document.querySelector(`.${quote.quoteParentElement}`);
      if (parent == null) parent = el;
      parent.appendChild(img);
    });
  });
}

function populateSettings(el) {
  el.innerHTML = `
  <div class="dark-theme-toggle-switch">
            <label class="switch-label">Dark Theme</label>
            <label class="switch">
              <input class="dark-theme-checkbox checkboxes" type="checkbox" />
              <span class="slider round"></span>
            </label>
          </div>

          <div class="grid-toggle-switch">
            <label class="switch-label">Show Grid</label>
            <label class="switch">
              <input class="grid-checkbox checkboxes" type="checkbox" checked />
              <span class="slider round"></span>
            </label>
          </div>

          <div class="spacing-container border-settings">
            <label class="switch-label">Spacing</label>
            <input
              type="range"
              min="0"
              max="100"
              value="50"
              class="spacing-slider"
              id="spacing-slider"
            />
          </div>

          <div class="border-radius-container border-settings">
            <label class="switch-label">Border Radius</label>
            <input
              type="range"
              min="0"
              max="50"
              value="50"
              class="spacing-slider"
              id="border-radius-slider"
            />
          </div>

          <div class="border-thickness-container border-settings">
            <label class="switch-label">Border Thickness</label>
            <input
              type="range"
              min="0"
              max="30"
              value="2"
              class="spacing-slider"
              id="border-thickness-slider"
            />
          </div>
          <div class="border-color-container border-settings">
            <label class="switch-label">Border Color</label>
            <input type="color" class="border-color" />
          </div>
          <div class="border-style-container border-settings">
            <label class="switch-label">Border Style</label>
            <select class="border-style">
              <option value="dotted">Dotted</option>
              <option value="dashed">Dashed</option>
              <option value="solid" selected>Solid</option>
              <option value="double">Double</option>
              <option value="ridge">Ridge</option>
              <option value="groove">Groove</option>
              <option value="inset">Inset</option>
              <option value="outset">Outset</option>
              <option value="none">None</option>
            </select>
          </div>
        </div>
  `;
}

function populateHelp(el){
  el.innerHTML = `
  <div class="help-questions">

    <h2>Templates</h2>

    <h3>How do I select a new template for my vision board?</h3>

    <p>Select the Template Icon on the left of the screen and then select desired template from the template gallery. Once selected, the new template will display on the vision board.</p>

    <h2>Backgrounds</h2>

    <h3>How do I add a background color to my vision board?</h3>

    <p>Select the Background Icon on the left of the screen and then click the color block for the color picker to display. Then, select your desired color. The color will then display as the background for your vision board.</p>

    <h3>How do I add a new background image to the gallery?</h3>

    <p>Select the Background Icon on the left of the screen and then click in the Image URL box. Type or paste in the URL for the background image you would like to add and press the 'Enter' key. The background image will then add to the gallery.</p>

    <h3>How do I select a background for my vision board?</h3>

    <p>Select the Background Icon on the left of the screen and then click on the thumbnail of the background image you would like to add to your vision board. The background will then display on your vision board.</p>

  </div>
  `;
}
