function solution(arr, queries) {
  const answer = [];

  for (const [s, e, k] of queries) {
    let min = null;

    for (let i = s; i <= e; i++) {
      const value = arr[i];

      if (value > k && (min === null || value < min)) {
        min = value;
      }
    }

    answer.push(min === null ? -1 : min);
  }

  return answer;
}
