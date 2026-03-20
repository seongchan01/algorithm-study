const fs = require('fs');

const [str, n] = fs.readFileSync(0).toString().trim().split(' ');

console.log(str.repeat(Number(n)));