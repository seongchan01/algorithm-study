function solution(my_string, queries) {
  const arr = my_string.split('');

  for (let i = 0; i < queries.length; i++) {
    const [s, e] = queries[i];

    let left = s;
    let right = e;
    while (left < right) {
      const temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
  }

  return arr.join('');
}