function solution(numLog) {
  const commands = [];

  for (let i = 1; i < numLog.length; i++) {
    const diff = numLog[i] - numLog[i - 1];

    if (diff === 1) commands.push('w');
    else if (diff === -1) commands.push('s');
    else if (diff === 10) commands.push('d');
    else if (diff === -10) commands.push('a');
  }

  return commands.join('');
}
