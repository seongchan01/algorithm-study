function solution(participant, completion) {
  const hash = {};

  for (const p of participant) {
    if (hash[p]) {
      hash[p] += 1;
    } else {
      hash[p] = 1;
    }
  }

  for (const c of completion) {
    hash[c] -= 1;
  }

  for (const key in hash) {
    if (hash[key] > 0) {
      return key;
    }
  }
}
