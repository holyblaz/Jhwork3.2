public class BmiService {
    public float calculate(int m, float h) {
        float imt = m / (h * h);

        return imt;
    }
}


