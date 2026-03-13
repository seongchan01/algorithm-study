# [level 0] n의 배수 - 181937

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181937?language=javascript)

### 성능 요약

메모리: 33.4 MB, 시간: 0.04 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 02월 05일 23:22:13

### 문제 설명

<p>정수 <code>num</code>과 <code>n</code>이 매개 변수로 주어질 때, <code>num</code>이 <code>n</code>의 배수이면 1을 return <code>n</code>의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>2 ≤ <code>num</code> ≤ 100</li>
<li>2 ≤ <code>n</code> ≤ 9</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>num</th>
<th>n</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>98</td>
<td>2</td>
<td>1</td>
</tr>
<tr>
<td>34</td>
<td>3</td>
<td>0</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>98은 2의 배수이므로 1을 return합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>32는 3의 배수가 아니므로 0을 return합니다.</li>
</ul>

---

### 풀이

- `num`이 `n`으로 나누어 떨어지는지 확인해서 배수 여부를 판단한다.  
  나머지 연산자 `%`를 사용해 결과가 `0`이면 배수이므로 `1`을 반환하고 아니면 `0`을 반환한다.

### 소스 코드

```javascript
function solution(num, n) {
  let answer = 0;

  if (num % n === 0) {
    answer = 1;
  } else {
    answer = 0;
  }
  return answer;
}
```

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
