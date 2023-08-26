public class RecursiveMethod {
    // A recursive method p();
    public double p(double x, int n){
        if (n == 0)
            return 1.0;
        return x * p(x, n-1);
    }
}