function solve(arr) {
    let negativeCounter = 0;
    for (num of arr) {
        if (Number(num) < 0) {
            negativeCounter++;
        }
    }
    if (negativeCounter % 2 === 0) {
        return 'Positive';
    } else {
        return 'Negative';
    }
}

console.log(solve(['2', '3', '-1']));
;