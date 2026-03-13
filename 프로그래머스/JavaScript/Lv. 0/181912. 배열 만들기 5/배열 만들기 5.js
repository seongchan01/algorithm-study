function solution(intStrs, k, s, l) {
  let answer = [];

  for (let i = 0; i < intStrs.length; i++) {
    let str = intStrs[i].slice(s, s + l);
    let num = Number(str);

    if (num > k) {
      answer.push(num);
    }
  }

  return answer;
}