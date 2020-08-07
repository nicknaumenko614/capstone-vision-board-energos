const fetchVisionBoards = async () => {
  return fetch("http://localhost:8080/api/visionboards").then((response) =>
    response.json()
  );
};

const postNewVisionBoard = async (visionboard) => {
  return fetch("http://localhost:8080/api/visionboards/add", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(visionboard),
  }).then((response) => response.json());
};

const fetchSingleVisionBoard = (visionboardId) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${visionboardId}")`
  ).then((response) => response.json());
};

const updateVisionBoard = async (visionboardId) => {
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

const deleteVisionBoard = async (visionboardId) => {
  return fetch(
    `http://localhost:8080/api/visionboards/${visionboardId}/delete`,
    {
      method: "DELETE",
    }
  ).then((response) => reponse.json());
};
