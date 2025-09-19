/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if age >= 16{
        canDrive()= true;
        else 
        canDrive()= false;
        return canDrive
    }
}

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        totalSalary = unpaidHours * hourlyWage;
        taxesAndDeduction = 0.3;
        return(totalSalary * taxesAndDeduction);
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        double paidSalary = calculatePay();
        unpaidHours = 0;
        System.out.println("John Deere has received a wire transfer of " + paidSalary + " CAD"
    }
    
    /*
     *  Question 11..
     */
    private String changeName(String newName){
        fullname = newName;
        return(fullname);
    }
}
    