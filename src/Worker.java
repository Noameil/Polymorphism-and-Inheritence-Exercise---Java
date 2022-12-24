public class Worker extends Employee {

    private double wagePerHour;

    private int hours;

    public Worker(String name, double wagePerHour) {
        super(name);
        this.wagePerHour = wagePerHour;
    }

    public double getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(double wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Employee's name: " + getName() + ", wage = " + wagePerHour + ", hours = " + hours;
    }

    @Override
    public double salary() {
        return wagePerHour * hours;
    }


}
