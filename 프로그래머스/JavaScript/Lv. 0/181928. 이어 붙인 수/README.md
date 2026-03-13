# [level 0] 이어 붙인 수 - 181928

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181928)

### 성능 요약

메모리: 33.4 MB, 시간: 0.05 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 02월 14일 23:07:53

### 문제 설명

<p>정수가 담긴 리스트 <code>num_list</code>가 주어집니다. <code>num_list</code>의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>2 ≤ <code>num_list</code>의 길이 ≤ 10</li>
<li>1 ≤ <code>num_list</code>의 원소 ≤ 9</li>
<li><code>num_list</code>에는 적어도 한 개씩의 짝수와 홀수가 있습니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>num_list</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>[3, 4, 5, 2, 1]</td>
<td>393</td>
</tr>
<tr>
<td>[5, 7, 8, 3]</td>
<td>581</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>홀수만 이어 붙인 수는 351이고 짝수만 이어 붙인 수는 42입니다. 두 수의 합은 393입니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>홀수만 이어 붙인 수는 573이고 짝수만 이어 붙인 수는 8입니다. 두 수의 합은 581입니다.</li>
</ul>

---

### 풀이

배열을 순회하면서 `% 2` 연산으로 홀수와 짝수를 구분했다. 홀수는 하나의 문자열 변수에, 짝수는 다른 문자열 변수에 `+=`로 이어 붙였다.  
이어 붙인 값을 실제 수치 계산이 가능한 숫자형으로 바꾸기 위해 `Number()` 메소드를 사용해 숫자로 변환한 뒤 두 값을 더해 최종 결과를 반환했다.

### 소스 코드

```javascript
function solution(num_list) {
  let odd = '';
  let even = '';

  for (let num of num_list) {
    if (num % 2 === 0) {
      even += num;
    } else {
      odd += num;
    }
  }

  return Number(odd) + Number(even);
}
```

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
