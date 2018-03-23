function solve(infos) {
    let student={};
    for (let line of infos) {
        let temp=line.split(' -> ');
        let key=temp[0];
        let value=temp[1];
        student[key]=value;
    }
    student.age=20;
    student.grade=6;

    console.log(JSON.stringify(student));
}
/*name -> Angel
surname -> Georgiev
age -> 20
grade -> 6.00
date -> 23/05/1995
town -> Sofia*/