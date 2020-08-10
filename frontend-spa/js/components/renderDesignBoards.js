export function renderDesignBoard(i) {
  i = parseInt(i);
  if (i === 0) return renderDesignBoard1();
  if (i === 1) return renderDesignBoard2();
  if (i === 2) return renderDesignBoard3();
  if (i === 3) return renderDesignBoard4();
  if (i === 4) return renderDesignBoard5();
  if (i === 5) return renderDesignBoard6();
}

function renderDesignBoard1() {
    const designBoard = document.createElement("div");
    designBoard.classList.add("design-board");
    designBoard.innerHTML = `
    <div class="row">
    <div class="box"></div>
    <div class="box"></div>
    <div class="box"></div>
  </div>
  <div class="row">
    <div class="box"></div>
    <div class="box"></div>
    <div class="box"></div>
  </div>
  <div class="row">
    <div class="box"></div>
    <div class="box"></div>
    <div class="box"></div>
  </div>
    `
    return designBoard;
}

function renderDesignBoard2() {
  const designBoard = document.createElement("div");
  designBoard.classList.add("design-board2");
  designBoard.innerHTML = `
  <div class="column-left">
          <div class="row-single">
            <div class="box"></div>
          </div>
          <div class="row-double">
            <div class="box"></div>
            <div class="box"></div>
          </div>
        </div>
        <div class="column-right">
          <div class="row-double">
            <div class="box"></div>
            <div class="box"></div>
          </div>
          <div class="row-single">
            <div class="box"></div>
          </div>
        </div>
  `
  return designBoard;
}

function renderDesignBoard3() {
  const designBoard = document.createElement("div");
  designBoard.classList.add("design-board3");
  designBoard.innerHTML = `
  <div class="column-left">
          <div class="box"></div>
        </div>
        <div class="column-right">
          <div class="box"></div>
          <div class="box"></div>
          <div class="box"></div>
        </div>
  `
  return designBoard;
}

function renderDesignBoard4() {
  const designBoard = document.createElement("div");
  designBoard.classList.add("design-board4");
  designBoard.innerHTML = `
  <div class="column-end">
          <div class="box"></div>
          <div class="box"></div>
          <div class="box"></div>
          <div class="box"></div>
        </div>
        <div class="column-middle">
          <div class="row-end">
            <div class="box"></div>
            <div class="box"></div>
            <div class="box"></div>
          </div>
          <div class="row-middle">
            <div class="box"></div>
          </div>
          <div class="row-end">
            <div class="box"></div>
            <div class="box"></div>
            <div class="box"></div>
          </div>
        </div>
        <div class="column-end">
          <div class="box"></div>
          <div class="box"></div>
          <div class="box"></div>
          <div class="box"></div>
        </div>
  `
  return designBoard;
}

function renderDesignBoard5() {
  const designBoard = document.createElement("div");
  designBoard.classList.add("design-board5");
  designBoard.innerHTML = `
  <div class="column-left">
          <div class="row-top">
            <div class="box"></div>
            <div class="box"></div>
          </div>
          <div class="row-bottom">
            <div class="box"></div>
            <div class="box"></div>
          </div>
        </div>
        <div class="column-right">
          <div class="row-top">
            <div class="box"></div>
          </div>
          <div class="row-middle">
            <div class="box"></div>
          </div>
          <div class="row-bottom">
            <div class="box"></div>
            <div class="box"></div>
          </div>
        </div>
  `
  return designBoard;
}

function renderDesignBoard6() {
  const designBoard = document.createElement("div");
  designBoard.classList.add("design-board6");
  designBoard.innerHTML = `
  <div class="column-end">
          <div class="box"></div>
          <div class="box"></div>
          <div class="box"></div>
        </div>
        <div class="column-middle">
          <div class="box"></div>
        </div>
        <div class="column-end">
          <div class="box"></div>
          <div class="box"></div>
          <div class="box"></div>
        </div>
  `
  return designBoard;
}