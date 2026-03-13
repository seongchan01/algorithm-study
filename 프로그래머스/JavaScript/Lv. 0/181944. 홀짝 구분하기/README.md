# [level 0] 홀짝 구분하기 - 181944

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181944?language=javascript)

### 성능 요약

메모리: 32.3 MB, 시간: 46.95 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 01월 29일 21:03:41

### 문제 설명

<p>자연수 <code>n</code>이 입력으로 주어졌을 때 만약 <code>n</code>이 짝수이면 "<code>n</code> is even"을, 홀수이면 "<code>n</code> is odd"를 출력하는 코드를 작성해 보세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>n</code> ≤ 1,000</li>
</ul>

<hr>

<h5>입출력 예</h5>

<p>입력 #1</p>
<div class="highlight"><pre class="codehilite"><code>100
</code></pre></div>
<p>출력 #1</p>
<div class="highlight"><pre class="codehilite"><code>100 is even
</code></pre></div>
<p>입력 #2</p>
<div class="highlight"><pre class="codehilite"><code>1
</code></pre></div>
<p>출력 #2</p>
<div class="highlight"><pre class="codehilite"><code>1 is odd
</code></pre></div>
<p>※ 2023년 05월 15일 지문이 수정되었습니다.</p>

---

### 풀이

- 입력으로 들어오는 값은 문자열이므로 숫자 연산을 위해 `Number()`로 변환한 뒤, 나머지 연산자 `%`를 사용해 2로 나눈 결과를 기준으로 홀짝을 판별했다. 나머지가 0이면 짝수, 그렇지 않으면 홀수라는 조건을 `if`문으로 분기하여 처리했고, 판별된 결과를 문제에서 요구한 형식인 `"n is even"` 또는 `"n is odd"` 형태의 문자열로 출력하도록 구현했다.

### 소스 코드

```javascript
const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];

rl.on("line", function (line) {
  input = line.split(" ");
}).on("close", function () {
  n = Number(input[0]);
  if (n % 2 == 0) {
    console.log(`${n} is even`);
  } else {
    console.log(`${n} is odd`);
  }
});
```

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
