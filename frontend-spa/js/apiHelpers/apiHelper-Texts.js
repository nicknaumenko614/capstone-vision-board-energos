export const fetchTexts = async (visionBoardId) => {
  return fetch(
    `http://localhost:8080/api/texts/visionboard/${visionBoardId}`
  ).then((response) => response.json());
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

export const updateHasFontShadow = async (id, text) => {
  return fetch(`http://localhost:8080/api/texts/${id}/updateHasFontShadow`, {
    method: "PATCH",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(text),
  }).then((response) => response.json());
};

export const updateFontShadowColor = async (id, text) => {
  return fetch(`http://localhost:8080/api/texts/${id}/updateFontShadowColor`, {
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

export const updateIsFontBold = async (id, text) => {
  return fetch(`http://localhost:8080/api/texts/${id}/updateIsFontBold`, {
    method: "PATCH",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(text),
  }).then((response) => response.json());
};

export const updateIsFontItalicized = async (id, text) => {
  return fetch(`http://localhost:8080/api/texts/${id}/updateIsFontItalicized`, {
    method: "PATCH",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(text),
  }).then((response) => response.json());
};

export const updateIsFontUnderlined = async (id, text) => {
  return fetch(`http://localhost:8080/api/texts/${id}/updateIsFontUnderlined`, {
    method: "PATCH",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(text),
  }).then((response) => response.json());
};

export const updateTextParentElement = async (id, text) => {
  return fetch(
    `http://localhost:8080/api/texts/${id}/updateTextParentElement`,
    {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(text),
    }
  ).then((response) => response.json());
};

export const fetchTextId = async (visionBoardId, textHtmlId) => {
  return fetch(
    `http://localhost:8080/api/${visionBoardId}/texts/${textHtmlId}`
  ).then((response) => response.json());
};
