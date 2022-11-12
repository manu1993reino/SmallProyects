public class Intern extends Employee {

    private final int MAX_SALARY = 20000;

    public Intern(String name, String secondName, int age, int salary) {
        super(name, secondName, age, salary);
        setSalary(salary);
    }

    public void setSalary(int salary) {
        if (salary > MAX_SALARY) {
            super.setSalary(MAX_SALARY);
        } else {
            super.setSalary(salary);
        }

    }


}
