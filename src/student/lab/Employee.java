/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

/**
 * Simulates an actual employee in a business.
 * 
 * @author Peter Davis, pdavis13@my.wctc.edu
 * @version 0.01
 */
public class Employee {
    private String lastName;
    
    public Employee(){
        
    }

    /**
     * Convenience constructor that allows you to initialize an employee with a last name;
     * 
     * @param lastName - the employee's last name
     */
    public Employee(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get last name of the employee.
     * 
     * @return the last name of the employee, empty string, or null
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the last name of the employee
     * 
     * @param lastName - mandatory last name of employee
     * @throws IllegalArgumentException if last name is null or empty
     */
    public void setLastName(String lastName) {
        if(lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.lastName = lastName;
    }
    
    private void method3() {
        
    }
}
