export const fetchImages = async (visionBoardId) => {
    return fetch(`http://localhost:8080/api/images/visionboard/${visionBoardId}`).then((response) =>
      response.json()
    );
  };
  
  export const postNewImage = async (visionBoardId, image) => {
    return fetch(
      `http://localhost:8080/api/visionboards/${visionBoardId}/addimage`,
      {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(image),
      }
    ).then((response) => response.json());
  };
  
  export const deleteImage = async (imageId) => {
    return fetch(`http://localhost:8080/api/images/${imageId}/delete`, {
      method: "DELETE",
    }).then((response) => response.json());
  };
  
  export const updateImageIsZoomed = async (id, image) => {
    return fetch(`http://localhost:8080/api/images/${id}/updateImageIsZoomed`, {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(image),
    }).then((response) => response.json());
  };
  
  export const updateImageHasBorder = async (id, image) => {
    return fetch(`http://localhost:8080/api/images/${id}/updateImageHasBorder`, {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(image),
    }).then((response) => response.json());
  };
  
  export const updateImageBorderRadius = async (id, image) => {
    return fetch(`http://localhost:8080/api/images/${id}/updateImageBorderRadius`, {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(image),
    }).then((response) => response.json());
  };
  
  export const updateImageRotate = async (id, image) => {
    return fetch(`http://localhost:8080/api/images/${id}/updateImageRotate`, {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(image),
    }).then((response) => response.json());
  };
  
  export const updateImageIsFlipped = async (id, image) => {
    return fetch(`http://localhost:8080/api/images/${id}/updateImageIsFlipped`, {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(image),
    }).then((response) => response.json());
  };
  
  export const updateImageParentElement = async (id, image) => {
    return fetch(`http://localhost:8080/api/images/${id}/updateImageParentElement`, {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(image),
    }).then((response) => response.json());
  };