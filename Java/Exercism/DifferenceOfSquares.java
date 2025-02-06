class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int squareOfSumResult = 0;
        for(int i = 1; i <= input; i++){
            squareOfSumResult += i;
        }
        return squareOfSumResult * squareOfSumResult;
    }

    int computeSumOfSquaresTo(int input) {
        int sumOfSquaresResult = 0;
        for(int i = 1; i <= input; i++){
            sumOfSquaresResult += i * i;
        }
        return sumOfSquaresResult;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
