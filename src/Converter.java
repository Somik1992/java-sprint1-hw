public class Converter {

    public int converStepsInDist(int steps) {
        steps = steps * 75 / 1000;
        return steps;
    }

    public int converStepsIneEnergy(int steps) {
        steps = steps * 50 / 1000;
        return steps;
    }
}
