function solution(strArr) {
  let answer = [];
  for (const str of strArr) {
    if (!str.includes('ad')) {
      answer.push(str);
    }
  }

  return answer;
}
