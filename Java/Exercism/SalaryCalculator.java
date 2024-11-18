public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double salaryMultiplier = ( daysSkipped >= 5 ? 0.85 : 1.0);
        return salaryMultiplier;
    }

    public int bonusMultiplier(int productsSold) {
        int bonusMultiplier = ( productsSold >= 20 ? 13 : 10);
        return bonusMultiplier;
    }

    public double bonusForProductsSold(int productsSold) {
        double bonus = productsSold * bonusMultiplier(productsSold);
        return bonus;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000;
        double salaryMax = 2000;
        double salaryFinal = (salary * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold));
        
        return ( salaryFinal > salaryMax ? salaryMax : salaryFinal );
    } 
}
