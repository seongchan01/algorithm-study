function solution(myString, pat) {
  const lowerStr = myString.toLowerCase();
  const lowerPat = pat.toLowerCase();

  return lowerStr.includes(lowerPat) ? 1 : 0;
}
