function solution(my_string, queries) {
  let arr = my_string.split('');

  for (const [s, e] of queries) {
    const reversed = arr.slice(s, e + 1).reverse();

    for (let i = s; i <= e; i++) {
      arr[i] = reversed[i - s];
    }
  }

  return arr.join('');
}
