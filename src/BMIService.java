public class BMIService {

    public String calculate(int weight, int height){
        String bodyMassIndex;
        if(weight <= 0 | weight > 250){
            bodyMassIndex = "Неверный вес";
        }
        else if(height <= 50 | height > 250){
            bodyMassIndex = "Неверный рост";
        }
        else{
            double bodyMassIndexDouble = weight * 10_000 / Math.pow(height, 2); //10_000 из-за перевода см в метры (100^2)
            bodyMassIndexDouble = (double) ((int) (bodyMassIndexDouble * 100)) / 100; // округление до двух чисел после запятой
            bodyMassIndex = String.valueOf(bodyMassIndexDouble); //перевод из double в String
            if(bodyMassIndexDouble <= 18.5){
                if(bodyMassIndexDouble <= 16){
                    bodyMassIndex = "Ваш Индекс Массы Тела равен " + bodyMassIndex + ". У вас выраженный дефицит массы тела.";
                }
                else{
                    bodyMassIndex = "Ваш Индекс Массы Тела равен " + bodyMassIndex + ". У вас недостаточный (дефицит) массы тела";
                }
            }
            else if(bodyMassIndexDouble > 18.5 & bodyMassIndexDouble <= 30){
                if(bodyMassIndexDouble <= 25){
                    bodyMassIndex = "Ваш Индекс Массы Тела равен " + bodyMassIndex + ". Ваш вес в норме.";
                }
                else{
                    bodyMassIndex = "Ваш Индекс Массы Тела равен " + bodyMassIndex + ". У вас избыточная масса тела (предожирение).";
                }
            }
            else{
                if(bodyMassIndexDouble <= 35){
                    bodyMassIndex = "Ваш Индекс Массы Тела равен " + bodyMassIndex + ". У вас ожирение 1 степени.";
                }
                else if(bodyMassIndexDouble <= 40){
                    bodyMassIndex = "Ваш Индекс Массы Тела равен " + bodyMassIndex + ". У вас ожирение 2 степени.";
                }
                else{
                    bodyMassIndex = "Ваш Индекс Массы Тела равен " + bodyMassIndex + ". У вас ожирение 3 степени.";
                }
            }
        }

        return bodyMassIndex;
    }
}
