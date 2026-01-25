# [level 0] 특수문자 출력하기 - 181948

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181948?language=javascript)

### 성능 요약

메모리: 32.2 MB, 시간: 42.61 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 01월 25일 23:06:57

### 문제 설명

<p>다음과 같이 출력하도록 코드를 작성해 주세요.</p>

<hr>

<p>출력 예시</p>
<div class="highlight"><pre class="codehilite"><code>!@#$%^&amp;*(\'"&lt;&gt;?:;
</code></pre></div>

---

## 해결

### 접근 방식

- 문자열 내부에서 `\`를 출력하기 위해 이스케이프 규칙에 따라 `\\`를 사용했다.

### 주의 / 실수 포인트

- JavaScript 문자열에서 `\`는 이스케이프 문자이므로, 실제 출력에 `\`를 포함하려면 문자열 안에 `\\`로 작성해야 한다.

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
