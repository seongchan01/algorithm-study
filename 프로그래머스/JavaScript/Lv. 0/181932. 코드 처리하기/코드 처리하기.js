function solution(code) {
  let mode = 0;
  let answer = '';

  for (let idx = 0; idx < code.length; idx++) {
    const char = code[idx];

    if (char === '1') {
      mode = 1 - mode;
    } else if (idx % 2 === mode) {
      answer += char;
    }
  }

  return answer || 'EMPTY';
}
