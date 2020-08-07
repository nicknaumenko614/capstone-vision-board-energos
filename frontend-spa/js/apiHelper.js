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

// export const deleteVisionBoard = async (visionboardId) => {
//   return fetch(
//     `http://localhost:8080/api/visionboards/${visionboardId}/delete`,
//     {
//       method: "DELETE",
//     }
//   ).then((response) => response.json());
// };

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
  return fetch(`http://localhost:8080/api/visionboards/${visionBoardId}/add`, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(image),
  }).then((response) => response.json());
};

export const updateImage = async (image) => {
  return fetch(
    `http://localhost:8080/api/images/updateimage`,
    {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(image),
    }
  ).then((response) => response.json());
};

export const deleteBackground = async (imageId) => {
  return fetch(`http://localhost:8080/api/images/${imageId}/delete`, {
    method: "DELETE",
  }).then((response) => response.json());
};

export const fetchTexts = async () => {
  return fetch("http://localhost:8080/api/texts").then((response) =>
    response.json()
  );
};

export const postNewImage = async (visionBoardId, text) => {
  return fetch(`http://localhost:8080/api/visionboards/${visionBoardId}/add`, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(text),
  }).then((response) => response.json());
};

export const updateImage = async (text) => {
  return fetch(
    `http://localhost:8080/api/images/updateimage`,
    {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(text),
    }
  ).then((response) => response.json());
};

export const deleteBackground = async (textId) => {
  return fetch(`http://localhost:8080/api/images/${textId}/delete`, {
    method: "DELETE",
  }).then((response) => response.json());
};