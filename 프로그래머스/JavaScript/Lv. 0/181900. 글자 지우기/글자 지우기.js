function solution(my_string, indices) {
  const removeSet = new Set(indices);
  let answer = '';

  for (let i = 0; i < my_string.length; i++) {
    if (!removeSet.has(i)) {
      answer += my_string[i];
    }
  }

  return answer;
}
