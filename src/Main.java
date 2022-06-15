public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 70;
        double height = 1.81;
        double bmi = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела:");
        System.out.println(bmi);
    }
}