package isp.lab4.exercise6;

class Employee{
   private String firstName;
   private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
   
   public double getPaymentAmount(){
       return 0;
   }
}

class ComissionEmployee extends Employee{
    private double grossSale;
    private double comissionSale;

    public ComissionEmployee(double grossSale, double comissionSale, String firstName, String lastName) {
        super(firstName, lastName);
        this.grossSale = grossSale;
        this.comissionSale = comissionSale;
    }

    @Override
    public double getPaymentAmount() {
        return this.comissionSale*this.grossSale;
    }

    @Override
    public String toString() {
        return "ComissionEmployee{" + "grossSale=" + grossSale + ", comissionSale=" + comissionSale + '}';
    }
    
    
    
    
}

public class Exercise6 {
    public static void main(String[] args) {
        ComissionEmployee ce = new ComissionEmployee(10000, 0.15, "Alin", "Dan");
        System.out.println(ce.getPaymentAmount());
        System.out.println(ce); 
   }
}
