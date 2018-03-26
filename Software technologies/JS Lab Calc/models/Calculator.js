function Calculator(leftOperand,operator,rightOperand){
    this.leftOperand=leftOperand;
    this.operator=operator;
    this.rightOperand=rightOperand;

    this.calculateResult=function () {
        let result=0;
        if (isNaN(this.leftOperand)||isNaN(this.rightOperand)) {
            return 'Invalid Input';
        }
        switch (this.operator) {
            case '+':
                    result=this.leftOperand+this.rightOperand;
                break;
            case '-':
                result=this.leftOperand-this.rightOperand;
                break;
            case '/':
                result=this.leftOperand/this.rightOperand;
                break;
            case '*':
                result=this.leftOperand*this.rightOperand;
                break;
            case'pow':
                result=Math.pow(this.leftOperand*this.rightOperand,2);
                break;
        }
        return result;
    }
}
module.exports=Calculator;