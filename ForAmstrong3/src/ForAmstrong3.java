public class ForAmstrong3 {

    public static void main(String args[]){

        for (int hundredsDigit = 1; hundredsDigit < 10; hundredsDigit++){
            for (int tensDigit = 0; tensDigit < 10; tensDigit++){
                for (int unitsDigit = 0; unitsDigit < 10; unitsDigit++){

                    int cubeOfHundredsDigit = hundredsDigit * hundredsDigit * hundredsDigit;
                    int cubeOfTensDigit = tensDigit * tensDigit * tensDigit;
                    int cubeOfUnitsDigit = unitsDigit * unitsDigit * unitsDigit;

                    int num = hundredsDigit *100 + tensDigit *10 + unitsDigit;
                    if ((cubeOfHundredsDigit + cubeOfTensDigit +cubeOfUnitsDigit) == num){
                        System.out.println(num);
                    }
                }
            }
        }
    return;
    }
}