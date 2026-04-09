function stateChange(user, state, firstWord, uid, name) {
  if (firstWord == 'Enter') {
    user[uid] = name;
    state.push([firstWord, uid]);
  }
  if (firstWord == 'Leave') {
    state.push([firstWord, uid]);
  }

  if (firstWord == 'Change') {
    user[uid] = name;
  }

  return state;
}

function solution(record) {
  const user = {};
  const state = [];
  const answer = [];
  for (const r of record) {
    const [firstWord, uid, name] = r.split(' ');

    stateChange(user, state, firstWord, uid, name);
  }

  for (const [firstWord, uid] of state) {
    if (firstWord === 'Enter') {
      answer.push(`${user[uid]}님이 들어왔습니다.`);
    }

    if (firstWord === 'Leave') {
      answer.push(`${user[uid]}님이 나갔습니다.`);
    }
  }
  return answer;
}
