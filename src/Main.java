public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 70;
        double height = 1.81;
        double bmi = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела:");
        System.out.println(bmi);
        if (bmi > 0 && bmi < 16) {
            System.out.print("Выраженный дефицит массы тела");
        }
        if (bmi >= 16 && bmi < 18.5) {
            System.out.print("Недостаточная масса тела");
        }
        if (bmi >= 18.5 && bmi < 25) {
            System.out.print("Нормальная масса тела");
        }
        if (bmi >= 25 && bmi < 30) {
            System.out.print("Избыточная масса тела (предожирение)");
        }
        if (bmi >= 30 && bmi < 35) {
            System.out.print("Ожирение 1-ой степени");
        }
        if (bmi >= 35 && bmi < 40) {
            System.out.print("Ожирение 2-ой степени");
        }
        if (bmi >= 40) {
            System.out.print("Ожирение 3-ой степени");
        }

    }
}