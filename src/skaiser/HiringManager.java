package skaiser;

import sun.swing.BakedArrayList;

import java.util.ArrayList;


/**
 *
 * @author Sam Kaiser
 * @version 1
 * March, 2018
 *
 * This class is designed to simulate the hiring manager.
 *
 * The class has several methods that are things that are
 * actually done by a hiring manager when new employees
 * are hired.
 *
 */

public class HiringManager {

    // employees are created using the Employee.java class
    // this list holds objects of the type "Employee"
    private ArrayList<Employee> employees = new ArrayList();

    // constructor for HiringManager
    public HiringManager() {

    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    /**
     * This method will require all of the same parameters of
     * the constructor from the Employee.java class
     *
     * public Employee(String firstName, String lastName, String ssn)
     *
     * @param firstName
     * @param lastName
     * @param ssn
     *
     * The method must add the new employee to the employees array list.
     *
     */

    public void hireNewEmployee(String firstName, String lastName, String ssn){
        employees.add(new Employee(firstName, lastName, ssn));
    }
}
