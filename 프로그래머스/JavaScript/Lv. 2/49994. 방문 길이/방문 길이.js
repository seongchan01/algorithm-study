function solution(dirs) {
  let a = 5;
  let b = 5;

  let check = new Set();

  for (let i = 0; i < dirs.length; i++) {
    let na = a;
    let nb = b;

    if (dirs[i] === 'U') na -= 1;
    if (dirs[i] === 'D') na += 1;
    if (dirs[i] === 'R') nb += 1;
    if (dirs[i] === 'L') nb -= 1;

    if (na < 0 || na > 10 || nb < 0 || nb > 10) {
      continue;
    }

    let path = '';

    if (a < na || (a === na && b < nb)) {
      path = `${a},${b},${na},${nb}`;
    } else {
      path = `${na},${nb},${a},${b}`;
    }

    check.add(path);

    a = na;
    b = nb;
  }

  return check.size;
}
