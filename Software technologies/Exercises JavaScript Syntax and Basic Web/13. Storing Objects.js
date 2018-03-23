function solve(infos) {
    let students=[];
    for (let line of infos) {
        let info=line.split(' -> ');

        let name=info[0];
        let age=info[1];
        let grade=info[2];

        let student={};
        student.age=age;
        student.name=name;
        student.grade=grade;
        students.push(student);
    }

    for (let student of students) {
        console.log(`Name: ${student.name}\nAge: ${student.age}\nGrade: ${student.grade}`)
    }
}
solve(['Pesho -> 13 -> 6.00','Ivan -> 12 -> 5.57','Toni -> 13 -> 4.90']);