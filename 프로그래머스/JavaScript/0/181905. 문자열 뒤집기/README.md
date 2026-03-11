# [level 0] 문자열 뒤집기 - 181905

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181905)

### 성능 요약

메모리: 33.4 MB, 시간: 0.14 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 03월 10일 00:44:33

### 문제 설명

<p>문자열 <code>my_string</code>과 정수 <code>s</code>, <code>e</code>가 매개변수로 주어질 때, <code>my_string</code>에서 인덱스 <code>s</code>부터 인덱스 <code>e</code>까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li><code>my_string</code>은 숫자와 알파벳으로만 이루어져 있습니다.</li>
<li>1 ≤ <code>my_string</code>의 길이 ≤ 1,000</li>
<li>0 ≤ <code>s</code> ≤ <code>e</code> &lt; <code>my_string</code>의 길이</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>my_string</th>
<th>s</th>
<th>e</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"Progra21Sremm3"</td>
<td>6</td>
<td>12</td>
<td>"ProgrammerS123"</td>
</tr>
<tr>
<td>"Stanley1yelnatS"</td>
<td>4</td>
<td>10</td>
<td>"Stanley1yelnatS"</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>예제 1번의 <code>my_string</code>에서 인덱스 6부터 인덱스 12까지를 뒤집은 문자열은 "ProgrammerS123"이므로 "ProgrammerS123"를 return 합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>예제 2번의 <code>my_string</code>에서 인덱스 4부터 인덱스 10까지를 뒤집으면 원래 문자열과 같은 "Stanley1yelnatS"이므로 "Stanley1yelnatS"를 return 합니다.</li>
</ul>

---

### 풀이

문제에서 `s`부터 `e`까지의 부분 문자열만 뒤집으면 된다고 생각했다. 그래서 문자열을 세 부분으로 나누어 처리하기로 했다. 먼저 `s` 이전 부분을 그대로 두고 `s`부터 `e`까지는 `slice(s, e + 1)`로 잘라 `split → reverse → join`을 사용해 뒤집었다. 마지막으로 `e` 이후 부분을 다시 이어 붙이면 원하는 문자열을 만들 수 있다고 판단했다.

### 소스 코드

```javascript
function solution(my_string, s, e) {
  let front = my_string.slice(0, s);
  let mid = my_string
    .slice(s, e + 1)
    .split('')
    .reverse()
    .join('');
  let back = my_string.slice(e + 1);

  let answer = front + mid + back;

  return answer;
}
```

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
