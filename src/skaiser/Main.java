package skaiser;
import java.util.Scanner;
/**
 * Lab 4
 * Week 7 Challenge
 *
 * Hint from lab:
 *
 * "Employees don't just hire themselves and them tell themselves
 * to go through orientation. There's usually a company and a HR person involved."
 *
 * We need a class for HR and a class for the company itself.
 *
 * Update** My HR class is actually called HiringManager
 *
 *
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world");
        String firstName = "";
        String lastName = "";
        String ssn = "";
        String response = "";

        boolean done = false;

        Scanner keyboard = new Scanner(System.in);
        Employee employee = new Employee("Peter","Piper","333-33-3333");

        employee.doFirstTimeOrientation("A101");
        employee.getReportService().outputReport();

        HiringManager bob = new HiringManager();

        do{
            System.out.println("Would you like to enter a new employee? y/n");
            response = keyboard.nextLine().toLowerCase();
            if(response.equals("y")){

                // prompt for name and ssn
                System.out.println("Enter the employee's first name: ");
                firstName = keyboard.nextLine();
                System.out.println("Enter the employee's last name: ");
                lastName = keyboard.nextLine();

                // check to see the ssn entered is the correct length
                do{
                    System.out.println("Enter the employee's SSN: ");
                    ssn = keyboard.nextLine();
                }while(!(ssn.length() == 9));

                // add new employee to bob's list of employees
                bob.getEmployees().add(new Employee(firstName, lastName, ssn));
            }else if(response.equals("n")){
                done = true;
            }else{
                System.out.println("Please enter a \"y\" or \"n\"");
            }

        }while(!(done));

        int cubicleCounter = 2;

        for(Employee e: bob.getEmployees()){
            cubicleCounter++;
            e.doFirstTimeOrientation("A10" + cubicleCounter);
            e.getReportService().outputReport();
        }
    }
}
