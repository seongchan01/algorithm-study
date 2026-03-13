function solution(a, b) {
    const result1 = String(a)+String(b)
    const result2 = String(b)+String(a)
    
    if(result1>=result2){
        return Number(result1);
    }else{
        return Number(result2);
    }
}