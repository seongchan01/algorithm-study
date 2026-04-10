function solution(id_list, report, k) {
  const reportObj = {};
  const reportCnt = {};
  const answer = [];

  for (let i = 0; i < report.length; i++) {
    const [userId, reportId] = report[i].split(' ');

    if (!reportObj[userId]) reportObj[userId] = new Set();
    reportObj[userId].add(reportId);
  }

  for (const userId in reportObj) {
    for (const reportId of reportObj[userId]) {
      reportCnt[reportId] = (reportCnt[reportId] || 0) + 1;
    }
  }

  const banned = new Set();
  for (const reportId in reportCnt) {
    if (reportCnt[reportId] >= k) {
      banned.add(reportId);
    }
  }

  for (const userId of id_list) {
    let cnt = 0;

    if (reportObj[userId]) {
      for (const id of reportObj[userId]) {
        if (banned.has(id)) {
          cnt++;
        }
      }
    }
    answer.push(cnt);
  }

  return answer;
}
