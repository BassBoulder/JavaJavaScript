class NeedForSpeed {
    int speed, batteryDrain, distance, battery = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery - batteryDrain < 0;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (batteryDrained()) {
            return;
        }
        distance = distance + speed;
        battery = battery - batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        car.drive();
        return car.batteryDrained() ? car.distanceDriven() >= distance : canFinishRace(car);
    }
}