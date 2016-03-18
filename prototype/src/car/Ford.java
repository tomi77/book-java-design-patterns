package car;

public class Ford extends BasicCar {
    public Ford(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
