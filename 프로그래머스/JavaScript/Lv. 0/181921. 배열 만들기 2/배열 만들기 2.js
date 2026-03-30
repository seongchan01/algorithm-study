function solution(l, r) {
  const result = [];

  function dfs(n) {
    const num = Number(n);

    if (num > r) return;

    if (num >= l) {
      result.push(num);
    }

    dfs(n + '0');
    dfs(n + '5');
  }

  dfs('5');

  return result.length ? result.sort((a, b) => a - b) : [-1];
}
