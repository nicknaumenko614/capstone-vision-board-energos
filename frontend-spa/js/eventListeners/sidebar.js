import { drag } from "./drag-and-drop.js";

const sidebar = document.querySelector(".sidebar");
const sidebarContent = document.querySelector(".sidebar-content");
const main = document.querySelector("main");
const icons = document.querySelectorAll(".icon-div i");
const contentContainers = document.querySelectorAll(".sidebar-content > div");
const addTextInput = document.querySelector(".add-text");
const inputContainerDiv = document.querySelector(
  ".text-container .input-container"
);
const backgroundColorPickerInput = document.querySelector(
  ".wallpapers-container .color-picker"
);
const backgroundAddImageInput = document.querySelector(
  ".wallpapers-container .add-image"
);
const backgroundImageInputContainer = document.querySelector(
  ".wallpapers-container .input-container"
);
// const presetWallpaperImages = document.querySelectorAll(
//   ".wallpapers-container img"
// );
const addImageInput = document.querySelector(".images-container .add-image");
const imageInputContainer = document.querySelector(
  ".images-container .input-container"
);
// const presetImages = document.querySelectorAll(".images-container img");
const addQuoteInput = document.querySelector(".add-quote");
// const presetQuotes = document.querySelectorAll(".quotes-container img");
const quoteInputContainer = document.querySelector(
  ".quotes-container .input-container"
);
// const presetTexts = document.querySelectorAll(".text");

export function addSideBarEventListeners() {
  for (let i = 0; i < icons.length; i++) {
    icons[i].addEventListener("click", () => {
      addHoverEffectsForIcons(i);
    });
  }

  sidebar.addEventListener("click", () => {
    sidebarClickEventListener();
  });

  sidebar.addEventListener("dragstart", () => {
    sidebarDragEventListener();
  });

  window.addEventListener("mouseover", () => {
    hideSidebarContent();
  });

  addTextInput.addEventListener("change", () => {
    createNewTextElement();
  });

  backgroundColorPickerInput.addEventListener("change", () => {
    changeBackgroundColor();
  });

  backgroundAddImageInput.addEventListener("change", () => {
    createNewBackgroundImage();
  });

  addImageInput.addEventListener("change", () => {
    createNewImage();
  });

  addQuoteInput.addEventListener("change", () => {
    createNewQuote();
  });

  // fillArraysWithPresetElements();
  // addEventListenerToWallpaperImages();
  // addEventListenersToImages();
  // addEventListenersToQuotes();
  // addEventListenerToTexts();
}

// function fillArraysWithPresetElements() {
//   presetWallpaperImages.forEach((img) => {
//     wallpaperImages.push(img);
//   });
//   presetImages.forEach((img) => {
//     images.push(img);
//   });
//   presetQuotes.forEach((quote) => {
//     quotes.push(quote);
//   });
//   presetTexts.forEach((text) => {
//     texts.push(text);
//   });
// }

function changeBackgroundColor() {
  let color = backgroundColorPickerInput.value;
  main.style.backgroundColor = color;
  main.style.backgroundImage = "";
}

function addHoverEffectsForIcons(i) {
  sidebarContent.style.display = "block";
  icons.forEach((icon) => icon.classList.remove("icon-text"));
  icons.forEach((icon) => icon.classList.remove("active"));
  icons[i].classList.add("active");
  setTimeout(() => {
    sidebarContent.style.width = "16vw";
  }, 50);
  setTimeout(() => {
    contentContainers.forEach(
      (container) => (container.style.display = "none")
    );
    contentContainers[i].style.display = "flex";
  }, 300);
}

function hideSidebarContent() {
  const el = event.target;
  if (event.target.closest(".sidebar")) return false;

  sidebarContent.style.width = "0";

  for (let i = 0; i < icons.length; i++) {
    icons[i].classList.add("icon-text");
    icons[i].classList.remove("active");
  }

  setTimeout(() => {
    sidebarContent.style.display = "none";
  }, 300);
}

