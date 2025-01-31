package Java.Exercism;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {

        String numberString = Integer.toBinaryString(number);
        int length = numberString.length();
        List<Signal> actionList = new ArrayList<>();
        
        if (length > 0 && numberString.charAt(length - 1) == '1'){
            actionList.add(Signal.WINK);
        }
        if (length > 1 && numberString.charAt(length - 2) == '1'){
            actionList.add(Signal.DOUBLE_BLINK);
        }
        if (length > 2 && numberString.charAt(length - 3) == '1'){
            actionList.add(Signal.CLOSE_YOUR_EYES);
        }
        if (length > 3 && numberString.charAt(length - 4) == '1'){
            actionList.add(Signal.JUMP);
        }
        if (length > 4 && numberString.charAt(length - 5) == '1'){
            Collections.reverse(actionList);
        }
        return actionList;
    }
}
