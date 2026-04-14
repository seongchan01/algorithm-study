function solution(myString, pat) {
  let cnt = 0;
  for (let i = 0; i <= myString.length - pat.length; i++) {
    const str = myString.slice(i, i + pat.length);

    if (str === pat) cnt += 1;
  }

  return cnt;
}
