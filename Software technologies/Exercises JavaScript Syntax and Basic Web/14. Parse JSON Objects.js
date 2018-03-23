function solve(input) {
    let students=[];
    for (let line of input) {
        let student=JSON.parse(line);
        students.push(student);
    }
    for (let student of students) {
        console.log(`Name: ${student.name}\nAge: ${student.age}\nDate: ${student.date}`)
    }
}
solve(['{"name":"Gosho","age":10,"date":"19/06/2005"}',
    '{"name":"Tosho","age":11,"date":"04/04/2005"}']);