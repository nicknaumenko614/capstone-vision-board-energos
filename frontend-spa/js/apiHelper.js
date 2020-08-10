export const fetchVisionBoards = async () => {
  return fetch("http://localhost:8080/api/visionboards").then((response) =>
    response.json()
  );
};

export const postNewVisionBoard = async (boardName) => {
  return fetch(`http://localhost:8080/api/visionboards/add/${boardName}`, {
    method: "POST",
  }).then((response) => response.json());
};

export const fetchSingleVisionBoard = (visionboardId) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${visionboardId}`
  ).then((response) => response.json());
};

export const updateVisionBoard = async (visionboard) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${visionboard.id}/update`,
    {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(visionboard),
    }
  ).then((response) => response.json());
};

// export const deleteVisionBoard = async (visionboardId) => {
//   return fetch(
//     `http://localhost:8080/api/visionboards/${visionboardId}/delete`,
//     {
//       method: "DELETE",
//     }
//   ).then((response) => response.json());
// };

export const fetchBackgrounds = async (visionBoardId) => {
  return fetch(`http://localhost:8080/api/backgrounds/visionboard/${visionBoardId}`).then((response) =>
    response.json()
  );
};

export const postNewBackgrounds = async (visionBoardId, background) => {
  return fetch(`http://localhost:8080/api/backgrounds/${visionBoardId}/add`, {
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

export const fetchImages = async (visionBoardId) => {
  return fetch(`http://localhost:8080/api/images/visionboard/${visionBoardId}`).then((response) =>
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
  return fetch("http://localhost:8080/api/images/updateimage", {
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

export const fetchTexts = async (visionBoardId) => {
  return fetch(`http://localhost:8080/api/texts/visionboard/${visionBoardId}`).then((response) =>
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

export const fetchQuotes = async (visionBoardId) => {
  return fetch(`http://localhost:8080/api/quotes/visionboard/${visionBoardId}`).then((response) =>
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
