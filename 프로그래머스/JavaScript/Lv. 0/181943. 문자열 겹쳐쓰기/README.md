# [level 0] 문자열 겹쳐쓰기 - 181943

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181943?language=javascript)

### 성능 요약

메모리: 33.5 MB, 시간: 0.11 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 01월 30일 23:39:41

### 문제 설명

<p>문자열 <code>my_string</code>, <code>overwrite_string</code>과 정수 <code>s</code>가 주어집니다. 문자열 <code>my_string</code>의 인덱스 <code>s</code>부터 <code>overwrite_string</code>의 길이만큼을 문자열 <code>overwrite_string</code>으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li><code>my_string</code>와 <code>overwrite_string</code>은 숫자와 알파벳으로 이루어져 있습니다.</li>
<li>1 ≤ <code>overwrite_string</code>의 길이 ≤ <code>my_string</code>의 길이 ≤ 1,000</li>
<li>0 ≤ <code>s</code> ≤ <code>my_string</code>의 길이 - <code>overwrite_string</code>의 길이</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>my_string</th>
<th>overwrite_string</th>
<th>s</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"He11oWor1d"</td>
<td>"lloWorl"</td>
<td>2</td>
<td>"HelloWorld"</td>
</tr>
<tr>
<td>"Program29b8UYP"</td>
<td>"merS123"</td>
<td>7</td>
<td>"ProgrammerS123"</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>예제 1번의 <code>my_string</code>에서 인덱스 2부터 <code>overwrite_string</code>의 길이만큼에 해당하는 부분은 "11oWor1"이고 이를 "lloWorl"로 바꾼 "HelloWorld"를 return 합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>예제 2번의 <code>my_string</code>에서 인덱스 7부터 <code>overwrite_string</code>의 길이만큼에 해당하는 부분은 "29b8UYP"이고 이를 "merS123"로 바꾼 "ProgrammerS123"를 return 합니다.</li>
</ul>

---

### 풀이

- 문자열의 일부를 다른 문자열로 바꿔야 하는 문제라서 문자열 상태에서 직접 처리하기보다는 수정이 쉬운 배열로 바꾸는 방식으로 접근했다.
  먼저 `my_string`을 전개 연산자를 사용해 문자 배열로 변환한 뒤 시작 인덱스 `s`부터 `overwrite_string`의 길이만큼을`splice`로 제거하고 해당 위치에 `overwrite_string`을 넣었다.
  이 과정이 끝나면 결과가 문자 배열 형태이기 때문에 최종 반환 형식에 맞추기 위해 `join("")`을 사용해 배열의 모든 요소를 하나의 문자열로 합쳐 결과를 반환했다.

### 소스 코드

```javascript
function solution(my_string, overwrite_string, s) {
  const arr = [...my_string];
  arr.splice(s, overwrite_string.length, overwrite_string);
  return arr.join("");
}
```

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
