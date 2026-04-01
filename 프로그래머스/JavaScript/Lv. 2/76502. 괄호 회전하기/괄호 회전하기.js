function solution(s) {
  let cnt = 0;
  for (let i = 0; i < s.length; i++) {
    let isTrue = true;
    const stack = [];

    for (let j = 0; j < s.length; j++) {
      const n = s[(i + j) % s.length];

      if (n == '(' || n == '{' || n == '[') {
        stack.push(n);
      } else {
        if (stack.length == 0) {
          isTrue = false;
          break;
        }

        const top = stack[stack.length - 1];
        if (top == '{' && n == '}') stack.pop();
        else if (top == '(' && n == ')') stack.pop();
        else if (top == '[' && n == ']') stack.pop();
        else {
          isTrue = false;
          break;
        }
      }
    }

    if (isTrue == true && stack.length == 0) {
      cnt += 1;
    }
  }
  return cnt;
}
