# [level 0] 공배수 - 181936

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181936?language=javascript)

### 성능 요약

메모리: 33.4 MB, 시간: 0.04 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 02월 06일 23:34:22

### 문제 설명

<p>정수 <code>number</code>와 <code>n</code>, <code>m</code>이 주어집니다. <code>number</code>가 <code>n</code>의 배수이면서 <code>m</code>의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>10 ≤ <code>number</code> ≤ 100</li>
<li>2 ≤ <code>n</code>, <code>m</code> &lt; 10</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>number</th>
<th>n</th>
<th>m</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>60</td>
<td>2</td>
<td>3</td>
<td>1</td>
</tr>
<tr>
<td>55</td>
<td>10</td>
<td>5</td>
<td>0</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>60은 2의 배수이면서 3의 배수이기 때문에 1을 return합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>55는 5의 배수이지만 10의 배수가 아니기 때문에 0을 return합니다.</li>
</ul>

---

### 풀이

- `number`가 `n`과 `m`의 배수인지 확인하기 위해 나머지 연산을 사용했다.  
  두 값 모두의 배수여야 하므로 `number % n === 0`과 `number % m === 0`을 논리 `AND`로 결합해 조건을 구성했다.  
  조건에 따라 반환값만 달라지므로 삼항 연산자를 사용해 조건을 만족하면 `1` 그렇지 않으면 `0`을 반환했다.

### 소스 코드

```javascript
function solution(number, n, m) {
  return number % n === 0 && number % m === 0 ? 1 : 0;
}
```

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
