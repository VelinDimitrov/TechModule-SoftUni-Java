function solve(arr) {
    let n = Number(arr[0]);
    let x = Number(arr[1]);
    if (x >= n) {
        return n * x;
    } else {
        return n / x;
    }

}

solve(['2', '3']);