public class Employee extends Person{
    private String name;
    private double payRate;

    public Employee(String name, double payRate){
        this.name = name;
        this.payRate = payRate;
    }

    public double pay(){
        return payRate;
    }

    // public void setPayRate(doube newRate){
    //     this.payRate = newRate;
    // }

    public String toString(){
        return super.toString() + "\nPay: " + pay();
    }
}