class CollatzCalculator {

    int computeStepCount(int start) {

        int howManySteps = 0;
        
        if (start <= 0){
            throw new IllegalArgumentException("Only positive integers are allowed");
        }

        if (start == 1){
            howManySteps = 0;
        } else {
            do {
                if (start % 2 == 0){
                    start = start / 2;
                    howManySteps++;
                } else {
                    start = (start * 3) + 1;
                    howManySteps++;
                }
            }
            while (start > 1);    
        }
    return howManySteps;
    }
}