function solution(a, b) {
  const result1 = Number(String(a) + String(b));
  const result2 = 2 * a * b;

  if (result1 >= result2) {
    return result1;
  }

  return result2;
}
