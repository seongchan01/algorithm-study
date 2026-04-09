function solution(num_list, n) {
  const answer = [];
  answer.push(...num_list.slice(n), ...num_list.slice(0, n));
  return answer;
}
