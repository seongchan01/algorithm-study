function solution(my_string, s, e) {
  let front = my_string.slice(0, s);
  let mid = my_string.slice(s, e + 1).split('').reverse().join('');
  let back = my_string.slice(e + 1);

  let answer = front + mid + back;

  return answer;
}