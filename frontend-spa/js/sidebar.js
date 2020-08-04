const sidebar = document.querySelector(".sidebar");
const sidebarContent = document.querySelector(".sidebar-content");
const main = document.querySelector("main");
const icons = document.querySelectorAll(".icon-div i");
const contentContainers = document.querySelectorAll(".sidebar-content > div");
const addTextInput = document.querySelector(".add-text");
const inputContainerDiv = document.querySelector(".text-container .input-container");
const backgroundColorPickerInput = document.querySelector(".wallpapers-container .color-picker");
const backgroundAddImageInput = document.querySelector(".wallpapers-container .add-image");

export function addSideBarEventListeners() {
  for (let i = 0; i < icons.length; i++) {
    icons[i].addEventListener("click", () => {
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
    });
  }

  setTimeout(() => {
    main.addEventListener("mouseover", () => {
      sidebarContent.style.width = "0";

      for (let i = 0; i < icons.length; i++) {
        icons[i].classList.add("icon-text");
        icons[i].classList.remove("active");
      }

      setTimeout(() => {
        sidebarContent.style.display = "none";
      }, 300);
    });
  });

  addTextInput.addEventListener("change", () => {
    createNewTextElement();
  });

  backgroundColorPickerInput.addEventListener("change", () => {
    let color = backgroundColorPickerInput.value;
    main.style.backgroundColor = color;
  });
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
  inputContainerDiv.parentNode.insertBefore(textDiv, inputContainerDiv.nextSibling);
  addTextInput.value = "";
}

function checkUrl(url) {
  return url.match(/\.(jpeg|jpg|png|gif|tiff)$/) != null;
}

