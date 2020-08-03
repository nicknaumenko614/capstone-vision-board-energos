const body = document.body;
const logoImage = document.querySelector(".logo-image");
const darkModeToggleSwitch = document.querySelector(".dark-theme-checkbox");
const icons = document.querySelectorAll(".icon-div i");
const showGridToggleSwitch = document.querySelector(".grid-checkbox");
const gridBoxes = document.querySelectorAll(".box");


export function addSettingsEventListeners() {
  darkModeToggleSwitch.addEventListener("click", () => {
    toggleDarkMode();
  });

  showGridToggleSwitch.addEventListener("click", () => {
    toggleShowGrid();
  });
}

function toggleDarkMode() {
  body.classList.toggle("dark");
  if (darkModeToggleSwitch.checked) {
    logoImage.src = "./images/logo-dark.png";
    logoImage.style.marginTop = "20px";
    logoImage.style.transform = "scale(1)";
  } else {
    logoImage.src = "./images/logo.png";
    logoImage.style.marginTop = "";
    logoImage.style.transform = "scale(1.2)";
  }

  icons.forEach((icon) => icon.classList.toggle("dark"));
}

function toggleShowGrid() {
  if (showGridToggleSwitch.checked) {
    gridBoxes.forEach((box)  => box.style.backgroundColor ="");
  } else {
    gridBoxes.forEach((box)  => box.style.backgroundColor ="transparent" );
  }
}