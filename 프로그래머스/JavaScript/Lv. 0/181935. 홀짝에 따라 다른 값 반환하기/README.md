# [level 0] 홀짝에 따라 다른 값 반환하기 - 181935

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181935)

### 성능 요약

메모리: 33.5 MB, 시간: 0.16 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 02월 07일 22:59:07

### 문제 설명

<p>양의 정수 <code>n</code>이 매개변수로 주어질 때, <code>n</code>이 홀수라면 <code>n</code> 이하의 홀수인 모든 양의 정수의 합을 return 하고 <code>n</code>이 짝수라면 <code>n</code> 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>n</code> ≤ 100</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>n</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>7</td>
<td>16</td>
</tr>
<tr>
<td>10</td>
<td>220</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>예제 1번의 <code>n</code>은 7로 홀수입니다. 7 이하의 모든 양의 홀수는 1, 3, 5, 7이고 이들의 합인 1 + 3 + 5 + 7 = 16을 return 합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>예제 2번의 <code>n</code>은 10으로 짝수입니다. 10 이하의 모든 양의 짝수는 2, 4, 6, 8, 10이고 이들의 제곱의 합인 2<sup>2</sup> + 4<sup>2</sup> + 6<sup>2</sup> + 8<sup>2</sup> + 10<sup>2</sup> = 4 + 16 + 36 + 64 + 100 = 220을 return 합니다.</li>
</ul>

---

### 풀이

문제를 읽고 먼저 `n`이 홀수인지 짝수인지에 따라 계산 방식이 완전히 달라진다는 점을 확인했다.  
따라서 가장 먼저 `n % 2`를 이용해 홀수/짝수를 분기하는 조건문이 필요하다고 판단했다.

- `n`이 홀수인 경우 : `n` 이하의 홀수만 골라서 단순히 더하면 되므로 `1`부터 `n`까지 `2`씩 증가시키며 합을 누적했다.
- `n`이 짝수인 경우 : `n` 이하의 짝수만 대상으로 각 값을 제곱한 뒤 더해야 하므로 `2`부터 `n`까지 `2`씩 증가시키며 `i * i` 값을 누적했다.

문제의 범위가 작기 때문에(최대 100) 조건에 맞는 수만 순회하는 방식이 가장 직관적이고 실수 가능성이 적다고 판단해 반복문을 사용했다.

### 소스 코드

```javascript
function solution(n) {
  let sum = 0;
  if (n % 2 === 0) {
    for (let i = 2; i <= n; i += 2) {
      sum += i * i;
    }
  } else {
    for (let i = 1; i <= n; i += 2) {
      sum += i;
    }
  }
  return sum;
}
```

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
