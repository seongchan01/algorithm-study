function solution(n, control) {
  for (const st of control) {
    if (st == 'w') n += 1;
    else if (st == 's') n -= 1;
    else if (st == 'd') n += 10;
    else n -= 10;
  }
  return n;
}
