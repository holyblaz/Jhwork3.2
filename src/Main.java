public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float resultImt = (float) service.calculate(66, 1.54f);
        System.out.println("Ваш индекс массы тела: " + resultImt + " кг/м^2");
    }
}


