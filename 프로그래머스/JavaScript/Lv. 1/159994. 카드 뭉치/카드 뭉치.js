function solution(cards1, cards2, goal) {
  class Queue {
    items = [];
    front = 0;
    rear = 0;

    push(item) {
      this.items.push(item);
      this.rear++;
    }

    pop() {
      return this.items[this.front++];
    }

    isEmpty() {
      return this.front == this.rear;
    }
  }

  const q1 = new Queue();
  const q2 = new Queue();
  for (const card1 of cards1) {
    q1.push(card1);
  }
  for (const card2 of cards2) {
    q2.push(card2);
  }

  for (let i = 0; i < goal.length; i++) {
    if (goal[i] == q1.items[q1.front]) q1.pop();
    else if (goal[i] == q2.items[q2.front]) q2.pop();
    else return 'No';
  }

  return 'Yes';
}
