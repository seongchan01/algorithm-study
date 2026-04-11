function one(num) {
  if (num === 1) return 0;

  if (num % 2 === 0) {
    return 1 + one(num / 2);
  } else {
    return 1 + one((num - 1) / 2);
  }
}

function solution(num_list) {
  let cnt = 0;

  for (const num of num_list) {
    cnt += one(num);
  }

  return cnt;
}
