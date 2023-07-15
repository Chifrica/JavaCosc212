class MonthlyEmployee extends Employee {
    public MonthlyEmployee(String empName double empRate){
        super(empName, empRate);
    }
    
    public double pay(){
        return payRate;
    }
 
}