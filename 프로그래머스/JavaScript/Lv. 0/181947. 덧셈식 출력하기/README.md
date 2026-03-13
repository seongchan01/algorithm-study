# [level 0] 덧셈식 출력하기 - 181947

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181947?language=javascript)

### 성능 요약

메모리: 32.2 MB, 시간: 65.91 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 01월 26일 23:25:42

### 문제 설명

<p>두 정수 <code>a</code>, <code>b</code>가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.</p>
<div class="highlight"><pre class="codehilite"><code>a + b = c
</code></pre></div>
<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>a</code>, <code>b</code> ≤ 100</li>
</ul>

<hr>

<h5>입출력 예</h5>

<p>입력 #1</p>
<div class="highlight"><pre class="codehilite"><code>4 5
</code></pre></div>
<p>출력 #1</p>
<div class="highlight"><pre class="codehilite"><code>4 + 5 = 9
</code></pre></div>

---

## 해결

### 접근 방식

- 입력으로 받은 두 정수를 숫자로 변환한 뒤 템플릿 리터럴을 사용해 계산식을 문자열로 구성하여 출력한다.

### 주의 / 실수 포인트

- 템플릿 리터럴 내부에 큰따옴표를 포함하면 출력 결과에도 따옴표가 그대로 출력되어 형식 오류가 발생한다.

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
