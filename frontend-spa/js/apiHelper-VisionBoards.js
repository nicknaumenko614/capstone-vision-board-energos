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

// export const deleteVisionBoard = async (visionboardId) => {
//   return fetch(
//     `http://localhost:8080/api/visionboards/${visionboardId}/delete`,
//     {
//       method: "DELETE",
//     }
//   ).then((response) => response.json());
// };

export const updateVisionBoardThemeDark = async (id, visionboard) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${id}/updateThemeDark`,
    {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(visionboard),
    }
  ).then((response) => response.json());
};

export const updateVisionBoardHasGrid = async (id, visionboard) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${id}/updateHasGrid`,
    {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(visionboard),
    }
  ).then((response) => response.json());
};

export const updateVisionBoardGridSpacing = async (id, visionboard) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${id}/updateGridSpacing`,
    {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(visionboard),
    }
  ).then((response) => response.json());
};

export const updateVisionBoardGridBorderRadius = async (id, visionboard) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${id}/updateGridBorderRadius`,
    {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(visionboard),
    }
  ).then((response) => response.json());
};

export const updateVisionBoardGridBorderThickness = async (id, visionboard) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${id}/updateGridBorderThickness`,
    {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(visionboard),
    }
  ).then((response) => response.json());
};

export const updateVisionBoardGridBorderColor = async (id, visionboard) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${id}/updateGridBorderColor`,
    {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(visionboard),
    }
  ).then((response) => response.json());
};

export const updateVisionBoardGridBorderStyle = async (id, visionboard) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${id}/updateGridBorderStyle`,
    {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(visionboard),
    }
  ).then((response) => response.json());
};

export const updateVisionBoardBackgroundImageLink = async (id, visionboard) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${id}/updateBackgroundImageLink`,
    {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(visionboard),
    }
  ).then((response) => response.json());
};

export const updateVisionBoardBackgroundColor = async (id, visionboard) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${id}/updateBackgroundColor`,
    {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(visionboard),
    }
  ).then((response) => response.json());
};

export const updateVisionBoardGridTemplateName = async (id, visionboard) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${id}/updateGridTemplateName`,
    {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(visionboard),
    }
  ).then((response) => response.json());
};