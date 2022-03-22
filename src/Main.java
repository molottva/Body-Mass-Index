public class Main {

    public static void main(String[] args) {
        BMIService service = new BMIService();
        int weight = 77; //масса в кг
        int height = 170; //рост в см (так интереснее, чем сразу в метрах считать)

        String bodyMassIndex;

        bodyMassIndex = service.calculate(weight, height);
        System.out.println(bodyMassIndex);

        bodyMassIndex = service.calculate(0, 180);
        System.out.println(bodyMassIndex);

        bodyMassIndex = service.calculate(251, 180);
        System.out.println(bodyMassIndex);

        bodyMassIndex = service.calculate(80, 50);
        System.out.println(bodyMassIndex);

        bodyMassIndex = service.calculate(80, 251);
        System.out.println(bodyMassIndex);

        bodyMassIndex = service.calculate( 50, 190);
        System.out.println(bodyMassIndex);

        bodyMassIndex = service.calculate( 60, 190);
        System.out.println(bodyMassIndex);

        bodyMassIndex = service.calculate( 70, 190);
        System.out.println(bodyMassIndex);

        bodyMassIndex = service.calculate( 100, 190);
        System.out.println(bodyMassIndex);

        bodyMassIndex = service.calculate( 120, 190);
        System.out.println(bodyMassIndex);

        bodyMassIndex = service.calculate( 140, 190);
        System.out.println(bodyMassIndex);

        bodyMassIndex = service.calculate( 160, 190);
        System.out.println(bodyMassIndex);
    }
}
