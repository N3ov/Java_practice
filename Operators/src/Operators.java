public class Operators {

    private int firstNum;
    private String operate;
    private int secondNum;

    public Operators() {
        firstNum = 0;
        operate = "";
        secondNum = 0;
    }

    public Operators(int firstNum, String operate, int secondNum) {
        this.firstNum = firstNum;
        this.operate = operate;
        this.secondNum = secondNum;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum){
        this.firstNum = firstNum;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate){
        this.operate = operate;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum){
        this.secondNum = secondNum;
    }

    public void Operators() {

        int result = 0;
        switch (this.operate) {

            case "+":
                result = this.firstNum + this.secondNum;
                System.out.println("your answer: " + result);
                break;

            case "-":
                result = this.firstNum - this.secondNum;
                System.out.println("your answer: " + result);
                break;

            case "x":
                result = this.firstNum * this.secondNum;
                System.out.println("your answer: " + result);
                break;

            case "/":
                result = this.firstNum / this.secondNum;
                System.out.println("your answer: " + result);
                break;

            default:
                System.out.println("Error input");
                break;
        }

    }



}
