# [level 0] 문자열 반복해서 출력하기 - 181950

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181950)

### 성능 요약

메모리: 32.2 MB, 시간: 46.79 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 01월 23일 20:27:09

### 문제 설명

<p>문자열 <code>str</code>과 정수 <code>n</code>이 주어집니다.<br>
<code>str</code>이 <code>n</code>번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>str</code>의 길이 ≤ 10</li>
<li>1 ≤ <code>n</code> ≤ 5</li>
</ul>

<hr>

<h5>입출력 예</h5>

<p>입력 #1</p>
<div class="highlight"><pre class="codehilite"><code>string 5
</code></pre></div>
<p>출력 #1</p>
<div class="highlight"><pre class="codehilite"><code>stringstringstringstringstring
</code></pre></div>

---

## 해결

### 접근 방식

- 입력을 공백 기준으로 분리해 문자열과 반복 횟수를 추출한 뒤, 문자열의 `repeat` 메서드를 사용해 n번 반복 출력했다.

### 주의 / 실수 포인트

- 반복문으로 직접 구현할 수도 있지만 내장 메서드인 `repeat`을 사용해 불필요한 로직을 줄였다.

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
