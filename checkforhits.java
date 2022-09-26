function checkForHits(squares) {
  if (
    (currentSnake[0] + width >= width * width && direction === width) ||
    (currentSnake[0] % width === width - 1 && direction === 1) ||
    (currentSnake[0] % width === 0 && direction === -1) ||
    (currentSnake[0] - width <= 0 && direction === -width) ||
    squares[currentSnake[0] + direction].classList.contains("snake")
  ) {
    return true;
  } else {
    return false;
  }
}
