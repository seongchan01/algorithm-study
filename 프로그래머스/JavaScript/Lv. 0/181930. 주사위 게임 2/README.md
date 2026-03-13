# [level 0] 주사위 게임 2 - 181930

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181930)

### 성능 요약

메모리: 33.4 MB, 시간: 0.08 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 02월 12일 23:12:28

### 문제 설명

<p>1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 <code>a</code>, <code>b</code>, <code>c</code>라고 했을 때 얻는 점수는 다음과 같습니다.</p>

<ul>
<li>세 숫자가 모두 다르다면 <code>a</code> + <code>b</code> + <code>c</code> 점을 얻습니다.</li>
<li>세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (<code>a</code> + <code>b</code> + <code>c</code>) × (<code>a</code><sup>2</sup> + <code>b</code><sup>2</sup> + <code>c</code><sup>2</sup> )점을 얻습니다.</li>
<li>세 숫자가 모두 같다면 (<code>a</code> + <code>b</code> + <code>c</code>) × (<code>a</code><sup>2</sup> + <code>b</code><sup>2</sup> + <code>c</code><sup>2</sup> ) × (<code>a</code><sup>3</sup> + <code>b</code><sup>3</sup> + <code>c</code><sup>3</sup> )점을 얻습니다.</li>
</ul>

<p>세 정수 <code>a</code>, <code>b</code>, <code>c</code>가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li><code>a</code>, <code>b</code>, <code>c</code>는 1이상 6이하의 정수입니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>a</th>
<th>b</th>
<th>c</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>2</td>
<td>6</td>
<td>1</td>
<td>9</td>
</tr>
<tr>
<td>5</td>
<td>3</td>
<td>3</td>
<td>473</td>
</tr>
<tr>
<td>4</td>
<td>4</td>
<td>4</td>
<td>110592</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>예제 1번에서 세 주사위 숫자가 모두 다르므로 2 + 6 + 1 = 9점을 얻습니다. 따라서 9를 return 합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>예제 2번에서 두 주사위 숫자만 같으므로 (5 + 3 + 3) × (5<sup>2</sup> + 3<sup>2</sup> + 3<sup>2</sup> ) = 11 × 43 = 473점을 얻습니다. 따라서 473을 return 합니다.</li>
</ul>

<p>입출력 예 #3</p>

<ul>
<li>예제 3번에서 세 주사위 숫자가 모두 같으므로 (4 + 4 + 4) × (4<sup>2</sup> + 4<sup>2</sup> + 4<sup>2</sup> ) × (4<sup>3</sup> + 4<sup>3</sup> + 4<sup>3</sup> ) = 12 × 48 × 192 = 110,592점을 얻습니다. 따라서 110592를 return 합니다.</li>
</ul>

---

### 풀이

문제를 보자마자 점수가 “같은 숫자의 개수”에 따라 달라진다는 게 핵심이라고 생각했다. 그래서 먼저 `a, b, c`가 서로 어떻게 같은지를 조건문으로 나누는 구조부터 떠올렸다.

그 다음 계산식을 그대로 조건 안에 다 쓰기보다는 `(a+b+c), (a²+b²+c²), (a³+b³+c³)`처럼 반복해서 등장하는 값을 미리 변수로 빼두면 코드가 훨씬 깔끔해지겠다고 판단했다.  
그래서 `sum1, sum2, sum3`로 각각 정의해두고 조건에 따라 필요한 것만 곱해서 반환하는 방식으로 정리했다.

또한 세 개가 모두 같은 경우는 두 개가 같은 조건에도 포함될 수 있기 때문에 가장 먼저 `a === b && b === c`를 검사하고 그 다음에 두 개만 같은 경우를 처리하도록 순서를 잡았다.

### 소스 코드

```javascript
function solution(a, b, c) {
  let sum1 = a + b + c;
  let sum2 = a * a + b * b + c * c;
  let sum3 = a ** 3 + b ** 3 + c ** 3;

  if (a === b && b === c) return sum1 * sum2 * sum3;
  else if (a === b || a === c || b === c) return sum1 * sum2;
  else return sum1;
}
```

---

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
