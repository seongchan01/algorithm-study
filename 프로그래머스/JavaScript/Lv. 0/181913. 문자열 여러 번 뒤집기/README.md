# [level 0] 문자열 여러 번 뒤집기 - 181913

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181913)

### 성능 요약

메모리: 36.7 MB, 시간: 3.84 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 03월 02일 23:29:39

### 문제 설명

<p>문자열 <code>my_string</code>과 이차원 정수 배열 <code>queries</code>가 매개변수로 주어집니다. <code>queries</code>의 원소는 [s, e] 형태로, <code>my_string</code>의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다. <code>my_string</code>에 <code>queries</code>의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li><code>my_string</code>은 영소문자로만 이루어져 있습니다.</li>
<li>1 ≤ <code>my_string</code>의 길이 ≤ 1,000</li>
<li><code>queries</code>의 원소는 [s, e]의 형태로 0 ≤ s ≤ e &lt; <code>my_string</code>의 길이를 만족합니다.</li>
<li>1 ≤ <code>queries</code>의 길이 ≤ 1,000</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>my_string</th>
<th>queries</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"rermgorpsam"</td>
<td>[[2, 3], [0, 7], [5, 9], [6, 10]]</td>
<td>"programmers"</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<ul>
<li>예제 1번의 <code>my_string</code>은 "rermgorpsam"이고 주어진 <code>queries</code>를 순서대로 처리하면 다음과 같습니다.</li>
</ul>
<table class="table">
        <thead><tr>
<th>queries</th>
<th>my_string</th>
</tr>
</thead>
        <tbody><tr>
<td></td>
<td>"rermgorpsam"</td>
</tr>
<tr>
<td>[2, 3]</td>
<td>"remrgorpsam"</td>
</tr>
<tr>
<td>[0, 7]</td>
<td>"progrmersam"</td>
</tr>
<tr>
<td>[5, 9]</td>
<td>"prograsremm"</td>
</tr>
<tr>
<td>[6, 10]</td>
<td>"programmers"</td>
</tr>
</tbody>
      </table><div class="highlight"><pre class="codehilite"><code>따라서 "programmers"를 return 합니다.
</code></pre></div>

---

### 풀이

`my_string`을 문자 배열로 변환한 뒤 각 `[s, e]`마다 해당 구간을 `left/right`로 직접 `swap` 하며 뒤집었다. 문자열은 직접 수정이 불가능하므로 배열로 변환해 제자리에서 처리하고 마지막에 `join`으로 문자열로 다시 합쳤다.

### 소스 코드

```javascript
function solution(my_string, queries) {
  const arr = my_string.split('');

  for (let i = 0; i < queries.length; i++) {
    const [s, e] = queries[i];

    let left = s;
    let right = e;
    while (left < right) {
      const temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
  }

  return arr.join('');
}
```

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
