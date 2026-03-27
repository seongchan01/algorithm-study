function solution(answers) {
  let n = [
    [1, 2, 3, 4, 5],
    [2, 1, 2, 3, 2, 4, 2, 5],
    [3, 3, 1, 1, 2, 2, 4, 4, 5, 5],
  ];

  let cnt = [0, 0, 0];
  for (let i = 0; i < answers.length; i++) {
    for (let j = 0; j < 3; j++) {
      if (answers[i] == n[j][i % n[j].length]) {
        cnt[j] += 1;
      }
    }
  }

  const max = Math.max(...cnt);
  let answer = [];
  for (let i = 0; i < cnt.length; i++) {
    if (cnt[i] === max) {
      answer.push(i + 1);
    }
  }
  return answer;
}
