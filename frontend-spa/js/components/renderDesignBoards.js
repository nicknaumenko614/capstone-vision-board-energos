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
    <div class="box" id="box1"></div>
    <div class="box" id="box2"></div>
    <div class="box" id="box3"></div>
  </div>
  <div class="row">
    <div class="box" id="box4"></div>
    <div class="box" id="box5"></div>
    <div class="box" id="box6"></div>
  </div>
  <div class="row">
    <div class="box" id="box7"></div>
    <div class="box" id="box8"></div>
    <div class="box" id="box9"></div>
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
            <div class="box" id="box10"></div>
          </div>
          <div class="row-double">
            <div class="box" id="box11"></div>
            <div class="box" id="box12"></div>
          </div>
        </div>
        <div class="column-right">
          <div class="row-double">
            <div class="box" id="box13"></div>
            <div class="box" id="box14"></div>
          </div>
          <div class="row-single">
            <div class="box" id="box15"></div>
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
          <div class="box" id="box16"></div>
        </div>
        <div class="column-right">
          <div class="box" id="box17"></div>
          <div class="box" id="box18"></div>
          <div class="box" id="box19"></div>
        </div>
  `
  return designBoard;
}

function renderDesignBoard4() {
  const designBoard = document.createElement("div");
  designBoard.classList.add("design-board4");
  designBoard.innerHTML = `
  <div class="column-end">
          <div class="box" id="box20"></div>
          <div class="box" id="box21"></div>
          <div class="box" id="box22"></div>
          <div class="box" id="box23"></div>
        </div>
        <div class="column-middle">
          <div class="row-end">
            <div class="box" id="box24"></div>
            <div class="box" id="box25"></div>
            <div class="box" id="box26"></div>
          </div>
          <div class="row-middle">
            <div class="box" id="box27"></div>
          </div>
          <div class="row-end">
            <div class="box" id="box28"></div>
            <div class="box" id="box29"></div>
            <div class="box" id="box30"></div>
          </div>
        </div>
        <div class="column-end">
          <div class="box" id="box31"></div>
          <div class="box" id="box32"></div>
          <div class="box" id="box33"></div>
          <div class="box" id="box34"></div>
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
            <div class="box" id="box35"></div>
            <div class="box" id="box36"></div>
          </div>
          <div class="row-bottom">
            <div class="box" id="box37"></div>
            <div class="box" id="box38"></div>
          </div>
        </div>
        <div class="column-right">
          <div class="row-top">
            <div class="box" id="box39"></div>
          </div>
          <div class="row-middle">
            <div class="box" id="box40"></div>
          </div>
          <div class="row-bottom">
            <div class="box" id="box41"></div>
            <div class="box" id="box42"></div>
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
          <div class="box" id="box43"></div>
          <div class="box" id="box44"></div>
          <div class="box" id="box45"></div>
        </div>
        <div class="column-middle">
          <div class="box" id="box46"></div>
        </div>
        <div class="column-end">
          <div class="box" id="box47"></div>
          <div class="box" id="box48"></div>
          <div class="box" id="box49"></div>
        </div>
  `
  return designBoard;
}