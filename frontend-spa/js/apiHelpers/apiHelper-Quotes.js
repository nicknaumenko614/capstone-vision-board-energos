export const fetchQuotes = async (visionBoardId) => {
  return fetch(
    `http://localhost:8080/api/quotes/visionboard/${visionBoardId}`
  ).then((response) => response.json());
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
  );
};

export const deleteQuote = async (quoteId) => {
  return fetch(`http://localhost:8080/api/quotes/${quoteId}/delete`, {
    method: "DELETE",
  }).then((response) => response.json());
};

export const updateQuoteIsZoomed = async (id, quote) => {
  return fetch(`http://localhost:8080/api/quotes/${id}/updateQuoteIsZoomed`, {
    method: "PATCH",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(quote),
  }).then((response) => response.json());
};

export const updateQuoteHasBorder = async (id, quote) => {
  return fetch(`http://localhost:8080/api/quotes/${id}/updateQuoteHasBorder`, {
    method: "PATCH",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(quote),
  }).then((response) => response.json());
};

export const updateQuoteBorderRadius = async (id, quote) => {
  return fetch(
    `http://localhost:8080/api/quotes/${id}/updateQuoteBorderRadius`,
    {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(quote),
    }
  ).then((response) => response.json());
};

export const updateQuoteRotate = async (id, quote) => {
  return fetch(`http://localhost:8080/api/quotes/${id}/updateQuoteRotate`, {
    method: "PATCH",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(quote),
  }).then((response) => response.json());
};

export const updateQuoteIsFlipped = async (id, quote) => {
  return fetch(`http://localhost:8080/api/quotes/${id}/updateQuoteIsFlipped`, {
    method: "PATCH",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(quote),
  }).then((response) => response.json());
};

export const updateQuoteParentElement = async (id, quote) => {
  return fetch(
    `http://localhost:8080/api/quotes/${id}/updateQuoteParentElement`,
    {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(quote),
    }
  ).then((response) => response.json());
};

export const fetchQuoteId = async (visionBoardId, quoteHtmlId) => {
  return fetch(
    `http://localhost:8080/api/${visionBoardId}/quotes/${quoteHtmlId}`
  ).then((response) => response.json());
};
