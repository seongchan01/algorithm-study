function solution(n, slicer, num_list) {
  const a = slicer[0];
  const b = slicer[1];
  const c = slicer[2];

  if (n === 1) {
    return num_list.slice(0, b + 1);
  }

  if (n === 2) {
    return num_list.slice(a);
  }

  if (n === 3) {
    return num_list.slice(a, b + 1);
  }

  if (n === 4) {
    const result = [];
    for (let i = a; i <= b; i += c) {
      result.push(num_list[i]);
    }
    return result;
  }
}