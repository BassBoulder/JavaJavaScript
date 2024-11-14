public class ElonsToyCar {

    int distance = 0;
    int batteryLevel = 100;
    
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        return batteryLevel > 0 ? "Battery at " + batteryLevel + "%" : "Battery empty";
    }

    public void drive() {
        if (batteryLevel > 0){
            distance += 20;
            batteryLevel -= 1;
        }

    }
}
