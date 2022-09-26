function moveOutcome() {
  let squares = document.querySelectorAll(".grid div");
  if (checkForHits(squares)) {
    alert("you hit something");
    popup.style.display = "flex";
    return clearInterval(interval);
  } else {
    moveSnake(squares);
  }
}
