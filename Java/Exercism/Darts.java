class Darts {
    int score(double xOfDart, double yOfDart) {
        
        double powerSum = Math.hypot(xOfDart, yOfDart);
     
         if (powerSum <= 1){
            return 10;  
         }
         if (powerSum <= 5){
            return 5;  
         }
         if (powerSum <= 10){
            return 1;  
         }
         if (powerSum > 10){
            return 0;  
         }
    return 0;
    }
}