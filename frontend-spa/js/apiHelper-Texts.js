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
  
  export const deleteText = async (textId) => {
    return fetch(`http://localhost:8080/api/texts/${textId}/delete`, {
      method: "DELETE",
    }).then((response) => response.json());
  };
  
  export const updateTextContent = async (id, text) => {
    return fetch(`http://localhost:8080/api/texts/${id}/updateTextContent`, {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(text),
    }).then((response) => response.json());
  };
  
  export const updateFontSize = async (id, text) => {
    return fetch(`http://localhost:8080/api/texts/${id}/updateFontSize`, {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(text),
    }).then((response) => response.json());
  };
  
  export const updateTextHasFontShadow = async (id, text) => {
    return fetch(`http://localhost:8080/api/texts/${id}/updateTextHasFontShadow`, {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(text),
    }).then((response) => response.json());
  };
  
  export const updateFontColor = async (id, text) => {
    return fetch(`http://localhost:8080/api/texts/${id}/updateFontColor`, {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(text),
    }).then((response) => response.json());
  };
  
  export const updateFontFamily = async (id, text) => {
    return fetch(`http://localhost:8080/api/texts/${id}/updateFontFamily`, {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(text),
    }).then((response) => response.json());
  };
  
  export const updateTextIsFontBold = async (id, text) => {
    return fetch(`http://localhost:8080/api/texts/${id}/updateTextIsFontBold`, {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(text),
    }).then((response) => response.json());
  };
  
  export const updateTextIsFontItalicized = async (id, text) => {
    return fetch(`http://localhost:8080/api/texts/${id}/updateTextIsFontItalicized`, {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(text),
    }).then((response) => response.json());
  };
  
  export const updateTextIsFontUnderlined = async (id, text) => {
    return fetch(`http://localhost:8080/api/texts/${id}/updateTextIsFontUnderlined`, {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(text),
    }).then((response) => response.json());
  };
  
  export const updateTextParentElement = async (id, text) => {
    return fetch(`http://localhost:8080/api/texts/${id}/updateTextParentElement`, {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(text),
    }).then((response) => response.json());
  };