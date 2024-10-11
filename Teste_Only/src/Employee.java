public class Employee {

    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate){
       setBaseSalary(baseSalary);
       setHourlyRate(hourlyRate);

    }


    public int calculateWage(int extraHours){
        return baseSalary + (getHourlyRate() * extraHours);
    }

    private int getHourlyRate() {
    return hourlyRate;
    }


    public int calculateWage(){
        return calculateWage(0);
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
