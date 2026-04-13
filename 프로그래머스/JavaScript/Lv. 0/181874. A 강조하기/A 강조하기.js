function solution(myString) {
  let answer = '';

  for (const char of myString) {
    if (char === 'a') {
      answer += 'A';
    } else if (char !== 'A' && char === char.toUpperCase()) {
      answer += char.toLowerCase();
    } else {
      answer += char;
    }
  }

  return answer;
}
