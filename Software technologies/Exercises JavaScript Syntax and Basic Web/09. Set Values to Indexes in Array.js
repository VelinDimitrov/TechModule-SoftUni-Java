function solve(arr) {
    let numberOfElements=Number(arr[0]);

    let result=new Array(numberOfElements).fill(0);

    for (let i = 1; i < arr.length; i++) {
        let commands =arr[i].split(' - ');
        result[commands[0]]=commands[1];
    }
    for (let num of result) {
        console.log(num);
    }
}
solve(['3','0 - 5','1 - 6','2 - 7']);