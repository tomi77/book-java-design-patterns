package car;

public class Nano extends BasicCar {
    public Nano(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
