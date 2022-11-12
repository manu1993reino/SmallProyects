import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Employee manu = new Employee("manuel antonio", "reino diez", 29, 25000);
        Intern mire = new Intern("mireya", "lópez marin", 28, 25000);

        System.out.println(manu.toString());
        System.out.println(mire.toString());

        File employeesFile = new File("_01_Employees_txt/employees.txt");
        if(employeesFile.createNewFile()){
            System.out.println("File was successfully created");
        }
        else {
            System.out.println("The file already exist");
        }

        Scanner scanner = new Scanner(System.in);

        FileWriter writer = new FileWriter("employees.txt", true);

        int elementNumber = 0;
        boolean done = false;

        while (!done){
            String option;
            boolean isNumber;
            boolean isAnOption;

            do {
                isNumber = true;
                isAnOption = true;

                Methods.printMenu();

                option = scanner.nextLine();

                if (!Methods.isNumeric(option)) {
                    isNumber = false;
                } else if (Integer.parseInt(option) < 0 || Integer.parseInt(option) > 2) {
                    isAnOption = false;
                }
            }while(!isNumber || !isAnOption);

            if(Integer.parseInt(option) == 1){
                String[] data = Methods.introduce("employee");

                Employee employee = new Employee(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]));
                writer.write(employee.toString() + "\n");

            } else if (Integer.parseInt(option) == 2) {
                String[] data = Methods.introduce("intern");

                Intern employee = new Intern(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]));
                writer.write(employee.toString() + "\n");
            }
            else if (Integer.parseInt(option) == 0){
                done = true;
            }
        }

        System.out.println("Your .txt document has been successfully created");
        scanner.close();
        writer.close();
    }

}