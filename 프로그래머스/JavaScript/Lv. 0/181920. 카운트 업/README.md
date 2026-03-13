# [level 0] 카운트 업 - 181920

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181920)

### 성능 요약

메모리: 33.5 MB, 시간: 0.06 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 02월 23일 22:08:40

### 문제 설명

<p>정수 <code>start_num</code>와 <code>end_num</code>가 주어질 때, <code>start_num</code>부터 <code>end_num</code>까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>0 ≤ <code>start_num</code> ≤ <code>end_num</code> ≤ 50</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>start_num</th>
<th>end_num</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>3</td>
<td>10</td>
<td>[3, 4, 5, 6, 7, 8, 9, 10]</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>3부터 10까지의 숫자들을 담은 리스트 [3, 4, 5, 6, 7, 8, 9, 10]를 return합니다.</li>
</ul>

---

### 풀이

문제를 읽고 `start_num`부터 `end_num`까지 `1`씩 증가시키면서 값을 배열에 담으면 된다고 이해했다.  
따라서 반복문을 사용해 시작값부터 끝값까지 순차적으로 `push`하는 방식으로 구현했다.

### 소스 코드

```javascript
function solution(start_num, end_num) {
  const result = [];

  for (let i = start_num; i <= end_num; i++) {
    result.push(i);
  }

  return result;
}
```

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
