function solution(l, r) {
  const result = [];
  const queue = [5];

  while (queue.length > 0) {
    const x = queue.shift();

    if (x > r) continue;
    if (x >= l) result.push(x);

    const next1 = x * 10;
    const next2 = x * 10 + 5;

    if (next1 <= r) queue.push(next1);
    if (next2 <= r) queue.push(next2);
  }

  return result.length ? result : [-1];
}