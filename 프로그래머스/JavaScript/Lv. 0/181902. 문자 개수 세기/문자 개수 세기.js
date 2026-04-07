function solution(my_string) {
  const arr = new Array(52).fill(0);

  for (let i = 0; i < my_string.length; i++) {
    const alphabet = my_string.charCodeAt(i);

    if (alphabet >= 65 && alphabet <= 90) {
      arr[alphabet - 65]++;
    } else {
      arr[alphabet - 97 + 26]++;
    }
  }

  return arr;
}
