public class IslamicBank implements Zakatable{
    private double deposit;
    private double withDraw;
    private double balance;

    public IslamicBank ( double balance){
        this.balance = balance;
    }

    public double getbalance(){
        return balance;
    }

    public double deposit(double depo){
        balance = depo + balance;
    }

    public double withDraw(double withD){
        balance = balance - withD;
    } 

    public double addDivident(double dividened){
        balance = balance + dividened
    }
}