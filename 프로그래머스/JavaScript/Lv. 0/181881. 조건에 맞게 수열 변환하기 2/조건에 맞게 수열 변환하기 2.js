function solution(arr) {
  let cnt = 0;

  while (true) {
    let changed = false;

    for (let i = 0; i < arr.length; i++) {
      const num = arr[i];

      if (num >= 50 && num % 2 === 0) {
        arr[i] = num / 2;
        changed = true;
      } else if (num < 50 && num % 2 === 1) {
        arr[i] = num * 2 + 1;
        changed = true;
      }
    }

    if (!changed) return cnt;

    cnt++;
  }
}
