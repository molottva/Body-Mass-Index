public class BMIService {

    public float calculate(int weight, int height){
        float bodyMassIndex = weight * 10_000 / ((float) height * (float) height); //10_000 это из-за перевода см в метры (100^2)

        return bodyMassIndex;
    }
}
