package car;

import java.util.Random;

public abstract class BasicCar implements Cloneable {
    public String modelName;

    public int price;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public static int setPrice() {
        int price;
        Random r = new Random();
        price = r.nextInt(100000);
        return price;
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar)super.clone();
    }
}
