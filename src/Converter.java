public class Converter {

    public int converStepsInDist(int steps) {
        steps = steps * 75 / 100000;
        return steps;
    }

    public int converStepsIneEnergy(int steps) {
        steps = steps * 50 / 1000;
        return steps;
    }
}
