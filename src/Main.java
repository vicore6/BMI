public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 87;
        double height =  1.70;
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);

        double bmifat = service.calculate(130, 1.5);
        System.out.println(bmifat);

        double bmifit = service.calculate(80, 1.98);
        System.out.println(bmifit);
    }
}
