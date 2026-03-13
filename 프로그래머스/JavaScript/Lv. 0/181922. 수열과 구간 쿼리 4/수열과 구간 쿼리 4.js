function solution(arr, queries) {
  for (const [start, end, k] of queries) {
    for (let index = start; index <= end; index++) {
      if (index % k === 0) arr[index] += 1;
    }
  }
  return arr;
}