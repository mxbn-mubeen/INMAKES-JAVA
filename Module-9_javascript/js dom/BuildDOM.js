// Create a new paragraph element
var newPara = document.createElement("p");
// Create a text node for the new paragraph
var content = document.createTextNode("This is a new paragraph.");
// Append the text node to the new paragraph element
newPara.appendChild(content);

// Get the div element by its ID
var divElem = document.getElementById("theDiv");
// Append the new paragraph to the div element
divElem.appendChild(newPara);

// Function to remove an element
function removeElement(element) {
    element.parentNode.removeChild(element);
}
