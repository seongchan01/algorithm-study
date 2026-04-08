function solution(arr, intervals) {
  let answer = [];

  for (const interval of intervals) {
    const [a, b] = interval;
    answer.push(...arr.slice(a, b + 1));
  }

  return answer;
}
