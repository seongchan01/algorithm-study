# [level 0] 문자 리스트를 문자열로 변환하기 - 181941

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181941?language=javascript)

### 성능 요약

메모리: 33.5 MB, 시간: 0.03 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 02월 01일 23:17:57

### 문제 설명

<p>문자들이 담겨있는 배열 <code>arr</code>가 주어집니다. <code>arr</code>의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>arr</code>의 길이 ≤ 200

<ul>
<li><code>arr</code>의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.</li>
</ul></li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>arr</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>["a","b","c"]</td>
<td>"abc"</td>
</tr>
</tbody>
      </table>

---

### 풀이

- 배열에 담긴 문자들을 순서대로 하나의 문자열로 만들어야 하므로 배열을 문자열로 합쳐주는 `join` 메서드를 사용했다.
  구분자가 필요 없는 문제이기 때문에 빈 문자열을 인자로 전달해 요구한 결과를 바로 반환하도록 구현했다.

### 소스 코드

```javascript
function solution(arr) {
  return arr.join("");
}
```

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
