public class IslamicBank implements Zakatable{
    private double deposit;
    private double withDraw;
    private double balance;

    public IslamicBank ( double balance, double withDraw, double deposit){
        this.balance = balance;
        this.withDraw = withDraw;
        this.deposit = deposit;
    }

    public double getbalance(){
        return balance;
    }

    public double getWithdraw(){
        return withDraw;
    }

    public double getDeposit(){
        return deposit;
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