function solution(num_list) {
  let answer;

  if (num_list.length >= 11) {
    answer = 0;
    for (const num of num_list) {
      answer += num;
    }
  } else {
    answer = 1;
    for (const num of num_list) {
      answer *= num;
    }
  }

  return answer;
}
