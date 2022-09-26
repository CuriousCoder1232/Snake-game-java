document.addEventListener("DOMContentLoaded", function () {
  document.addEventListener("keyup", control);
  createBoard();
  startGame();
  playAgain.addEventListener("click", replay);
});
