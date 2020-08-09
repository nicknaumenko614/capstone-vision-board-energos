export const fetchVisionBoards = async () => {
  return fetch("http://localhost:8080/api/visionboards").then((response) =>
    response.json()
  );
};

export const postNewVisionBoard = async (visionboard) => {
  return fetch("http://localhost:8080/api/visionboards/add", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(visionboard),
  }).then((response) => response.json());
};

export const fetchSingleVisionBoard = (visionboardId) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${visionboardId}")`
  ).then((response) => response.json());
};

export const updateVisionBoard = async (visionboardId) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${visionboardId}/update`,
    {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(visionboard),
    }
  ).then((response) => response.json());
};

export const deleteVisionBoard = async (visionboardId) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${visionboardId}/delete`,
    {
      method: "DELETE",
    }
  ).then((response) => response.json());
};

export const fetchBackgrounds = async () => {
  return fetch("http://localhost:8080/api/backgrounds").then((response) =>
    response.json()
  );
};

export const postNewBackgrounds = async (background) => {
  return fetch("http://localhost:8080/api/background/add", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(background),
  }).then((response) => response.json());
};

export const deleteBackground = async (backgroundId) => {
  return fetch(`http://localhost:8080/api/backgrounds/${backgroundId}/delete`, {
    method: "DELETE",
  }).then((response) => response.json());
};

export const fetchImages = async () => {
  return fetch("http://localhost:8080/api/images").then((response) =>
    response.json()
  );
};

export const postNewImage = async (visionBoardId, image) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${visionBoardId}/addimage`,
    {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(image),
    }
  ).then((response) => response.json());
};

export const updateImage = async (image) => {
  return fetch(`http://localhost:8080/api/images/updateimage`, {
    method: "PATCH",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(image),
  }).then((response) => response.json());
};

export const deleteImage = async (imageId) => {
  return fetch(`http://localhost:8080/api/images/${imageId}/delete`, {
    method: "DELETE",
  }).then((response) => response.json());
};

export const fetchTexts = async () => {
  return fetch("http://localhost:8080/api/texts").then((response) =>
    response.json()
  );
};

export const postText = async (visionBoardId, text) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${visionBoardId}/addtext`,
    {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(text),
    }
  ).then((response) => response.json());
};

export const updateText = async (text) => {
  return fetch(`http://localhost:8080/api/texts/updatetext`, {
    method: "PATCH",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(text),
  }).then((response) => response.json());
};

export const deleteText = async (textId) => {
  return fetch(`http://localhost:8080/api/texts/${textId}/delete`, {
    method: "DELETE",
  }).then((response) => response.json());
};

export const fetchQuotes = async () => {
  return fetch("http://localhost:8080/api/quotes").then((response) =>
    response.json()
  );
};

export const postNewQuote = async (visionBoardId, quote) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${visionBoardId}/addquote`,
    {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(quote),
    }
  ).then((response) => response.json());
};

export const updateQuote = async (quote) => {
  return fetch(`http://localhost:8080/api/quotes/updatequote`, {
    method: "PATCH",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(quote),
  }).then((response) => response.json());
};

export const deleteQuote = async (quoteId) => {
  return fetch(`http://localhost:8080/api/quotes/${quoteId}/delete`, {
    method: "DELETE",
  }).then((response) => response.json());
};
