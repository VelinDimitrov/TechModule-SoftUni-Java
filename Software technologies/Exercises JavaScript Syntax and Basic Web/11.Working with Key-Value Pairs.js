function solve(pairs) {
let map={};
    for (let i = 0; i < pairs.length-1; i++) {
        let key=pairs[i].split(' ')[0];
        map[key]=pairs[i].split(' ')[1];
    }
    if (pairs[pairs.length-1]in map)
    {
        console.log(map[pairs[pairs.length-1]]);
    }else {
        console.log('None');
    }
}
solve(['key value', 'key eulav','test tset','key']);