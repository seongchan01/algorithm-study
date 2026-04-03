function solution(my_string) {
  let answer = [];

  for (let i = 0; i < my_string.length; i++) {
    let str = my_string.slice(i);
    answer.push(str);
  }

  return answer.sort();
}
