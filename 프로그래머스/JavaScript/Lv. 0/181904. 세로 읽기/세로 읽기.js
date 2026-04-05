function solution(my_string, m, c) {
  let result = '';

  for (let i = 0; i < my_string.length; i += m) {
    const row = my_string.slice(i, i + m);
    result += row[c - 1];
  }

  return result;
}
