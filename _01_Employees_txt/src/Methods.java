import java.util.Scanner;

public class Methods{

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

        public static void printMenu(){
            System.out.println();
            System.out.println("----------------------------");
            System.out.println("-------"+Methods.ANSI_GREEN +"Employees Menu"+Methods.ANSI_RESET+"-------" );
            System.out.println("------Select an option------");
            System.out.println("---------1. Employee--------");
            System.out.println("---------2. Intern----------");
            System.out.println("---------"+Methods.ANSI_RED+"0. Exit"+Methods.ANSI_RESET+"------------");
            System.out.println("----------------------------");
        };
        public static String[] introduce(String type){

            String[] data = new String[4];
            boolean numeric = false;
            Scanner scanner2 = new Scanner(System.in);

            System.out.print("Please introduce the "+type+"`s name: ");
            String name = scanner2.nextLine();
            data[0] = name;

            System.out.print("Please introduce the "+type+"`s second name: ");
            String secondName = scanner2.nextLine();
            data[1] = secondName;

            while(!numeric) {
                System.out.print("Please introduce the " + type + "`s age: ");
                String age = scanner2.nextLine();
                if(age>=16 && age<=100){}
                numeric = isNumeric(age);
                data[2] = age;
            }

            numeric=false;

            while(!numeric) {
                System.out.print("Please introduce the " + type + "`s salary: ");
                String salary = scanner2.nextLine();
                numeric = isNumeric(salary);
                data[3] = salary;
            }
            return data;
        }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

}
