package sharmat;

/**
 *
 * @author Tamanna Sharma
 */
public class Bicycle {

    private Gear[] frontGears;
    private Gear[] backGears;

    public Bicycle(Gear[] frontGears, Gear[] backGears) {
        this.frontGears = frontGears;
        this.backGears = backGears;
    }

    public Gear[] getFrontGears() {
        return frontGears;
    }

    public Gear[] getBackGears() {
        return backGears;
    }

    public double getGearRatio(int frontIndex, int backIndex) {
        double ratio = (double)frontGears[frontIndex].getNumTeeth()
                / backGears[backIndex].getNumTeeth();
        return ratio;
    }
}
