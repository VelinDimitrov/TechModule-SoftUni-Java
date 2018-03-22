function solve(commands) {
    let arr=[];
    for (let command of commands) {
        let tokens=command.split(' ');
        if (tokens[0]==='add') {
            arr.push(tokens[1])
        }else {
            arr.splice(tokens[1],1);
        }
    }
    for (let num of arr) {
        console.log(num);
    }
}
solve(['add 3','add 5','remove 2','remove 0','add 7']);