function solution(num_list) {
  let mul = 1;
  let add = 0;

  for (let i = 0; i < num_list.length; i++) {
    mul *= num_list[i];
    add += num_list[i];
  }

  if (mul < add ** 2) {
    return 1;
  } else {
    return 0;
  }
}
