export const fetchBackgrounds = async (visionBoardId) => {
  return fetch(
    `http://localhost:8080/api/backgrounds/visionboard/${visionBoardId}`
  ).then((response) => response.json());
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
