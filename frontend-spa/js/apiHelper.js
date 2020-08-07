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

const fetchSingleVisionBoard = async 