import { toggleDarkMode } from "./settings.js";

const darkModeToggleSwitch = document.querySelector(".dark-theme-checkbox");

darkModeToggleSwitch.addEventListener("click", () => {
  toggleDarkMode();
});
