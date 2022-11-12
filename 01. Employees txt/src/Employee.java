public class Employee {

    private String name;
    private String secondName;
    private int age;
    private int salary;

    public Employee(String name, String secondName, int age, int salary) {
        setName(name);
        setSecondName(secondName);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String[] nameCapitalized = name.split(" ");
        for(int i=0; i<nameCapitalized.length; i++){
            nameCapitalized[i] = nameCapitalized[i].substring(0,1).toUpperCase() + nameCapitalized[i].substring(1);
        }
        String nameCapitalizedFinal = String.join(" " , nameCapitalized);
        this.name = nameCapitalizedFinal;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        String[] nameCapitalized = secondName.split(" ");
        for(int i=0; i<nameCapitalized.length; i++){
            nameCapitalized[i] = nameCapitalized[i].substring(0,1).toUpperCase() + nameCapitalized[i].substring(1);
        }
        String nameCapitalizedFinal = String.join(" " , nameCapitalized);
        this.secondName = nameCapitalizedFinal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<17 && age>65){
            this.age=0;
        }
        else{
            this.age=age;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nName: " + this.name + "\n" +
                "Second Name: " + this.secondName + "\n" +
                "Age: " + this.age + " years old\n" +
                "Salary: " + this.salary + "€\n";
    }
}
