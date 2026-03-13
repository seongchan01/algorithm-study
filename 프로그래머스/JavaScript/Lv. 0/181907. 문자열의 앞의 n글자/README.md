# [level 0] 문자열의 앞의 n글자 - 181907

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181907)

### 성능 요약

메모리: 33.5 MB, 시간: 0.04 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 03월 08일 15:49:50

### 문제 설명

<p>문자열 <code>my_string</code>과 정수 <code>n</code>이 매개변수로 주어질 때, <code>my_string</code>의 앞의 <code>n</code>글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li><code>my_string</code>은 숫자와 알파벳으로 이루어져 있습니다.</li>
<li>1 ≤ <code>my_string</code>의 길이 ≤ 1,000</li>
<li>1 ≤ <code>n</code> ≤ <code>my_string</code>의 길이</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>my_string</th>
<th>n</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"ProgrammerS123"</td>
<td>11</td>
<td>"ProgrammerS"</td>
</tr>
<tr>
<td>"He110W0r1d"</td>
<td>5</td>
<td>"He110"</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예</h5>

<p>입출력 예 #1</p>

<ul>
<li>예제 1번의 <code>my_string</code>에서 앞의 11글자는 "ProgrammerS"이므로 이 문자열을 return 합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>예제 2번의 <code>my_string</code>에서 앞의 5글자는 "He110"이므로 이 문자열을 return 합니다.</li>
</ul>

---

### 풀이

문제에서 문자열의 앞에서부터 `n`글자를 가져오면 된다고 생각했다. 문자열의 앞부분을 자를 때는 `slice()`를 사용할 수 있으므로 시작 인덱스를 `0`으로 두고 `slice(0, n)`을 사용하면 원하는 부분 문자열을 얻을 수 있다고 판단했다. 따라서 앞에서 `n`글자를 잘라 반환하는 방식으로 해결했다.

### 소스 코드

```javascript
function solution(my_string, n) {
  let answer = my_string.slice(0, n);
  return answer;
}
```

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
