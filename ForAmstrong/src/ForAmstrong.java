public class ForAmstrong {

    public static void main(String args[]){

        System.out.println("Finding Armstrong Number: ");

        for (int num = 100; num < 1000; num++) {
            int hundredsDigit = num / 100;
            int tensDigit = (num % 100) / 10;
            int unitsDigit = num % 10;

            int cubeOfHundredsDigit = hundredsDigit * hundredsDigit * hundredsDigit;
//          int cubeOfHundredsDigit = (int) Math.pow(hundredsDigit, 3);

            int cubeOfTensDigit = tensDigit * tensDigit * tensDigit;
//          int cubeOfTensDigit = (int) Math.pow(tensDigit, 3);

            int cubeOfUnitsDigit = unitsDigit * unitsDigit * unitsDigit;
//          int cubeOfUnitsDigit = (int) Math.pow(unitsDigit, 3);

            if ((cubeOfHundredsDigit + cubeOfTensDigit + cubeOfUnitsDigit) == num) {
                System.out.println(num);
            }
        }
    return;
    }
}
