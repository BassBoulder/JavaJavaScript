public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double creations = speed * 221;
        
        if (speed >= 0  && speed <= 4){
            return creations;
        }
        if (speed >= 5  && speed <= 8){
            return creations * 0.9;
        }
        if (speed == 9){
            return creations * 0.8;
        }
        else {
            return creations * 0.77;
        }
    }
    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / 60);
    }
}