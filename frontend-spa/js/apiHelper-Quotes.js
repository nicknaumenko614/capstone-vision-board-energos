export const fetchQuotes = async (visionBoardId) => {
    return fetch(`http://localhost:8080/api/quotes/visionboard/${visionBoardId}`).then((response) =>
      response.json()
    );
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
    ).then((response) => response.json());
  };
  
  export const updateQuote = async (quote) => {
    return fetch(`http://localhost:8080/api/quotes/updatequote`, {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(quote),
    }).then((response) => response.json());
  };
  
  export const deleteQuote = async (quoteId) => {
    return fetch(`http://localhost:8080/api/quotes/${quoteId}/delete`, {
      method: "DELETE",
    }).then((response) => response.json());
  };
  