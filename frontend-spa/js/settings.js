const body = document.body;
const logoImage = document.querySelector(".logo-image");
const darkModeToggleSwitch = document.querySelector(".dark-theme-checkbox");
const icons = document.querySelectorAll(".icon-div i");

export function toggleDarkMode() {
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
