const body = document.body;
const logoImage = document.querySelector(".logo-image");
const darkModeToggleSwitch = document.querySelector(".dark-theme-checkbox");


export function toggleDarkMode() {
  body.classList.toggle("dark");
  if (darkModeToggleSwitch.checked){
      logoImage.src = "./images/logo-dark.png";
      logoImage.style.marginTop = "20px";
  } else {
      logoImage.src = "./images/logo.png";
      logoImage.style.marginTop = "";
  }
}
