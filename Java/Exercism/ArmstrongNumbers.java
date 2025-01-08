import java.lang.Math;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        String numberToCheckString = String.valueOf(numberToCheck);
        int numberToCheckStringLength = numberToCheckString.length();
        int armstrongNumber = 0;
        
        for (char character : numberToCheckString.toCharArray()) {   
            int digit = character - '0';
            armstrongNumber += (int) Math.pow(digit, numberToCheckStringLength);
        }
    return armstrongNumber == numberToCheck;
    }
}
