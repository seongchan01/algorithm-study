# [level 0] 간단한 논리 연산 - 181917

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181917)

### 성능 요약

메모리: 33 MB, 시간: 0.04 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 02월 26일 23:10:09

### 문제 설명

<p>boolean 변수 <code>x1</code>, <code>x2</code>, <code>x3</code>, <code>x4</code>가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.</p>

<ul>
<li>(<code>x1</code> ∨ <code>x2</code>) ∧ (<code>x3</code> ∨ <code>x4</code>)</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>x1</th>
<th>x2</th>
<th>x3</th>
<th>x4</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>false</td>
<td>true</td>
<td>true</td>
<td>true</td>
<td>true</td>
</tr>
<tr>
<td>true</td>
<td>false</td>
<td>false</td>
<td>false</td>
<td>false</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li><p>예제 1번의 <code>x1</code>, <code>x2</code>, <code>x3</code>, <code>x4</code>로 식을 계산하면 다음과 같습니다.</p>

<p>(<code>x1</code> ∨ <code>x2</code>) ∧ (<code>x3</code> ∨ <code>x4</code>) ≡ (F ∨ T) ∧ (T ∨ T) ≡ T ∧ T ≡ T</p>

<p>따라서 true를 return 합니다.</p></li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li><p>예제 2번의 <code>x1</code>, <code>x2</code>, <code>x3</code>, <code>x4</code>로 식을 계산하면 다음과 같습니다.</p>

<p>(<code>x1</code> ∨ <code>x2</code>) ∧ (<code>x3</code> ∨ <code>x4</code>) ≡ (T ∨ F) ∧ (F ∨ F) ≡ T ∧ F ≡ F</p>

<p>따라서 false를 return 합니다.</p></li>
</ul>

<hr>

<ul>
<li>∨과 ∧의 진리표는 다음과 같습니다.</li>
</ul>
<table class="table">
        <thead><tr>
<th>x</th>
<th>y</th>
<th>x ∨ y</th>
<th>x ∧ y</th>
</tr>
</thead>
        <tbody><tr>
<td>T</td>
<td>T</td>
<td>T</td>
<td>T</td>
</tr>
<tr>
<td>T</td>
<td>F</td>
<td>T</td>
<td>F</td>
</tr>
<tr>
<td>F</td>
<td>T</td>
<td>T</td>
<td>F</td>
</tr>
<tr>
<td></td>
<td>F</td>
<td>F</td>
<td>F</td>
</tr>
</tbody>
      </table>

---

### 풀이

문제에서 이미 `(x1 ∨ x2) ∧ (x3 ∨ x4)`라는 식이 주어져 있으므로 이 식을 그대로 코드로 표현하면 된다고 생각했다.  
`∨`는 `OR` 연산이므로 `||`로 `∧`는 `AND` 연산이므로 `&&`로 바꿔 작성했다.

따로 조건문을 나누기보다 논리식을 그대로 반환하는 것이 가장 간단하고 명확한 방법이라서 한 줄로 구현했다.

### 소스 코드

```javascript
function solution(x1, x2, x3, x4) {
  return (x1 || x2) && (x3 || x4);
}
```

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
