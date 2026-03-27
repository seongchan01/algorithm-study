function solution(N, stages) {
  let fail = [];
  let stageN = [];

  for (let i = 1; i < N + 1; i++) {
    let cnt = 0;
    for (let j = 0; j < stages.length; j++) {
      if (i == stages[j]) {
        cnt += 1;
      }
    }
    stageN.push(cnt);
  }

  let tmp = stages;
  for (let i = 0; i < N; i++) {
    fail.push(stageN[i] / tmp.length);
    tmp = tmp.filter((x) => x !== i + 1);
  }

  const answer = fail
    .map((value, index) => ({ value, index }))
    .sort((a, b) => b.value - a.value || a.index - b.index)
    .map((x) => x.index + 1);

  return answer;
}
