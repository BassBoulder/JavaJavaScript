public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method

    int EXPECTED_MINUTES_IN_OVEN = 40;
    
    public int expectedMinutesInOven(){
        
        return EXPECTED_MINUTES_IN_OVEN;
    }

    // TODO: define the 'remainingMinutesInOven()' method

    public int remainingMinutesInOven(int remainingTime) {
        
        return expectedMinutesInOven() - remainingTime;
    }

    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int numberOfLayers){

        return numberOfLayers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int numberOfLayers, int currentCookingTime){

        return preparationTimeInMinutes(numberOfLayers) + currentCookingTime;
    }
}
