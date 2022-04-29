public class BmiService {
    public float calculate(int weight, float height) {
        float imt = weight / (height * height);

        return imt;
    }
}


