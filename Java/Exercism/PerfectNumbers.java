class NaturalNumber {

    public String outcome = "";
    
    NaturalNumber(int number) {
        int Result = 0;

        if (number <= 0){
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                Result += i;
            }
        } 
        if (Result > number){
            outcome = "abundant";
        }
        if (Result < number){
            outcome = "deficient";
        }
        if (Result == number){
            outcome = "perfect";
        }
    }
    
    Classification getClassification() {
        
        if (outcome == "abundant"){
            return Classification.ABUNDANT;
        }
        else if (outcome == "perfect"){
            return Classification.PERFECT;
        }
        else
            return Classification.DEFICIENT;
        }
}