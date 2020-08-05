import { addSettingsEventListeners } from "./settings.js";
import { addSideBarEventListeners } from "./sidebar.js";
import { addEventListenersToTemplates } from "./templates.js";
import { addDragAndDropEventListeners } from "./drag-and-drop.js";

addSettingsEventListeners();
addSideBarEventListeners();
addEventListenersToTemplates();
addDragAndDropEventListeners();

