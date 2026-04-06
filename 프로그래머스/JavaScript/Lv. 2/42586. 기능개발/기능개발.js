function solution(progresses, speeds) {
  const day = [];

  for (let i = 0; i < progresses.length; i++) {
    day.push(Math.ceil((100 - progresses[i]) / speeds[i]));
  }

  let cnt = 0;
  let maxDay = day[0];
  let answer = [];

  for (let i = 0; i < day.length; i++) {
    if (day[i] <= maxDay) {
      cnt++;
    } else {
      answer.push(cnt);
      cnt = 1;
      maxDay = day[i];
    }
  }

  answer.push(cnt);
  return answer;
}
