public class Manager extends Employee {

    private double wage;

    private int numOfWorkers;

    public Manager(String name, double wage, int numOfWorkers) {
        super(name);
        this.wage = wage;
        this.numOfWorkers = numOfWorkers;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getNumOfWorkers() {
        return numOfWorkers;
    }

    public void setNumOfWorkers(int numOfWorkers) {
        this.numOfWorkers = numOfWorkers;
    }

    @Override
    public String toString() {
        return "Employee's name: " + getName() + ", wage = " + wage + ", workers = " + numOfWorkers;
    }

    @Override
    public double salary() {
        if (numOfWorkers <= 10)
            return wage;
        else if (numOfWorkers > 11 && numOfWorkers <= 20)
            return wage + ((numOfWorkers - 10) * 50);
        else
            return wage + 1000;
    }
}
