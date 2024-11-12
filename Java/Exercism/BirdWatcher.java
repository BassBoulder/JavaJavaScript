
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[birdsPerDay.length -1];
    }
        
    public void incrementTodaysCount() {
        this.birdsPerDay[6]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : this.birdsPerDay){
            if ( birds == 0 ) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        int numberOfDaysLimiter = numberOfDays > 7 ? 7 : numberOfDays;
        
            for (int i = 0; i < numberOfDaysLimiter; ++i) {
                total += this.birdsPerDay[i];
            }
        return total;
    }

    public int getBusyDays() {
        int totalBusyDays = 0;

        for ( int birds : this.birdsPerDay){
            if (birds >= 5){
                totalBusyDays += 1;
            }
        } return totalBusyDays;
    } 
}
