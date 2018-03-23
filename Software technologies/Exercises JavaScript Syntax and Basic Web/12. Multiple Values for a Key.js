function solve(pairs) {
    let map = {};
    for (let i = 0; i < pairs.length - 1; i++) {
        let key = pairs[i].split(' ')[0];
        let value = pairs[i].split(' ')[1];
        if (key in map === false) {
            map[key] = [];
        }
        map[key].push(value);
    }

    let lastKey = pairs[pairs.length - 1];
    if (lastKey in map) {
        console.log(map[lastKey].join('\n'));
    } else {
        console.log('None');
    }

}

solve(['key value', 'key eulav', 'test tset', 'key']);