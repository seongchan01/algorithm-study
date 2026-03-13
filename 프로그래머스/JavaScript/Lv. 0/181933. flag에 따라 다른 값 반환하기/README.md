# [level 0] flag에 따라 다른 값 반환하기 - 181933

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181933)

### 성능 요약

메모리: 33.4 MB, 시간: 0.05 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 02월 09일 22:30:18

### 문제 설명

<p>두 정수 <code>a</code>, <code>b</code>와 boolean 변수 <code>flag</code>가 매개변수로 주어질 때, <code>flag</code>가 true면 <code>a</code> + <code>b</code>를 false면 <code>a</code> - <code>b</code>를 return 하는 solution 함수를 작성해 주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>-1,000 ≤ <code>a</code>, <code>b</code> ≤ 1,000</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>a</th>
<th>b</th>
<th>flag</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>-4</td>
<td>7</td>
<td>true</td>
<td>3</td>
</tr>
<tr>
<td>-4</td>
<td>7</td>
<td>false</td>
<td>-11</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예</h5>

<p>입출력 예 #1</p>

<ul>
<li>예제 1번에서 <code>flag</code>가 true이므로 <code>a</code> + <code>b</code> = (-4) + 7 = 3을 return 합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>예제 2번에서 <code>flag</code>가 false이므로 <code>a</code> - <code>b</code> = (-4) - 7 = -11을 return 합니다.</li>
</ul>

---

### 풀이

`flag`가 `true`인 경우에는 두 수를 더한 값을 반환하고, `false`인 경우에는 두 수를 뺀 값을 반환하면 되기 때문에 조건문이 필요하다고 판단했다.  
이에 따라 `if` 문을 사용해 `flag`가 `true`일 때는 `a + b`, 그렇지 않을 때는 `a - b`를 반환하도록 구현했다.

문제를 제출한 뒤 다른 사람들의 풀이를 살펴보면서 삼항 연산자로도 표현할 수 있다는 점을 알게 되었고 `return flag ? a + b : a - b;` 형태로 더 간결하게 작성할 수도 있겠다고 생각했다.

### 소스 코드

```javascript
function solution(a, b, flag) {
  let answer = 0;
  if (flag === true) {
    answer = a + b;
  } else {
    answer = a - b;
  }
  return answer;
}
```

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
