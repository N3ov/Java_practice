public class ReverseInt {

    private int numbers;
    public ReverseInt() {
        numbers = 0;
    }

    public ReverseInt(int numbers) {
        this.numbers = numbers;
    }

    public int getReverseInt() {
        return numbers;
    }

    public void setReverseInt(int numbers){
        this.numbers = numbers;
    }

    public void reverseInt(){

        int result = 0;
        while (true){

            result = result * 10 + this.numbers % 10;
            this.numbers = this.numbers / 10;

            if (this.numbers == 0) break;
        }

        System.out.print(result);

    }

}

