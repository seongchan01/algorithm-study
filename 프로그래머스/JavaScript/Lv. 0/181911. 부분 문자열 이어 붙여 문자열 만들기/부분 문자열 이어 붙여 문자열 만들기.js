function solution(my_strings, parts) {
  let answer = '';

  for (let i = 0; i < my_strings.length; i++) {
    let s = parts[i][0];
    let e = parts[i][1];

    let str = my_strings[i].slice(s, e + 1);
    answer += str;
  }

  return answer;
}