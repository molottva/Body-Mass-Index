public class Main {

    public static void main(String[] args) {
        BMIService service = new BMIService();
        int weight = 77; //масса в кг
        int height = 170; //рост в см (так интереснее, чем сразу в метрах считать)

        float bodyMassIndex = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела равен " + bodyMassIndex);
    }
}
