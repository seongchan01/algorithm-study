# [level 0] 주사위 게임 3 - 181916

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181916)

### 성능 요약

메모리: 33.5 MB, 시간: 0.10 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 02월 27일 23:41:47

### 문제 설명

<p>1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.</p>

<ul>
<li>네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.</li>
<li>세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)<sup>2</sup> 점을 얻습니다.</li>
<li>주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.</li>
<li>어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.</li>
<li>네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.</li>
</ul>

<p>네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 <code>a</code>, <code>b</code>, <code>c</code>, <code>d</code>로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li><code>a</code>, <code>b</code>, <code>c</code>, <code>d</code>는 1 이상 6 이하의 정수입니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>a</th>
<th>b</th>
<th>c</th>
<th>d</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>2</td>
<td>2</td>
<td>2</td>
<td>2</td>
<td>2222</td>
</tr>
<tr>
<td>4</td>
<td>1</td>
<td>4</td>
<td>4</td>
<td>1681</td>
</tr>
<tr>
<td>6</td>
<td>3</td>
<td>3</td>
<td>6</td>
<td>27</td>
</tr>
<tr>
<td>2</td>
<td>5</td>
<td>2</td>
<td>6</td>
<td>30</td>
</tr>
<tr>
<td>6</td>
<td>4</td>
<td>2</td>
<td>5</td>
<td>2</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>예제 1번에서 네 주사위 숫자가 모두 2로 같으므로 1111 × 2 = 2222점을 얻습니다. 따라서 2222를 return 합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>예제 2번에서 세 주사위에서 나온 숫자가 4로 같고 나머지 다른 주사위에서 나온 숫자가 1이므로 (10 × 4 + 1)<sup>2</sup> = 41<sup>2</sup> = 1681점을 얻습니다. 따라서 1681을 return 합니다.</li>
</ul>

<p>입출력 예 #3</p>

<ul>
<li>예제 3번에서 <code>a</code>, <code>d</code>는 6으로, <code>b</code>, <code>c</code>는 3으로 각각 같으므로 (6 + 3) × |6 - 3| = 9 × 3 = 27점을 얻습니다. 따라서 27을 return 합니다.</li>
</ul>

<p>입출력 예 #4</p>

<ul>
<li>예제 4번에서 두 주사위에서 2가 나오고 나머지 다른 두 주사위에서 각각 5, 6이 나왔으므로 5 × 6 = 30점을 얻습니다. 따라서 30을 return 합니다.</li>
</ul>

<p>입출력 예 #5</p>

<ul>
<li>예제 5번에서 네 주사위 숫자가 모두 다르고 나온 숫자 중 가장 작은 숫자가 2이므로 2점을 얻습니다. 따라서 2를 return 합니다.</li>
</ul>

---

### 풀이

주사위 네 개의 값이 어떤 형태로 나왔는지에 따라 점수 계산식이 달라지므로 각 경우를 조건문으로 직접 나누어 처리하는 방식으로 구현했다.

먼저 네 개가 모두 같은 경우를 가장 먼저 처리하고 그 다음 세 개가 같은 경우를 각각 나누어 계산하도록 구성했다.
이후 두 개씩 같은 경우 `(2+2)` 한 쌍만 같은 경우 `(2+1+1)`를 조건으로 구분해 해당 공식에 맞게 점수를 계산했다.

모든 조건에 해당하지 않으면 네 값이 모두 다른 경우이므로 `Math.min`을 사용해 가장 작은 값을 반환하도록 했다.

### 소스 코드

```javascript
function solution(a, b, c, d) {
  if (a === b && a === c && a === d) return 1111 * a;

  if (a === b && a === c) return (10 * a + d) ** 2;
  if (a === b && a === d) return (10 * a + c) ** 2;
  if (a === c && a === d) return (10 * a + b) ** 2;
  if (b === c && b === d) return (10 * b + a) ** 2;

  if (a === b && c === d) return (a + c) * Math.abs(a - c);
  if (a === c && b === d) return (a + b) * Math.abs(a - b);
  if (a === d && b === c) return (a + b) * Math.abs(a - b);

  if (a === b) return c * d;
  if (a === c) return b * d;
  if (a === d) return b * c;
  if (b === c) return a * d;
  if (b === d) return a * c;
  if (c === d) return a * b;

  return Math.min(a, b, c, d);
}
```

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
