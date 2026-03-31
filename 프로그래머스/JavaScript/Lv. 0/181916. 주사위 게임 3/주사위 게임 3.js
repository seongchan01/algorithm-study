function solution(a, b, c, d) {
  const arr = [a, b, c, d].sort((x, y) => x - y);

  if (arr[0] === arr[3]) {
    return 1111 * arr[0];
  }

  if (arr[0] === arr[2] || arr[1] === arr[3]) {
    const p = arr[1];
    const q = arr[0] === arr[2] ? arr[3] : arr[0];
    return (10 * p + q) ** 2;
  }

  if (arr[0] === arr[1] && arr[2] === arr[3]) {
    return (arr[0] + arr[2]) * Math.abs(arr[0] - arr[2]);
  }

  if (arr[0] === arr[1]) {
    return arr[2] * arr[3];
  }

  if (arr[1] === arr[2]) {
    return arr[0] * arr[3];
  }

  if (arr[2] === arr[3]) {
    return arr[0] * arr[1];
  }

  return arr[0];
}
