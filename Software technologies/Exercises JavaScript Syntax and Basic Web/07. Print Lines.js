function solve(arr) {
    for(let commandLine of arr) {
        if (commandLine !=='Stop') {
            console.log(commandLine);
        }else {
            return;
        }
    }
}