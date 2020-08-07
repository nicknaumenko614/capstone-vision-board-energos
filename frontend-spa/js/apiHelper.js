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

export const deleteBackground = async (background) => {
    return fetch(
      `http://localhost:8080/api/visionboards/${background}/delete`,
      {
        method: "DELETE",
      }
    ).then((response) => response.json());
  };