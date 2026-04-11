function solution(arr) {
  const answer = [];

  for (const num of arr) {
    let result = num;

    if (num >= 50 && num % 2 === 0) {
      result = num / 2;
    } else if (num < 50 && num % 2 === 1) {
      result = num * 2;
    }

    answer.push(result);
  }

  return answer;
}