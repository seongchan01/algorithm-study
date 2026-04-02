function solution(board, moves) {
  const basket = [];

  let cnt = 0;
  for (const move of moves) {
    let doll;
    for (let i = 0; i < board.length; i++) {
      if (board[i][move - 1] != 0) {
        doll = board[i][move - 1];
        board[i][move - 1] = 0;
        break;
      }
    }

    if (!doll) {
      continue;
    }

    let top = basket[basket.length - 1];
    if (top == doll && basket.length > 0) {
      basket.pop();
      cnt += 2;
    } else {
      basket.push(doll);
    }
  }

  return cnt;
}
