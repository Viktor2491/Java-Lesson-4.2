public class BmiService {
    public double calculate(double m, double h) {
        double x = h / 100;
        double result = m / (x * x);
        return result;
    }
}
