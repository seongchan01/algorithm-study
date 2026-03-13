# [level 0] 코드 처리하기 - 181932

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181932)

### 성능 요약

메모리: 39.6 MB, 시간: 9.07 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 02월 10일 22:57:22

### 문제 설명

<p>문자열 <code>code</code>가 주어집니다.<br>
<code>code</code>를 앞에서부터 읽으면서 만약 문자가 "1"이면 <code>mode</code>를 바꿉니다. <code>mode</code>에 따라 <code>code</code>를 읽어가면서 문자열 <code>ret</code>을 만들어냅니다.</p>

<p><code>mode</code>는 0과 1이 있으며, <code>idx</code>를 0 부터 <code>code의 길이 - 1</code> 까지 1씩 키워나가면서 <code>code[idx]</code>의 값에 따라 다음과 같이 행동합니다.</p>

<ul>
<li><code>mode</code>가 0일 때

<ul>
<li><code>code[idx]</code>가 "1"이 아니면 <code>idx</code>가 짝수일 때만 <code>ret</code>의 맨 뒤에 <code>code[idx]</code>를 추가합니다.</li>
<li><code>code[idx]</code>가 "1"이면 <code>mode</code>를 0에서 1로 바꿉니다.</li>
</ul></li>
<li><code>mode</code>가 1일 때

<ul>
<li><code>code[idx]</code>가 "1"이 아니면 <code>idx</code>가 홀수일 때만 <code>ret</code>의 맨 뒤에 <code>code[idx]</code>를 추가합니다.</li>
<li><code>code[idx]</code>가 "1"이면 <code>mode</code>를 1에서 0으로 바꿉니다.</li>
</ul></li>
</ul>

<p>문자열 <code>code</code>를 통해 만들어진 문자열 <code>ret</code>를 return 하는 solution 함수를 완성해 주세요.</p>

<p>단, 시작할 때 <code>mode</code>는 0이며, return 하려는 <code>ret</code>가 만약 빈 문자열이라면 대신 "EMPTY"를 return 합니다.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>code</code>의 길이 ≤ 100,000

<ul>
<li><code>code</code>는 알파벳 소문자 또는 "1"로 이루어진 문자열입니다.</li>
</ul></li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>code</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"abc1abc1abc"</td>
<td>"acbac"</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li><code>code</code>의 각 인덱스 <code>i</code>에 따라 다음과 같이 <code>mode</code>와 <code>ret</code>가 변합니다.</li>
</ul>
<table class="table">
        <thead><tr>
<th>i</th>
<th>code[i]</th>
<th>mode</th>
<th>ret</th>
</tr>
</thead>
        <tbody><tr>
<td>0</td>
<td>"a"</td>
<td>0</td>
<td>"a"</td>
</tr>
<tr>
<td>1</td>
<td>"b"</td>
<td>0</td>
<td>"a"</td>
</tr>
<tr>
<td>2</td>
<td>"c"</td>
<td>0</td>
<td>"ac"</td>
</tr>
<tr>
<td>3</td>
<td>"1"</td>
<td>1</td>
<td>"ac"</td>
</tr>
<tr>
<td>4</td>
<td>"a"</td>
<td>1</td>
<td>"ac"</td>
</tr>
<tr>
<td>5</td>
<td>"b"</td>
<td>1</td>
<td>"acb"</td>
</tr>
<tr>
<td>6</td>
<td>"c"</td>
<td>1</td>
<td>"acb"</td>
</tr>
<tr>
<td>7</td>
<td>"1"</td>
<td>0</td>
<td>"acb"</td>
</tr>
<tr>
<td>8</td>
<td>"a"</td>
<td>0</td>
<td>"acba"</td>
</tr>
<tr>
<td>9</td>
<td>"b"</td>
<td>0</td>
<td>"acba"</td>
</tr>
<tr>
<td>10</td>
<td>"c"</td>
<td>0</td>
<td>"acbac"</td>
</tr>
</tbody>
      </table>
<p>따라서 "acbac"를 return 합니다.</p>

<p>※ 2023년 05월 18일 지문이 수정되었습니다.</p>

---

### 풀이

문자열을 앞에서부터 하나씩 읽으면서 조건에 따라 결과 문자열을 만들어야 하므로 현재 상태를 구분할 수 있는 값이 필요했다.  
문제에서 `"1"`을 기준으로 동작 방식이 바뀌기 때문에 `mode`를 정의하고 시작 조건에 맞게 `0`으로 초기화했다.

문자열을 순회하면서 `mode`가 `0`인지 `1`인지에 따라 처리 규칙이 달라지므로 반복문 안에서 `mode` 값에 따라 조건을 나누어 실행했다.  
각 인덱스에서 문자가 `"1"`인 경우에는 결과에 포함하지 않고 `mode`만 전환하도록 했고 `"1"`이 아닌 경우에는 `mode` 값에 따라 인덱스가 짝수이거나 홀수일 때만 결과 문자열에 문자를 추가하도록 구현했다.

모든 문자를 처리한 뒤 결과 문자열이 비어 있는 경우도 고려해야 하므로 `ret`의 길이가 `0`일 때는 `"EMPTY"`를 반환하도록 마무리했다.

### 소스 코드

```javascript
function solution(code) {
  let ret = '';
  let mode = 0;

  for (let i = 0; i < code.length; i++) {
    if (mode == 0) {
      code[i] == '1' ? (mode = 1) : i % 2 == 0 && (ret += code[i]);
    } else {
      code[i] == '1' ? (mode = 0) : i % 2 !== 0 && (ret += code[i]);
    }
  }
  return ret.length > 0 ? ret : 'EMPTY';
}
```

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
