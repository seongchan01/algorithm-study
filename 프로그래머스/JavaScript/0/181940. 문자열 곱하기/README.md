# [level 0] 문자열 곱하기 - 181940

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181940?language=javascript)

### 성능 요약

메모리: 33.5 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 02월 02일 03:10:20

### 문제 설명

<p>문자열 <code>my_string</code>과 정수 <code>k</code>가 주어질 때, <code>my_string</code>을 <code>k</code>번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>my_string</code>의 길이 ≤ 100</li>
<li><code>my_string</code>은 영소문자로만 이루어져 있습니다.</li>
<li>1 ≤ <code>k</code> ≤ 100</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>my_string</th>
<th>k</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"string"</td>
<td>3</td>
<td>"stringstringstring"</td>
</tr>
<tr>
<td>"love"</td>
<td>10</td>
<td>"lovelovelovelovelovelovelovelovelovelove"</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>예제 1번의 <code>my_string</code>은 "string"이고 이를 3번 반복한 문자열은 "stringstringstring"이므로 이를 return 합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>예제 2번의 <code>my_string</code>은 "love"이고 이를 10번 반복한 문자열은 "lovelovelovelovelovelovelovelovelovelove"이므로 이를 return 합니다.</li>
</ul>

---

### 풀이

- 문자열을 정해진 횟수만큼 반복해 이어 붙이는 문제이기 때문에 자바스크립트에서 문자열을 반복할 수 있는 `repeat` 메서드를 사용했다.  
  반복문으로 직접 문자열을 더할 수도 있지만, 이 문제에서는 내장 메서드를 사용하는 편이 더 간단하고 의도가 명확하다고 판단했다.

### 소스 코드

```javascript
function solution(my_string, k) {
  return my_string.repeat(k);
}
```

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
