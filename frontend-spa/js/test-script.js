const main = document.querySelector("main");
const icons = document.querySelectorAll(".sidebar i");

main.addEventListener("click", () => {
  let el = event.target;
  toggleFillClassOfImage(el);
  removeBoxShadows();
  addBoxShadowOnTarget(el);
});

function toggleFillClassOfImage(el) {
  el.classList.toggle("fill");
}

function removeBoxShadows() {
  const boxes = document.querySelectorAll(".box");
  boxes.forEach((box) => {
    box.style.boxShadow = "";
    box.style.zIndex = "";
  });
}

function addBoxShadowOnTarget(el) {
  if (el.tagName == "H2") el = el.parentNode;
  if (!el.classList.contains("text") && el.tagName != "IMG") return false;
  el = el.parentNode;
  el.style.boxShadow = "0 0 10px red, 0 0 10px red, 0 0 10px red";
  el.style.zIndex = "100";
}

icons.forEach((icon) => {
  icon.addEventListener("click", () => {
    removeBoxShadows();
  });
});

window.addEventListener("click", () => {
  const el = event.target;
  if (event.target.closest("main") || event.target.closest(".sidebar-right"))
    return false;
  removeBoxShadows();
});
