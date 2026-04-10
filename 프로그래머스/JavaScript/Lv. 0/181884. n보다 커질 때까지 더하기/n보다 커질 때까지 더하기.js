function solution(numbers, n) {
  let sum = 0;
  for (const number of numbers) {
    if ((sum += number) > n) return sum;
  }
}
