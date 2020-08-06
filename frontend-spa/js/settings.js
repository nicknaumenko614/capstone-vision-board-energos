const body = document.body;
const logoImage = document.querySelector(".logo-image");
const darkModeToggleSwitch = document.querySelector(".dark-theme-checkbox");
const icons = document.querySelectorAll(".icon-div i");
const showGridToggleSwitch = document.querySelector(".grid-checkbox");
const spacingSlider = document.querySelector("#spacing-slider");
const borderRadiusSlider = document.querySelector("#border-radius-slider");
const borderThicknessSlider = document.querySelector(
  "#border-thickness-slider"
);
const main = document.querySelector("main");
const borderColorPicker = document.querySelector(".border-color");
const borderStyleSelector = document.querySelector(".border-style");

export function addSettingsEventListeners() {
  darkModeToggleSwitch.addEventListener("click", () => {
    toggleDarkMode();
  });

  showGridToggleSwitch.addEventListener("click", () => {
    toggleShowGrid();
  });

  spacingSlider.addEventListener("mousemove", () => {
    changeSpacing();
  });

  borderRadiusSlider.addEventListener("mousemove", () => {
    changeBorderRadius();
  });

  borderThicknessSlider.addEventListener("mousemove", () => {
    changeBorder();
  });

  borderColorPicker.addEventListener("change", () => {
    changeBorder();
  });

  borderStyleSelector.addEventListener("change", () => {
    changeBorder();
  });
}

function toggleDarkMode() {
  if (darkModeToggleSwitch.checked) {
    body.classList.add("dark");
    logoImage.src = "./images/logo-dark.png";
    logoImage.style.marginTop = "20px";
    logoImage.style.transform = "scale(1)";
    icons.forEach((icon) => icon.classList.add("dark"));
  } else {
    body.classList.remove("dark");
    logoImage.src = "./images/logo.png";
    logoImage.style.marginTop = "";
    logoImage.style.transform = "scale(1.2)";
    icons.forEach((icon) => icon.classList.remove("dark"));
  }
}

function toggleShowGrid() {
  const gridBoxes = document.querySelectorAll(".box");
  if (showGridToggleSwitch.checked) {
    gridBoxes.forEach((box) => (box.style.backgroundColor = ""));
  } else {
    gridBoxes.forEach((box) => (box.style.backgroundColor = "transparent"));
  }
}

function changeSpacing() {
  const elementsWithGridGap = document.querySelectorAll("main div:not(.box)");
  let gap = spacingSlider.value;
  elementsWithGridGap.forEach(
    (element) => (element.style.gridGap = gap + "px")
  );
}

function changeBorderRadius() {
  const gridBoxes = document.querySelectorAll(".box");
  let radius = borderRadiusSlider.value;
  gridBoxes.forEach((box) => (box.style.borderRadius = radius + "%"));
}

function changeBorder() {
  let thickness = borderThicknessSlider.value;
  let style = borderStyleSelector.value;
  let color = borderColorPicker.value;
  main.style.border = thickness + "px " + style + " " + color;
}