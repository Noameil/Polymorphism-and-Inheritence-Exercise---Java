public class Factory {

    private Employee[] emps;

    private int numOfEmps;

    private static final int MAX_EMPS = 100;

    public Factory() {
        emps = new Employee[MAX_EMPS];
        numOfEmps = 0;
    }

    public boolean addEmployee(Employee e) {
        for (Employee emp : emps) {
            if (emp == null) {
                emp = e;
                return true;
            }
        }
        return false;
    }

    public int numOfWorkers() {
        int workersCounter = 0;
        for (Employee emp : emps) {
            if (emp.getClass().getSimpleName().equals("Worker"))
                workersCounter ++;
        }
        return workersCounter;
    }

    public Manager mostManager() {
        Manager mostManager = null;
        Manager[] managers = new Manager[MAX_EMPS];
        for (Employee emp : emps) {
            if (emp.getClass().getSimpleName().equals("Manager"))
                for (Manager m : managers) {
                    if (m == null)
                        m.equals(emp);
                }
        }
        for (Manager m : managers) {
            if (m.getNumOfWorkers() > mostManager.getNumOfWorkers()) {
                mostManager.equals(m);
            }

        }
        return mostManager;
    }

    public Worker minHours() {
        Worker minHoursWorker = null;
        Worker[] workers = new Worker[MAX_EMPS];
        for (Employee emp : emps) {
            if (emp.getClass().getSimpleName().equals("Worker"))
                for (Worker w : workers) {
                    if (w == null)
                        w.equals(emp);
                }
        }
        for (Worker m : workers) {
            if (m.getHours() < minHoursWorker.getHours()) {
                minHoursWorker.equals(m);
            }

        }
        return minHoursWorker;
    }

    public Employee maxSalary() {
        Employee maxSalaryEmp = null;
        for (Employee e : emps) {
            if (e.salary() > maxSalaryEmp.salary())
                maxSalaryEmp.equals(e);
        }
        return maxSalaryEmp;
    }

    public Employee getByName(String eName) {
        for (Employee e : emps) {
            if (e.getName().equals(eName))
                return e;
        }
        return null;
    }

    @Override
    public String toString() {
        String str = "Workers int factory: ";
        for (Employee e : emps) {
            str += "\n" + e;
        }
        return str;
    }

    public double salaryByName(String eName) {
        Employee emp = getByName(eName);
        for (Employee e : emps) {
            if (e.equals(emp))
                return e.salary();
        }
        return 0;
    }
}
