function solution(n) {
  let answer = [];

  function collatz(n) {
    answer.push(n);

    if (n === 1) return;

    if (n % 2 === 0) n /= 2;
    else n = 3 * n + 1;

    collatz(n);
  }

  collatz(n);
  return answer;
}