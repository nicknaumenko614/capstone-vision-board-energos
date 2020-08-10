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