let textNumber = 0;
function createNewTextElement() {
  let textDiv = document.createElement("div");
  textDiv.classList.add("text");
  textDiv.id = "add-text-" + textNumber;
  textNumber++;
  textDiv.draggable = "true";
  let textH2 = document.createElement("h2");
  let textFromInput = addTextInput.value;
  textH2.contentEditable = "true";
  textH2.innerText = textFromInput;
  textDiv.appendChild(textH2);
  inputContainerDiv.parentNode.insertBefore(
    textDiv,
    inputContainerDiv.nextSibling
  );
  addTextInput.value = "";
  // texts.push(textDiv);
  // addEventListenerToTexts();
}

// function addEventListenerToTexts() {
//   texts.forEach((text) => {
//     text.addEventListener("dragstart", () => {
//       drag(event);
//     });
//   });
// }

function checkUrl(url) {
  return url.match(/\.(jpeg|jpg|png|gif|tiff)/) != null;
}

let wallpaperNumber = 0;
function createNewBackgroundImage() {
  let url = backgroundAddImageInput.value;
  let urlToCheck = checkUrl(url);
  if (urlToCheck === false) {
    backgroundAddImageInput.value = "";
    return false;
  }
  const img = createImageToAdd(url, "wallpaper", wallpaperNumber);

  // const img = new Image();
  // img.src = url;
  // img.id = "add-" + className + "-" + number;
  // img.classList.add(className);
  backgroundImageInputContainer.parentNode.insertBefore(
    img,
    backgroundImageInputContainer.nextSibling
  );
  backgroundAddImageInput.value = "";
  wallpaperNumber++;
  // wallpaperImages.push(img);
  // addEventListenerToWallpaperImages();
}

// function addEventListenerToWallpaperImages() {
//   for (let i = 0; i < wallpaperImages.length; i++) {
//     wallpaperImages[i].addEventListener("click", () => {
//       main.style.backgroundImage = "url(" + wallpaperImages[i].src + ")";
//     });
//   }
// }

let imageNumber = 0;
function createNewImage() {
  let url = addImageInput.value;
  let urlToCheck = checkUrl(url);
  if (urlToCheck === false) {
    addImageInput.value = "";
    return false;
  }
  const img = createImageToAdd(url, "image", imageNumber);

  // const img = new Image();
  // img.src = url;
  // img.id = "add-" + className + "-" + number;
  // img.classList.add(className);
  imageInputContainer.parentNode.insertBefore(
    img,
    imageInputContainer.nextSibling
  );
  addImageInput.value = "";
  imageNumber++;
  // images.push(img);
  // addEventListenersToImages();
}

// function addEventListenersToImages() {
//   for (let i = 0; i < images.length; i++) {
//     images[i].addEventListener("dragstart", () => {
//       drag(event);
//     });
//   }
// }

let quoteNumber = 0;
function createNewQuote() {
  let url = addQuoteInput.value;
  let urlToCheck = checkUrl(url);
  if (urlToCheck === false) {
    addQuoteInput.value = "";
    return false;
  }
  const img = createImageToAdd(url, "quote", quoteNumber);

  // const img = new Image();
  // img.src = url;
  // img.id = "add-" + className + "-" + number;
  // img.classList.add(className);
  quoteInputContainer.parentNode.insertBefore(
    img,
    quoteInputContainer.nextSibling
  );
  addQuoteInput.value = "";
  quoteNumber++;
  // quotes.push(img);
  // addEventListenersToQuotes();
}

// function addEventListenersToQuotes() {
//   for (let i = 0; i < quotes.length; i++) {
//     quotes[i].addEventListener("dragstart", () => {
//       drag(event);
//     });
//   }
// }

function sidebarClickEventListener() {
  const el = event.target;
  if (el.classList.contains("wallpaper")) {
    const src = el.src;
    main.style.backgroundImage = "url(" + src + ")";
  }
}

function sidebarDragEventListener() {
  const el = event.target;
  if (
    el.classList.contains("image") ||
    el.classList.contains("text") ||
    el.classList.contains("quote")
  )
    drag(el);
}

function createImageToAdd(url, className, number) {
  const img = new Image();
  img.src = url;
  img.id = "add-" + className + "-" + number;
  img.classList.add(className);
  return img;
}
